package com.google.android.gms.maps.internal;

import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public interface ICameraUpdateFactoryDelegate extends IInterface {
    @NonNull
    IObjectWrapper newCameraPosition(@NonNull CameraPosition cameraPosition);

    @NonNull
    IObjectWrapper newLatLng(@NonNull LatLng latLng);

    @NonNull
    IObjectWrapper newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i8);

    @NonNull
    IObjectWrapper newLatLngBoundsWithSize(@NonNull LatLngBounds latLngBounds, int i8, int i9, int i10);

    @NonNull
    IObjectWrapper newLatLngZoom(@NonNull LatLng latLng, float f8);

    @NonNull
    IObjectWrapper scrollBy(float f8, float f9);

    @NonNull
    IObjectWrapper zoomBy(float f8);

    @NonNull
    IObjectWrapper zoomByWithFocus(float f8, int i8, int i9);

    @NonNull
    IObjectWrapper zoomIn();

    @NonNull
    IObjectWrapper zoomOut();

    @NonNull
    IObjectWrapper zoomTo(float f8);
}
