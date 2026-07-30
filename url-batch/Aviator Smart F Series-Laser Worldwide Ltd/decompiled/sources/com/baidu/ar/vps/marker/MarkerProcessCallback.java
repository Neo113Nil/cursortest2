package com.baidu.ar.vps.marker;

import com.baidu.ar.marker.model.LocationMarkerData;
import java.util.List;

/* loaded from: classes.dex */
public interface MarkerProcessCallback {
    void onAlgoEnd(boolean z7);

    void onAlgoStartUp();

    void onCoordinateResult(int i8, double[] dArr);

    void onCreateSessionEnd(boolean z7, String str);

    void onCreateSessionStart();

    void onDownloadAlgoStart();

    void onDownloadSoResult(boolean z7);

    void onFrameQueryResult(int i8, String str);

    void onLocationResult(boolean z7, List<LocationMarkerData> list);
}
