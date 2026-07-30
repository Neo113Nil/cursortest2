package com.baidu.mapapi.map.track;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public interface TraceAnimationListener {
    void onTraceAnimationFinish();

    void onTraceAnimationUpdate(float f8);

    void onTraceUpdatePosition(LatLng latLng);
}
