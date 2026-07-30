package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e, a.b, k {
    private static final int CACHE_STEPS_MS = 32;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a blurAnimation;
    float blurMaskFilterRadius;
    private final RectF boundsRect;
    private final int cacheSteps;
    private final com.airbnb.lottie.animation.keyframe.a colorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.q colorCallbackAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.c dropShadowAnimation;
    private final com.airbnb.lottie.animation.keyframe.a endPointAnimation;
    private final boolean hidden;
    private final com.airbnb.lottie.model.layer.b layer;
    private final LottieDrawable lottieDrawable;

    @NonNull
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a opacityAnimation;
    private final Paint paint;
    private final Path path;
    private final List<m> paths;
    private final com.airbnb.lottie.animation.keyframe.a startPointAnimation;
    private final GradientType type;
    private final LongSparseArray<LinearGradient> linearGradientCache = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> radialGradientCache = new LongSparseArray<>();

    public h(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.path = path;
        this.paint = new v.a(1);
        this.boundsRect = new RectF();
        this.paths = new ArrayList();
        this.blurMaskFilterRadius = 0.0f;
        this.layer = bVar;
        this.name = eVar.getName();
        this.hidden = eVar.isHidden();
        this.lottieDrawable = lottieDrawable;
        this.type = eVar.getGradientType();
        path.setFillType(eVar.getFillType());
        this.cacheSteps = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a createAnimation = eVar.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        bVar.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = eVar.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        bVar.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = eVar.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        bVar.addAnimation(createAnimation3);
        com.airbnb.lottie.animation.keyframe.a createAnimation4 = eVar.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation4;
        createAnimation4.addUpdateListener(this);
        bVar.addAnimation(createAnimation4);
        if (bVar.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation5 = bVar.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            bVar.addAnimation(this.blurAnimation);
        }
        if (bVar.getDropShadowEffect() != null) {
            this.dropShadowAnimation = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.getDropShadowEffect());
        }
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.colorCallbackAnimation;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.getValue();
            int i8 = 0;
            if (iArr.length == numArr.length) {
                while (i8 < iArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i8 < numArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int round = Math.round(this.startPointAnimation.getProgress() * this.cacheSteps);
        int round2 = Math.round(this.endPointAnimation.getProgress() * this.cacheSteps);
        int round3 = Math.round(this.colorAnimation.getProgress() * this.cacheSteps);
        int i8 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i8 = i8 * 31 * round2;
        }
        return round3 != 0 ? i8 * 31 * round3 : i8;
    }

    private LinearGradient getLinearGradient() {
        long gradientHash = getGradientHash();
        LinearGradient linearGradient = this.linearGradientCache.get(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.startPointAnimation.getValue();
        PointF pointF2 = (PointF) this.endPointAnimation.getValue();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.colorAnimation.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, applyDynamicColorsIfNeeded(dVar.getColors()), dVar.getPositions(), Shader.TileMode.CLAMP);
        this.linearGradientCache.put(gradientHash, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        long gradientHash = getGradientHash();
        RadialGradient radialGradient = this.radialGradientCache.get(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.startPointAnimation.getValue();
        PointF pointF2 = (PointF) this.endPointAnimation.getValue();
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(dVar.getColors());
        float[] positions = dVar.getPositions();
        float f8 = pointF.x;
        float f9 = pointF.y;
        float hypot = (float) Math.hypot(pointF2.x - f8, pointF2.y - f9);
        RadialGradient radialGradient2 = new RadialGradient(f8, f9, hypot <= 0.0f ? 0.001f : hypot, applyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
        this.radialGradientCache.put(gradientHash, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        com.airbnb.lottie.animation.keyframe.c cVar6;
        if (t7 == n0.OPACITY) {
            this.opacityAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
            if (aVar != null) {
                this.layer.removeAnimation(aVar);
            }
            if (cVar == null) {
                this.colorFilterAnimation = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.colorFilterAnimation = qVar;
            qVar.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t7 == n0.GRADIENT_COLOR) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.colorCallbackAnimation;
            if (qVar2 != null) {
                this.layer.removeAnimation(qVar2);
            }
            if (cVar == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            this.linearGradientCache.clear();
            this.radialGradientCache.clear();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.colorCallbackAnimation = qVar3;
            qVar3.addUpdateListener(this);
            this.layer.addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t7 == n0.BLUR_RADIUS) {
            com.airbnb.lottie.animation.keyframe.a aVar2 = this.blurAnimation;
            if (aVar2 != null) {
                aVar2.setValueCallback(cVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.blurAnimation = qVar4;
            qVar4.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
            return;
        }
        if (t7 == n0.DROP_SHADOW_COLOR && (cVar6 = this.dropShadowAnimation) != null) {
            cVar6.setColorCallback(cVar);
            return;
        }
        if (t7 == n0.DROP_SHADOW_OPACITY && (cVar5 = this.dropShadowAnimation) != null) {
            cVar5.setOpacityCallback(cVar);
            return;
        }
        if (t7 == n0.DROP_SHADOW_DIRECTION && (cVar4 = this.dropShadowAnimation) != null) {
            cVar4.setDirectionCallback(cVar);
            return;
        }
        if (t7 == n0.DROP_SHADOW_DISTANCE && (cVar3 = this.dropShadowAnimation) != null) {
            cVar3.setDistanceCallback(cVar);
        } else {
            if (t7 != n0.DROP_SHADOW_RADIUS || (cVar2 = this.dropShadowAnimation) == null) {
                return;
            }
            cVar2.setRadiusCallback(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.hidden) {
            return;
        }
        com.airbnb.lottie.c.beginSection("GradientFillContent#draw");
        this.path.reset();
        for (int i9 = 0; i9 < this.paths.size(); i9++) {
            this.path.addPath(this.paths.get(i9).getPath(), matrix);
        }
        this.path.computeBounds(this.boundsRect, false);
        Shader linearGradient = this.type == GradientType.LINEAR ? getLinearGradient() : getRadialGradient();
        linearGradient.setLocalMatrix(matrix);
        this.paint.setShader(linearGradient);
        com.airbnb.lottie.animation.keyframe.a aVar = this.colorFilterAnimation;
        if (aVar != null) {
            this.paint.setColorFilter((ColorFilter) aVar.getValue());
        }
        com.airbnb.lottie.animation.keyframe.a aVar2 = this.blurAnimation;
        if (aVar2 != null) {
            float floatValue = ((Float) aVar2.getValue()).floatValue();
            if (floatValue == 0.0f) {
                this.paint.setMaskFilter(null);
            } else if (floatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.blurMaskFilterRadius = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.dropShadowAnimation;
        if (cVar != null) {
            cVar.applyTo(this.paint);
        }
        this.paint.setAlpha(com.airbnb.lottie.utils.i.clamp((int) ((((i8 / 255.0f) * ((Integer) this.opacityAnimation.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.path, this.paint);
        com.airbnb.lottie.c.endSection("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        this.path.reset();
        for (int i8 = 0; i8 < this.paths.size(); i8++) {
            this.path.addPath(this.paths.get(i8).getPath(), matrix);
        }
        this.path.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.resolveKeyPath(dVar, i8, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = list2.get(i8);
            if (cVar instanceof m) {
                this.paths.add((m) cVar);
            }
        }
    }
}
