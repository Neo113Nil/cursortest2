package dev.chrisbanes.haze;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Surface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public abstract class HazeKt {
    public static final void access$drawGraphicsLayer(Surface surface, GraphicsLayer graphicsLayer, Density density, CanvasDrawScope canvasDrawScope) {
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.getClass();
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            CanvasDrawScope.DrawParams drawParams = canvasDrawScope.drawParams;
            LayoutDirection layoutDirection = drawParams.layoutDirection;
            Canvas canvas = AndroidCanvas_androidKt.EmptyCanvas;
            AndroidCanvas androidCanvas = new AndroidCanvas();
            androidCanvas.internalCanvas = lockHardwareCanvas;
            float width = lockHardwareCanvas.getWidth();
            float height = lockHardwareCanvas.getHeight();
            long floatToRawIntBits = (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32);
            Density density2 = drawParams.density;
            LayoutDirection layoutDirection2 = drawParams.layoutDirection;
            androidx.compose.ui.graphics.Canvas canvas2 = drawParams.canvas;
            long j = drawParams.size;
            drawParams.density = density;
            drawParams.layoutDirection = layoutDirection;
            drawParams.canvas = androidCanvas;
            drawParams.size = floatToRawIntBits;
            androidCanvas.save();
            SizeKt.drawLayer(canvasDrawScope, graphicsLayer);
            androidCanvas.restore();
            drawParams.density = density2;
            drawParams.layoutDirection = layoutDirection2;
            drawParams.canvas = canvas2;
            drawParams.size = j;
        } finally {
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: createScaledContentLayer-wZMzALA, reason: not valid java name */
    public static final GraphicsLayer m4110createScaledContentLayerwZMzALA(LayoutNodeDrawScope layoutNodeDrawScope, HazeEffectNode hazeEffectNode, float f, long j, long j2) {
        long m3989roundToIntSizeuvyYCjk = Countries.m3989roundToIntSizeuvyYCjk(Size.m645times7Ah8Wj8(j, f));
        if (((int) (m3989roundToIntSizeuvyYCjk >> 32)) <= 0 || ((int) (BodyPartID.bodyIdMax & m3989roundToIntSizeuvyYCjk)) <= 0) {
            return null;
        }
        GraphicsLayer createGraphicsLayer = ((GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext)).createGraphicsLayer();
        layoutNodeDrawScope.m876recordJVtK1S4(m3989roundToIntSizeuvyYCjk, createGraphicsLayer, new BlurEffectKt$$ExternalSyntheticLambda0(hazeEffectNode, f, j2, 0));
        return createGraphicsLayer;
    }

    public static final void drawContentSafely(LayoutNodeDrawScope layoutNodeDrawScope) {
        try {
            layoutNodeDrawScope.drawContent();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (!StringsKt.contains((CharSequence) message, (CharSequence) "mViewFlags", false) && !StringsKt.contains((CharSequence) message, (CharSequence) "LayoutNode", false)) {
                throw e;
            }
        }
    }

    /* renamed from: drawScaledContent-LF441nw, reason: not valid java name */
    public static final void m4111drawScaledContentLF441nw(DrawScope drawScope, long j, long j2, boolean z, Function1 function1) {
        GrpcMethod drawContext;
        long m3999getSizeNHjbRc;
        drawScope.getClass();
        float max = Math.max(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
        GrpcMethod drawContext2 = drawScope.getDrawContext();
        long m3999getSizeNHjbRc2 = drawContext2.m3999getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            Extras.Key key = (Extras.Key) drawContext2.path;
            if (z) {
                key.m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intBitsToFloat, intBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || Offset.m622equalsimpl0(j, 0L)) {
                drawContext = drawScope.getDrawContext();
                m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    ((Extras.Key) drawContext.path).m1437scale0AR0LA0(max, max, 0L);
                    function1.invoke(drawScope);
                    Recorder$$ExternalSyntheticOutline2.m(drawContext2, m3999getSizeNHjbRc2);
                } finally {
                }
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            ((Extras.Key) drawScope.getDrawContext().path).translate(intBitsToFloat3, intBitsToFloat4);
            try {
                drawContext = drawScope.getDrawContext();
                m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    ((Extras.Key) drawContext.path).m1437scale0AR0LA0(max, max, 0L);
                    function1.invoke(drawScope);
                    drawContext.getCanvas().restore();
                    drawContext.m4000setSizeuvyYCjk(m3999getSizeNHjbRc);
                    Recorder$$ExternalSyntheticOutline2.m(drawContext2, m3999getSizeNHjbRc2);
                } finally {
                }
            } finally {
                ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat3, -intBitsToFloat4);
            }
        } catch (Throwable th) {
            Recorder$$ExternalSyntheticOutline2.m(drawContext2, m3999getSizeNHjbRc2);
            throw th;
        }
    }

    /* renamed from: drawScrim-DBWKusU, reason: not valid java name */
    public static final void m4112drawScrimDBWKusU(DrawScope drawScope, HazeTint hazeTint, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, long j, long j2) {
        drawScope.getClass();
        hazeTint.getClass();
        Brush brush = hazeTint.brush;
        if (brush != null) {
            DrawScope.m746drawRectAsUm42w$default(drawScope, brush, j, drawScope.mo753getSizeNHjbRc(), RecyclerView.DECELERATION_RATE, null, null, hazeTint.blendMode, 56);
        } else {
            DrawScope.m747drawRectnJ9OG0$default(drawScope, hazeTint.color, 0L, j2, RecyclerView.DECELERATION_RATE, null, null, hazeTint.blendMode, 58);
        }
    }

    public static Modifier hazeEffect$default(HazeState hazeState, HazeStyle hazeStyle) {
        return new HazeEffectNodeElement(hazeState, hazeStyle);
    }

    public static Modifier hazeSource$default(Modifier modifier, HazeState hazeState) {
        modifier.getClass();
        return modifier.then(new HazeSourceElement(hazeState));
    }

    public static final HazeState rememberHazeState(Composer composer) {
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = HazeDefaults.blurredEdgeTreatment;
        boolean z = Build.VERSION.SDK_INT >= 31;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new HazeState(z);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        HazeState hazeState = (HazeState) rememberedValue;
        hazeState.blurEnabled$delegate.setValue(Boolean.valueOf(z));
        return hazeState;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m4113toAndroidBlendModes9anfk8(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 27 ? BlendMode.COLOR : i == 19 ? BlendMode.COLOR_BURN : i == 18 ? BlendMode.COLOR_DODGE : i == 16 ? BlendMode.DARKEN : i == 22 ? BlendMode.DIFFERENCE : i == 2 ? BlendMode.DST : i == 10 ? BlendMode.DST_ATOP : i == 6 ? BlendMode.DST_IN : i == 8 ? BlendMode.DST_OUT : i == 4 ? BlendMode.DST_OVER : i == 23 ? BlendMode.EXCLUSION : i == 20 ? BlendMode.HARD_LIGHT : i == 25 ? BlendMode.HUE : i == 17 ? BlendMode.LIGHTEN : i == 28 ? BlendMode.LUMINOSITY : i == 13 ? BlendMode.MODULATE : i == 24 ? BlendMode.MULTIPLY : i == 15 ? BlendMode.OVERLAY : i == 26 ? BlendMode.SATURATION : i == 14 ? BlendMode.SCREEN : i == 21 ? BlendMode.SOFT_LIGHT : i == 1 ? BlendMode.SRC : i == 9 ? BlendMode.SRC_ATOP : i == 5 ? BlendMode.SRC_IN : i == 7 ? BlendMode.SRC_OUT : i == 3 ? BlendMode.SRC_OVER : BlendMode.SRC_IN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.Result$Failure] */
    public static final void updateBlurEffectIfNeeded(HazeEffectNode hazeEffectNode, LayoutNodeDrawScope layoutNodeDrawScope) {
        RenderScriptBlurEffect failure;
        boolean z = Build.VERSION.SDK_INT >= 31 && AndroidCanvas_androidKt.getNativeCanvas(layoutNodeDrawScope.canvasDrawScope.drawContext.getCanvas()).isHardwareAccelerated();
        boolean resolveBlurEnabled = HazeEffectNodeKt.resolveBlurEnabled(hazeEffectNode);
        if (resolveBlurEnabled && z) {
            BlurEffect blurEffect = hazeEffectNode.blurEffect;
            if (!(blurEffect instanceof RenderEffectBlurEffect)) {
                blurEffect = new RenderEffectBlurEffect(hazeEffectNode);
            }
            hazeEffectNode.setBlurEffect$haze_release(blurEffect);
            return;
        }
        if (resolveBlurEnabled) {
            BlurEffect blurEffect2 = hazeEffectNode.blurEffect;
            if (!(blurEffect2 instanceof RenderScriptBlurEffect)) {
                if (RenderScriptBlurEffect.isEnabled) {
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = new RenderScriptBlurEffect(hazeEffectNode);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    if (Result.m4120exceptionOrNullimpl(failure) != null) {
                        RenderScriptBlurEffect.isEnabled = false;
                    }
                    r0 = failure instanceof Result.Failure ? null : failure;
                }
                blurEffect2 = r0;
            }
            if (blurEffect2 != null) {
                hazeEffectNode.setBlurEffect$haze_release(blurEffect2);
                return;
            }
        }
        if (hazeEffectNode.blurEffect instanceof ScrimBlurEffect) {
            return;
        }
        hazeEffectNode.setBlurEffect$haze_release(new ScrimBlurEffect(hazeEffectNode));
    }
}
