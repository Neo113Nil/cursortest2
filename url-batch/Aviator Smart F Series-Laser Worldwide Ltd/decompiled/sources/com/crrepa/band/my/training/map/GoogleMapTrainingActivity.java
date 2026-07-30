package com.crrepa.band.my.training.map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.gps.GpsLocation;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class GoogleMapTrainingActivity extends BaseMapTrainingActivity implements OnMapReadyCallback, LocationSource {
    private final b googleLocationCallback = new b(this);
    private GoogleMap googleMap;
    private LocationSource.OnLocationChangedListener onLocationChangedListener;
    private Location previousLocation;

    class a implements OnCompleteListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Location> task) {
            Location result = task.getResult();
            if (result != null) {
                GoogleMapTrainingActivity.this.changeLocation(result);
            }
        }
    }

    static class b extends LocationCallback {
        private final WeakReference<GoogleMapTrainingActivity> weakReference;

        public b(GoogleMapTrainingActivity googleMapTrainingActivity) {
            this.weakReference = new WeakReference<>(googleMapTrainingActivity);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(@NonNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            GoogleMapTrainingActivity googleMapTrainingActivity = this.weakReference.get();
            com.orhanobut.logger.f.d("onLocationResult");
            Iterator<Location> it = locationResult.getLocations().iterator();
            while (it.hasNext()) {
                googleMapTrainingActivity.handleNewLocation(it.next());
            }
        }
    }

    private void changeCamera(LatLng latLng) {
        this.googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(latLng).zoom(16.0f).bearing(0.0f).tilt(25.0f).build()), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeLocation(Location location) {
        this.onLocationChangedListener.onLocationChanged(location);
        changeCamera(new LatLng(location.getLatitude(), location.getLongitude()));
    }

    private void drawRunPath(Location location) {
        GpsLocation gpsLocation = new GpsLocation(true);
        gpsLocation.setAccuracy(location.getAccuracy());
        gpsLocation.setLatitude(location.getLatitude());
        gpsLocation.setLongitude(location.getLongitude());
        gpsLocation.setSpeed(location.getSpeed());
        gpsLocation.setAltitude(location.getAltitude());
        gpsLocation.setTimestamp(location.getTime());
        this.presenter.drawRunPath(gpsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNewLocation(Location location) {
        if (location == null) {
            return;
        }
        this.previousLocation = location;
        changeLocation(location);
        drawRunPath(location);
    }

    private void removeLocationUpdates() {
        LocationServices.getFusedLocationProviderClient((Activity) this).removeLocationUpdates(this.googleLocationCallback);
    }

    @SuppressLint({"MissingPermission"})
    private void requestLocationUpdates() {
        if (com.crrepa.band.my.training.utils.h.isGooglePlayServices(com.moyoung.dafit.module.common.utils.d.get())) {
            com.orhanobut.logger.f.d("requestLocationUpdates");
            LocationRequest interval = LocationRequest.create().setPriority(100).setInterval(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) this);
            fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new a());
            fusedLocationProviderClient.requestLocationUpdates(interval, this.googleLocationCallback, getMainLooper());
        }
    }

    @SuppressLint({"MissingPermission"})
    private void setupMapStyle() {
        this.googleMap.setMapType(1);
        this.googleMap.getUiSettings().setZoomControlsEnabled(false);
        this.googleMap.getUiSettings().setCompassEnabled(false);
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        this.googleMap.setMyLocationEnabled(true);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void activate(@NonNull LocationSource.OnLocationChangedListener onLocationChangedListener) {
        com.orhanobut.logger.f.d("activate");
        this.onLocationChangedListener = onLocationChangedListener;
        requestLocationUpdates();
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void deactivate() {
        this.onLocationChangedListener = null;
        removeLocationUpdates();
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity
    public int getMapType() {
        return 1;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.googleMapView.setVisibility(0);
        this.googleMapView.onCreate(bundle != null ? bundle.getBundle(c0.MAPVIEW_BUNDLE_KEY) : null);
        this.googleMapView.getMapAsync(this);
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.googleMapView.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
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

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        this.googleMapView.onPause();
        super.onPause();
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.googleMapView.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle(c0.MAPVIEW_BUNDLE_KEY);
        if (bundle2 == null) {
            bundle2 = new Bundle();
            bundle.putBundle(c0.MAPVIEW_BUNDLE_KEY, bundle2);
        }
        this.googleMapView.onSaveInstanceState(bundle2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.googleMapView.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.googleMapView.onStop();
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, com.crrepa.band.my.training.map.c0
    public void removeLocation() {
        removeLocationUpdates();
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, com.crrepa.band.my.training.map.c0
    public void renderMapCamera() {
        if (this.previousLocation != null) {
            changeCamera(new LatLng(this.previousLocation.getLatitude(), this.previousLocation.getLongitude()));
        }
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, com.crrepa.band.my.training.map.c0
    public void renderPathLine(double d8, double d9, double d10, double d11) {
        this.googleMap.addPolyline(new PolylineOptions().add(new LatLng(d8, d9), new LatLng(d10, d11)).width(com.moyoung.dafit.module.common.utils.o.dp2px(this, 8.0f)).geodesic(true).startCap(new RoundCap()).endCap(new RoundCap()).color(ContextCompat.getColor(this, R.color.color_gps_training_path)));
    }

    @Override // com.crrepa.band.my.training.map.BaseMapTrainingActivity, com.crrepa.band.my.training.map.c0
    public void requestLocation() {
        requestLocationUpdates();
    }
}
