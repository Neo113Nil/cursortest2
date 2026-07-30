package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class i extends com.airbnb.lottie.value.a {

    @Nullable
    private Path path;
    private final com.airbnb.lottie.value.a pointKeyFrame;

    public i(com.airbnb.lottie.h hVar, com.airbnb.lottie.value.a aVar) {
        super(hVar, (PointF) aVar.startValue, (PointF) aVar.endValue, aVar.interpolator, aVar.xInterpolator, aVar.yInterpolator, aVar.startFrame, aVar.endFrame);
        this.pointKeyFrame = aVar;
        createPath();
    }

    public void createPath() {
        Object obj;
        Object obj2;
        Object obj3 = this.endValue;
        boolean z7 = (obj3 == null || (obj2 = this.startValue) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.startValue;
        if (obj4 == null || (obj = this.endValue) == null || z7) {
            return;
        }
        com.airbnb.lottie.value.a aVar = this.pointKeyFrame;
        this.path = com.airbnb.lottie.utils.j.createPath((PointF) obj4, (PointF) obj, aVar.pathCp1, aVar.pathCp2);
    }

    @Nullable
    Path getPath() {
        return this.path;
    }
}
