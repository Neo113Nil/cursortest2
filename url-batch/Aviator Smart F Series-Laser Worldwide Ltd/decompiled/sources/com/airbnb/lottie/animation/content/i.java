package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.n0;

/* loaded from: classes.dex */
public class i extends a {
    private static final int CACHE_STEPS_MS = 32;
    private final RectF boundsRect;
    private final int cacheSteps;
    private final com.airbnb.lottie.animation.keyframe.a colorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.q colorCallbackAnimation;
    private final com.airbnb.lottie.animation.keyframe.a endPointAnimation;
    private final boolean hidden;
    private final LongSparseArray<LinearGradient> linearGradientCache;
    private final String name;
    private final LongSparseArray<RadialGradient> radialGradientCache;
    private final com.airbnb.lottie.animation.keyframe.a startPointAnimation;
    private final GradientType type;

    public i(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(lottieDrawable, bVar, fVar.getCapType().toPaintCap(), fVar.getJoinType().toPaintJoin(), fVar.getMiterLimit(), fVar.getOpacity(), fVar.getWidth(), fVar.getLineDashPattern(), fVar.getDashOffset());
        this.linearGradientCache = new LongSparseArray<>();
        this.radialGradientCache = new LongSparseArray<>();
        this.boundsRect = new RectF();
        this.name = fVar.getName();
        this.type = fVar.getGradientType();
        this.hidden = fVar.isHidden();
        this.cacheSteps = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a createAnimation = fVar.getGradientColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        bVar.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = fVar.getStartPoint().createAnimation();
        this.startPointAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        bVar.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = fVar.getEndPoint().createAnimation();
        this.endPointAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        bVar.addAnimation(createAnimation3);
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
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), applyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
        this.radialGradientCache.put(gradientHash, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        super.addValueCallback(t7, cVar);
        if (t7 == n0.GRADIENT_COLOR) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.colorCallbackAnimation;
            if (qVar != null) {
                this.layer.removeAnimation(qVar);
            }
            if (cVar == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.colorCallbackAnimation = qVar2;
            qVar2.addUpdateListener(this);
            this.layer.addAnimation(this.colorCallbackAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.hidden) {
            return;
        }
        getBounds(this.boundsRect, matrix, false);
        Shader linearGradient = this.type == GradientType.LINEAR ? getLinearGradient() : getRadialGradient();
        linearGradient.setLocalMatrix(matrix);
        this.paint.setShader(linearGradient);
        super.draw(canvas, matrix, i8);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }
}
