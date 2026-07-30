package com.google.android.gms.maps.internal;

import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* loaded from: classes3.dex */
public interface IStreetViewPanoramaDelegate extends IInterface {
    void animateTo(@NonNull StreetViewPanoramaCamera streetViewPanoramaCamera, long j8);

    void enablePanning(boolean z7);

    void enableStreetNames(boolean z7);

    void enableUserNavigation(boolean z7);

    void enableZoom(boolean z7);

    @NonNull
    StreetViewPanoramaCamera getPanoramaCamera();

    @NonNull
    StreetViewPanoramaLocation getStreetViewPanoramaLocation();

    boolean isPanningGesturesEnabled();

    boolean isStreetNamesEnabled();

    boolean isUserNavigationEnabled();

    boolean isZoomGesturesEnabled();

    @Nullable
    IObjectWrapper orientationToPoint(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation);

    @NonNull
    StreetViewPanoramaOrientation pointToOrientation(@NonNull IObjectWrapper iObjectWrapper);

    void setOnStreetViewPanoramaCameraChangeListener(@javax.annotation.Nullable zzbl zzblVar);

    void setOnStreetViewPanoramaChangeListener(@javax.annotation.Nullable zzbn zzbnVar);

    void setOnStreetViewPanoramaClickListener(@javax.annotation.Nullable zzbp zzbpVar);

    void setOnStreetViewPanoramaLongClickListener(@javax.annotation.Nullable zzbr zzbrVar);

    void setPosition(@NonNull LatLng latLng);

    void setPositionWithID(@NonNull String str);

    void setPositionWithRadius(@NonNull LatLng latLng, int i8);

    void setPositionWithRadiusAndSource(@NonNull LatLng latLng, int i8, @javax.annotation.Nullable StreetViewSource streetViewSource);

    void setPositionWithSource(@NonNull LatLng latLng, @javax.annotation.Nullable StreetViewSource streetViewSource);
}
