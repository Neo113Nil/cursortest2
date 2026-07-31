package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes.dex */
class SVGAndroidRenderer {
    private static HashSet supportedFeatures;
    private Canvas canvas;
    private SVG document;
    private float dpi;
    private Stack matrixStack;
    private Stack parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = null;
    private RendererState state;
    private Stack stateStack;

    private static int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    private float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    private class RendererState {
        Paint fillPaint;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        Paint strokePaint;
        SVG.Style style;
        SVG.Box viewBox;
        SVG.Box viewPort;

        RendererState() {
            Paint paint = new Paint();
            this.fillPaint = paint;
            paint.setFlags(193);
            this.fillPaint.setHinting(0);
            this.fillPaint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.fillPaint;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.strokePaint = paint3;
            paint3.setFlags(193);
            this.strokePaint.setHinting(0);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(typeface);
            this.style = SVG.Style.getDefaultStyle();
        }

        RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVG.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVG.Box(box);
            }
            SVG.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVG.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            try {
                this.style = (SVG.Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.style = SVG.Style.getDefaultStyle();
            }
        }
    }

    private void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack();
        this.parentStack = new Stack();
    }

    SVGAndroidRenderer(Canvas canvas, float f) {
        this.canvas = canvas;
        this.dpi = f;
    }

    float getDPI() {
        return this.dpi;
    }

    float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    SVG.Box getCurrentViewPortInUserUnits() {
        RendererState rendererState = this.state;
        SVG.Box box = rendererState.viewBox;
        return box != null ? box : rendererState.viewPort;
    }

    void renderDocument(SVG svg, RenderOptions renderOptions) {
        SVG.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptions == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.document = svg;
        SVG.Svg rootElement = svg.getRootElement();
        if (rootElement == null) {
            warn("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (renderOptions.hasView()) {
            SVG.SvgElementBase elementById = this.document.getElementById(renderOptions.viewId);
            if (elementById == null || !(elementById instanceof SVG.View)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", renderOptions.viewId));
                return;
            }
            SVG.View view = (SVG.View) elementById;
            box = view.viewBox;
            if (box == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptions.viewId));
                return;
            }
            preserveAspectRatio = view.preserveAspectRatio;
        } else {
            box = renderOptions.hasViewBox() ? renderOptions.viewBox : rootElement.viewBox;
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.preserveAspectRatio : rootElement.preserveAspectRatio;
        }
        if (renderOptions.hasCss()) {
            svg.addCSSRules(renderOptions.css);
        }
        if (renderOptions.hasTarget()) {
            CSSParser.RuleMatchContext ruleMatchContext = new CSSParser.RuleMatchContext();
            this.ruleMatchContext = ruleMatchContext;
            ruleMatchContext.targetElement = svg.getElementById(renderOptions.targetId);
        }
        resetState();
        checkXMLSpaceAttribute(rootElement);
        statePush();
        SVG.Box box2 = new SVG.Box(renderOptions.viewPort);
        SVG.Length length = rootElement.width;
        if (length != null) {
            box2.width = length.floatValue(this, box2.width);
        }
        SVG.Length length2 = rootElement.height;
        if (length2 != null) {
            box2.height = length2.floatValue(this, box2.height);
        }
        render(rootElement, box2, box, preserveAspectRatio);
        statePop();
        if (renderOptions.hasCss()) {
            svg.clearRenderCSSRules();
        }
    }

    private void render(SVG.SvgObject svgObject) {
        if (svgObject instanceof SVG.NotDirectlyRendered) {
            return;
        }
        statePush();
        checkXMLSpaceAttribute(svgObject);
        if (svgObject instanceof SVG.Svg) {
            render((SVG.Svg) svgObject);
        } else if (svgObject instanceof SVG.Use) {
            render((SVG.Use) svgObject);
        } else if (svgObject instanceof SVG.Switch) {
            render((SVG.Switch) svgObject);
        } else if (svgObject instanceof SVG.Group) {
            render((SVG.Group) svgObject);
        } else if (svgObject instanceof SVG.Image) {
            render((SVG.Image) svgObject);
        } else if (svgObject instanceof SVG.Path) {
            render((SVG.Path) svgObject);
        } else if (svgObject instanceof SVG.Rect) {
            render((SVG.Rect) svgObject);
        } else if (svgObject instanceof SVG.Circle) {
            render((SVG.Circle) svgObject);
        } else if (svgObject instanceof SVG.Ellipse) {
            render((SVG.Ellipse) svgObject);
        } else if (svgObject instanceof SVG.Line) {
            render((SVG.Line) svgObject);
        } else if (svgObject instanceof SVG.Polygon) {
            render((SVG.Polygon) svgObject);
        } else if (svgObject instanceof SVG.PolyLine) {
            render((SVG.PolyLine) svgObject);
        } else if (svgObject instanceof SVG.Text) {
            render((SVG.Text) svgObject);
        }
        statePop();
    }

    private void renderChildren(SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        Iterator it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            render((SVG.SvgObject) it.next());
        }
        if (z) {
            parentPop();
        }
    }

    private void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private void statePop() {
        this.canvas.restore();
        this.state = (RendererState) this.stateStack.pop();
    }

    private void parentPush(SVG.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void updateStyleForElement(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        SVG.Style style = svgElementBase.baseStyle;
        if (style != null) {
            updateStyle(rendererState, style);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule rule : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, rule.selector, svgElementBase)) {
                    updateStyle(rendererState, rule.style);
                }
            }
        }
        SVG.Style style2 = svgElementBase.style;
        if (style2 != null) {
            updateStyle(rendererState, style2);
        }
    }

    private void checkXMLSpaceAttribute(SVG.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVG.SvgElementBase) && (bool = ((SVG.SvgElementBase) svgObject).spacePreserve) != null) {
            this.state.spacePreserve = bool.booleanValue();
        }
    }

    private void doFilledPath(SVG.SvgElement svgElement, Path path) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            SVG.SvgObject resolveIRI = this.document.resolveIRI(((SVG.PaintReference) svgPaint).href);
            if (resolveIRI instanceof SVG.Pattern) {
                fillWithPattern(svgElement, path, (SVG.Pattern) resolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        RendererState rendererState = this.state;
        if (rendererState.style.vectorEffect == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.canvas.setMatrix(new Matrix());
            Shader shader = this.state.strokePaint.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.canvas.drawPath(path2, this.state.strokePaint);
            this.canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.canvas.drawPath(path, rendererState.strokePaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void render(SVG.Svg svg) {
        render(svg, makeViewPort(svg.x, svg.y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, svg);
        if (display()) {
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                SVG.Box box3 = this.state.viewPort;
                setClipRect(box3.minX, box3.minY, box3.width, box3.height);
            }
            checkForClipPath(svg, this.state.viewPort);
            if (box2 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                this.state.viewBox = svg.viewBox;
            } else {
                Canvas canvas = this.canvas;
                SVG.Box box4 = this.state.viewPort;
                canvas.translate(box4.minX, box4.minY);
            }
            boolean pushLayer = pushLayer();
            viewportFill();
            renderChildren(svg, true);
            if (pushLayer) {
                popLayer(svg);
            }
            updateParentBoundingBox(svg);
        }
    }

    private SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        return new SVG.Box(floatValueX, floatValueY, length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : currentViewPortInUserUnits.height);
    }

    private void render(SVG.Group group) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            Matrix matrix = group.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(group);
            boolean pushLayer = pushLayer();
            renderChildren(group, true);
            if (pushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent == null || svgElement.boundingBox == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.matrixStack.peek()).invert(matrix)) {
            SVG.Box box = svgElement.boundingBox;
            float f = box.minX;
            float f2 = box.minY;
            float maxX = box.maxX();
            SVG.Box box2 = svgElement.boundingBox;
            float f3 = box2.minY;
            float maxX2 = box2.maxX();
            float maxY = svgElement.boundingBox.maxY();
            SVG.Box box3 = svgElement.boundingBox;
            float[] fArr = {f, f2, maxX, f3, maxX2, maxY, box3.minX, box3.maxY()};
            matrix.preConcat(this.canvas.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            SVG.SvgElement svgElement2 = (SVG.SvgElement) this.parentStack.peek();
            SVG.Box box4 = svgElement2.boundingBox;
            if (box4 == null) {
                svgElement2.boundingBox = SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                box4.union(SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private boolean pushLayer() {
        SVG.SvgObject resolveIRI;
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha(null, clamp255(this.state.style.opacity.floatValue()), 31);
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        String str = rendererState.style.mask;
        if (str != null && ((resolveIRI = this.document.resolveIRI(str)) == null || !(resolveIRI instanceof SVG.Mask))) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    private void popLayer(SVG.SvgElement svgElement) {
        popLayer(svgElement, svgElement.boundingBox);
    }

    private void popLayer(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.canvas.saveLayer(null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.canvas.saveLayer(null, paint3, 31);
            renderMask(mask, svgElement, box);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private boolean requiresCompositing() {
        return this.state.style.opacity.floatValue() < 1.0f || this.state.style.mask != null;
    }

    private void render(SVG.Switch r3) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, r3);
        if (display()) {
            Matrix matrix = r3.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(r3);
            boolean pushLayer = pushLayer();
            renderSwitchChild(r3);
            if (pushLayer) {
                popLayer(r3);
            }
            updateParentBoundingBox(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void renderSwitchChild(SVG.Switch r6) {
        Set systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVG.getFileResolver();
        for (SVG.SvgObject svgObject : r6.getChildren()) {
            if (svgObject instanceof SVG.SvgConditional) {
                SVG.SvgConditional svgConditional = (SVG.SvgConditional) svgObject;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (!requiredFeatures.isEmpty() && supportedFeatures.containsAll(requiredFeatures)) {
                        }
                    }
                    Set requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        requiredFormats.isEmpty();
                    } else {
                        Set requiredFonts = svgConditional.getRequiredFonts();
                        if (requiredFonts != null) {
                            requiredFonts.isEmpty();
                        } else {
                            render(svgObject);
                            return;
                        }
                    }
                }
            }
        }
    }

    private static synchronized void initialiseSupportedFeaturesMap() {
        synchronized (SVGAndroidRenderer.class) {
            HashSet hashSet = new HashSet();
            supportedFeatures = hashSet;
            hashSet.add("Structure");
            supportedFeatures.add("BasicStructure");
            supportedFeatures.add("ConditionalProcessing");
            supportedFeatures.add("Image");
            supportedFeatures.add("Style");
            supportedFeatures.add("ViewportAttribute");
            supportedFeatures.add("Shape");
            supportedFeatures.add("BasicText");
            supportedFeatures.add("PaintAttribute");
            supportedFeatures.add("BasicPaintAttribute");
            supportedFeatures.add("OpacityAttribute");
            supportedFeatures.add("BasicGraphicsAttribute");
            supportedFeatures.add("Marker");
            supportedFeatures.add("Gradient");
            supportedFeatures.add("Pattern");
            supportedFeatures.add("Clip");
            supportedFeatures.add("BasicClip");
            supportedFeatures.add("Mask");
            supportedFeatures.add("View");
        }
    }

    private void render(SVG.Use use) {
        debug("Use render", new Object[0]);
        SVG.Length length = use.width;
        if (length == null || !length.isZero()) {
            SVG.Length length2 = use.height;
            if (length2 == null || !length2.isZero()) {
                updateStyleForElement(this.state, use);
                if (display()) {
                    SVG.SvgObject resolveIRI = use.document.resolveIRI(use.href);
                    if (resolveIRI == null) {
                        error("Use reference '%s' not found", use.href);
                        return;
                    }
                    Matrix matrix = use.transform;
                    if (matrix != null) {
                        this.canvas.concat(matrix);
                    }
                    SVG.Length length3 = use.x;
                    float floatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
                    SVG.Length length4 = use.y;
                    this.canvas.translate(floatValueX, length4 != null ? length4.floatValueY(this) : 0.0f);
                    checkForClipPath(use);
                    boolean pushLayer = pushLayer();
                    parentPush(use);
                    if (resolveIRI instanceof SVG.Svg) {
                        SVG.Box makeViewPort = makeViewPort(null, null, use.width, use.height);
                        statePush();
                        render((SVG.Svg) resolveIRI, makeViewPort);
                        statePop();
                    } else if (resolveIRI instanceof SVG.Symbol) {
                        SVG.Length length5 = use.width;
                        if (length5 == null) {
                            length5 = new SVG.Length(100.0f, SVG.Unit.percent);
                        }
                        SVG.Length length6 = use.height;
                        if (length6 == null) {
                            length6 = new SVG.Length(100.0f, SVG.Unit.percent);
                        }
                        SVG.Box makeViewPort2 = makeViewPort(null, null, length5, length6);
                        statePush();
                        render((SVG.Symbol) resolveIRI, makeViewPort2);
                        statePop();
                    } else {
                        render(resolveIRI);
                    }
                    parentPop();
                    if (pushLayer) {
                        popLayer(use);
                    }
                    updateParentBoundingBox(use);
                }
            }
        }
    }

    private void render(SVG.Path path) {
        debug("Path render", new Object[0]);
        if (path.d == null) {
            return;
        }
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = path.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path path2 = new PathConverter(path.d).getPath();
                if (path.boundingBox == null) {
                    path.boundingBox = calculatePathBounds(path2);
                }
                updateParentBoundingBox(path);
                checkForGradientsAndPatterns(path);
                checkForClipPath(path);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    path2.setFillType(getFillTypeFromState());
                    doFilledPath(path, path2);
                }
                if (this.state.hasStroke) {
                    doStroke(path2);
                }
                renderMarkers(path);
                if (pushLayer) {
                    popLayer(path);
                }
            }
        }
    }

    private SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void render(SVG.Rect rect) {
        debug("Rect render", new Object[0]);
        SVG.Length length = rect.width;
        if (length == null || rect.height == null || length.isZero() || rect.height.isZero()) {
            return;
        }
        updateStyleForElement(this.state, rect);
        if (display() && visible()) {
            Matrix matrix = rect.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(rect);
            updateParentBoundingBox(rect);
            checkForGradientsAndPatterns(rect);
            checkForClipPath(rect);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(rect, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(rect);
            }
        }
    }

    private void render(SVG.Circle circle) {
        debug("Circle render", new Object[0]);
        SVG.Length length = circle.r;
        if (length == null || length.isZero()) {
            return;
        }
        updateStyleForElement(this.state, circle);
        if (display() && visible()) {
            Matrix matrix = circle.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(circle);
            updateParentBoundingBox(circle);
            checkForGradientsAndPatterns(circle);
            checkForClipPath(circle);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(circle, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(circle);
            }
        }
    }

    private void render(SVG.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        SVG.Length length = ellipse.rx;
        if (length == null || ellipse.ry == null || length.isZero() || ellipse.ry.isZero()) {
            return;
        }
        updateStyleForElement(this.state, ellipse);
        if (display() && visible()) {
            Matrix matrix = ellipse.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(ellipse);
            updateParentBoundingBox(ellipse);
            checkForGradientsAndPatterns(ellipse);
            checkForClipPath(ellipse);
            boolean pushLayer = pushLayer();
            if (this.state.hasFill) {
                doFilledPath(ellipse, makePathAndBoundingBox);
            }
            if (this.state.hasStroke) {
                doStroke(makePathAndBoundingBox);
            }
            if (pushLayer) {
                popLayer(ellipse);
            }
        }
    }

    private void render(SVG.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            Matrix matrix = line.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean pushLayer = pushLayer();
            doStroke(makePathAndBoundingBox);
            renderMarkers(line);
            if (pushLayer) {
                popLayer(line);
            }
        }
    }

    private List calculateMarkerPositions(SVG.Line line) {
        SVG.Length length = line.x1;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = line.y1;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Length length3 = line.x2;
        float floatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
        SVG.Length length4 = line.y2;
        float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f = floatValueX2 - floatValueX;
        float f2 = floatValueY2 - floatValueY;
        arrayList.add(new MarkerVector(floatValueX, floatValueY, f, f2));
        arrayList.add(new MarkerVector(floatValueX2, floatValueY2, f, f2));
        return arrayList;
    }

    private void render(SVG.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polyLine.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polyLine.points.length < 2) {
                    return;
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                updateParentBoundingBox(polyLine);
                makePathAndBoundingBox.setFillType(getFillTypeFromState());
                checkForGradientsAndPatterns(polyLine);
                checkForClipPath(polyLine);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polyLine, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polyLine);
                if (pushLayer) {
                    popLayer(polyLine);
                }
            }
        }
    }

    private List calculateMarkerPositions(SVG.PolyLine polyLine) {
        int length = polyLine.points.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = polyLine.points;
        MarkerVector markerVector = new MarkerVector(fArr[0], fArr[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = polyLine.points;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            markerVector.add(f3, f4);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new MarkerVector(f3, f4, f3 - markerVector.x, f4 - markerVector.y);
            f2 = f4;
            f = f3;
        }
        if (polyLine instanceof SVG.Polygon) {
            float[] fArr3 = polyLine.points;
            float f5 = fArr3[0];
            if (f != f5) {
                float f6 = fArr3[1];
                if (f2 != f6) {
                    markerVector.add(f5, f6);
                    arrayList.add(markerVector);
                    MarkerVector markerVector2 = new MarkerVector(f5, f6, f5 - markerVector.x, f6 - markerVector.y);
                    markerVector2.add((MarkerVector) arrayList.get(0));
                    arrayList.add(markerVector2);
                    arrayList.set(0, markerVector2);
                }
            }
        } else {
            arrayList.add(markerVector);
        }
        return arrayList;
    }

    private void render(SVG.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polygon.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polygon.points.length < 2) {
                    return;
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(polygon);
                updateParentBoundingBox(polygon);
                checkForGradientsAndPatterns(polygon);
                checkForClipPath(polygon);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(polygon, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                renderMarkers(polygon);
                if (pushLayer) {
                    popLayer(polygon);
                }
            }
        }
    }

    private void render(SVG.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix = text.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            List list = text.x;
            float f = 0.0f;
            float floatValueX = (list == null || list.size() == 0) ? 0.0f : ((SVG.Length) text.x.get(0)).floatValueX(this);
            List list2 = text.y;
            float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.Length) text.y.get(0)).floatValueY(this);
            List list3 = text.dx;
            float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.Length) text.dx.get(0)).floatValueX(this);
            List list4 = text.dy;
            if (list4 != null && list4.size() != 0) {
                f = ((SVG.Length) text.dy.get(0)).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean pushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(floatValueX + floatValueX2, floatValueY + f));
            if (pushLayer) {
                popLayer(text);
            }
        }
    }

    private SVG.Style.TextAnchor getAnchorPosition() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.state.style;
        if (style.direction == SVG.Style.TextDirection.LTR || (textAnchor = style.textAnchor) == SVG.Style.TextAnchor.Middle) {
            return style.textAnchor;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    private class PlainTextDrawer extends TextProcessor {
        float x;
        float y;

        PlainTextDrawer(float f, float f2) {
            super(SVGAndroidRenderer.this, null);
            this.x = f;
            this.y = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.x, this.y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.x, this.y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private abstract class TextProcessor {
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);

        private TextProcessor() {
        }

        /* synthetic */ TextProcessor(SVGAndroidRenderer sVGAndroidRenderer, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private void enumerateTextSpans(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
                if (svgObject instanceof SVG.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
                } else {
                    processTextChild(svgObject, textProcessor);
                }
                z = false;
            }
        }
    }

    private void processTextChild(SVG.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float f2;
        float f3;
        SVG.Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVG.TextContainer) svgObject)) {
            if (svgObject instanceof SVG.TextPath) {
                statePush();
                renderTextPath((SVG.TextPath) svgObject);
                statePop();
                return;
            }
            if (svgObject instanceof SVG.TSpan) {
                debug("TSpan render", new Object[0]);
                statePush();
                SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                updateStyleForElement(this.state, tSpan);
                if (display()) {
                    List list = tSpan.x;
                    boolean z = list != null && list.size() > 0;
                    boolean z2 = textProcessor instanceof PlainTextDrawer;
                    float f4 = 0.0f;
                    if (z2) {
                        float floatValueX = !z ? ((PlainTextDrawer) textProcessor).x : ((SVG.Length) tSpan.x.get(0)).floatValueX(this);
                        List list2 = tSpan.y;
                        f2 = (list2 == null || list2.size() == 0) ? ((PlainTextDrawer) textProcessor).y : ((SVG.Length) tSpan.y.get(0)).floatValueY(this);
                        List list3 = tSpan.dx;
                        f3 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.Length) tSpan.dx.get(0)).floatValueX(this);
                        List list4 = tSpan.dy;
                        if (list4 != null && list4.size() != 0) {
                            f4 = ((SVG.Length) tSpan.dy.get(0)).floatValueY(this);
                        }
                        f = f4;
                        f4 = floatValueX;
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    if (z && (anchorPosition = getAnchorPosition()) != SVG.Style.TextAnchor.Start) {
                        float calculateTextWidth = calculateTextWidth(tSpan);
                        if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                            calculateTextWidth /= 2.0f;
                        }
                        f4 -= calculateTextWidth;
                    }
                    checkForGradientsAndPatterns((SVG.SvgElement) tSpan.getTextRoot());
                    if (z2) {
                        PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                        plainTextDrawer.x = f4 + f3;
                        plainTextDrawer.y = f2 + f;
                    }
                    boolean pushLayer = pushLayer();
                    enumerateTextSpans(tSpan, textProcessor);
                    if (pushLayer) {
                        popLayer(tSpan);
                    }
                }
                statePop();
                return;
            }
            if (svgObject instanceof SVG.TRef) {
                statePush();
                SVG.TRef tRef = (SVG.TRef) svgObject;
                updateStyleForElement(this.state, tRef);
                if (display()) {
                    checkForGradientsAndPatterns((SVG.SvgElement) tRef.getTextRoot());
                    SVG.SvgObject resolveIRI = svgObject.document.resolveIRI(tRef.href);
                    if (resolveIRI != null && (resolveIRI instanceof SVG.TextContainer)) {
                        StringBuilder sb = new StringBuilder();
                        extractRawText((SVG.TextContainer) resolveIRI, sb);
                        if (sb.length() > 0) {
                            textProcessor.processText(sb.toString());
                        }
                    } else {
                        error("Tref reference '%s' not found", tRef.href);
                    }
                }
                statePop();
            }
        }
    }

    private void renderTextPath(SVG.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            SVG.SvgObject resolveIRI = textPath.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = new PathConverter(path.d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(path2, false);
            SVG.Length length = textPath.startOffset;
            float floatValue = length != null ? length.floatValue(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValue -= calculateTextWidth;
            }
            checkForGradientsAndPatterns((SVG.SvgElement) textPath.getTextRoot());
            boolean pushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, floatValue, 0.0f));
            if (pushLayer) {
                popLayer(textPath);
            }
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private Path path;

        PathTextDrawer(Path path, float f, float f2) {
            super(f, f2);
            this.path = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer, com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.x, this.y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.x, this.y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private float calculateTextWidth(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this, null);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.x;
    }

    private class TextWidthCalculator extends TextProcessor {
        float x;

        private TextWidthCalculator() {
            super(SVGAndroidRenderer.this, null);
            this.x = 0.0f;
        }

        /* synthetic */ TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            this.x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        RectF bbox;
        float x;
        float y;

        TextBoundsCalculator(float f, float f2) {
            super(SVGAndroidRenderer.this, null);
            this.bbox = new RectF();
            this.x = f;
            this.y = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgObject resolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = SVGAndroidRenderer.this.new PathConverter(path.d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.x, this.y);
                this.bbox.union(rectF);
            }
            this.x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject svgObject = (SVG.SvgObject) it.next();
            if (svgObject instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) svgObject, sb);
            } else if (svgObject instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) svgObject).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        if (this.state.spacePreserve) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private void render(SVG.Symbol symbol, SVG.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width == 0.0f || box.height == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        updateStyleForElement(this.state, symbol);
        RendererState rendererState = this.state;
        rendererState.viewPort = box;
        if (!rendererState.style.overflow.booleanValue()) {
            SVG.Box box2 = this.state.viewPort;
            setClipRect(box2.minX, box2.minY, box2.width, box2.height);
        }
        SVG.Box box3 = symbol.viewBox;
        if (box3 != null) {
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box3, preserveAspectRatio));
            this.state.viewBox = symbol.viewBox;
        } else {
            Canvas canvas = this.canvas;
            SVG.Box box4 = this.state.viewPort;
            canvas.translate(box4.minX, box4.minY);
        }
        boolean pushLayer = pushLayer();
        renderChildren(symbol, true);
        if (pushLayer) {
            popLayer(symbol);
        }
        updateParentBoundingBox(symbol);
    }

    private void render(SVG.Image image) {
        SVG.Length length;
        String str;
        debug("Image render", new Object[0]);
        SVG.Length length2 = image.width;
        if (length2 == null || length2.isZero() || (length = image.height) == null || length.isZero() || (str = image.href) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
        }
        Bitmap checkForImageDataURL = checkForImageDataURL(str);
        if (checkForImageDataURL == null) {
            SVG.getFileResolver();
            return;
        }
        SVG.Box box = new SVG.Box(0.0f, 0.0f, checkForImageDataURL.getWidth(), checkForImageDataURL.getHeight());
        updateStyleForElement(this.state, image);
        if (display() && visible()) {
            Matrix matrix = image.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            SVG.Length length3 = image.x;
            float floatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVG.Length length4 = image.y;
            this.state.viewPort = new SVG.Box(floatValueX, length4 != null ? length4.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
            if (!this.state.style.overflow.booleanValue()) {
                SVG.Box box2 = this.state.viewPort;
                setClipRect(box2.minX, box2.minY, box2.width, box2.height);
            }
            image.boundingBox = this.state.viewPort;
            updateParentBoundingBox(image);
            checkForClipPath(image);
            boolean pushLayer = pushLayer();
            viewportFill();
            this.canvas.save();
            this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
            this.canvas.drawBitmap(checkForImageDataURL, 0.0f, 0.0f, new Paint(this.state.style.imageRendering != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.canvas.restore();
            if (pushLayer) {
                popLayer(image);
            }
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
            return null;
        }
    }

    private boolean display() {
        Boolean bool = this.state.style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean visible() {
        Boolean bool = this.state.style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Matrix calculateViewBoxTransform(SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f3 = box.width / box2.width;
            float f4 = box.height / box2.height;
            float f5 = -box2.minX;
            float f6 = -box2.minY;
            if (preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = box.width / max;
            float f8 = box.height / max;
            int[] iArr = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
            switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (box2.width - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = box2.width - f7;
                    break;
            }
            f5 -= f2;
            int i = iArr[preserveAspectRatio.getAlignment().ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                }
                f = box2.height - f8;
                f6 -= f;
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (box2.height - f8) / 2.0f;
            f6 -= f;
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    private boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    private void updateStyle(RendererState rendererState, SVG.Style style) {
        if (isSpecified(style, 4096L)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, 2048L)) {
            rendererState.style.opacity = style.opacity;
        }
        if (isSpecified(style, 1L)) {
            rendererState.style.fill = style.fill;
            SVG.SvgPaint svgPaint = style.fill;
            rendererState.hasFill = (svgPaint == null || svgPaint == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4L)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149L)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2L)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8L)) {
            rendererState.style.stroke = style.stroke;
            SVG.SvgPaint svgPaint2 = style.stroke;
            rendererState.hasStroke = (svgPaint2 == null || svgPaint2 == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16L)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168L)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32L)) {
            SVG.Style style2 = rendererState.style;
            SVG.Length length = style.strokeWidth;
            style2.strokeWidth = length;
            rendererState.strokePaint.setStrokeWidth(length.floatValue(this));
        }
        if (isSpecified(style, 64L)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i == 1) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                rendererState.strokePaint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (isSpecified(style, 128L)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                rendererState.strokePaint.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (isSpecified(style, 256L)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512L)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024L)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typeface = null;
        if (isSpecified(style, 1536L)) {
            SVG.Length[] lengthArr = rendererState.style.strokeDashArray;
            if (lengthArr == null) {
                rendererState.strokePaint.setPathEffect(null);
            } else {
                int length2 = lengthArr.length;
                int i3 = length2 % 2 == 0 ? length2 : length2 * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float floatValue = rendererState.style.strokeDashArray[i4 % length2].floatValue(this);
                    fArr[i4] = floatValue;
                    f += floatValue;
                }
                if (f == 0.0f) {
                    rendererState.strokePaint.setPathEffect(null);
                } else {
                    float floatValue2 = rendererState.style.strokeDashOffset.floatValue(this);
                    if (floatValue2 < 0.0f) {
                        floatValue2 = (floatValue2 % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, floatValue2));
                }
            }
        }
        if (isSpecified(style, 16384L)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, 8192L)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768L)) {
            if (style.fontWeight.intValue() == -1 && rendererState.style.fontWeight.intValue() > 100) {
                SVG.Style style3 = rendererState.style;
                style3.fontWeight = Integer.valueOf(style3.fontWeight.intValue() - 100);
            } else if (style.fontWeight.intValue() == 1 && rendererState.style.fontWeight.intValue() < 900) {
                SVG.Style style4 = rendererState.style;
                style4.fontWeight = Integer.valueOf(style4.fontWeight.intValue() + 100);
            } else {
                rendererState.style.fontWeight = style.fontWeight;
            }
        }
        if (isSpecified(style, 65536L)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496L)) {
            if (rendererState.style.fontFamily != null && this.document != null) {
                SVG.getFileResolver();
                for (String str : rendererState.style.fontFamily) {
                    SVG.Style style5 = rendererState.style;
                    typeface = checkGenericFont(str, style5.fontWeight, style5.fontStyle);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                SVG.Style style6 = rendererState.style;
                typeface = checkGenericFont("serif", style6.fontWeight, style6.fontStyle);
            }
            rendererState.fillPaint.setTypeface(typeface);
            rendererState.strokePaint.setTypeface(typeface);
        }
        if (isSpecified(style, 131072L)) {
            rendererState.style.textDecoration = style.textDecoration;
            Paint paint = rendererState.fillPaint;
            SVG.Style.TextDecoration textDecoration = style.textDecoration;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = rendererState.fillPaint;
            SVG.Style.TextDecoration textDecoration3 = style.textDecoration;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            rendererState.strokePaint.setStrikeThruText(style.textDecoration == textDecoration2);
            rendererState.strokePaint.setUnderlineText(style.textDecoration == textDecoration4);
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, 262144L)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288L)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304L)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608L)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216L)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432L)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576L)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456L)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912L)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824L)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864L)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728L)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap;
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void setPaintColour(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        int i;
        SVG.Style style = rendererState.style;
        float floatValue = (z ? style.fillOpacity : style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = rendererState.style.color.colour;
        }
        int colourWithOpacity = colourWithOpacity(i, floatValue);
        if (z) {
            rendererState.fillPaint.setColor(colourWithOpacity);
        } else {
            rendererState.strokePaint.setColor(colourWithOpacity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        char c = 2;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.hashCode();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return Typeface.create(Typeface.SANS_SERIF, i);
    }

    private static int colourWithOpacity(int i, float f) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    private Path.FillType getFillTypeFromState() {
        SVG.Style.FillRule fillRule = this.state.style.fillRule;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    private void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        SVG.CSSClipRect cSSClipRect = this.state.style.clip;
        if (cSSClipRect != null) {
            f += cSSClipRect.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            f5 -= this.state.style.clip.right.floatValueX(this);
            f6 -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, f5, f6);
    }

    private void viewportFill() {
        int i;
        SVG.Style style = this.state.style;
        SVG.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (!(svgPaint instanceof SVG.CurrentColor)) {
            return;
        } else {
            i = style.color.colour;
        }
        Float f = style.viewportFillOpacity;
        if (f != null) {
            i = colourWithOpacity(i, f.floatValue());
        }
        this.canvas.drawColor(i);
    }

    private class PathConverter implements SVG.PathInterface {
        float lastX;
        float lastY;
        Path path = new Path();

        PathConverter(SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
        }

        Path getPath() {
            return this.path;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void close() {
            this.path.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        float f8;
        SVG.PathInterface pathInterface2;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f) {
            f8 = f6;
            pathInterface2 = pathInterface;
        } else {
            if (f4 != 0.0f) {
                float abs = Math.abs(f3);
                float abs2 = Math.abs(f4);
                double radians = Math.toRadians(f5 % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d = (f - f6) / 2.0d;
                double d2 = (f2 - f7) / 2.0d;
                double d3 = (cos * d) + (sin * d2);
                double d4 = ((-sin) * d) + (d2 * cos);
                double d5 = abs * abs;
                double d6 = abs2 * abs2;
                double d7 = d3 * d3;
                double d8 = d4 * d4;
                double d9 = (d7 / d5) + (d8 / d6);
                if (d9 > 0.99999d) {
                    double sqrt = Math.sqrt(d9) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d5 = abs * abs;
                    d6 = abs2 * abs2;
                }
                double d10 = z == z2 ? -1.0d : 1.0d;
                double d11 = d5 * d6;
                double d12 = d5 * d8;
                double d13 = d6 * d7;
                double d14 = ((d11 - d12) - d13) / (d12 + d13);
                if (d14 < 0.0d) {
                    d14 = 0.0d;
                }
                double sqrt2 = d10 * Math.sqrt(d14);
                double d15 = abs;
                double d16 = abs2;
                double d17 = ((d15 * d4) / d16) * sqrt2;
                float f9 = abs;
                float f10 = abs2;
                double d18 = sqrt2 * (-((d16 * d3) / d15));
                double d19 = ((f + f6) / 2.0d) + ((cos * d17) - (sin * d18));
                double d20 = ((f2 + f7) / 2.0d) + (sin * d17) + (cos * d18);
                double d21 = (d3 - d17) / d15;
                double d22 = (d4 - d18) / d16;
                double d23 = ((-d3) - d17) / d15;
                double d24 = ((-d4) - d18) / d16;
                double d25 = (d21 * d21) + (d22 * d22);
                double acos = (d22 < 0.0d ? -1.0d : 1.0d) * Math.acos(d21 / Math.sqrt(d25));
                double checkedArcCos = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24))));
                if (!z2 && checkedArcCos > 0.0d) {
                    checkedArcCos -= 6.283185307179586d;
                } else if (z2 && checkedArcCos < 0.0d) {
                    checkedArcCos += 6.283185307179586d;
                }
                float[] arcToBeziers = arcToBeziers(acos % 6.283185307179586d, checkedArcCos % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f9, f10);
                matrix.postRotate(f5);
                matrix.postTranslate((float) d19, (float) d20);
                matrix.mapPoints(arcToBeziers);
                arcToBeziers[arcToBeziers.length - 2] = f6;
                arcToBeziers[arcToBeziers.length - 1] = f7;
                for (int i = 0; i < arcToBeziers.length; i += 6) {
                    pathInterface.cubicTo(arcToBeziers[i], arcToBeziers[i + 1], arcToBeziers[i + 2], arcToBeziers[i + 3], arcToBeziers[i + 4], arcToBeziers[i + 5]);
                }
                return;
            }
            pathInterface2 = pathInterface;
            f8 = f6;
        }
        pathInterface2.lineTo(f8, f7);
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    private static float[] arcToBeziers(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ceil;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d5 = d + (i * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            double d6 = d3;
            fArr[i2] = (float) (cos - (sin * sin2));
            fArr[i2 + 1] = (float) (sin2 + (cos * sin));
            double d7 = d5 + d6;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            fArr[i2 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i2 + 3] = (float) (sin3 - (sin * cos2));
            int i3 = i2 + 5;
            fArr[i2 + 4] = (float) cos2;
            i2 += 6;
            fArr[i3] = (float) sin3;
            i++;
            d3 = d6;
        }
        return fArr;
    }

    private class MarkerVector {
        float dx;
        float dy;
        boolean isAmbiguous = false;
        float x;
        float y;

        MarkerVector(float f, float f2, float f3, float f4) {
            this.dx = 0.0f;
            this.dy = 0.0f;
            this.x = f;
            this.y = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.dx = (float) (f3 / sqrt);
                this.dy = (float) (f4 / sqrt);
            }
        }

        void add(float f, float f2) {
            float f3 = f - this.x;
            float f4 = f2 - this.y;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.dx;
            if (f3 == (-f5) && f4 == (-this.dy)) {
                this.isAmbiguous = true;
                this.dx = -f4;
                this.dy = f3;
            } else {
                this.dx = f5 + f3;
                this.dy += f4;
            }
        }

        void add(MarkerVector markerVector) {
            float f = markerVector.dx;
            float f2 = this.dx;
            if (f == (-f2)) {
                float f3 = markerVector.dy;
                if (f3 == (-this.dy)) {
                    this.isAmbiguous = true;
                    this.dx = -f3;
                    this.dy = markerVector.dx;
                    return;
                }
            }
            this.dx = f2 + f;
            this.dy += markerVector.dy;
        }

        public String toString() {
            return "(" + this.x + StringUtils.COMMA + this.y + " " + this.dx + StringUtils.COMMA + this.dy + ")";
        }
    }

    private class MarkerPositionCalculator implements SVG.PathInterface {
        private boolean closepathReAdjustPending;
        private float startX;
        private float startY;
        private List markers = new ArrayList();
        private MarkerVector lastPos = null;
        private boolean startArc = false;
        private boolean normalCubic = true;
        private int subpathStartIndex = -1;

        MarkerPositionCalculator(SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.enumeratePath(this);
            if (this.closepathReAdjustPending) {
                this.lastPos.add((MarkerVector) this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
        }

        List getMarkers() {
            return this.markers;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add((MarkerVector) this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            MarkerVector markerVector = this.lastPos;
            this.lastPos = sVGAndroidRenderer.new MarkerVector(f, f2, f - markerVector.x, f2 - markerVector.y);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = SVGAndroidRenderer.this.new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            MarkerVector markerVector = this.lastPos;
            SVGAndroidRenderer.arcTo(markerVector.x, markerVector.y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void renderMarkers(SVG.GraphicsElement graphicsElement) {
        SVG.Marker marker;
        String str;
        SVG.Marker marker2;
        String str2;
        SVG.Marker marker3;
        List calculateMarkerPositions;
        int size;
        int i;
        SVG.Style style = this.state.style;
        String str3 = style.markerStart;
        if (str3 == null && style.markerMid == null && style.markerEnd == null) {
            return;
        }
        if (str3 != null) {
            SVG.SvgObject resolveIRI = graphicsElement.document.resolveIRI(str3);
            if (resolveIRI == null) {
                error("Marker reference '%s' not found", this.state.style.markerStart);
            } else {
                marker = (SVG.Marker) resolveIRI;
                str = this.state.style.markerMid;
                if (str != null) {
                    SVG.SvgObject resolveIRI2 = graphicsElement.document.resolveIRI(str);
                    if (resolveIRI2 == null) {
                        error("Marker reference '%s' not found", this.state.style.markerMid);
                    } else {
                        marker2 = (SVG.Marker) resolveIRI2;
                        str2 = this.state.style.markerEnd;
                        if (str2 != null) {
                            SVG.SvgObject resolveIRI3 = graphicsElement.document.resolveIRI(str2);
                            if (resolveIRI3 == null) {
                                error("Marker reference '%s' not found", this.state.style.markerEnd);
                            } else {
                                marker3 = (SVG.Marker) resolveIRI3;
                                if (!(graphicsElement instanceof SVG.Path)) {
                                    calculateMarkerPositions = new MarkerPositionCalculator(((SVG.Path) graphicsElement).d).getMarkers();
                                } else if (graphicsElement instanceof SVG.Line) {
                                    calculateMarkerPositions = calculateMarkerPositions((SVG.Line) graphicsElement);
                                } else {
                                    calculateMarkerPositions = calculateMarkerPositions((SVG.PolyLine) graphicsElement);
                                }
                                if (calculateMarkerPositions == null && (size = calculateMarkerPositions.size()) != 0) {
                                    SVG.Style style2 = this.state.style;
                                    style2.markerEnd = null;
                                    style2.markerMid = null;
                                    style2.markerStart = null;
                                    if (marker != null) {
                                        renderMarker(marker, (MarkerVector) calculateMarkerPositions.get(0));
                                    }
                                    if (marker2 != null && calculateMarkerPositions.size() > 2) {
                                        MarkerVector markerVector = (MarkerVector) calculateMarkerPositions.get(0);
                                        MarkerVector markerVector2 = (MarkerVector) calculateMarkerPositions.get(1);
                                        i = 1;
                                        while (i < size - 1) {
                                            i++;
                                            MarkerVector markerVector3 = (MarkerVector) calculateMarkerPositions.get(i);
                                            markerVector = markerVector2.isAmbiguous ? realignMarkerMid(markerVector, markerVector2, markerVector3) : markerVector2;
                                            renderMarker(marker2, markerVector);
                                            markerVector2 = markerVector3;
                                        }
                                    }
                                    if (marker3 == null) {
                                        renderMarker(marker3, (MarkerVector) calculateMarkerPositions.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        marker3 = null;
                        if (!(graphicsElement instanceof SVG.Path)) {
                        }
                        if (calculateMarkerPositions == null) {
                            return;
                        }
                        SVG.Style style22 = this.state.style;
                        style22.markerEnd = null;
                        style22.markerMid = null;
                        style22.markerStart = null;
                        if (marker != null) {
                        }
                        if (marker2 != null) {
                            MarkerVector markerVector4 = (MarkerVector) calculateMarkerPositions.get(0);
                            MarkerVector markerVector22 = (MarkerVector) calculateMarkerPositions.get(1);
                            i = 1;
                            while (i < size - 1) {
                            }
                        }
                        if (marker3 == null) {
                        }
                    }
                }
                marker2 = null;
                str2 = this.state.style.markerEnd;
                if (str2 != null) {
                }
                marker3 = null;
                if (!(graphicsElement instanceof SVG.Path)) {
                }
                if (calculateMarkerPositions == null) {
                }
            }
        }
        marker = null;
        str = this.state.style.markerMid;
        if (str != null) {
        }
        marker2 = null;
        str2 = this.state.style.markerEnd;
        if (str2 != null) {
        }
        marker3 = null;
        if (!(graphicsElement instanceof SVG.Path)) {
        }
        if (calculateMarkerPositions == null) {
        }
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float dotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector2.x - markerVector.x, markerVector2.y - markerVector.y);
        if (dotProduct == 0.0f) {
            dotProduct = dotProduct(markerVector2.dx, markerVector2.dy, markerVector3.x - markerVector2.x, markerVector3.y - markerVector2.y);
        }
        if (dotProduct > 0.0f) {
            return markerVector2;
        }
        if (dotProduct == 0.0f && (markerVector2.dx > 0.0f || markerVector2.dy >= 0.0f)) {
            return markerVector2;
        }
        markerVector2.dx = -markerVector2.dx;
        markerVector2.dy = -markerVector2.dy;
        return markerVector2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void renderMarker(SVG.Marker marker, MarkerVector markerVector) {
        float f;
        SVG.Box box;
        boolean pushLayer;
        float f2;
        float f3;
        float f4;
        statePush();
        Float f5 = marker.orient;
        float f6 = 0.0f;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = markerVector.dx;
                if (f7 != 0.0f || markerVector.dy != 0.0f) {
                    f = (float) Math.toDegrees(Math.atan2(markerVector.dy, f7));
                }
            } else {
                f = marker.orient.floatValue();
            }
            float floatValue = !marker.markerUnitsAreUser ? 1.0f : this.state.style.strokeWidth.floatValue(this.dpi);
            this.state = findInheritFromAncestorState(marker);
            Matrix matrix = new Matrix();
            matrix.preTranslate(markerVector.x, markerVector.y);
            matrix.preRotate(f);
            matrix.preScale(floatValue, floatValue);
            SVG.Length length = marker.refX;
            float floatValueX = length == null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = marker.refY;
            float floatValueY = length2 == null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = marker.markerWidth;
            float floatValueX2 = length3 == null ? length3.floatValueX(this) : 3.0f;
            SVG.Length length4 = marker.markerHeight;
            float floatValueY2 = length4 != null ? length4.floatValueY(this) : 3.0f;
            box = marker.viewBox;
            if (box == null) {
                float f8 = floatValueX2 / box.width;
                float f9 = floatValueY2 / box.height;
                PreserveAspectRatio preserveAspectRatio = marker.preserveAspectRatio;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
                }
                if (!preserveAspectRatio.equals(PreserveAspectRatio.STRETCH)) {
                    f8 = preserveAspectRatio.getScale() == PreserveAspectRatio.Scale.slice ? Math.max(f8, f9) : Math.min(f8, f9);
                    f9 = f8;
                }
                matrix.preTranslate((-floatValueX) * f8, (-floatValueY) * f9);
                this.canvas.concat(matrix);
                SVG.Box box2 = marker.viewBox;
                float f10 = box2.width * f8;
                float f11 = box2.height * f9;
                int[] iArr = AnonymousClass1.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment;
                switch (iArr[preserveAspectRatio.getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f2 = (floatValueX2 - f10) / 2.0f;
                        f3 = 0.0f - f2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f2 = floatValueX2 - f10;
                        f3 = 0.0f - f2;
                        break;
                    default:
                        f3 = 0.0f;
                        break;
                }
                int i = iArr[preserveAspectRatio.getAlignment().ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                    f4 = floatValueY2 - f11;
                    f6 = 0.0f - f4;
                    if (!this.state.style.overflow.booleanValue()) {
                        setClipRect(f3, f6, floatValueX2, floatValueY2);
                    }
                    matrix.reset();
                    matrix.preScale(f8, f9);
                    this.canvas.concat(matrix);
                }
                f4 = (floatValueY2 - f11) / 2.0f;
                f6 = 0.0f - f4;
                if (!this.state.style.overflow.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f8, f9);
                this.canvas.concat(matrix);
            } else {
                matrix.preTranslate(-floatValueX, -floatValueY);
                this.canvas.concat(matrix);
                if (!this.state.style.overflow.booleanValue()) {
                    setClipRect(0.0f, 0.0f, floatValueX2, floatValueY2);
                }
            }
            pushLayer = pushLayer();
            renderChildren(marker, false);
            if (pushLayer) {
                popLayer(marker);
            }
            statePop();
        }
        f = 0.0f;
        if (!marker.markerUnitsAreUser) {
        }
        this.state = findInheritFromAncestorState(marker);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(markerVector.x, markerVector.y);
        matrix2.preRotate(f);
        matrix2.preScale(floatValue, floatValue);
        SVG.Length length5 = marker.refX;
        if (length5 == null) {
        }
        SVG.Length length22 = marker.refY;
        if (length22 == null) {
        }
        SVG.Length length32 = marker.markerWidth;
        if (length32 == null) {
        }
        SVG.Length length42 = marker.markerHeight;
        if (length42 != null) {
        }
        box = marker.viewBox;
        if (box == null) {
        }
        pushLayer = pushLayer();
        renderChildren(marker, false);
        if (pushLayer) {
        }
        statePop();
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        return findInheritFromAncestorState(svgObject, rendererState);
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            Object obj = svgObject.parent;
            if (obj == null) {
                break;
            }
            svgObject = (SVG.SvgObject) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            updateStyleForElement(rendererState, (SVG.SvgElementBase) it.next());
        }
        RendererState rendererState2 = this.state;
        rendererState.viewBox = rendererState2.viewBox;
        rendererState.viewPort = rendererState2.viewPort;
        return rendererState;
    }

    private void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) svgPaint);
        }
        SVG.SvgPaint svgPaint2 = this.state.style.stroke;
        if (svgPaint2 instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) svgPaint2);
        }
    }

    private void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        SVG.SvgObject resolveIRI = this.document.resolveIRI(paintReference.href);
        if (resolveIRI == null) {
            error("%s reference '%s' not found", z ? "Fill" : "Stroke", paintReference.href);
            SVG.SvgPaint svgPaint = paintReference.fallback;
            if (svgPaint != null) {
                setPaintColour(this.state, z, svgPaint);
                return;
            } else if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        if (resolveIRI instanceof SVG.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVG.SvgLinearGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVG.SvgRadialGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SolidColor) {
            setSolidColor(z, (SVG.SolidColor) resolveIRI);
        }
    }

    private void makeLinearGradient(boolean z, SVG.Box box, SVG.SvgLinearGradient svgLinearGradient) {
        float f;
        float floatValue;
        float f2;
        float f3;
        String str = svgLinearGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgLinearGradient, str);
        }
        Boolean bool = svgLinearGradient.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            SVG.Length length = svgLinearGradient.x1;
            float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = svgLinearGradient.y1;
            float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = svgLinearGradient.x2;
            float floatValueX2 = length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width;
            SVG.Length length4 = svgLinearGradient.y2;
            f3 = floatValueX2;
            f = floatValueX;
            f2 = floatValueY;
            floatValue = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVG.Length length5 = svgLinearGradient.x1;
            float floatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = svgLinearGradient.y1;
            float floatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = svgLinearGradient.x2;
            float floatValue4 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
            SVG.Length length8 = svgLinearGradient.y2;
            f = floatValue2;
            floatValue = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            f2 = floatValue3;
            f3 = floatValue4;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgLinearGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgLinearGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = svgLinearGradient.children.iterator();
        float f4 = -1.0f;
        while (it.hasNext()) {
            SVG.Stop stop = (SVG.Stop) ((SVG.SvgObject) it.next());
            Float f5 = stop.offset;
            float floatValue5 = f5 != null ? f5.floatValue() : 0.0f;
            if (i == 0 || floatValue5 >= f4) {
                fArr[i] = floatValue5;
                f4 = floatValue5;
            } else {
                fArr[i] = f4;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Style style = this.state.style;
            SVG.Colour colour = (SVG.Colour) style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i++;
            statePop();
        }
        if ((f == f3 && f2 == floatValue) || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = svgLinearGradient.spreadMethod;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        statePop();
        LinearGradient linearGradient = new LinearGradient(f, f2, f3, floatValue, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    private void makeRadialGradient(boolean z, SVG.Box box, SVG.SvgRadialGradient svgRadialGradient) {
        float f;
        float floatValue;
        float f2;
        String str = svgRadialGradient.href;
        if (str != null) {
            fillInChainedGradientFields(svgRadialGradient, str);
        }
        Boolean bool = svgRadialGradient.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        RendererState rendererState = this.state;
        Paint paint = z ? rendererState.fillPaint : rendererState.strokePaint;
        if (z2) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            SVG.Length length2 = svgRadialGradient.cx;
            float floatValueX = length2 != null ? length2.floatValueX(this) : length.floatValueX(this);
            SVG.Length length3 = svgRadialGradient.cy;
            float floatValueY = length3 != null ? length3.floatValueY(this) : length.floatValueY(this);
            SVG.Length length4 = svgRadialGradient.r;
            floatValue = length4 != null ? length4.floatValue(this) : length.floatValue(this);
            f = floatValueX;
            f2 = floatValueY;
        } else {
            SVG.Length length5 = svgRadialGradient.cx;
            float floatValue2 = length5 != null ? length5.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length6 = svgRadialGradient.cy;
            float floatValue3 = length6 != null ? length6.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length7 = svgRadialGradient.r;
            f = floatValue2;
            floatValue = length7 != null ? length7.floatValue(this, 1.0f) : 0.5f;
            f2 = floatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = svgRadialGradient.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgRadialGradient.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
                return;
            } else {
                this.state.hasStroke = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = svgRadialGradient.children.iterator();
        float f3 = -1.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SVG.Stop stop = (SVG.Stop) ((SVG.SvgObject) it.next());
            Float f4 = stop.offset;
            float floatValue4 = f4 != null ? f4.floatValue() : 0.0f;
            if (i == 0 || floatValue4 >= f3) {
                fArr[i] = floatValue4;
                f3 = floatValue4;
            } else {
                fArr[i] = f3;
            }
            statePush();
            updateStyleForElement(this.state, stop);
            SVG.Style style = this.state.style;
            SVG.Colour colour = (SVG.Colour) style.stopColor;
            if (colour == null) {
                colour = SVG.Colour.BLACK;
            }
            iArr[i] = colourWithOpacity(colour.colour, style.stopOpacity.floatValue());
            i++;
            statePop();
        }
        if (floatValue == 0.0f || size == 1) {
            statePop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = svgRadialGradient.spreadMethod;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        statePop();
        RadialGradient radialGradient = new RadialGradient(f, f2, floatValue, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
    }

    private void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgObject resolveIRI = gradientElement.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
            return;
        }
        if (!(resolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (resolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.GradientElement gradientElement2 = (SVG.GradientElement) resolveIRI;
        if (gradientElement.gradientUnitsAreUser == null) {
            gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
        }
        if (gradientElement.gradientTransform == null) {
            gradientElement.gradientTransform = gradientElement2.gradientTransform;
        }
        if (gradientElement.spreadMethod == null) {
            gradientElement.spreadMethod = gradientElement2.spreadMethod;
        }
        if (gradientElement.children.isEmpty()) {
            gradientElement.children = gradientElement2.children;
        }
        try {
            if (gradientElement instanceof SVG.SvgLinearGradient) {
                fillInChainedGradientFields((SVG.SvgLinearGradient) gradientElement, (SVG.SvgLinearGradient) resolveIRI);
            } else {
                fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) resolveIRI);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = gradientElement2.href;
        if (str2 != null) {
            fillInChainedGradientFields(gradientElement, str2);
        }
    }

    private void fillInChainedGradientFields(SVG.SvgLinearGradient svgLinearGradient, SVG.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.x1 == null) {
            svgLinearGradient.x1 = svgLinearGradient2.x1;
        }
        if (svgLinearGradient.y1 == null) {
            svgLinearGradient.y1 = svgLinearGradient2.y1;
        }
        if (svgLinearGradient.x2 == null) {
            svgLinearGradient.x2 = svgLinearGradient2.x2;
        }
        if (svgLinearGradient.y2 == null) {
            svgLinearGradient.y2 = svgLinearGradient2.y2;
        }
    }

    private void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.cx == null) {
            svgRadialGradient.cx = svgRadialGradient2.cx;
        }
        if (svgRadialGradient.cy == null) {
            svgRadialGradient.cy = svgRadialGradient2.cy;
        }
        if (svgRadialGradient.r == null) {
            svgRadialGradient.r = svgRadialGradient2.r;
        }
        if (svgRadialGradient.fx == null) {
            svgRadialGradient.fx = svgRadialGradient2.fx;
        }
        if (svgRadialGradient.fy == null) {
            svgRadialGradient.fy = svgRadialGradient2.fy;
        }
    }

    private void setSolidColor(boolean z, SVG.SolidColor solidColor) {
        if (z) {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                RendererState rendererState = this.state;
                SVG.Style style = rendererState.style;
                SVG.SvgPaint svgPaint = solidColor.baseStyle.solidColor;
                style.fill = svgPaint;
                rendererState.hasFill = svgPaint != null;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                RendererState rendererState2 = this.state;
                setPaintColour(rendererState2, z, rendererState2.style.fill);
                return;
            }
            return;
        }
        if (isSpecified(solidColor.baseStyle, 2147483648L)) {
            RendererState rendererState3 = this.state;
            SVG.Style style2 = rendererState3.style;
            SVG.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
            style2.stroke = svgPaint2;
            rendererState3.hasStroke = svgPaint2 != null;
        }
        if (isSpecified(solidColor.baseStyle, 4294967296L)) {
            this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
        }
        if (isSpecified(solidColor.baseStyle, 6442450944L)) {
            RendererState rendererState4 = this.state;
            setPaintColour(rendererState4, z, rendererState4.style.stroke);
        }
    }

    private void checkForClipPath(SVG.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path calculateClipPath;
        if (this.state.style.clipPath == null || (calculateClipPath = calculateClipPath(svgElement, box)) == null) {
            return;
        }
        this.canvas.clipPath(calculateClipPath);
    }

    private Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path objectToPath;
        SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.SvgObject svgObject : clipPath.children) {
            if ((svgObject instanceof SVG.SvgElement) && (objectToPath = objectToPath((SVG.SvgElement) svgObject, true)) != null) {
                path.op(objectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path calculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (calculateClipPath != null) {
                path.op(calculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = (RendererState) this.stateStack.pop();
        return path;
    }

    private Path objectToPath(SVG.SvgElement svgElement, boolean z) {
        Path makePathAndBoundingBox;
        Path calculateClipPath;
        this.stateStack.push(this.state);
        RendererState rendererState = new RendererState(this.state);
        this.state = rendererState;
        updateStyleForElement(rendererState, svgElement);
        if (!display() || !visible()) {
            this.state = (RendererState) this.stateStack.pop();
            return null;
        }
        if (svgElement instanceof SVG.Use) {
            if (!z) {
                error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.Use use = (SVG.Use) svgElement;
            SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                this.state = (RendererState) this.stateStack.pop();
                return null;
            }
            if (!(resolveIRI instanceof SVG.SvgElement)) {
                this.state = (RendererState) this.stateStack.pop();
                return null;
            }
            makePathAndBoundingBox = objectToPath((SVG.SvgElement) resolveIRI, false);
            if (makePathAndBoundingBox == null) {
                return null;
            }
            if (use.boundingBox == null) {
                use.boundingBox = calculatePathBounds(makePathAndBoundingBox);
            }
            Matrix matrix = use.transform;
            if (matrix != null) {
                makePathAndBoundingBox.transform(matrix);
            }
        } else if (svgElement instanceof SVG.GraphicsElement) {
            SVG.GraphicsElement graphicsElement = (SVG.GraphicsElement) svgElement;
            if (svgElement instanceof SVG.Path) {
                makePathAndBoundingBox = new PathConverter(((SVG.Path) svgElement).d).getPath();
                if (svgElement.boundingBox == null) {
                    svgElement.boundingBox = calculatePathBounds(makePathAndBoundingBox);
                }
            } else {
                makePathAndBoundingBox = svgElement instanceof SVG.Rect ? makePathAndBoundingBox((SVG.Rect) svgElement) : svgElement instanceof SVG.Circle ? makePathAndBoundingBox((SVG.Circle) svgElement) : svgElement instanceof SVG.Ellipse ? makePathAndBoundingBox((SVG.Ellipse) svgElement) : svgElement instanceof SVG.PolyLine ? makePathAndBoundingBox((SVG.PolyLine) svgElement) : null;
            }
            if (makePathAndBoundingBox == null) {
                return null;
            }
            if (graphicsElement.boundingBox == null) {
                graphicsElement.boundingBox = calculatePathBounds(makePathAndBoundingBox);
            }
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                makePathAndBoundingBox.transform(matrix2);
            }
            makePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else if (svgElement instanceof SVG.Text) {
            SVG.Text text = (SVG.Text) svgElement;
            makePathAndBoundingBox = makePathAndBoundingBox(text);
            if (makePathAndBoundingBox == null) {
                return null;
            }
            Matrix matrix3 = text.transform;
            if (matrix3 != null) {
                makePathAndBoundingBox.transform(matrix3);
            }
            makePathAndBoundingBox.setFillType(getClipRuleFromState());
        } else {
            error("Invalid %s element found in clipPath definition", svgElement.getNodeName());
            return null;
        }
        if (this.state.style.clipPath != null && (calculateClipPath = calculateClipPath(svgElement, svgElement.boundingBox)) != null) {
            makePathAndBoundingBox.op(calculateClipPath, Path.Op.INTERSECT);
        }
        this.state = (RendererState) this.stateStack.pop();
        return makePathAndBoundingBox;
    }

    private Path.FillType getClipRuleFromState() {
        SVG.Style.FillRule fillRule = this.state.style.clipRule;
        if (fillRule != null && fillRule == SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    private class PlainTextToPath extends TextProcessor {
        Path textAsPath;
        float x;
        float y;

        PlainTextToPath(float f, float f2, Path path) {
            super(SVGAndroidRenderer.this, null);
            this.x = f;
            this.y = f2;
            this.textAsPath = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str, 0, str.length(), this.x, this.y, path);
                this.textAsPath.addPath(path);
            }
            this.x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private Path makePathAndBoundingBox(SVG.Line line) {
        SVG.Length length = line.x1;
        float floatValueX = length == null ? 0.0f : length.floatValueX(this);
        SVG.Length length2 = line.y1;
        float floatValueY = length2 == null ? 0.0f : length2.floatValueY(this);
        SVG.Length length3 = line.x2;
        float floatValueX2 = length3 == null ? 0.0f : length3.floatValueX(this);
        SVG.Length length4 = line.y2;
        float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        if (line.boundingBox == null) {
            line.boundingBox = new SVG.Box(Math.min(floatValueX, floatValueX2), Math.min(floatValueY, floatValueY2), Math.abs(floatValueX2 - floatValueX), Math.abs(floatValueY2 - floatValueY));
        }
        Path path = new Path();
        path.moveTo(floatValueX, floatValueY);
        path.lineTo(floatValueX2, floatValueY2);
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path makePathAndBoundingBox(SVG.Rect rect) {
        float floatValueX;
        float floatValueY;
        float min;
        float floatValueX2;
        float floatValueY2;
        float f;
        float f2;
        Path path;
        Path path2;
        SVG.Length length = rect.rx;
        if (length == null && rect.ry == null) {
            floatValueX = 0.0f;
        } else if (length == null) {
            floatValueX = rect.ry.floatValueY(this);
        } else if (rect.ry == null) {
            floatValueX = length.floatValueX(this);
        } else {
            floatValueX = length.floatValueX(this);
            floatValueY = rect.ry.floatValueY(this);
            min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
            float min2 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
            SVG.Length length2 = rect.x;
            floatValueX2 = length2 == null ? length2.floatValueX(this) : 0.0f;
            SVG.Length length3 = rect.y;
            floatValueY2 = length3 == null ? length3.floatValueY(this) : 0.0f;
            float floatValueX3 = rect.width.floatValueX(this);
            float floatValueY3 = rect.height.floatValueY(this);
            if (rect.boundingBox == null) {
                rect.boundingBox = new SVG.Box(floatValueX2, floatValueY2, floatValueX3, floatValueY3);
            }
            f = floatValueX2 + floatValueX3;
            f2 = floatValueY2 + floatValueY3;
            path = new Path();
            if (min != 0.0f || min2 == 0.0f) {
                path2 = path;
                path2.moveTo(floatValueX2, floatValueY2);
                path2.lineTo(f, floatValueY2);
                path2.lineTo(f, f2);
                path2.lineTo(floatValueX2, f2);
                path2.lineTo(floatValueX2, floatValueY2);
            } else {
                float f3 = min * 0.5522848f;
                float f4 = 0.5522848f * min2;
                float f5 = floatValueY2 + min2;
                path.moveTo(floatValueX2, f5);
                float f6 = f5 - f4;
                float f7 = floatValueX2 + min;
                float f8 = f7 - f3;
                path.cubicTo(floatValueX2, f6, f8, floatValueY2, f7, floatValueY2);
                float f9 = f - min;
                path.lineTo(f9, floatValueY2);
                float f10 = f9 + f3;
                path.cubicTo(f10, floatValueY2, f, f6, f, f5);
                float f11 = f2 - min2;
                path.lineTo(f, f11);
                float f12 = f11 + f4;
                path2 = path;
                path.cubicTo(f, f12, f10, f2, f9, f2);
                path2.lineTo(f7, f2);
                path2.cubicTo(f8, f2, floatValueX2, f12, floatValueX2, f11);
                path2.lineTo(floatValueX2, f5);
            }
            path2.close();
            return path2;
        }
        floatValueY = floatValueX;
        min = Math.min(floatValueX, rect.width.floatValueX(this) / 2.0f);
        float min22 = Math.min(floatValueY, rect.height.floatValueY(this) / 2.0f);
        SVG.Length length22 = rect.x;
        if (length22 == null) {
        }
        SVG.Length length32 = rect.y;
        if (length32 == null) {
        }
        float floatValueX32 = rect.width.floatValueX(this);
        float floatValueY32 = rect.height.floatValueY(this);
        if (rect.boundingBox == null) {
        }
        f = floatValueX2 + floatValueX32;
        f2 = floatValueY2 + floatValueY32;
        path = new Path();
        if (min != 0.0f) {
        }
        path2 = path;
        path2.moveTo(floatValueX2, floatValueY2);
        path2.lineTo(f, floatValueY2);
        path2.lineTo(f, f2);
        path2.lineTo(floatValueX2, f2);
        path2.lineTo(floatValueX2, floatValueY2);
        path2.close();
        return path2;
    }

    private Path makePathAndBoundingBox(SVG.Circle circle) {
        SVG.Length length = circle.cx;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = circle.cy;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float floatValue = circle.r.floatValue(this);
        float f = floatValueX - floatValue;
        float f2 = floatValueY - floatValue;
        float f3 = floatValueX + floatValue;
        float f4 = floatValueY + floatValue;
        if (circle.boundingBox == null) {
            float f5 = 2.0f * floatValue;
            circle.boundingBox = new SVG.Box(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * floatValue;
        Path path = new Path();
        path.moveTo(floatValueX, f2);
        float f7 = floatValueX + f6;
        float f8 = floatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, floatValueY);
        float f9 = floatValueY + f6;
        path.cubicTo(f3, f9, f7, f4, floatValueX, f4);
        float f10 = floatValueX - f6;
        path.cubicTo(f10, f4, f, f9, f, floatValueY);
        path.cubicTo(f, f8, f10, f2, floatValueX, f2);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        SVG.Length length = ellipse.cx;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = ellipse.cy;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        float floatValueX2 = ellipse.rx.floatValueX(this);
        float floatValueY2 = ellipse.ry.floatValueY(this);
        float f = floatValueX - floatValueX2;
        float f2 = floatValueY - floatValueY2;
        float f3 = floatValueX + floatValueX2;
        float f4 = floatValueY + floatValueY2;
        if (ellipse.boundingBox == null) {
            ellipse.boundingBox = new SVG.Box(f, f2, floatValueX2 * 2.0f, 2.0f * floatValueY2);
        }
        float f5 = floatValueX2 * 0.5522848f;
        float f6 = 0.5522848f * floatValueY2;
        Path path = new Path();
        path.moveTo(floatValueX, f2);
        float f7 = floatValueX + f5;
        float f8 = floatValueY - f6;
        path.cubicTo(f7, f2, f3, f8, f3, floatValueY);
        float f9 = f6 + floatValueY;
        path.cubicTo(f3, f9, f7, f4, floatValueX, f4);
        float f10 = floatValueX - f5;
        path.cubicTo(f10, f4, f, f9, f, floatValueY);
        path.cubicTo(f, f8, f10, f2, floatValueX, f2);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = polyLine.points;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Text text) {
        List list = text.x;
        float f = 0.0f;
        float floatValueX = (list == null || list.size() == 0) ? 0.0f : ((SVG.Length) text.x.get(0)).floatValueX(this);
        List list2 = text.y;
        float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.Length) text.y.get(0)).floatValueY(this);
        List list3 = text.dx;
        float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.Length) text.dx.get(0)).floatValueX(this);
        List list4 = text.dy;
        if (list4 != null && list4.size() != 0) {
            f = ((SVG.Length) text.dy.get(0)).floatValueY(this);
        }
        if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
            float calculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                calculateTextWidth /= 2.0f;
            }
            floatValueX -= calculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
            enumerateTextSpans(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.bbox;
            text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path));
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6 A[LOOP:3: B:67:0x01f0->B:69:0x01f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void fillWithPattern(SVG.SvgElement svgElement, Path path, SVG.Pattern pattern) {
        float f;
        float f2;
        float f3;
        float f4;
        PreserveAspectRatio preserveAspectRatio;
        boolean z;
        boolean z2;
        float floor;
        float maxY;
        boolean pushLayer;
        PreserveAspectRatio preserveAspectRatio2;
        Iterator it;
        Boolean bool = pattern.patternUnitsAreUser;
        boolean z3 = bool != null && bool.booleanValue();
        String str = pattern.href;
        if (str != null) {
            fillInChainedPatternFields(pattern, str);
        }
        if (z3) {
            SVG.Length length = pattern.x;
            f = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = pattern.y;
            f3 = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = pattern.width;
            f4 = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVG.Length length4 = pattern.height;
            f2 = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVG.Length length5 = pattern.x;
            float floatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = pattern.y;
            float floatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = pattern.width;
            float floatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length8 = pattern.height;
            float floatValue4 = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            SVG.Box box = svgElement.boundingBox;
            float f5 = box.minX;
            float f6 = box.width;
            f = (floatValue * f6) + f5;
            float f7 = box.minY;
            float f8 = box.height;
            float f9 = floatValue3 * f6;
            f2 = floatValue4 * f8;
            f3 = (floatValue2 * f8) + f7;
            f4 = f9;
        }
        if (f4 == 0.0f || f2 == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio3 = pattern.preserveAspectRatio;
        if (preserveAspectRatio3 == null) {
            preserveAspectRatio3 = PreserveAspectRatio.LETTERBOX;
        }
        statePush();
        this.canvas.clipPath(path);
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        rendererState.style.overflow = Boolean.FALSE;
        this.state = findInheritFromAncestorState(pattern, rendererState);
        SVG.Box box2 = svgElement.boundingBox;
        Matrix matrix = pattern.patternTransform;
        if (matrix != null) {
            this.canvas.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (pattern.patternTransform.invert(matrix2)) {
                SVG.Box box3 = svgElement.boundingBox;
                float f10 = box3.minX;
                float f11 = box3.minY;
                float maxX = box3.maxX();
                SVG.Box box4 = svgElement.boundingBox;
                float f12 = box4.minY;
                float maxX2 = box4.maxX();
                float maxY2 = svgElement.boundingBox.maxY();
                SVG.Box box5 = svgElement.boundingBox;
                preserveAspectRatio = preserveAspectRatio3;
                float[] fArr = {f10, f11, maxX, f12, maxX2, maxY2, box5.minX, box5.maxY()};
                matrix2.mapPoints(fArr);
                z2 = false;
                float f13 = fArr[0];
                float f14 = fArr[1];
                RectF rectF = new RectF(f13, f14, f13, f14);
                for (int i = 2; i <= 6; i += 2) {
                    float f15 = fArr[i];
                    if (f15 < rectF.left) {
                        rectF.left = f15;
                    }
                    if (f15 > rectF.right) {
                        rectF.right = f15;
                    }
                    float f16 = fArr[i + 1];
                    if (f16 < rectF.top) {
                        rectF.top = f16;
                    }
                    if (f16 > rectF.bottom) {
                        rectF.bottom = f16;
                    }
                }
                z = true;
                float f17 = rectF.left;
                float f18 = rectF.top;
                box2 = new SVG.Box(f17, f18, rectF.right - f17, rectF.bottom - f18);
                float floor2 = f + (((float) Math.floor((box2.minX - f) / f4)) * f4);
                floor = f3 + (((float) Math.floor((box2.minY - f3) / f2)) * f2);
                float maxX3 = box2.maxX();
                maxY = box2.maxY();
                SVG.Box box6 = new SVG.Box(0.0f, 0.0f, f4, f2);
                pushLayer = pushLayer();
                while (floor < maxY) {
                    float f19 = floor2;
                    while (f19 < maxX3) {
                        box6.minX = f19;
                        box6.minY = floor;
                        statePush();
                        if (!this.state.style.overflow.booleanValue()) {
                            setClipRect(box6.minX, box6.minY, box6.width, box6.height);
                        }
                        SVG.Box box7 = pattern.viewBox;
                        if (box7 != null) {
                            preserveAspectRatio2 = preserveAspectRatio;
                            this.canvas.concat(calculateViewBoxTransform(box6, box7, preserveAspectRatio2));
                        } else {
                            preserveAspectRatio2 = preserveAspectRatio;
                            Boolean bool2 = pattern.patternContentUnitsAreUser;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            this.canvas.translate(f19, floor);
                            if (!z4) {
                                Canvas canvas = this.canvas;
                                SVG.Box box8 = svgElement.boundingBox;
                                canvas.scale(box8.width, box8.height);
                                it = pattern.children.iterator();
                                while (it.hasNext()) {
                                    render((SVG.SvgObject) it.next());
                                }
                                statePop();
                                f19 += f4;
                                preserveAspectRatio = preserveAspectRatio2;
                                z = true;
                            }
                        }
                        it = pattern.children.iterator();
                        while (it.hasNext()) {
                        }
                        statePop();
                        f19 += f4;
                        preserveAspectRatio = preserveAspectRatio2;
                        z = true;
                    }
                    floor += f2;
                    z = true;
                }
                if (pushLayer) {
                    popLayer(pattern);
                }
                statePop();
            }
        }
        preserveAspectRatio = preserveAspectRatio3;
        z = true;
        z2 = false;
        float floor22 = f + (((float) Math.floor((box2.minX - f) / f4)) * f4);
        floor = f3 + (((float) Math.floor((box2.minY - f3) / f2)) * f2);
        float maxX32 = box2.maxX();
        maxY = box2.maxY();
        SVG.Box box62 = new SVG.Box(0.0f, 0.0f, f4, f2);
        pushLayer = pushLayer();
        while (floor < maxY) {
        }
        if (pushLayer) {
        }
        statePop();
    }

    private void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgObject resolveIRI = pattern.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
            return;
        }
        if (!(resolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (resolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.Pattern pattern2 = (SVG.Pattern) resolveIRI;
        if (pattern.patternUnitsAreUser == null) {
            pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
        }
        if (pattern.patternContentUnitsAreUser == null) {
            pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
        }
        if (pattern.patternTransform == null) {
            pattern.patternTransform = pattern2.patternTransform;
        }
        if (pattern.x == null) {
            pattern.x = pattern2.x;
        }
        if (pattern.y == null) {
            pattern.y = pattern2.y;
        }
        if (pattern.width == null) {
            pattern.width = pattern2.width;
        }
        if (pattern.height == null) {
            pattern.height = pattern2.height;
        }
        if (pattern.children.isEmpty()) {
            pattern.children = pattern2.children;
        }
        if (pattern.viewBox == null) {
            pattern.viewBox = pattern2.viewBox;
        }
        if (pattern.preserveAspectRatio == null) {
            pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
        }
        String str2 = pattern2.href;
        if (str2 != null) {
            fillInChainedPatternFields(pattern, str2);
        }
    }

    private void renderMask(SVG.Mask mask, SVG.SvgElement svgElement, SVG.Box box) {
        float f;
        float f2;
        debug("Mask render", new Object[0]);
        Boolean bool = mask.maskUnitsAreUser;
        if (bool != null && bool.booleanValue()) {
            SVG.Length length = mask.width;
            f = length != null ? length.floatValueX(this) : box.width;
            SVG.Length length2 = mask.height;
            f2 = length2 != null ? length2.floatValueY(this) : box.height;
        } else {
            SVG.Length length3 = mask.width;
            float floatValue = length3 != null ? length3.floatValue(this, 1.0f) : 1.2f;
            SVG.Length length4 = mask.height;
            float floatValue2 = length4 != null ? length4.floatValue(this, 1.0f) : 1.2f;
            f = floatValue * box.width;
            f2 = floatValue2 * box.height;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        statePush();
        RendererState findInheritFromAncestorState = findInheritFromAncestorState(mask);
        this.state = findInheritFromAncestorState;
        findInheritFromAncestorState.style.opacity = Float.valueOf(1.0f);
        boolean pushLayer = pushLayer();
        this.canvas.save();
        Boolean bool2 = mask.maskContentUnitsAreUser;
        if (bool2 != null && !bool2.booleanValue()) {
            this.canvas.translate(box.minX, box.minY);
            this.canvas.scale(box.width, box.height);
        }
        renderChildren(mask, false);
        this.canvas.restore();
        if (pushLayer) {
            popLayer(svgElement, box);
        }
        statePop();
    }
}
