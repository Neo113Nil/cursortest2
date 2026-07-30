package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.n0;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {
    private static final float ELLIPSE_CONTROL_POINT_PERCENTAGE = 0.55228f;
    private final com.airbnb.lottie.model.content.b circleShape;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a positionAnimation;
    private final com.airbnb.lottie.animation.keyframe.a sizeAnimation;
    private final Path path = new Path();
    private final b trimPaths = new b();

    public f(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.name = bVar2.getName();
        this.lottieDrawable = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.a createAnimation = bVar2.getSize().createAnimation();
        this.sizeAnimation = createAnimation;
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = bVar2.getPosition().createAnimation();
        this.positionAnimation = createAnimation2;
        this.circleShape = bVar2;
        bVar.addAnimation(createAnimation);
        bVar.addAnimation(createAnimation2);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        if (t7 == n0.ELLIPSE_SIZE) {
            this.sizeAnimation.setValueCallback(cVar);
        } else if (t7 == n0.POSITION) {
            this.positionAnimation.setValueCallback(cVar);
        }
    }

    @Override // com.airbnb.lottie.animation.content.m, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (this.circleShape.isHidden()) {
            this.isPathValid = true;
            return this.path;
        }
        PointF pointF = (PointF) this.sizeAnimation.getValue();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f8 * ELLIPSE_CONTROL_POINT_PERCENTAGE;
        float f11 = ELLIPSE_CONTROL_POINT_PERCENTAGE * f9;
        this.path.reset();
        if (this.circleShape.isReversed()) {
            float f12 = -f9;
            this.path.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f8;
            float f15 = 0.0f - f11;
            this.path.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            this.path.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            this.path.cubicTo(f17, f9, f8, f16, f8, 0.0f);
            this.path.cubicTo(f8, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            this.path.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            this.path.cubicTo(f19, f18, f8, f20, f8, 0.0f);
            float f21 = f11 + 0.0f;
            this.path.cubicTo(f8, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f8;
            this.path.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            this.path.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.positionAnimation.getValue();
        this.path.offset(pointF2.x, pointF2.y);
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

    @Override // com.airbnb.lottie.animation.content.m, com.airbnb.lottie.animation.content.c, com.airbnb.lottie.animation.content.e
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
        }
    }
}
