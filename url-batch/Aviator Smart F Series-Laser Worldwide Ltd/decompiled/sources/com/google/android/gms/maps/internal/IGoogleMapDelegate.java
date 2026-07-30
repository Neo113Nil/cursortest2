package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface IGoogleMapDelegate extends IInterface {
    com.google.android.gms.internal.maps.zzl addCircle(CircleOptions circleOptions);

    com.google.android.gms.internal.maps.zzv addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    com.google.android.gms.internal.maps.zzah addMarker(MarkerOptions markerOptions);

    void addOnMapCapabilitiesChangedListener(zzal zzalVar);

    com.google.android.gms.internal.maps.zzam addPolygon(PolygonOptions polygonOptions);

    com.google.android.gms.internal.maps.zzap addPolyline(PolylineOptions polylineOptions);

    com.google.android.gms.internal.maps.zzau addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(@NonNull IObjectWrapper iObjectWrapper);

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, @Nullable zzd zzdVar);

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i8, @Nullable zzd zzdVar);

    void clear();

    @NonNull
    CameraPosition getCameraPosition();

    com.google.android.gms.internal.maps.zzs getFeatureLayer(FeatureLayerOptions featureLayerOptions);

    com.google.android.gms.internal.maps.zzy getFocusedBuilding();

    void getMapAsync(zzat zzatVar);

    com.google.android.gms.internal.maps.zzae getMapCapabilities();

    @MapColorScheme
    int getMapColorScheme();

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    @NonNull
    Location getMyLocation();

    @NonNull
    IProjectionDelegate getProjection();

    @NonNull
    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(@NonNull IObjectWrapper iObjectWrapper);

    void onCreate(@NonNull Bundle bundle);

    void onDestroy();

    void onEnterAmbient(@NonNull Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(@NonNull Bundle bundle);

    void onStart();

    void onStop();

    void removeOnMapCapabilitiesChangedListener(zzal zzalVar);

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z7);

    void setContentDescription(@Nullable String str);

    boolean setIndoorEnabled(boolean z7);

    void setInfoWindowAdapter(@Nullable zzi zziVar);

    void setLatLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds);

    void setLocationSource(@Nullable ILocationSourceDelegate iLocationSourceDelegate);

    void setMapColorScheme(@MapColorScheme int i8);

    boolean setMapStyle(@Nullable MapStyleOptions mapStyleOptions);

    void setMapType(int i8);

    void setMaxZoomPreference(float f8);

    void setMinZoomPreference(float f8);

    void setMyLocationEnabled(boolean z7);

    void setOnCameraChangeListener(@Nullable zzn zznVar);

    void setOnCameraIdleListener(@Nullable zzp zzpVar);

    void setOnCameraMoveCanceledListener(@Nullable zzr zzrVar);

    void setOnCameraMoveListener(@Nullable zzt zztVar);

    void setOnCameraMoveStartedListener(@Nullable zzv zzvVar);

    void setOnCircleClickListener(@Nullable zzx zzxVar);

    void setOnGroundOverlayClickListener(@Nullable zzz zzzVar);

    void setOnIndoorStateChangeListener(@Nullable zzab zzabVar);

    void setOnInfoWindowClickListener(@Nullable zzad zzadVar);

    void setOnInfoWindowCloseListener(@Nullable zzaf zzafVar);

    void setOnInfoWindowLongClickListener(@Nullable zzah zzahVar);

    void setOnMapClickListener(@Nullable zzan zzanVar);

    void setOnMapLoadedCallback(@Nullable zzap zzapVar);

    void setOnMapLongClickListener(@Nullable zzar zzarVar);

    void setOnMarkerClickListener(@Nullable zzav zzavVar);

    void setOnMarkerDragListener(@Nullable zzax zzaxVar);

    void setOnMyLocationButtonClickListener(@Nullable zzaz zzazVar);

    void setOnMyLocationChangeListener(@Nullable zzbb zzbbVar);

    void setOnMyLocationClickListener(@Nullable zzbd zzbdVar);

    void setOnPoiClickListener(@Nullable zzbf zzbfVar);

    void setOnPolygonClickListener(@Nullable zzbh zzbhVar);

    void setOnPolylineClickListener(@Nullable zzbj zzbjVar);

    void setPadding(int i8, int i9, int i10, int i11);

    void setTrafficEnabled(boolean z7);

    void setWatermarkEnabled(boolean z7);

    void snapshot(zzbw zzbwVar, @Nullable IObjectWrapper iObjectWrapper);

    void snapshotForTest(zzbw zzbwVar);

    void stopAnimation();

    boolean useViewLifecycleWhenInFragment();
}
