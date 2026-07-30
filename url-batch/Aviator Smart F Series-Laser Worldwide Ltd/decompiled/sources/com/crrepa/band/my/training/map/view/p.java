package com.crrepa.band.my.training.map.view;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsLocation;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class p {
    public static final int CAMERA_BOUND_DP = 40;
    protected static final int LOCATION_INTERVAL = 2000;
    protected static final float MAP_CAMERA_TILT = 25.0f;
    protected static final float MAP_ZOOM_VALUE = 16.0f;
    public static final int MAX_PATH_POINT = 10000;
    private static final float PATH_WIDTH_DP = 8.0f;
    protected Context context;
    protected a onLocationListener;
    protected b onMapLoadedListener;
    protected boolean showMyLocation = false;

    public interface a {
    }

    public interface b {
        void onMapLoaded();
    }

    public abstract void changeCamera(double d8, double d9);

    public abstract void drawLine(double d8, double d9, double d10, double d11);

    public abstract void drawTrainingPath(List<GpsLocation> list);

    protected int getCameraBound() {
        return com.moyoung.dafit.module.common.utils.o.dp2px(this.context, 40.0f);
    }

    @ColorInt
    protected int getPathColor() {
        return ContextCompat.getColor(this.context, R.color.color_result_run_path_color);
    }

    protected int getPathWidth() {
        return com.moyoung.dafit.module.common.utils.o.dp2px(this.context, 8.0f);
    }

    public abstract void init(boolean z7);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onLowMemory();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    abstract void setMapStyle();

    public void setOnLocationListener(a aVar) {
    }

    public void setOnMapLoadedListener(b bVar) {
        this.onMapLoadedListener = bVar;
    }

    public abstract void startLocation();

    public abstract void stopLocation();

    protected o toMapLocation(Location location) {
        o oVar = new o();
        oVar.setAccuracy(location.getAccuracy());
        oVar.setAltitude(location.getAltitude());
        oVar.setSpeed(location.getSpeed());
        oVar.setLatitude(location.getLatitude());
        oVar.setLongitude(location.getLongitude());
        return oVar;
    }
}
