package com.baidu.ar.marker;

import com.baidu.ar.marker.model.LocationMarkerData;
import java.util.List;

/* loaded from: classes.dex */
public interface IMarkerStateListener {
    void compassResult(double d8);

    void onCoordinateResult(int i8, double[] dArr);

    void onError(int i8, String str);

    void onLocationResult(boolean z7, List<LocationMarkerData> list);

    void onResuourceCreated();

    void onSessionCreated(boolean z7, String str);
}
