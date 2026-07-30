package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.n0;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {
    private final com.airbnb.lottie.animation.keyframe.a cornerRadiusAnimation;
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a positionAnimation;
    private final com.airbnb.lottie.animation.keyframe.a sizeAnimation;
    private final Path path = new Path();
    private final RectF rect = new RectF();
    private final b trimPaths = new b();

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a roundedCornersAnimation = null;

    public o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.g gVar) {
        this.name = gVar.getName();
        this.hidden = gVar.isHidden();
        this.lottieDrawable = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.a createAnimation = gVar.getPosition().createAnimation();
        this.positionAnimation = createAnimation;
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = gVar.getSize().createAnimation();
        this.sizeAnimation = createAnimation2;
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = gVar.getCornerRadius().createAnimation();
        this.cornerRadiusAnimation = createAnimation3;
        bVar.addAnimation(createAnimation);
        bVar.addAnimation(createAnimation2);
        bVar.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        if (t7 == n0.RECTANGLE_SIZE) {
            this.sizeAnimation.setValueCallback(cVar);
        } else if (t7 == n0.POSITION) {
            this.positionAnimation.setValueCallback(cVar);
        } else if (t7 == n0.CORNER_RADIUS) {
            this.cornerRadiusAnimation.setValueCallback(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path getPath() {
        com.airbnb.lottie.animation.keyframe.a aVar;
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        PointF pointF = (PointF) this.sizeAnimation.getValue();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a aVar2 = this.cornerRadiusAnimation;
        float floatValue = aVar2 == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.d) aVar2).getFloatValue();
        if (floatValue == 0.0f && (aVar = this.roundedCornersAnimation) != null) {
            floatValue = Math.min(((Float) aVar.getValue()).floatValue(), Math.min(f8, f9));
        }
        float min = Math.min(f8, f9);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF pointF2 = (PointF) this.positionAnimation.getValue();
        this.path.moveTo(pointF2.x + f8, (pointF2.y - f9) + floatValue);
        this.path.lineTo(pointF2.x + f8, (pointF2.y + f9) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.rect;
            float f10 = pointF2.x;
            float f11 = floatValue * 2.0f;
            float f12 = pointF2.y;
            rectF.set((f10 + f8) - f11, (f12 + f9) - f11, f10 + f8, f12 + f9);
            this.path.arcTo(this.rect, 0.0f, 90.0f, false);
        }
        this.path.lineTo((pointF2.x - f8) + floatValue, pointF2.y + f9);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.rect;
            float f13 = pointF2.x;
            float f14 = pointF2.y;
            float f15 = floatValue * 2.0f;
            rectF2.set(f13 - f8, (f14 + f9) - f15, (f13 - f8) + f15, f14 + f9);
            this.path.arcTo(this.rect, 90.0f, 90.0f, false);
        }
        this.path.lineTo(pointF2.x - f8, (pointF2.y - f9) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.rect;
            float f16 = pointF2.x;
            float f17 = pointF2.y;
            float f18 = floatValue * 2.0f;
            rectF3.set(f16 - f8, f17 - f9, (f16 - f8) + f18, (f17 - f9) + f18);
            this.path.arcTo(this.rect, 180.0f, 90.0f, false);
        }
        this.path.lineTo((pointF2.x + f8) - floatValue, pointF2.y - f9);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.rect;
            float f19 = pointF2.x;
            float f20 = floatValue * 2.0f;
            float f21 = pointF2.y;
            rectF4.set((f19 + f8) - f20, f21 - f9, f19 + f8, (f21 - f9) + f20);
            this.path.arcTo(this.rect, 270.0f, 90.0f, false);
        }
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.resolveKeyPath(dVar, i8, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public void setContents(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(uVar);
                    uVar.addListener(this);
                }
            }
            if (cVar instanceof q) {
                this.roundedCornersAnimation = ((q) cVar).getRoundedCorners();
            }
        }
    }
}
