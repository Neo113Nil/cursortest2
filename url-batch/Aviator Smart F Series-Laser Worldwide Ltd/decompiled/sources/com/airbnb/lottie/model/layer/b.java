package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, com.airbnb.lottie.model.e {
    private static final int CLIP_SAVE_FLAG = 2;
    private static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    private static final int MATRIX_SAVE_FLAG = 1;
    private static final int SAVE_FLAGS = 19;
    private final List<com.airbnb.lottie.animation.keyframe.a> animations;

    @Nullable
    BlurMaskFilter blurMaskFilter;
    float blurMaskFilterRadius;
    final Matrix boundsMatrix;
    private final RectF canvasBounds;
    private final Paint clearPaint;
    private final String drawTraceName;
    private final Paint dstInPaint;
    private final Paint dstOutPaint;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.d inOutAnimation;
    final Layer layerModel;
    final LottieDrawable lottieDrawable;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.h mask;
    private final RectF maskBoundsRect;
    private final RectF matteBoundsRect;

    @Nullable
    private b matteLayer;
    private final Paint mattePaint;
    private boolean outlineMasksAndMattes;

    @Nullable
    private Paint outlineMasksAndMattesPaint;

    @Nullable
    private b parentLayer;
    private List<b> parentLayers;
    private final RectF rect;
    private final RectF tempMaskBoundsRect;
    final p transform;
    private boolean visible;
    private final Path path = new Path();
    private final Matrix matrix = new Matrix();
    private final Matrix canvasMatrix = new Matrix();
    private final Paint contentPaint = new v.a(1);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode;
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.dstInPaint = new v.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.dstOutPaint = new v.a(1, mode2);
        v.a aVar = new v.a(1);
        this.mattePaint = aVar;
        this.clearPaint = new v.a(PorterDuff.Mode.CLEAR);
        this.rect = new RectF();
        this.canvasBounds = new RectF();
        this.maskBoundsRect = new RectF();
        this.matteBoundsRect = new RectF();
        this.tempMaskBoundsRect = new RectF();
        this.boundsMatrix = new Matrix();
        this.animations = new ArrayList();
        this.visible = true;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layerModel = layer;
        this.drawTraceName = layer.getName() + "#draw";
        if (layer.getMatteType() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p createAnimation = layer.getTransform().createAnimation();
        this.transform = createAnimation;
        createAnimation.addListener(this);
        if (layer.getMasks() != null && !layer.getMasks().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(layer.getMasks());
            this.mask = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a> it = hVar.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a aVar2 : this.mask.getOpacityAnimations()) {
                addAnimation(aVar2);
                aVar2.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    private void applyAddMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar, com.airbnb.lottie.animation.keyframe.a aVar2) {
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar, com.airbnb.lottie.animation.keyframe.a aVar2) {
        j.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.path, this.contentPaint);
        canvas.restore();
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar, com.airbnb.lottie.animation.keyframe.a aVar2) {
        j.saveLayerCompat(canvas, this.rect, this.contentPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        this.contentPaint.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar, com.airbnb.lottie.animation.keyframe.a aVar2) {
        j.saveLayerCompat(canvas, this.rect, this.dstInPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar, com.airbnb.lottie.animation.keyframe.a aVar2) {
        j.saveLayerCompat(canvas, this.rect, this.dstOutPaint);
        canvas.drawRect(this.rect, this.contentPaint);
        this.dstOutPaint.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
        canvas.restore();
    }

    private void applyMasks(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.c.beginSection("Layer#saveLayer");
        j.saveLayerCompat(canvas, this.rect, this.dstInPaint, 19);
        if (Build.VERSION.SDK_INT < 28) {
            clearCanvas(canvas);
        }
        com.airbnb.lottie.c.endSection("Layer#saveLayer");
        for (int i8 = 0; i8 < this.mask.getMasks().size(); i8++) {
            Mask mask = this.mask.getMasks().get(i8);
            com.airbnb.lottie.animation.keyframe.a aVar = this.mask.getMaskAnimations().get(i8);
            com.airbnb.lottie.animation.keyframe.a aVar2 = this.mask.getOpacityAnimations().get(i8);
            int i9 = a.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask.getMaskMode().ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    if (i8 == 0) {
                        this.contentPaint.setColor(-16777216);
                        this.contentPaint.setAlpha(255);
                        canvas.drawRect(this.rect, this.contentPaint);
                    }
                    if (mask.isInverted()) {
                        applyInvertedSubtractMask(canvas, matrix, aVar, aVar2);
                    } else {
                        applySubtractMask(canvas, matrix, aVar);
                    }
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (mask.isInverted()) {
                            applyInvertedAddMask(canvas, matrix, aVar, aVar2);
                        } else {
                            applyAddMask(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (mask.isInverted()) {
                    applyInvertedIntersectMask(canvas, matrix, aVar, aVar2);
                } else {
                    applyIntersectMask(canvas, matrix, aVar, aVar2);
                }
            } else if (areAllMasksNone()) {
                this.contentPaint.setAlpha(255);
                canvas.drawRect(this.rect, this.contentPaint);
            }
        }
        com.airbnb.lottie.c.beginSection("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.c.endSection("Layer#restoreLayer");
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a aVar) {
        this.path.set((Path) aVar.getValue());
        this.path.transform(matrix);
        canvas.drawPath(this.path, this.dstOutPaint);
    }

    private boolean areAllMasksNone() {
        if (this.mask.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i8 = 0; i8 < this.mask.getMasks().size(); i8++) {
            if (this.mask.getMasks().get(i8).getMaskMode() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void buildParentLayerListIfNeeded() {
        if (this.parentLayers != null) {
            return;
        }
        if (this.parentLayer == null) {
            this.parentLayers = Collections.emptyList();
            return;
        }
        this.parentLayers = new ArrayList();
        for (b bVar = this.parentLayer; bVar != null; bVar = bVar.parentLayer) {
            this.parentLayers.add(bVar);
        }
    }

    private void clearCanvas(Canvas canvas) {
        com.airbnb.lottie.c.beginSection("Layer#clearLayer");
        RectF rectF = this.rect;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.clearPaint);
        com.airbnb.lottie.c.endSection("Layer#clearLayer");
    }

    @Nullable
    static b forModel(c cVar, Layer layer, LottieDrawable lottieDrawable, com.airbnb.lottie.h hVar) {
        switch (a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType[layer.getLayerType().ordinal()]) {
            case 1:
                return new f(lottieDrawable, layer, cVar);
            case 2:
                return new c(lottieDrawable, layer, hVar.getPrecomps(layer.getRefId()), hVar);
            case 3:
                return new g(lottieDrawable, layer);
            case 4:
                return new d(lottieDrawable, layer);
            case 5:
                return new e(lottieDrawable, layer);
            case 6:
                return new h(lottieDrawable, layer);
            default:
                com.airbnb.lottie.utils.f.warning("Unknown layer type " + layer.getLayerType());
                return null;
        }
    }

    private void intersectBoundsWithMask(RectF rectF, Matrix matrix) {
        this.maskBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (hasMasksOnThisLayer()) {
            int size = this.mask.getMasks().size();
            for (int i8 = 0; i8 < size; i8++) {
                Mask mask = this.mask.getMasks().get(i8);
                Path path = (Path) this.mask.getMaskAnimations().get(i8).getValue();
                if (path != null) {
                    this.path.set(path);
                    this.path.transform(matrix);
                    int i9 = a.$SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode[mask.getMaskMode().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        return;
                    }
                    if ((i9 == 3 || i9 == 4) && mask.isInverted()) {
                        return;
                    }
                    this.path.computeBounds(this.tempMaskBoundsRect, false);
                    if (i8 == 0) {
                        this.maskBoundsRect.set(this.tempMaskBoundsRect);
                    } else {
                        RectF rectF2 = this.maskBoundsRect;
                        rectF2.set(Math.min(rectF2.left, this.tempMaskBoundsRect.left), Math.min(this.maskBoundsRect.top, this.tempMaskBoundsRect.top), Math.max(this.maskBoundsRect.right, this.tempMaskBoundsRect.right), Math.max(this.maskBoundsRect.bottom, this.tempMaskBoundsRect.bottom));
                    }
                }
            }
            if (rectF.intersect(this.maskBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix) {
        if (hasMatteOnThisLayer() && this.layerModel.getMatteType() != Layer.MatteType.INVERT) {
            this.matteBoundsRect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.matteLayer.getBounds(this.matteBoundsRect, matrix, true);
            if (rectF.intersect(this.matteBoundsRect)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void invalidateSelf() {
        this.lottieDrawable.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupInOutAnimations$0() {
        setVisible(this.inOutAnimation.getFloatValue() == 1.0f);
    }

    private void recordRenderTime(float f8) {
        this.lottieDrawable.getComposition().getPerformanceTracker().recordRenderTime(this.layerModel.getName(), f8);
    }

    private void setVisible(boolean z7) {
        if (z7 != this.visible) {
            this.visible = z7;
            invalidateSelf();
        }
    }

    private void setupInOutAnimations() {
        if (this.layerModel.getInOutKeyframes().isEmpty()) {
            setVisible(true);
            return;
        }
        com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.layerModel.getInOutKeyframes());
        this.inOutAnimation = dVar;
        dVar.setIsDiscrete();
        this.inOutAnimation.addUpdateListener(new a.b() { // from class: com.airbnb.lottie.model.layer.a
            @Override // com.airbnb.lottie.animation.keyframe.a.b
            public final void onValueChanged() {
                b.this.lambda$setupInOutAnimations$0();
            }
        });
        setVisible(((Float) this.inOutAnimation.getValue()).floatValue() == 1.0f);
        addAnimation(this.inOutAnimation);
    }

    public void addAnimation(@Nullable com.airbnb.lottie.animation.keyframe.a aVar) {
        if (aVar == null) {
            return;
        }
        this.animations.add(aVar);
    }

    @Override // com.airbnb.lottie.model.e
    @CallSuper
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        this.transform.applyValueCallback(t7, cVar);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        Paint paint;
        com.airbnb.lottie.c.beginSection(this.drawTraceName);
        if (!this.visible || this.layerModel.isHidden()) {
            com.airbnb.lottie.c.endSection(this.drawTraceName);
            return;
        }
        buildParentLayerListIfNeeded();
        com.airbnb.lottie.c.beginSection("Layer#parentMatrix");
        this.matrix.reset();
        this.matrix.set(matrix);
        for (int size = this.parentLayers.size() - 1; size >= 0; size--) {
            this.matrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
        }
        com.airbnb.lottie.c.endSection("Layer#parentMatrix");
        int intValue = (int) ((((i8 / 255.0f) * (this.transform.getOpacity() == null ? 100 : ((Integer) this.transform.getOpacity().getValue()).intValue())) / 100.0f) * 255.0f);
        if (!hasMatteOnThisLayer() && !hasMasksOnThisLayer()) {
            this.matrix.preConcat(this.transform.getMatrix());
            com.airbnb.lottie.c.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.matrix, intValue);
            com.airbnb.lottie.c.endSection("Layer#drawLayer");
            recordRenderTime(com.airbnb.lottie.c.endSection(this.drawTraceName));
            return;
        }
        com.airbnb.lottie.c.beginSection("Layer#computeBounds");
        getBounds(this.rect, this.matrix, false);
        intersectBoundsWithMatte(this.rect, matrix);
        this.matrix.preConcat(this.transform.getMatrix());
        intersectBoundsWithMask(this.rect, this.matrix);
        this.canvasBounds.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.canvasMatrix);
        if (!this.canvasMatrix.isIdentity()) {
            Matrix matrix2 = this.canvasMatrix;
            matrix2.invert(matrix2);
            this.canvasMatrix.mapRect(this.canvasBounds);
        }
        if (!this.rect.intersect(this.canvasBounds)) {
            this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.c.endSection("Layer#computeBounds");
        if (this.rect.width() >= 1.0f && this.rect.height() >= 1.0f) {
            com.airbnb.lottie.c.beginSection("Layer#saveLayer");
            this.contentPaint.setAlpha(255);
            j.saveLayerCompat(canvas, this.rect, this.contentPaint);
            com.airbnb.lottie.c.endSection("Layer#saveLayer");
            clearCanvas(canvas);
            com.airbnb.lottie.c.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.matrix, intValue);
            com.airbnb.lottie.c.endSection("Layer#drawLayer");
            if (hasMasksOnThisLayer()) {
                applyMasks(canvas, this.matrix);
            }
            if (hasMatteOnThisLayer()) {
                com.airbnb.lottie.c.beginSection("Layer#drawMatte");
                com.airbnb.lottie.c.beginSection("Layer#saveLayer");
                j.saveLayerCompat(canvas, this.rect, this.mattePaint, 19);
                com.airbnb.lottie.c.endSection("Layer#saveLayer");
                clearCanvas(canvas);
                this.matteLayer.draw(canvas, matrix, intValue);
                com.airbnb.lottie.c.beginSection("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.c.endSection("Layer#restoreLayer");
                com.airbnb.lottie.c.endSection("Layer#drawMatte");
            }
            com.airbnb.lottie.c.beginSection("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.c.endSection("Layer#restoreLayer");
        }
        if (this.outlineMasksAndMattes && (paint = this.outlineMasksAndMattesPaint) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.outlineMasksAndMattesPaint.setColor(-251901);
            this.outlineMasksAndMattesPaint.setStrokeWidth(4.0f);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
            this.outlineMasksAndMattesPaint.setStyle(Paint.Style.FILL);
            this.outlineMasksAndMattesPaint.setColor(1357638635);
            canvas.drawRect(this.rect, this.outlineMasksAndMattesPaint);
        }
        recordRenderTime(com.airbnb.lottie.c.endSection(this.drawTraceName));
    }

    abstract void drawLayer(Canvas canvas, Matrix matrix, int i8);

    @Nullable
    public com.airbnb.lottie.model.content.a getBlurEffect() {
        return this.layerModel.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f8) {
        if (this.blurMaskFilterRadius == f8) {
            return this.blurMaskFilter;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f8 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.blurMaskFilter = blurMaskFilter;
        this.blurMaskFilterRadius = f8;
        return blurMaskFilter;
    }

    @Override // com.airbnb.lottie.animation.content.e
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        buildParentLayerListIfNeeded();
        this.boundsMatrix.set(matrix);
        if (z7) {
            List<b> list = this.parentLayers;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.parentLayers.get(size).transform.getMatrix());
                }
            } else {
                b bVar = this.parentLayer;
                if (bVar != null) {
                    this.boundsMatrix.preConcat(bVar.transform.getMatrix());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.getMatrix());
    }

    @Nullable
    public com.airbnb.lottie.parser.j getDropShadowEffect() {
        return this.layerModel.getDropShadowEffect();
    }

    Layer getLayerModel() {
        return this.layerModel;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.layerModel.getName();
    }

    boolean hasMasksOnThisLayer() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.mask;
        return (hVar == null || hVar.getMaskAnimations().isEmpty()) ? false : true;
    }

    boolean hasMatteOnThisLayer() {
        return this.matteLayer != null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        invalidateSelf();
    }

    public void removeAnimation(com.airbnb.lottie.animation.keyframe.a aVar) {
        this.animations.remove(aVar);
    }

    void resolveChildKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    @Override // com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        b bVar = this.matteLayer;
        if (bVar != null) {
            com.airbnb.lottie.model.d addKey = dVar2.addKey(bVar.getName());
            if (dVar.fullyResolvesTo(this.matteLayer.getName(), i8)) {
                list.add(addKey.resolve(this.matteLayer));
            }
            if (dVar.propagateToChildren(getName(), i8)) {
                this.matteLayer.resolveChildKeyPath(dVar, dVar.incrementDepthBy(this.matteLayer.getName(), i8) + i8, list, addKey);
            }
        }
        if (dVar.matches(getName(), i8)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.addKey(getName());
                if (dVar.fullyResolvesTo(getName(), i8)) {
                    list.add(dVar2.resolve(this));
                }
            }
            if (dVar.propagateToChildren(getName(), i8)) {
                resolveChildKeyPath(dVar, i8 + dVar.incrementDepthBy(getName(), i8), list, dVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void setContents(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    void setMatteLayer(@Nullable b bVar) {
        this.matteLayer = bVar;
    }

    void setOutlineMasksAndMattes(boolean z7) {
        if (z7 && this.outlineMasksAndMattesPaint == null) {
            this.outlineMasksAndMattesPaint = new v.a();
        }
        this.outlineMasksAndMattes = z7;
    }

    void setParentLayer(@Nullable b bVar) {
        this.parentLayer = bVar;
    }

    void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.transform.setProgress(f8);
        if (this.mask != null) {
            for (int i8 = 0; i8 < this.mask.getMaskAnimations().size(); i8++) {
                this.mask.getMaskAnimations().get(i8).setProgress(f8);
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.inOutAnimation;
        if (dVar != null) {
            dVar.setProgress(f8);
        }
        b bVar = this.matteLayer;
        if (bVar != null) {
            bVar.setProgress(f8);
        }
        for (int i9 = 0; i9 < this.animations.size(); i9++) {
            this.animations.get(i9).setProgress(f8);
        }
    }
}
