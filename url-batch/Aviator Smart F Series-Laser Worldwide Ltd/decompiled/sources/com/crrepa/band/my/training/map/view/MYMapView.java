package com.crrepa.band.my.training.map.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.training.map.view.p;
import com.crrepa.band.my.training.model.MapType;
import com.google.android.gms.maps.MapView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MYMapView extends RelativeLayout {
    private MapView googleMapView;
    private p mapViewHelper;
    private NestedScrollView scrollView;

    public MYMapView(Context context) {
        this(context, null);
    }

    public void drawLine(double d8, double d9, double d10, double d11) {
        this.mapViewHelper.drawLine(d8, d9, d10, d11);
    }

    public void drawTrainingPath(List<GpsLocation> list) {
        if (list == null || 2 >= list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (GpsLocation gpsLocation : list) {
            if (gpsLocation.getLatitude() != 200.0d && gpsLocation.getLongitude() != 200.0d) {
                arrayList.add(gpsLocation);
            }
        }
        this.mapViewHelper.drawTrainingPath(arrayList);
    }

    public void init(boolean z7) {
        this.mapViewHelper.init(z7);
    }

    public void onCreate(Bundle bundle) {
        this.mapViewHelper.onCreate(bundle);
    }

    public void onDestroy() {
        this.mapViewHelper.onDestroy();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.scrollView.requestDisallowInterceptTouchEvent(false);
        } else {
            this.scrollView.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    public void onLowMemory() {
        this.mapViewHelper.onLowMemory();
    }

    public void onPause() {
        this.mapViewHelper.onPause();
    }

    public void onResume() {
        this.mapViewHelper.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mapViewHelper.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.mapViewHelper.onStart();
    }

    public void onStop() {
        this.mapViewHelper.onStop();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setMapType(MapType mapType) {
        this.mapViewHelper = new f(getContext(), this.googleMapView);
    }

    public void setOnLocationListener(p.a aVar) {
        this.mapViewHelper.setOnLocationListener(aVar);
    }

    public void setOnMapLoadedListener(p.b bVar) {
        this.mapViewHelper.setOnMapLoadedListener(bVar);
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.scrollView = nestedScrollView;
    }

    public MYMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MYMapView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.googleMapView = (MapView) LayoutInflater.from(context).inflate(R.layout.view_map, this).findViewById(R.id.google_map_view);
    }
}
