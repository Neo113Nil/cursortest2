package com.crrepa.band.my.training.map;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityTrainingPathBinding;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.training.map.BaseTrainingPathActivity;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.OnMapsSdkInitializedCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GoogleMapTrainingPathActivity extends BaseTrainingPathActivity implements OnMapReadyCallback, GoogleMap.OnMapLoadedCallback {
    private CameraUpdate cameraUpdate;
    private GoogleMap googleMap;
    private boolean latest;
    private List<LatLng> milestoneList = new ArrayList();
    private LatLng previousLatLng;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer;

        static {
            int[] iArr = new int[MapsInitializer.Renderer.values().length];
            $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer = iArr;
            try {
                iArr[MapsInitializer.Renderer.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[MapsInitializer.Renderer.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void addMarkerForMap(LatLng latLng, int i8) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.icon(BitmapDescriptorFactory.fromResource(i8));
        this.googleMap.addMarker(markerOptions);
    }

    private List<LatLng> getRunLocationPoints(List<TrainingLocation> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        this.milestoneList.clear();
        ArrayList arrayList = new ArrayList();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (TrainingLocation trainingLocation : list) {
            LatLng latLng = new LatLng(trainingLocation.getLatitude(), trainingLocation.getLongitude());
            if (isPausePoint(latLng)) {
                this.previousLatLng = null;
            } else {
                LatLng latLng2 = this.previousLatLng;
                if (latLng2 != null) {
                    d8 += com.crrepa.band.my.training.utils.j.calculateDistanceOfGoogle(latLng2.latitude, latLng2.longitude, latLng.latitude, latLng.longitude);
                    if (this.milestoneDistance <= d8) {
                        this.milestoneList.add(latLng);
                        d8 -= this.milestoneDistance;
                    }
                }
                this.previousLatLng = latLng;
            }
            arrayList.add(latLng);
        }
        return arrayList;
    }

    private LatLng getStopPoint(List<LatLng> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            LatLng latLng = list.get(size);
            if (!isPausePoint(latLng)) {
                return latLng;
            }
        }
        return null;
    }

    private boolean isPausePoint(LatLng latLng) {
        return latLng.latitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latLng.longitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(MapsInitializer.Renderer renderer) {
        int i8 = a.$SwitchMap$com$google$android$gms$maps$MapsInitializer$Renderer[renderer.ordinal()];
        if (i8 == 1) {
            this.latest = true;
            com.orhanobut.logger.f.d("The latest version of the renderer is used.");
        } else {
            if (i8 != 2) {
                return;
            }
            this.latest = false;
            com.orhanobut.logger.f.d("The legacy version of the renderer is used.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shotMap$1(Bitmap bitmap) {
        BaseTrainingPathActivity.b bVar = this.onMapScreenShotListener;
        if (bVar != null) {
            bVar.onShot(bitmap);
        }
    }

    private void renderPathInLatestVersion(List<TrainingLocation> list) {
        List<LatLng> runLocationPoints = getRunLocationPoints(list);
        if (runLocationPoints == null || runLocationPoints.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < runLocationPoints.size()) {
            LatLng latLng = runLocationPoints.get(i8);
            TrainingLocation trainingLocation = list.get(i8);
            arrayList.add(new StyleSpan(StrokeStyle.gradientBuilder(ContextCompat.getColor(this, com.crrepa.band.my.training.utils.c.resolvePaceToLineColor(trainingLocation.getSpeed(), BandUnitSystemProvider.isImperialSystem())), ContextCompat.getColor(this, com.crrepa.band.my.training.utils.c.resolvePaceToLineColor((i8 < list.size() + (-1) ? list.get(i8 + 1) : trainingLocation).getSpeed(), BandUnitSystemProvider.isImperialSystem()))).build()));
            if (latLng.latitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latLng.longitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                if (i8 != i9) {
                    List<LatLng> subList = runLocationPoints.subList(i9, i8);
                    LatLng[] latLngArr = (LatLng[]) subList.toArray(new LatLng[subList.size()]);
                    if (2 <= latLngArr.length) {
                        this.googleMap.addPolyline(new PolylineOptions().add(latLngArr).width(com.moyoung.dafit.module.common.utils.o.dp2px(this, 8.0f)).startCap(new RoundCap()).endCap(new RoundCap()).addAllSpans(arrayList));
                    }
                }
                i9 = i8 + 1;
            }
            i8++;
        }
    }

    private void renderPathInLegacyVersion(List<TrainingLocation> list) {
        List<LatLng> runLocationPoints = getRunLocationPoints(list);
        if (runLocationPoints == null || runLocationPoints.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < runLocationPoints.size(); i9++) {
            LatLng latLng = runLocationPoints.get(i9);
            if (latLng.latitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && latLng.longitude == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                if (i9 != i8) {
                    List<LatLng> subList = runLocationPoints.subList(i8, i9);
                    LatLng[] latLngArr = (LatLng[]) subList.toArray(new LatLng[subList.size()]);
                    if (2 <= latLngArr.length) {
                        this.googleMap.addPolyline(new PolylineOptions().add(latLngArr).width(com.moyoung.dafit.module.common.utils.o.dp2px(this, 8.0f)).startCap(new RoundCap()).endCap(new RoundCap()).color(ContextCompat.getColor(this, R.color.color_result_run_path_color)));
                    }
                }
                i8 = i9 + 1;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void setupMapStyle(GoogleMap googleMap) {
        googleMap.setMapType(1);
        googleMap.getUiSettings().setZoomControlsEnabled(false);
        googleMap.getUiSettings().setCompassEnabled(false);
        googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        googleMap.setMyLocationEnabled(false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        MapsInitializer.initialize(this, MapsInitializer.Renderer.LATEST, new OnMapsSdkInitializedCallback() { // from class: com.crrepa.band.my.training.map.x
            @Override // com.google.android.gms.maps.OnMapsSdkInitializedCallback
            public final void onMapsSdkInitialized(MapsInitializer.Renderer renderer) {
                GoogleMapTrainingPathActivity.this.lambda$onCreate$0(renderer);
            }
        });
        ((ActivityTrainingPathBinding) this.binding).googleMapView.setVisibility(0);
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onCreate(bundle != null ? bundle.getBundle(c0.MAPVIEW_BUNDLE_KEY) : null);
        ((ActivityTrainingPathBinding) this.binding).googleMapView.getMapAsync(this);
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        releaseGoogleMap();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onLowMemory();
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public void onMapLoaded() {
        loadTrainingPath();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap = googleMap;
        setupMapStyle(googleMap);
        this.googleMap.setOnMapLoadedCallback(this);
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onPause();
        super.onPause();
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onResume();
        s0.logPage(getClass(), "GPS记录页");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onStart();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ((ActivityTrainingPathBinding) this.binding).googleMapView.onStop();
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity, x3.c
    public void renderTrainingPath(List<TrainingLocation> list) {
        List<LatLng> runLocationPoints = getRunLocationPoints(list);
        if (runLocationPoints == null || runLocationPoints.size() < 2) {
            ((ActivityTrainingPathBinding) this.binding).flMap.setVisibility(8);
            return;
        }
        int i8 = 0;
        if (this.latest) {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.rlSpeedRange.setVisibility(0);
            renderPathInLatestVersion(list);
        } else {
            ((ActivityTrainingPathBinding) this.binding).includeDetail.rlSpeedRange.setVisibility(8);
            renderPathInLegacyVersion(list);
        }
        LatLng latLng = runLocationPoints.get(0);
        LatLng stopPoint = getStopPoint(runLocationPoints);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (LatLng latLng2 : runLocationPoints) {
            if (latLng2.latitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || latLng2.longitude != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                builder.include(latLng2);
            }
        }
        if (com.moyoung.dafit.module.common.utils.u.isSimplified()) {
            addMarkerForMap(latLng, R$drawable.ic_gps_exercise_map_point_start_zh);
            addMarkerForMap(stopPoint, R$drawable.ic_gps_exercise_map_point_end_zh);
        } else {
            addMarkerForMap(latLng, R$drawable.ic_gps_exercise_map_point_start_en);
            addMarkerForMap(stopPoint, R$drawable.ic_gps_exercise_map_point_end_en);
        }
        while (i8 < this.milestoneList.size()) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(this.milestoneList.get(i8));
            i8++;
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(buildMilestoneView(i8)));
            this.googleMap.addMarker(markerOptions);
        }
        CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), com.moyoung.dafit.module.common.utils.o.dp2px(this, 40.0f));
        this.cameraUpdate = newLatLngBounds;
        this.googleMap.moveCamera(newLatLngBounds);
        shotMap();
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity
    public void resetMapCamera() {
        CameraUpdate cameraUpdate = this.cameraUpdate;
        if (cameraUpdate != null) {
            this.googleMap.moveCamera(cameraUpdate);
        }
    }

    @Override // com.crrepa.band.my.training.map.BaseTrainingPathActivity
    public void shotMap() {
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.crrepa.band.my.training.map.y
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    GoogleMapTrainingPathActivity.this.lambda$shotMap$1(bitmap);
                }
            });
            return;
        }
        BaseTrainingPathActivity.b bVar = this.onMapScreenShotListener;
        if (bVar != null) {
            bVar.onShot(null);
        }
    }
}
