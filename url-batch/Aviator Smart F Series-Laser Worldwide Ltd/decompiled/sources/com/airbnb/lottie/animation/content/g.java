package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a blurAnimation;
    float blurMaskFilterRadius;
    private final com.airbnb.lottie.animation.keyframe.a colorAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.c dropShadowAnimation;
    private final boolean hidden;
    private final com.airbnb.lottie.model.layer.b layer;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a opacityAnimation;
    private final Paint paint;
    private final Path path;
    private final List<m> paths;

    public g(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        Path path = new Path();
        this.path = path;
        this.paint = new v.a(1);
        this.paths = new ArrayList();
        this.layer = bVar;
        this.name = kVar.getName();
        this.hidden = kVar.isHidden();
        this.lottieDrawable = lottieDrawable;
        if (bVar.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation = bVar.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation;
            createAnimation.addUpdateListener(this);
            bVar.addAnimation(this.blurAnimation);
        }
        if (bVar.getDropShadowEffect() != null) {
            this.dropShadowAnimation = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.getDropShadowEffect());
        }
        if (kVar.getColor() == null || kVar.getOpacity() == null) {
            this.colorAnimation = null;
            this.opacityAnimation = null;
            return;
        }
        path.setFillType(kVar.getFillType());
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = kVar.getColor().createAnimation();
        this.colorAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        bVar.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = kVar.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation3;
        createAnimation3.addUpdateListener(this);
        bVar.addAnimation(createAnimation3);
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        com.airbnb.lottie.animation.keyframe.c cVar6;
        if (t7 == n0.COLOR) {
            this.colorAnimation.setValueCallback(cVar);
            return;
        }
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
        if (t7 == n0.BLUR_RADIUS) {
            com.airbnb.lottie.animation.keyframe.a aVar2 = this.blurAnimation;
            if (aVar2 != null) {
                aVar2.setValueCallback(cVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(cVar);
            this.blurAnimation = qVar2;
            qVar2.addUpdateListener(this);
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
        com.airbnb.lottie.c.beginSection("FillContent#draw");
        this.paint.setColor((com.airbnb.lottie.utils.i.clamp((int) ((((i8 / 255.0f) * ((Integer) this.opacityAnimation.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.b) this.colorAnimation).getIntValue() & ViewCompat.MEASURED_SIZE_MASK));
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
                this.paint.setMaskFilter(this.layer.getBlurMaskFilter(floatValue));
            }
            this.blurMaskFilterRadius = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.dropShadowAnimation;
        if (cVar != null) {
            cVar.applyTo(this.paint);
        }
        this.path.reset();
        for (int i9 = 0; i9 < this.paths.size(); i9++) {
            this.path.addPath(this.paths.get(i9).getPath(), matrix);
        }
        canvas.drawPath(this.path, this.paint);
        com.airbnb.lottie.c.endSection("FillContent#draw");
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
