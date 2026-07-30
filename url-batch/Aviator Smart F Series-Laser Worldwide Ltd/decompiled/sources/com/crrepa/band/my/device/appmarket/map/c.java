package com.crrepa.band.my.device.appmarket.map;

import android.content.Context;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

/* loaded from: classes2.dex */
public class c {
    private static final int LOCATION_INTERVAL = 2000;
    private static final int LOCATION_NOTIFICATION_ID = 101;
    private LocationClient locationClient;

    public c(Context context) {
        LocationClient.setAgreePrivacy(true);
        try {
            this.locationClient = new LocationClient(context);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private LocationClientOption getLocationOption() {
        LocationClientOption locationClientOption = new LocationClientOption();
        locationClientOption.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        locationClientOption.setFirstLocType(LocationClientOption.FirstLocType.ACCURACY_IN_FIRST_LOC);
        locationClientOption.setCoorType("bd09ll");
        locationClientOption.setScanSpan(2000);
        return locationClientOption;
    }

    public void startLocation(BDAbstractLocationListener bDAbstractLocationListener) {
        LocationClient locationClient = this.locationClient;
        if (locationClient == null || locationClient.isStarted()) {
            return;
        }
        this.locationClient.setLocOption(getLocationOption());
        this.locationClient.enableLocInForeground(101, m1.a.showGPSNotification(com.moyoung.dafit.module.common.utils.d.get()));
        this.locationClient.registerLocationListener(bDAbstractLocationListener);
        this.locationClient.start();
    }

    public void stopLocation(BDAbstractLocationListener bDAbstractLocationListener) {
        LocationClient locationClient = this.locationClient;
        if (locationClient != null) {
            locationClient.stop();
            this.locationClient.disableLocInForeground(true);
            this.locationClient.unRegisterLocationListener(bDAbstractLocationListener);
        }
    }
}
