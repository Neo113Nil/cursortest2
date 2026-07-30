package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g {
    private final PathMeasure pathMeasure;
    private i pathMeasureKeyframe;
    private final PointF point;
    private final float[] pos;

    public j(List<? extends com.airbnb.lottie.value.a> list) {
        super(list);
        this.point = new PointF();
        this.pos = new float[2];
        this.pathMeasure = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public PointF getValue(com.airbnb.lottie.value.a aVar, float f8) {
        PointF pointF;
        i iVar = (i) aVar;
        Path path = iVar.getPath();
        if (path == null) {
            return (PointF) aVar.startValue;
        }
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        if (cVar != null && (pointF = (PointF) cVar.getValueInternal(iVar.startFrame, iVar.endFrame.floatValue(), (PointF) iVar.startValue, (PointF) iVar.endValue, getLinearCurrentKeyframeProgress(), f8, getProgress())) != null) {
            return pointF;
        }
        if (this.pathMeasureKeyframe != iVar) {
            this.pathMeasure.setPath(path, false);
            this.pathMeasureKeyframe = iVar;
        }
        PathMeasure pathMeasure = this.pathMeasure;
        pathMeasure.getPosTan(f8 * pathMeasure.getLength(), this.pos, null);
        PointF pointF2 = this.point;
        float[] fArr = this.pos;
        pointF2.set(fArr[0], fArr[1]);
        return this.point;
    }
}
