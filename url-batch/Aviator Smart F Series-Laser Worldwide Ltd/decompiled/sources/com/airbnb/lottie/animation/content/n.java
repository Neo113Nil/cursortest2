package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.n0;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;

    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a innerRadiusAnimation;

    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a innerRoundednessAnimation;
    private boolean isPathValid;
    private final boolean isReversed;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final com.airbnb.lottie.animation.keyframe.a outerRadiusAnimation;
    private final com.airbnb.lottie.animation.keyframe.a outerRoundednessAnimation;
    private final com.airbnb.lottie.animation.keyframe.a pointsAnimation;
    private final com.airbnb.lottie.animation.keyframe.a positionAnimation;
    private final com.airbnb.lottie.animation.keyframe.a rotationAnimation;
    private final PolystarShape.Type type;
    private final Path path = new Path();
    private final b trimPaths = new b();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.b bVar, PolystarShape polystarShape) {
        this.lottieDrawable = lottieDrawable;
        this.name = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.type = type;
        this.hidden = polystarShape.isHidden();
        this.isReversed = polystarShape.isReversed();
        com.airbnb.lottie.animation.keyframe.a createAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = createAnimation;
        com.airbnb.lottie.animation.keyframe.a createAnimation2 = polystarShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation2;
        com.airbnb.lottie.animation.keyframe.a createAnimation3 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = createAnimation3;
        com.airbnb.lottie.animation.keyframe.a createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = createAnimation4;
        com.airbnb.lottie.animation.keyframe.a createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = createAnimation5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            this.innerRoundednessAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.innerRadiusAnimation = null;
            this.innerRoundednessAnimation = null;
        }
        bVar.addAnimation(createAnimation);
        bVar.addAnimation(createAnimation2);
        bVar.addAnimation(createAnimation3);
        bVar.addAnimation(createAnimation4);
        bVar.addAnimation(createAnimation5);
        if (type == type2) {
            bVar.addAnimation(this.innerRadiusAnimation);
            bVar.addAnimation(this.innerRoundednessAnimation);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type == type2) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        int i8;
        double d8;
        double d9;
        double d10;
        int floor = (int) Math.floor(((Float) this.pointsAnimation.getValue()).floatValue());
        double radians = Math.toRadians((this.rotationAnimation == null ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : ((Float) r2.getValue()).floatValue()) - 90.0d);
        double d11 = floor;
        float floatValue = ((Float) this.outerRoundednessAnimation.getValue()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.outerRadiusAnimation.getValue()).floatValue();
        double d12 = floatValue2;
        float cos = (float) (Math.cos(radians) * d12);
        float sin = (float) (Math.sin(radians) * d12);
        this.path.moveTo(cos, sin);
        double d13 = (float) (6.283185307179586d / d11);
        double d14 = radians + d13;
        double ceil = Math.ceil(d11);
        int i9 = 0;
        while (i9 < ceil) {
            float cos2 = (float) (Math.cos(d14) * d12);
            double d15 = ceil;
            float sin2 = (float) (d12 * Math.sin(d14));
            if (floatValue != 0.0f) {
                d9 = d12;
                i8 = i9;
                d8 = d14;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d10 = d13;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f8 = floatValue2 * floatValue * POLYGON_MAGIC_NUMBER;
                this.path.cubicTo(cos - (cos3 * f8), sin - (sin3 * f8), cos2 + (cos4 * f8), sin2 + (f8 * sin4), cos2, sin2);
            } else {
                i8 = i9;
                d8 = d14;
                d9 = d12;
                d10 = d13;
                this.path.lineTo(cos2, sin2);
            }
            d14 = d8 + d10;
            i9 = i8 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d15;
            d12 = d9;
            d13 = d10;
        }
        PointF pointF = (PointF) this.positionAnimation.getValue();
        this.path.offset(pointF.x, pointF.y);
        this.path.close();
    }

    private void createStarPath() {
        int i8;
        float f8;
        float f9;
        double d8;
        float f10;
        float f11;
        float f12;
        float f13;
        double d9;
        float f14;
        float f15;
        float f16;
        double d10;
        float floatValue = ((Float) this.pointsAnimation.getValue()).floatValue();
        double radians = Math.toRadians((this.rotationAnimation == null ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : ((Float) r2.getValue()).floatValue()) - 90.0d);
        double d11 = floatValue;
        float f17 = (float) (6.283185307179586d / d11);
        if (this.isReversed) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue - ((int) floatValue);
        int i9 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i9 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue2 = ((Float) this.outerRadiusAnimation.getValue()).floatValue();
        float floatValue3 = ((Float) this.innerRadiusAnimation.getValue()).floatValue();
        com.airbnb.lottie.animation.keyframe.a aVar = this.innerRoundednessAnimation;
        float floatValue4 = aVar != null ? ((Float) aVar.getValue()).floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.animation.keyframe.a aVar2 = this.outerRoundednessAnimation;
        float floatValue5 = aVar2 != null ? ((Float) aVar2.getValue()).floatValue() / 100.0f : 0.0f;
        if (i9 != 0) {
            f11 = ((floatValue2 - floatValue3) * f19) + floatValue3;
            i8 = i9;
            double d12 = f11;
            float cos = (float) (d12 * Math.cos(radians));
            f10 = (float) (d12 * Math.sin(radians));
            this.path.moveTo(cos, f10);
            d8 = radians + ((f17 * f19) / 2.0f);
            f8 = cos;
            f9 = f18;
        } else {
            i8 = i9;
            double d13 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d13);
            float sin = (float) (d13 * Math.sin(radians));
            this.path.moveTo(cos2, sin);
            f8 = cos2;
            f9 = f18;
            d8 = radians + f9;
            f10 = sin;
            f11 = 0.0f;
        }
        double ceil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        float f20 = f9;
        float f21 = f8;
        boolean z7 = false;
        while (true) {
            double d14 = i10;
            if (d14 >= ceil) {
                PointF pointF = (PointF) this.positionAnimation.getValue();
                this.path.offset(pointF.x, pointF.y);
                this.path.close();
                return;
            }
            float f22 = z7 ? floatValue2 : floatValue3;
            if (f11 == 0.0f || d14 != ceil - 2.0d) {
                f12 = f17;
                f13 = f20;
            } else {
                f12 = f17;
                f13 = (f17 * f19) / 2.0f;
            }
            if (f11 == 0.0f || d14 != ceil - 1.0d) {
                d9 = d14;
                f14 = f11;
                f11 = f22;
            } else {
                d9 = d14;
                f14 = f11;
            }
            double d15 = f11;
            double d16 = ceil;
            float cos3 = (float) (d15 * Math.cos(d8));
            float sin2 = (float) (d15 * Math.sin(d8));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.path.lineTo(cos3, sin2);
                d10 = d8;
                f15 = floatValue4;
                f16 = floatValue5;
            } else {
                f15 = floatValue4;
                double atan2 = (float) (Math.atan2(f10, f21) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f16 = floatValue5;
                d10 = d8;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f23 = z7 ? f15 : f16;
                float f24 = z7 ? f16 : f15;
                float f25 = z7 ? floatValue3 : floatValue2;
                float f26 = z7 ? floatValue2 : floatValue3;
                float f27 = f25 * f23 * POLYSTAR_MAGIC_NUMBER;
                float f28 = cos4 * f27;
                float f29 = f27 * sin3;
                float f30 = f26 * f24 * POLYSTAR_MAGIC_NUMBER;
                float f31 = cos5 * f30;
                float f32 = f30 * sin4;
                if (i8 != 0) {
                    if (i10 == 0) {
                        f28 *= f19;
                        f29 *= f19;
                    } else if (d9 == d16 - 1.0d) {
                        f31 *= f19;
                        f32 *= f19;
                    }
                }
                this.path.cubicTo(f21 - f28, f10 - f29, cos3 + f31, sin2 + f32, cos3, sin2);
            }
            d8 = d10 + f13;
            z7 = !z7;
            i10++;
            f21 = cos3;
            f10 = sin2;
            floatValue5 = f16;
            floatValue4 = f15;
            f11 = f14;
            f17 = f12;
            ceil = d16;
        }
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.k, com.airbnb.lottie.model.e
    public <T> void addValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.animation.keyframe.a aVar;
        com.airbnb.lottie.animation.keyframe.a aVar2;
        if (t7 == n0.POLYSTAR_POINTS) {
            this.pointsAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.POLYSTAR_ROTATION) {
            this.rotationAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.POSITION) {
            this.positionAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.POLYSTAR_INNER_RADIUS && (aVar2 = this.innerRadiusAnimation) != null) {
            aVar2.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.POLYSTAR_OUTER_RADIUS) {
            this.outerRadiusAnimation.setValueCallback(cVar);
            return;
        }
        if (t7 == n0.POLYSTAR_INNER_ROUNDEDNESS && (aVar = this.innerRoundednessAnimation) != null) {
            aVar.setValueCallback(cVar);
        } else if (t7 == n0.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.outerRoundednessAnimation.setValueCallback(cVar);
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
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        int i8 = a.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.type.ordinal()];
        if (i8 == 1) {
            createStarPath();
        } else if (i8 == 2) {
            createPolygonPath();
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
