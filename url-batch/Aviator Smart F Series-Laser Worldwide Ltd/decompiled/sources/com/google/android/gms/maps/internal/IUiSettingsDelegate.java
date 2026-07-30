package com.google.android.gms.maps.internal;

import android.os.IInterface;

/* loaded from: classes3.dex */
public interface IUiSettingsDelegate extends IInterface {
    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isScrollGesturesEnabledDuringRotateOrZoom();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z7);

    void setCompassEnabled(boolean z7);

    void setIndoorLevelPickerEnabled(boolean z7);

    void setMapToolbarEnabled(boolean z7);

    void setMyLocationButtonEnabled(boolean z7);

    void setRotateGesturesEnabled(boolean z7);

    void setScrollGesturesEnabled(boolean z7);

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z7);

    void setTiltGesturesEnabled(boolean z7);

    void setZoomControlsEnabled(boolean z7);

    void setZoomGesturesEnabled(boolean z7);
}
