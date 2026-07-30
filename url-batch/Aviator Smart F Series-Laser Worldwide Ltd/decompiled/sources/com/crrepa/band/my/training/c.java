package com.crrepa.band.my.training;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.home.training.model.HomeTrainingEvent;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.gps.GpsLocation;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.model.MapType;
import com.crrepa.ble.conn.bean.CRPGpsPathInfo;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.ble.conn.listener.CRPGpsChangeListener;
import com.crrepa.ble.conn.type.CRPEpoType;
import com.google.android.exoplayer2.ExoPlayer;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class c implements CRPGpsChangeListener {
    private GpsTrainingDaoProxy gpsTrainingDaoProxy = new GpsTrainingDaoProxy();
    private List<Integer> timeList = new ArrayList();
    private com.crrepa.band.my.training.presenter.c epoFileUploadPresenter = new com.crrepa.band.my.training.presenter.c();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUpdateGpsLocationChange$0(LocationCityInfo locationCityInfo) {
        if (locationCityInfo != null) {
            com.orhanobut.logger.f.d("onUpdateGpsLocationChange: " + locationCityInfo.getLatitude());
            i4.getInstance().sendLocalLocation(locationCityInfo.getLatitude(), locationCityInfo.getLongitude());
        }
    }

    private void queryGpsPathDetail() {
        if (this.timeList.isEmpty()) {
            return;
        }
        com.crrepa.band.my.ble.band.cmd.d.getInstance().queryGpsDetail(this.timeList.remove(0).intValue());
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onGpsPathChange(CRPGpsPathInfo cRPGpsPathInfo) {
        if (cRPGpsPathInfo == null || cRPGpsPathInfo.getLocationList() == null || cRPGpsPathInfo.getLocationList().isEmpty()) {
            queryGpsPathDetail();
            return;
        }
        com.orhanobut.logger.f.d("onGpsPathChange: " + com.moyoung.dafit.module.common.utils.s.bean2Json(cRPGpsPathInfo));
        long time = cRPGpsPathInfo.getTime();
        com.orhanobut.logger.f.d("onGpsPathChange: currentTimeMillis=" + time);
        List<CRPGpsPathInfo.Location> locationList = cRPGpsPathInfo.getLocationList();
        ArrayList arrayList = new ArrayList();
        for (CRPGpsPathInfo.Location location : locationList) {
            if (location.isNotSingal()) {
                GpsLocation gpsLocation = new GpsLocation(true);
                gpsLocation.setLatitude(200.0d);
                gpsLocation.setLongitude(200.0d);
                gpsLocation.setTimestamp(time);
                arrayList.add(gpsLocation);
            } else if (!location.isPause()) {
                GpsLocation gpsLocation2 = new GpsLocation(true);
                gpsLocation2.setLatitude(location.getLatitude());
                gpsLocation2.setLongitude(location.getLongitude());
                gpsLocation2.setTimestamp(time);
                arrayList.add(gpsLocation2);
            } else if (!arrayList.isEmpty() && !((GpsLocation) arrayList.get(arrayList.size() - 1)).isPause()) {
                GpsLocation gpsLocation3 = new GpsLocation(true);
                gpsLocation3.setLatitude(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
                gpsLocation3.setLongitude(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
                gpsLocation3.setTimestamp(time);
                arrayList.add(gpsLocation3);
            }
            time += ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        }
        GpsLocation gpsLocation4 = new GpsLocation(true);
        gpsLocation4.setLatitude(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        gpsLocation4.setLongitude(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        gpsLocation4.setTimestamp(time);
        arrayList.add(gpsLocation4);
        GpsTraining gpsTraining = new GpsTraining();
        String bean2Json = com.moyoung.dafit.module.common.utils.s.bean2Json(arrayList);
        com.orhanobut.logger.f.d("locationStr: " + bean2Json);
        gpsTraining.setFilePath(com.crrepa.band.my.training.utils.c.writeGpsPath(String.valueOf(cRPGpsPathInfo.getTime()), bean2Json).getPath());
        int size = locationList.size() * ((int) ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        Date date = new Date(cRPGpsPathInfo.getTime());
        Date date2 = new Date(cRPGpsPathInfo.getTime() + size);
        gpsTraining.setStartDate(date);
        gpsTraining.setEndDate(date2);
        gpsTraining.setType(Integer.valueOf(GpsTrainingDaoProxy.GPS_TYPE));
        gpsTraining.setDistance(Integer.valueOf(j.create(MapType.GOOGLE).getDistanceOverLoaded(arrayList)));
        this.gpsTrainingDaoProxy.insert(gpsTraining);
        queryGpsPathDetail();
        org.greenrobot.eventbus.c.getDefault().post(new HomeTrainingEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onHistoryGpsPathChange(List<Integer> list) {
        com.orhanobut.logger.f.d("onHistoryGpsPathChange: " + com.moyoung.dafit.module.common.utils.s.bean2Json(list));
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean isEmpty = this.timeList.isEmpty();
        for (Integer num : list) {
            if (num.intValue() > 0 && !this.timeList.contains(num) && this.gpsTrainingDaoProxy.get(new Date(num.intValue() * 1000)) == null) {
                this.timeList.add(num);
            }
        }
        if (isEmpty) {
            queryGpsPathDetail();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onLocationChanged(CRPGpsPathInfo.Location location) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onUpdateEpoChange(CRPEpoType cRPEpoType) {
        this.epoFileUploadPresenter.sendEpoFile(cRPEpoType);
        com.crrepa.band.my.training.utils.a.setGpsTraining(true);
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onUpdateGpsLocationChange() {
        com.orhanobut.logger.f.d("onUpdateGpsLocationChange");
        com.crrepa.band.my.training.utils.h.getLocationAddress(com.moyoung.dafit.module.common.utils.d.get()).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.lambda$onUpdateGpsLocationChange$0((LocationCityInfo) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.training.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPGpsChangeListener
    public void onUpdateHisiliconEpoChange(CRPHisiliconEpoInfo cRPHisiliconEpoInfo) {
        this.epoFileUploadPresenter.sendHisiliconEpoFile(cRPHisiliconEpoInfo);
        com.crrepa.band.my.training.utils.a.setGpsTraining(true);
    }
}
