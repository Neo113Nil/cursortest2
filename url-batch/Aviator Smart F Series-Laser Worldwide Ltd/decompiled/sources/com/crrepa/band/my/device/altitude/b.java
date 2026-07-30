package com.crrepa.band.my.device.altitude;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.training.utils.h;
import com.github.mikephil.charting.utils.i;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b {
    private static final int DEFAULT_ALTITUDE = 100000;
    private static final int MAX_ERROR = 10;
    private static final int REQUEST_ALITITUDE_PERIOD = 20;
    private final List<Double> altitudeList;
    private com.crrepa.band.my.training.map.google.c googleLocationProvider;
    private LocationCallback locationCallback;
    private boolean requestAltitude;

    class a extends LocationCallback {
        a() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(@NonNull LocationResult locationResult) {
            super.onLocationResult(locationResult);
            if (locationResult == null) {
                f.e("locationResult is null", new Object[0]);
                return;
            }
            List<Location> locations = locationResult.getLocations();
            Location location = (locations == null || locations.isEmpty()) ? null : locations.get(0);
            f.i("Google 获取到的定位数据：" + s.bean2Json(location), new Object[0]);
            if (location != null && location.hasAltitude() && b.this.isValidLocation(location.getAccuracy())) {
                b.this.addAltitude(location.getAltitude());
            }
        }
    }

    /* renamed from: com.crrepa.band.my.device.altitude.b$b, reason: collision with other inner class name */
    private static class C0161b {
        private static final b INSTANCE = new b(null);

        private C0161b() {
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAltitude(double d8) {
        f.i("海拔数据获取中：" + this.altitudeList.size() + ":" + d8 + " m", new Object[0]);
        this.altitudeList.add(Double.valueOf(d8));
    }

    private double getAverageAltitude(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return 100000.0d;
        }
        int size = list.size();
        double d8 = i.DOUBLE_EPSILON;
        if (size == 1 && list.get(0).doubleValue() == i.DOUBLE_EPSILON) {
            return 100000.0d;
        }
        if (3 < list.size()) {
            Collections.sort(list);
            list.remove(0);
            list.remove(list.size() - 1);
        }
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            d8 += it.next().doubleValue();
        }
        return new BigDecimal(d8 / list.size()).setScale(6, RoundingMode.HALF_UP).doubleValue();
    }

    public static b getInstance() {
        return C0161b.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidLocation(float f8) {
        f.i("定位精度：" + f8, new Object[0]);
        return f8 < 50.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGetAltitude$0(Long l8) {
        stopLocationUpdates();
        sendCurrentAltitude();
    }

    @SuppressLint({"MissingPermission"})
    private void requestLocationUpdates() {
        Context context = d.get();
        if (h.isGooglePlayServices(context)) {
            this.googleLocationProvider = new com.crrepa.band.my.training.map.google.c(context);
            a aVar = new a();
            this.locationCallback = aVar;
            this.googleLocationProvider.requestLocationUpdates(aVar);
        }
    }

    private void sendCurrentAltitude() {
        f.i("海拔数据获取结束：" + this.altitudeList.size(), new Object[0]);
        if (this.altitudeList.isEmpty()) {
            return;
        }
        double averageAltitude = getAverageAltitude(this.altitudeList);
        f.i("最终获取到的海拔: " + averageAltitude + " m", new Object[0]);
        if (averageAltitude == 100000.0d) {
            f.i("不发送海拔数据", new Object[0]);
            return;
        }
        double abs = Math.abs(averageAltitude - this.altitudeList.get(r0.size() - 1).doubleValue());
        f.i("最终海拔数据与最后一次海拔数据差值的绝对值: " + abs, new Object[0]);
        if (abs > 10.0d) {
            f.i("GPS持续定位误差过大，不发送海拔数据", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("发送海拔数据：");
        int i8 = (int) averageAltitude;
        sb.append(i8);
        f.i(sb.toString(), new Object[0]);
        i4.getInstance().sendCurrentBarometer(i8);
    }

    private void stopLocationUpdates() {
        this.requestAltitude = false;
        com.crrepa.band.my.training.map.google.c cVar = this.googleLocationProvider;
        if (cVar != null) {
            cVar.removeLocationUpdates(this.locationCallback);
            this.googleLocationProvider = null;
            this.locationCallback = null;
        }
    }

    @SuppressLint({"CheckResult"})
    public void startGetAltitude() {
        if (this.requestAltitude) {
            f.i("正在获取海拔数据", new Object[0]);
            return;
        }
        if (!com.crrepa.band.my.training.utils.i.isEnable(d.get())) {
            f.i("没有开启定位服务", new Object[0]);
            return;
        }
        if (!com.crrepa.band.my.training.utils.i.isPermission(d.get())) {
            f.i("没有定位权限", new Object[0]);
            return;
        }
        f.i("开始获取海拔数据", new Object[0]);
        this.requestAltitude = true;
        this.altitudeList.clear();
        requestLocationUpdates();
        Observable.timer(20L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.altitude.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.lambda$startGetAltitude$0((Long) obj);
            }
        });
    }

    private b() {
        this.altitudeList = new ArrayList();
        this.requestAltitude = false;
    }
}
