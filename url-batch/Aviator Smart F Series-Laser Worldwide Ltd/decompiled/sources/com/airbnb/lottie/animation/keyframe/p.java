package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import java.util.Collections;

/* loaded from: classes.dex */
public class p {

    @Nullable
    private a anchorPoint;

    @Nullable
    private a endOpacity;
    private final Matrix matrix = new Matrix();

    @Nullable
    private a opacity;

    @Nullable
    private a position;

    @Nullable
    private a rotation;

    @Nullable
    private a scale;

    @Nullable
    private d skew;

    @Nullable
    private d skewAngle;
    private final Matrix skewMatrix1;
    private final Matrix skewMatrix2;
    private final Matrix skewMatrix3;
    private final float[] skewValues;

    @Nullable
    private a startOpacity;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        this.anchorPoint = lVar.getAnchorPoint() == null ? null : lVar.getAnchorPoint().createAnimation();
        this.position = lVar.getPosition() == null ? null : lVar.getPosition().createAnimation();
        this.scale = lVar.getScale() == null ? null : lVar.getScale().createAnimation();
        this.rotation = lVar.getRotation() == null ? null : lVar.getRotation().createAnimation();
        d dVar = lVar.getSkew() == null ? null : (d) lVar.getSkew().createAnimation();
        this.skew = dVar;
        if (dVar != null) {
            this.skewMatrix1 = new Matrix();
            this.skewMatrix2 = new Matrix();
            this.skewMatrix3 = new Matrix();
            this.skewValues = new float[9];
        } else {
            this.skewMatrix1 = null;
            this.skewMatrix2 = null;
            this.skewMatrix3 = null;
            this.skewValues = null;
        }
        this.skewAngle = lVar.getSkewAngle() == null ? null : (d) lVar.getSkewAngle().createAnimation();
        if (lVar.getOpacity() != null) {
            this.opacity = lVar.getOpacity().createAnimation();
        }
        if (lVar.getStartOpacity() != null) {
            this.startOpacity = lVar.getStartOpacity().createAnimation();
        } else {
            this.startOpacity = null;
        }
        if (lVar.getEndOpacity() != null) {
            this.endOpacity = lVar.getEndOpacity().createAnimation();
        } else {
            this.endOpacity = null;
        }
    }

    private void clearSkewValues() {
        for (int i8 = 0; i8 < 9; i8++) {
            this.skewValues[i8] = 0.0f;
        }
    }

    public void addAnimationsToLayer(com.airbnb.lottie.model.layer.b bVar) {
        bVar.addAnimation(this.opacity);
        bVar.addAnimation(this.startOpacity);
        bVar.addAnimation(this.endOpacity);
        bVar.addAnimation(this.anchorPoint);
        bVar.addAnimation(this.position);
        bVar.addAnimation(this.scale);
        bVar.addAnimation(this.rotation);
        bVar.addAnimation(this.skew);
        bVar.addAnimation(this.skewAngle);
    }

    public void addListener(a.b bVar) {
        a aVar = this.opacity;
        if (aVar != null) {
            aVar.addUpdateListener(bVar);
        }
        a aVar2 = this.startOpacity;
        if (aVar2 != null) {
            aVar2.addUpdateListener(bVar);
        }
        a aVar3 = this.endOpacity;
        if (aVar3 != null) {
            aVar3.addUpdateListener(bVar);
        }
        a aVar4 = this.anchorPoint;
        if (aVar4 != null) {
            aVar4.addUpdateListener(bVar);
        }
        a aVar5 = this.position;
        if (aVar5 != null) {
            aVar5.addUpdateListener(bVar);
        }
        a aVar6 = this.scale;
        if (aVar6 != null) {
            aVar6.addUpdateListener(bVar);
        }
        a aVar7 = this.rotation;
        if (aVar7 != null) {
            aVar7.addUpdateListener(bVar);
        }
        d dVar = this.skew;
        if (dVar != null) {
            dVar.addUpdateListener(bVar);
        }
        d dVar2 = this.skewAngle;
        if (dVar2 != null) {
            dVar2.addUpdateListener(bVar);
        }
    }

    public <T> boolean applyValueCallback(T t7, @Nullable com.airbnb.lottie.value.c cVar) {
        if (t7 == n0.TRANSFORM_ANCHOR_POINT) {
            a aVar = this.anchorPoint;
            if (aVar == null) {
                this.anchorPoint = new q(cVar, new PointF());
                return true;
            }
            aVar.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_POSITION) {
            a aVar2 = this.position;
            if (aVar2 == null) {
                this.position = new q(cVar, new PointF());
                return true;
            }
            aVar2.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_POSITION_X) {
            a aVar3 = this.position;
            if (aVar3 instanceof n) {
                ((n) aVar3).setXValueCallback(cVar);
                return true;
            }
        }
        if (t7 == n0.TRANSFORM_POSITION_Y) {
            a aVar4 = this.position;
            if (aVar4 instanceof n) {
                ((n) aVar4).setYValueCallback(cVar);
                return true;
            }
        }
        if (t7 == n0.TRANSFORM_SCALE) {
            a aVar5 = this.scale;
            if (aVar5 == null) {
                this.scale = new q(cVar, new com.airbnb.lottie.value.d());
                return true;
            }
            aVar5.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_ROTATION) {
            a aVar6 = this.rotation;
            if (aVar6 == null) {
                this.rotation = new q(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_OPACITY) {
            a aVar7 = this.opacity;
            if (aVar7 == null) {
                this.opacity = new q(cVar, 100);
                return true;
            }
            aVar7.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_START_OPACITY) {
            a aVar8 = this.startOpacity;
            if (aVar8 == null) {
                this.startOpacity = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_END_OPACITY) {
            a aVar9 = this.endOpacity;
            if (aVar9 == null) {
                this.endOpacity = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.setValueCallback(cVar);
            return true;
        }
        if (t7 == n0.TRANSFORM_SKEW) {
            if (this.skew == null) {
                this.skew = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.skew.setValueCallback(cVar);
            return true;
        }
        if (t7 != n0.TRANSFORM_SKEW_ANGLE) {
            return false;
        }
        if (this.skewAngle == null) {
            this.skewAngle = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
        }
        this.skewAngle.setValueCallback(cVar);
        return true;
    }

    @Nullable
    public a getEndOpacity() {
        return this.endOpacity;
    }

    public Matrix getMatrix() {
        PointF pointF;
        this.matrix.reset();
        a aVar = this.position;
        if (aVar != null && (pointF = (PointF) aVar.getValue()) != null) {
            float f8 = pointF.x;
            if (f8 != 0.0f || pointF.y != 0.0f) {
                this.matrix.preTranslate(f8, pointF.y);
            }
        }
        a aVar2 = this.rotation;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof q ? ((Float) aVar2.getValue()).floatValue() : ((d) aVar2).getFloatValue();
            if (floatValue != 0.0f) {
                this.matrix.preRotate(floatValue);
            }
        }
        if (this.skew != null) {
            float cos = this.skewAngle == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.getFloatValue()) + 90.0f));
            float sin = this.skewAngle == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.getFloatValue()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.getFloatValue()));
            clearSkewValues();
            float[] fArr = this.skewValues;
            fArr[0] = cos;
            fArr[1] = sin;
            float f9 = -sin;
            fArr[3] = f9;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.skewMatrix1.setValues(fArr);
            clearSkewValues();
            float[] fArr2 = this.skewValues;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.skewMatrix2.setValues(fArr2);
            clearSkewValues();
            float[] fArr3 = this.skewValues;
            fArr3[0] = cos;
            fArr3[1] = f9;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.skewMatrix3.setValues(fArr3);
            this.skewMatrix2.preConcat(this.skewMatrix1);
            this.skewMatrix3.preConcat(this.skewMatrix2);
            this.matrix.preConcat(this.skewMatrix3);
        }
        a aVar3 = this.scale;
        if (aVar3 != null) {
            com.airbnb.lottie.value.d dVar = (com.airbnb.lottie.value.d) aVar3.getValue();
            if (dVar.getScaleX() != 1.0f || dVar.getScaleY() != 1.0f) {
                this.matrix.preScale(dVar.getScaleX(), dVar.getScaleY());
            }
        }
        a aVar4 = this.anchorPoint;
        if (aVar4 != null) {
            PointF pointF2 = (PointF) aVar4.getValue();
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.matrix.preTranslate(-f10, -pointF2.y);
            }
        }
        return this.matrix;
    }

    public Matrix getMatrixForRepeater(float f8) {
        a aVar = this.position;
        PointF pointF = aVar == null ? null : (PointF) aVar.getValue();
        a aVar2 = this.scale;
        com.airbnb.lottie.value.d dVar = aVar2 == null ? null : (com.airbnb.lottie.value.d) aVar2.getValue();
        this.matrix.reset();
        if (pointF != null) {
            this.matrix.preTranslate(pointF.x * f8, pointF.y * f8);
        }
        if (dVar != null) {
            double d8 = f8;
            this.matrix.preScale((float) Math.pow(dVar.getScaleX(), d8), (float) Math.pow(dVar.getScaleY(), d8));
        }
        a aVar3 = this.rotation;
        if (aVar3 != null) {
            float floatValue = ((Float) aVar3.getValue()).floatValue();
            a aVar4 = this.anchorPoint;
            PointF pointF2 = aVar4 != null ? (PointF) aVar4.getValue() : null;
            this.matrix.preRotate(floatValue * f8, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.matrix;
    }

    @Nullable
    public a getOpacity() {
        return this.opacity;
    }

    @Nullable
    public a getStartOpacity() {
        return this.startOpacity;
    }

    public void setProgress(float f8) {
        a aVar = this.opacity;
        if (aVar != null) {
            aVar.setProgress(f8);
        }
        a aVar2 = this.startOpacity;
        if (aVar2 != null) {
            aVar2.setProgress(f8);
        }
        a aVar3 = this.endOpacity;
        if (aVar3 != null) {
            aVar3.setProgress(f8);
        }
        a aVar4 = this.anchorPoint;
        if (aVar4 != null) {
            aVar4.setProgress(f8);
        }
        a aVar5 = this.position;
        if (aVar5 != null) {
            aVar5.setProgress(f8);
        }
        a aVar6 = this.scale;
        if (aVar6 != null) {
            aVar6.setProgress(f8);
        }
        a aVar7 = this.rotation;
        if (aVar7 != null) {
            aVar7.setProgress(f8);
        }
        d dVar = this.skew;
        if (dVar != null) {
            dVar.setProgress(f8);
        }
        d dVar2 = this.skewAngle;
        if (dVar2 != null) {
            dVar2.setProgress(f8);
        }
    }
}
