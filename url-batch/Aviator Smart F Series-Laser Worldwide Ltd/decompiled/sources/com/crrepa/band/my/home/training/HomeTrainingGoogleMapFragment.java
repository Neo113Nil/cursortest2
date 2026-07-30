package com.crrepa.band.my.home.training;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.my.training.map.c0;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class HomeTrainingGoogleMapFragment extends HomeTrainingFragment implements OnMapReadyCallback, LocationSource {
    private GoogleMap googleMap;
    private LocationSource.OnLocationChangedListener onLocationChangedListener;
    private double previousLatitude = -1.0d;
    private double previousLongitude = -1.0d;
    private final a googleLocationCallback = new a(this);

    static class a extends LocationCallback {
        private final WeakReference<HomeTrainingGoogleMapFragment> weakReference;

        public a(HomeTrainingGoogleMapFragment homeTrainingGoogleMapFragment) {
            this.weakReference = new WeakReference<>(homeTrainingGoogleMapFragment);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(@NonNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            HomeTrainingGoogleMapFragment homeTrainingGoogleMapFragment = this.weakReference.get();
            com.orhanobut.logger.f.d("onLocationResult");
            Iterator<Location> it = locationResult.getLocations().iterator();
            while (it.hasNext()) {
                homeTrainingGoogleMapFragment.handleNewLocation(it.next());
            }
        }
    }

    private void changeCamera(LatLng latLng) {
        CameraUpdate newCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(latLng).zoom(16.0f).bearing(0.0f).tilt(25.0f).build());
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            googleMap.animateCamera(newCameraPosition, 1, null);
        }
    }

    private void changeLocation(Location location) {
        if (location == null) {
            return;
        }
        LocationSource.OnLocationChangedListener onLocationChangedListener = this.onLocationChangedListener;
        if (onLocationChangedListener != null) {
            onLocationChangedListener.onLocationChanged(location);
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        changeCamera(new LatLng(latitude, longitude));
        float accuracy = location.getAccuracy();
        com.orhanobut.logger.f.d("定位精度：" + accuracy);
        this.gpsSignalView.setLocationAccuracy(accuracy);
        this.previousLatitude = latitude;
        this.previousLongitude = longitude;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNewLocation(Location location) {
        if (location == null) {
            return;
        }
        changeLocation(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestLocationUpdates$0(Task task) {
        if (this.hasLocationPermission) {
            try {
                Location location = (Location) task.getResult();
                if (location != null) {
                    changeLocation(location);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private void removeLocationUpdates() {
        LocationServices.getFusedLocationProviderClient((Activity) requireActivity()).removeLocationUpdates(this.googleLocationCallback);
    }

    @SuppressLint({"MissingPermission"})
    private void requestLocationUpdates() {
        if (this.hasLocationPermission) {
            com.orhanobut.logger.f.d("requestLocationUpdates");
            LocationRequest interval = LocationRequest.create().setPriority(100).setInterval(30000L);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) requireActivity());
            fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener() { // from class: com.crrepa.band.my.home.training.l
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    HomeTrainingGoogleMapFragment.this.lambda$requestLocationUpdates$0(task);
                }
            });
            fusedLocationProviderClient.requestLocationUpdates(interval, this.googleLocationCallback, requireActivity().getMainLooper());
        }
    }

    @SuppressLint({"MissingPermission"})
    private void setupMapStyle() {
        this.googleMap.setMapType(1);
        this.googleMap.getUiSettings().setZoomControlsEnabled(false);
        this.googleMap.getUiSettings().setCompassEnabled(false);
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        this.googleMap.setMyLocationEnabled(this.hasLocationPermission);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void activate(@NonNull LocationSource.OnLocationChangedListener onLocationChangedListener) {
        com.orhanobut.logger.f.d("activate");
        this.onLocationChangedListener = onLocationChangedListener;
        try {
            requestLocationUpdates();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void deactivate() {
        this.onLocationChangedListener = null;
        removeLocationUpdates();
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.googleMapView.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.googleMapView.onLowMemory();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap = googleMap;
        setupMapStyle();
        this.googleMap.setLocationSource(this);
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        this.googleMapView.onPause();
        super.onPause();
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment, com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.googleMapView.onResume();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle(c0.MAPVIEW_BUNDLE_KEY);
        if (bundle2 == null) {
            bundle2 = new Bundle();
            bundle.putBundle(c0.MAPVIEW_BUNDLE_KEY, bundle2);
        }
        this.googleMapView.onSaveInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.googleMapView.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.googleMapView.onStop();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.googleMapView.setVisibility(0);
        this.googleMapView.onCreate(bundle != null ? bundle.getBundle(c0.MAPVIEW_BUNDLE_KEY) : null);
        this.googleMapView.getMapAsync(this);
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment
    public void removeLocation() {
        removeLocationUpdates();
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment
    public void renderMapCamera() {
        changeCamera(new LatLng(this.previousLatitude, this.previousLongitude));
    }

    @Override // com.crrepa.band.my.home.training.HomeTrainingFragment
    public void requestLocation() {
        try {
            requestLocationUpdates();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
