package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends b {
    private boolean clipToCompositionBounds;

    @Nullable
    private Boolean hasMasks;

    @Nullable
    private Boolean hasMatte;
    private final Paint layerPaint;
    private final List<b> layers;
    private final RectF newClipRect;
    private final RectF rect;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a timeRemapping;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, com.airbnb.lottie.h hVar) {
        super(lottieDrawable, layer);
        int i8;
        b bVar;
        this.layers = new ArrayList();
        this.rect = new RectF();
        this.newClipRect = new RectF();
        this.layerPaint = new Paint();
        this.clipToCompositionBounds = true;
        com.airbnb.lottie.model.animatable.b timeRemapping = layer.getTimeRemapping();
        if (timeRemapping != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation = timeRemapping.createAnimation();
            this.timeRemapping = createAnimation;
            addAnimation(createAnimation);
            this.timeRemapping.addUpdateListener(this);
        } else {
            this.timeRemapping = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(hVar.getLayers().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            b forModel = b.forModel(this, layer2, lottieDrawable, hVar);
            if (forModel != null) {
                longSparseArray.put(forModel.getLayerModel().getId(), forModel);
                if (bVar2 != null) {
                    bVar2.setMatteLayer(forModel);
                    bVar2 = null;
                } else {
                    this.layers.add(0, forModel);
                    int i9 = a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[layer2.getMatteType().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        bVar2 = forModel;
                    }
                }
            }
            size--;
        }
        for (i8 = 0; i8 < longSparseArray.size(); i8++) {
            b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i8));
            if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.getLayerModel().getParentId())) != null) {
                bVar3.setParentLayer(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.TIME_REMAP) {
            if (cVar == null) {
                com.airbnb.lottie.animation.keyframe.a aVar = this.timeRemapping;
                if (aVar != null) {
                    aVar.setValueCallback(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.timeRemapping = qVar;
            qVar.addUpdateListener(this);
            addAnimation(this.timeRemapping);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        com.airbnb.lottie.c.beginSection("CompositionLayer#draw");
        this.newClipRect.set(0.0f, 0.0f, this.layerModel.getPreCompWidth(), this.layerModel.getPreCompHeight());
        matrix.mapRect(this.newClipRect);
        boolean z7 = this.lottieDrawable.isApplyingOpacityToLayersEnabled() && this.layers.size() > 1 && i8 != 255;
        if (z7) {
            this.layerPaint.setAlpha(i8);
            j.saveLayerCompat(canvas, this.newClipRect, this.layerPaint);
        } else {
            canvas.save();
        }
        if (z7) {
            i8 = 255;
        }
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            if ((!this.clipToCompositionBounds && "__container".equals(this.layerModel.getName())) || this.newClipRect.isEmpty() || canvas.clipRect(this.newClipRect)) {
                this.layers.get(size).draw(canvas, matrix, i8);
            }
        }
        canvas.restore();
        com.airbnb.lottie.c.endSection("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        super.getBounds(rectF, matrix, z7);
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.layers.get(size).getBounds(this.rect, this.boundsMatrix, true);
            rectF.union(this.rect);
        }
    }

    public boolean hasMasks() {
        if (this.hasMasks == null) {
            for (int size = this.layers.size() - 1; size >= 0; size--) {
                b bVar = this.layers.get(size);
                if (bVar instanceof f) {
                    if (bVar.hasMasksOnThisLayer()) {
                        this.hasMasks = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).hasMasks()) {
                    this.hasMasks = Boolean.TRUE;
                    return true;
                }
            }
            this.hasMasks = Boolean.FALSE;
        }
        return this.hasMasks.booleanValue();
    }

    public boolean hasMatte() {
        if (this.hasMatte == null) {
            if (hasMatteOnThisLayer()) {
                this.hasMatte = Boolean.TRUE;
                return true;
            }
            for (int size = this.layers.size() - 1; size >= 0; size--) {
                if (this.layers.get(size).hasMatteOnThisLayer()) {
                    this.hasMatte = Boolean.TRUE;
                    return true;
                }
            }
            this.hasMatte = Boolean.FALSE;
        }
        return this.hasMatte.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void resolveChildKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i9 = 0; i9 < this.layers.size(); i9++) {
            this.layers.get(i9).resolveKeyPath(dVar, i8, list, dVar2);
        }
    }

    public void setClipToCompositionBounds(boolean z7) {
        this.clipToCompositionBounds = z7;
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void setOutlineMasksAndMattes(boolean z7) {
        super.setOutlineMasksAndMattes(z7);
        Iterator<b> it = this.layers.iterator();
        while (it.hasNext()) {
            it.next().setOutlineMasksAndMattes(z7);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        super.setProgress(f8);
        if (this.timeRemapping != null) {
            f8 = ((((Float) this.timeRemapping.getValue()).floatValue() * this.layerModel.getComposition().getFrameRate()) - this.layerModel.getComposition().getStartFrame()) / (this.lottieDrawable.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.timeRemapping == null) {
            f8 -= this.layerModel.getStartProgress();
        }
        if (this.layerModel.getTimeStretch() != 0.0f && !"__container".equals(this.layerModel.getName())) {
            f8 /= this.layerModel.getTimeStretch();
        }
        for (int size = this.layers.size() - 1; size >= 0; size--) {
            this.layers.get(size).setProgress(f8);
        }
    }
}
