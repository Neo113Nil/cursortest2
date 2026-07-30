package com.crrepa.band.my.device.muslim.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.crrepa.band.my.training.model.GpsStateChangeEvent;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.utils.h;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f, SensorEventListener {
    private static final int MAX_ANGLE = 360;
    private static final double TARGET_LATITUDE = 21.424055d;
    private static final double TARGET_LONGITUDE = 39.826164d;
    private boolean isLocationOpen;
    private SensorManager sensorManager;
    private com.crrepa.band.my.device.muslim.view.b view;
    private int muslimAngle = 0;
    private int lastAngle = -1;
    private int accuracy = 0;

    /* renamed from: com.crrepa.band.my.device.muslim.presenter.a$a, reason: collision with other inner class name */
    class C0179a implements Observer {
        C0179a() {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            com.crrepa.band.my.device.muslim.utils.b.setLocationError();
            if (a.this.view != null) {
                a.this.view.renderLocationFailure(true);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onNext(LocationCityInfo locationCityInfo) {
            com.orhanobut.logger.f.d("muslim ==> 方向获取 经度：" + locationCityInfo.getLongitude() + " 纬度：" + locationCityInfo.getLatitude());
            if (locationCityInfo.getLatitude() == i.DOUBLE_EPSILON || locationCityInfo.getLongitude() == i.DOUBLE_EPSILON) {
                com.crrepa.band.my.device.muslim.utils.b.setLocationError();
                if (a.this.view != null) {
                    a.this.view.renderLocationFailure(true);
                    return;
                }
                return;
            }
            com.crrepa.band.my.device.muslim.utils.b.latitude = locationCityInfo.getLatitude();
            com.crrepa.band.my.device.muslim.utils.b.longitude = locationCityInfo.getLongitude();
            com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimLocation();
            if (a.this.view != null) {
                a.this.updateDirection();
            }
        }
    }

    private void changeLocationOpenStatus(boolean z7) {
        if (z7 != this.isLocationOpen) {
            com.orhanobut.logger.f.d("muslim ==> changeLocationOpen: " + z7);
            this.isLocationOpen = z7;
            if (z7) {
                this.view.renderLocationSuccess();
            } else {
                this.view.renderLocationFailure(false);
            }
        }
    }

    private int getDeviceAngleGap(int i8) {
        if (i8 < 0) {
            i8 += MAX_ANGLE;
        }
        int i9 = this.muslimAngle;
        int i10 = i8 - i9;
        return (i8 < 0 || i8 > i9 + (-180)) ? i10 : (i8 + MAX_ANGLE) - i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDirection() {
        int calculateBearing = com.crrepa.band.my.device.muslim.utils.a.calculateBearing(com.crrepa.band.my.device.muslim.utils.b.latitude, com.crrepa.band.my.device.muslim.utils.b.longitude, TARGET_LATITUDE, TARGET_LONGITUDE);
        this.muslimAngle = calculateBearing;
        this.view.renderMuslimAngle(calculateBearing);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public void getDirection(Context context, boolean z7) {
        if (z7 || com.crrepa.band.my.device.muslim.utils.b.isLocationError()) {
            h.getLocationAddress(context).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0179a());
        } else {
            updateDirection();
        }
    }

    public boolean isLocationOpen() {
        return this.isLocationOpen;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
        this.accuracy = i8;
        this.view.showAccuracyDialog(i8 < 2, i8);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onGpsStateChangeEvent(GpsStateChangeEvent gpsStateChangeEvent) {
        changeLocationOpenStatus(com.crrepa.band.my.training.utils.i.isEnable(gpsStateChangeEvent.getContext()));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i8;
        if (!this.isLocationOpen || com.crrepa.band.my.device.muslim.utils.b.isLocationError() || sensorEvent.sensor.getType() != 3 || this.lastAngle == (i8 = (int) sensorEvent.values[0])) {
            return;
        }
        this.lastAngle = i8;
        this.view.renderDeviceAngle(i8, getDeviceAngleGap(i8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
        this.sensorManager.unregisterListener(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(3);
        if (defaultSensor != null) {
            this.sensorManager.registerListener(this, defaultSensor, 1);
        }
    }

    public void setView(com.crrepa.band.my.device.muslim.view.b bVar, Context context) {
        this.view = bVar;
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.isLocationOpen = com.crrepa.band.my.training.utils.i.isEnable(context);
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
    }
}
