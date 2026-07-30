package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.n0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a blurAnimation;
    float blurMaskFilterRadius;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a colorFilterAnimation;
    private final List<com.airbnb.lottie.animation.keyframe.a> dashPatternAnimations;

    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a dashPatternOffsetAnimation;
    private final float[] dashPatternValues;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.c dropShadowAnimation;
    protected final com.airbnb.lottie.model.layer.b layer;
    private final LottieDrawable lottieDrawable;
    private final com.airbnb.lottie.animation.keyframe.a opacityAnimation;
    final Paint paint;
    private final com.airbnb.lottie.animation.keyframe.a widthAnimation;
    private final PathMeasure pm = new PathMeasure();
    private final Path path = new Path();
    private final Path trimPathPath = new Path();
    private final RectF rect = new RectF();
    private final List<b> pathGroups = new ArrayList();

    private static final class b {
        private final List<m> paths;

        @Nullable
        private final u trimPath;

        private b(@Nullable u uVar) {
            this.paths = new ArrayList();
            this.trimPath = uVar;
        }
    }

    a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f8, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        v.a aVar = new v.a(1);
        this.paint = aVar;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layer = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f8);
        this.opacityAnimation = dVar.createAnimation();
        this.widthAnimation = bVar2.createAnimation();
        if (bVar3 == null) {
            this.dashPatternOffsetAnimation = null;
        } else {
            this.dashPatternOffsetAnimation = bVar3.createAnimation();
        }
        this.dashPatternAnimations = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.dashPatternAnimations.add(list.get(i8).createAnimation());
        }
        bVar.addAnimation(this.opacityAnimation);
        bVar.addAnimation(this.widthAnimation);
        for (int i9 = 0; i9 < this.dashPatternAnimations.size(); i9++) {
            bVar.addAnimation(this.dashPatternAnimations.get(i9));
        }
        com.airbnb.lottie.animation.keyframe.a aVar2 = this.dashPatternOffsetAnimation;
        if (aVar2 != null) {
            bVar.addAnimation(aVar2);
        }
        this.opacityAnimation.addUpdateListener(this);
        this.widthAnimation.addUpdateListener(this);
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.dashPatternAnimations.get(i10).addUpdateListener(this);
        }
        com.airbnb.lottie.animation.keyframe.a aVar3 = this.dashPatternOffsetAnimation;
        if (aVar3 != null) {
            aVar3.addUpdateListener(this);
        }
        if (bVar.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.a createAnimation = bVar.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = createAnimation;
            createAnimation.addUpdateListener(this);
            bVar.addAnimation(this.blurAnimation);
        }
        if (bVar.getDropShadowEffect() != null) {
            this.dropShadowAnimation = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.getDropShadowEffect());
        }
    }

    private void applyDashPatternIfNeeded(Matrix matrix) {
        com.airbnb.lottie.c.beginSection("StrokeContent#applyDashPattern");
        if (this.dashPatternAnimations.isEmpty()) {
            com.airbnb.lottie.c.endSection("StrokeContent#applyDashPattern");
            return;
        }
        float scale = com.airbnb.lottie.utils.j.getScale(matrix);
        for (int i8 = 0; i8 < this.dashPatternAnimations.size(); i8++) {
            this.dashPatternValues[i8] = ((Float) this.dashPatternAnimations.get(i8).getValue()).floatValue();
            if (i8 % 2 == 0) {
                float[] fArr = this.dashPatternValues;
                if (fArr[i8] < 1.0f) {
                    fArr[i8] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dashPatternValues;
                if (fArr2[i8] < 0.1f) {
                    fArr2[i8] = 0.1f;
                }
            }
            float[] fArr3 = this.dashPatternValues;
            fArr3[i8] = fArr3[i8] * scale;
        }
        com.airbnb.lottie.animation.keyframe.a aVar = this.dashPatternOffsetAnimation;
        this.paint.setPathEffect(new DashPathEffect(this.dashPatternValues, aVar == null ? 0.0f : scale * ((Float) aVar.getValue()).floatValue()));
        com.airbnb.lottie.c.endSection("StrokeContent#applyDashPattern");
    }

    private void applyTrimPath(Canvas canvas, b bVar, Matrix matrix) {
        com.airbnb.lottie.c.beginSection("StrokeContent#applyTrimPath");
        if (bVar.trimPath == null) {
            com.airbnb.lottie.c.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.path.reset();
        for (int size = bVar.paths.size() - 1; size >= 0; size--) {
            this.path.addPath(((m) bVar.paths.get(size)).getPath(), matrix);
        }
        float floatValue = ((Float) bVar.trimPath.getStart().getValue()).floatValue() / 100.0f;
        float floatValue2 = ((Float) bVar.trimPath.getEnd().getValue()).floatValue() / 100.0f;
        float floatValue3 = ((Float) bVar.trimPath.getOffset().getValue()).floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.path, this.paint);
            com.airbnb.lottie.c.endSection("StrokeContent#applyTrimPath");
            return;
        }
        this.pm.setPath(this.path, false);
        float length = this.pm.getLength();
        while (this.pm.nextContour()) {
            length += this.pm.getLength();
        }
        float f8 = floatValue3 * length;
        float f9 = (floatValue * length) + f8;
        float min = Math.min((floatValue2 * length) + f8, (f9 + length) - 1.0f);
        float f10 = 0.0f;
        for (int size2 = bVar.paths.size() - 1; size2 >= 0; size2--) {
            this.trimPathPath.set(((m) bVar.paths.get(size2)).getPath());
            this.trimPathPath.transform(matrix);
            this.pm.setPath(this.trimPathPath, false);
            float length2 = this.pm.getLength();
            if (min > length) {
                float f11 = min - length;
                if (f11 < f10 + length2 && f10 < f11) {
                    com.airbnb.lottie.utils.j.applyTrimPathIfNeeded(this.trimPathPath, f9 > length ? (f9 - length) / length2 : 0.0f, Math.min(f11 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                    f10 += length2;
                }
            }
            float f12 = f10 + length2;
            if (f12 >= f9 && f10 <= min) {
                if (f12 > min || f9 >= f10) {
                    com.airbnb.lottie.utils.j.applyTrimPathIfNeeded(this.trimPathPath, f9 < f10 ? 0.0f : (f9 - f10) / length2, min > f12 ? 1.0f : (min - f10) / length2, 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                } else {
                    canvas.drawPath(this.trimPathPath, this.paint);
                }
            }
            f10 += length2;
        }
        com.airbnb.lottie.c.endSection("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    @CallSuper
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
        if (t7 == n0.STROKE_WIDTH) {
            this.widthAnimation.setValueCallback(cVar);
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
        com.airbnb.lottie.c.beginSection("StrokeContent#draw");
        if (com.airbnb.lottie.utils.j.hasZeroScaleAxis(matrix)) {
            com.airbnb.lottie.c.endSection("StrokeContent#draw");
            return;
        }
        this.paint.setAlpha(com.airbnb.lottie.utils.i.clamp((int) ((((i8 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.opacityAnimation).getIntValue()) / 100.0f) * 255.0f), 0, 255));
        this.paint.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.widthAnimation).getFloatValue() * com.airbnb.lottie.utils.j.getScale(matrix));
        if (this.paint.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.c.endSection("StrokeContent#draw");
            return;
        }
        applyDashPatternIfNeeded(matrix);
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
        for (int i9 = 0; i9 < this.pathGroups.size(); i9++) {
            b bVar = this.pathGroups.get(i9);
            if (bVar.trimPath != null) {
                applyTrimPath(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.c.beginSection("StrokeContent#buildPath");
                this.path.reset();
                for (int size = bVar.paths.size() - 1; size >= 0; size--) {
                    this.path.addPath(((m) bVar.paths.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.c.endSection("StrokeContent#buildPath");
                com.airbnb.lottie.c.beginSection("StrokeContent#drawPath");
                canvas.drawPath(this.path, this.paint);
                com.airbnb.lottie.c.endSection("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.c.endSection("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z7) {
        com.airbnb.lottie.c.beginSection("StrokeContent#getBounds");
        this.path.reset();
        for (int i8 = 0; i8 < this.pathGroups.size(); i8++) {
            b bVar = this.pathGroups.get(i8);
            for (int i9 = 0; i9 < bVar.paths.size(); i9++) {
                this.path.addPath(((m) bVar.paths.get(i9)).getPath(), matrix);
            }
        }
        this.path.computeBounds(this.rect, false);
        float floatValue = ((com.airbnb.lottie.animation.keyframe.d) this.widthAnimation).getFloatValue();
        RectF rectF2 = this.rect;
        float f8 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f8, rectF2.top - f8, rectF2.right + f8, rectF2.bottom + f8);
        rectF.set(this.rect);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.c.endSection("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public abstract /* synthetic */ String getName();

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.resolveKeyPath(dVar, i8, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.addListener(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.pathGroups.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.addListener(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.paths.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.pathGroups.add(bVar);
        }
    }
}
