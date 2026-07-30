package com.crrepa.band.my.training.map.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.training.map.view.p;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class f extends p implements OnMapReadyCallback, LocationSource, GoogleMap.OnMapLoadedCallback {
    private static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";
    private b googleLocationCallback = new b(this);
    private GoogleMap googleMap;
    private MapView googleMapView;
    private Disposable moveCameraSubscribe;
    private LocationSource.OnLocationChangedListener onLocationChangedListener;
    private Disposable pathSubscribe;

    class a implements OnCompleteListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Location> task) {
            Location result = task.getResult();
            if (result != null) {
                f.this.changeLocation(result);
            }
        }
    }

    static class b extends LocationCallback {
        private WeakReference<f> weakReference;

        public b(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            f fVar = this.weakReference.get();
            com.orhanobut.logger.f.d("onLocationResult");
            List<Location> locations = locationResult.getLocations();
            if (locations.isEmpty()) {
                return;
            }
            Iterator<Location> it = locations.iterator();
            while (it.hasNext()) {
                fVar.updateLocation(it.next());
            }
        }
    }

    public f(Context context, MapView mapView) {
        this.context = context;
        this.googleMapView = mapView;
        mapView.setVisibility(0);
    }

    private void addMarker(LatLng latLng, int i8) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.icon(BitmapDescriptorFactory.fromResource(i8));
        this.googleMap.addMarker(markerOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeLocation(Location location) {
        com.orhanobut.logger.f.d("changeLocation: " + location.toString());
        LocationSource.OnLocationChangedListener onLocationChangedListener = this.onLocationChangedListener;
        if (onLocationChangedListener != null) {
            onLocationChangedListener.onLocationChanged(location);
        }
        changeCamera(location.getLatitude(), location.getLongitude());
    }

    private LatLng getStopPoint(List<LatLng> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            LatLng latLng = list.get(size);
            if (latLng.latitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latLng.longitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                return latLng;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$drawTrainingPath$0(List list, ObservableEmitter observableEmitter) {
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            LatLng latLng = (LatLng) list.get(i9);
            if (latLng.latitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latLng.longitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                if (i8 < i9) {
                    com.orhanobut.logger.f.d("pause index: " + i9);
                    com.orhanobut.logger.f.d("pausePosition: " + i8);
                    int i10 = ((i9 - i8) / 10000) + 1;
                    com.orhanobut.logger.f.d("offset: " + i10);
                    ArrayList arrayList = new ArrayList();
                    while (i8 < i9) {
                        arrayList.add((LatLng) list.get(i8));
                        i8 += i10;
                    }
                    if (1 < i10) {
                        arrayList.add((LatLng) list.get(i9 - 1));
                    }
                    observableEmitter.onNext((LatLng[]) arrayList.toArray(new LatLng[arrayList.size()]));
                }
                i8 = i9 + 1;
            }
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$drawTrainingPath$1(LatLng[] latLngArr) {
        com.orhanobut.logger.f.d("subscribe latLngs: " + latLngArr.length);
        this.googleMap.addPolyline(new PolylineOptions().add(latLngArr).width((float) getPathWidth()).color(getPathColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$drawTrainingPath$2(List list, ObservableEmitter observableEmitter) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int size = (list.size() / 10000) + 1;
        for (int i8 = 0; i8 < list.size(); i8 += size) {
            LatLng latLng = (LatLng) list.get(i8);
            if (latLng.latitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || latLng.longitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                builder.include(latLng);
            }
        }
        observableEmitter.onNext(CameraUpdateFactory.newLatLngBounds(builder.build(), getCameraBound()));
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$drawTrainingPath$3(CameraUpdate cameraUpdate) {
        this.googleMap.moveCamera(cameraUpdate);
        com.orhanobut.logger.f.d("moveCamera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocation(Location location) {
        if (location != null) {
            changeLocation(location);
        }
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.onLocationChangedListener = onLocationChangedListener;
        startLocation();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void changeCamera(double d8, double d9) {
        this.googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(new LatLng(d8, d9)).zoom(16.0f).bearing(0.0f).tilt(25.0f).build()), 1, null);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public void deactivate() {
        this.onLocationChangedListener = null;
        stopLocation();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void drawLine(double d8, double d9, double d10, double d11) {
        this.googleMap.addPolyline(new PolylineOptions().add(new LatLng(d8, d9), new LatLng(d10, d11)).width(getPathWidth()).geodesic(true).color(getPathColor()));
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void drawTrainingPath(List<GpsLocation> list) {
        final ArrayList arrayList = new ArrayList();
        for (GpsLocation gpsLocation : list) {
            arrayList.add(new LatLng(gpsLocation.getLatitude(), gpsLocation.getLongitude()));
        }
        this.pathSubscribe = Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.training.map.view.b
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                f.lambda$drawTrainingPath$0(arrayList, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.map.view.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.this.lambda$drawTrainingPath$1((LatLng[]) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
        addMarker(arrayList.get(0), R$drawable.ic_map_point_1);
        LatLng stopPoint = getStopPoint(arrayList);
        if (stopPoint != null) {
            addMarker(stopPoint, R$drawable.ic_map_point_2);
        }
        this.moveCameraSubscribe = Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.training.map.view.d
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                f.this.lambda$drawTrainingPath$2(arrayList, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.map.view.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.this.lambda$drawTrainingPath$3((CameraUpdate) obj);
            }
        });
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void init(boolean z7) {
        this.showMyLocation = z7;
        this.googleMapView.getMapAsync(this);
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onCreate(Bundle bundle) {
        this.googleMapView.onCreate(bundle != null ? bundle.getBundle("MapViewBundleKey") : null);
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onDestroy() {
        this.googleMapView.onDestroy();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onLowMemory() {
        this.googleMapView.onLowMemory();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public void onMapLoaded() {
        p.b bVar = this.onMapLoadedListener;
        if (bVar != null) {
            bVar.onMapLoaded();
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    @SuppressLint({"MissingPermission"})
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        setMapStyle();
        this.googleMap.setMyLocationEnabled(this.showMyLocation);
        if (this.showMyLocation) {
            this.googleMap.setLocationSource(this);
        } else {
            this.googleMap.setOnMapLoadedCallback(this);
        }
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onPause() {
        this.googleMapView.onPause();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onResume() {
        this.googleMapView.onResume();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("MapViewBundleKey");
        if (bundle2 == null) {
            bundle2 = new Bundle();
            bundle.putBundle("MapViewBundleKey", bundle2);
        }
        this.googleMapView.onSaveInstanceState(bundle2);
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onStart() {
        this.googleMapView.onStart();
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void onStop() {
        this.googleMapView.onStop();
        Disposable disposable = this.pathSubscribe;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.moveCameraSubscribe;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    @Override // com.crrepa.band.my.training.map.view.p
    void setMapStyle() {
        this.googleMap.setMapType(1);
        this.googleMap.getUiSettings().setZoomControlsEnabled(false);
        this.googleMap.getUiSettings().setCompassEnabled(false);
        this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
    }

    @Override // com.crrepa.band.my.training.map.view.p
    @SuppressLint({"MissingPermission"})
    public void startLocation() {
        com.orhanobut.logger.f.d("requestLocationUpdates");
        LocationRequest interval = LocationRequest.create().setPriority(100).setInterval(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.context);
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new a());
        fusedLocationProviderClient.requestLocationUpdates(interval, this.googleLocationCallback, this.context.getMainLooper());
    }

    @Override // com.crrepa.band.my.training.map.view.p
    public void stopLocation() {
        LocationServices.getFusedLocationProviderClient(this.context).removeLocationUpdates(this.googleLocationCallback);
    }
}
