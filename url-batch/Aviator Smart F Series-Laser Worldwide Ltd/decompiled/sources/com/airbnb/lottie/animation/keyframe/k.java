package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g {
    private final PointF point;

    public k(List<com.airbnb.lottie.value.a> list) {
        super(list);
        this.point = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public PointF getValue(com.airbnb.lottie.value.a aVar, float f8) {
        return getValue(aVar, f8, f8, f8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public PointF getValue(com.airbnb.lottie.value.a aVar, float f8, float f9, float f10) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.startValue;
        if (obj2 != null && (obj = aVar.endValue) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            com.airbnb.lottie.value.c cVar = this.valueCallback;
            if (cVar != null && (pointF = (PointF) cVar.getValueInternal(aVar.startFrame, aVar.endFrame.floatValue(), pointF2, pointF3, f8, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
                return pointF;
            }
            PointF pointF4 = this.point;
            float f11 = pointF2.x;
            float f12 = f11 + (f9 * (pointF3.x - f11));
            float f13 = pointF2.y;
            pointF4.set(f12, f13 + (f10 * (pointF3.y - f13)));
            return this.point;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
