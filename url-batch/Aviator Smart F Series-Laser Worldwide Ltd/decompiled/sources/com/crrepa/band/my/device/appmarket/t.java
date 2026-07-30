package com.crrepa.band.my.device.appmarket;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.appmarket.model.event.AppUninstallFailEvent;
import com.crrepa.band.my.device.appmarket.model.event.AppUninstallSuccessEvent;
import com.crrepa.band.my.device.appmarket.model.event.InstalledAppsChangeEvent;
import com.crrepa.band.my.device.appmarket.model.event.SupportAppInfoEvent;
import com.crrepa.band.my.device.calendar.model.BandCalendarEventChangeEvent;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.crrepa.ble.conn.bean.CRPSupportAppInfo;
import com.crrepa.ble.conn.listener.CRPAppChangeListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class t implements CRPAppChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onAppStoreInfo(CRPAppStoreInfo cRPAppStoreInfo) {
        com.orhanobut.logger.f.d("BandAppChangeListener onAppStoreInfo: " + cRPAppStoreInfo);
        AppMarketProvider.saveAppStoreInfo(cRPAppStoreInfo);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onAvailableSize(int i8) {
        Log.d("BandAppChangeListener", "onAvailableSize=" + i8);
        AppMarketProvider.saveAvailableSize(i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onInstalledAppList(List<CRPAppInfo> list) {
        Log.d("BandAppChangeListener", "onInstalledAppList: " + com.moyoung.dafit.module.common.utils.s.bean2Json(list));
        AppMarketProvider.saveInstalledAppList(list);
        org.greenrobot.eventbus.c.getDefault().post(new InstalledAppsChangeEvent());
        org.greenrobot.eventbus.c.getDefault().post(new BandCalendarEventChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onSupportAppInfo(CRPSupportAppInfo cRPSupportAppInfo) {
        Log.d("BandAppChangeListener", "onSupportAppInfo: " + cRPSupportAppInfo);
        i4.getInstance().queryAppAvailableSize();
        i4.getInstance().queryAppStoreInfo();
        AppMarketProvider.saveSupportAppInfo(cRPSupportAppInfo);
        org.greenrobot.eventbus.c.getDefault().post(new SupportAppInfoEvent());
        if (cRPSupportAppInfo.getInstalledCount() <= 0) {
            AppMarketProvider.saveInstalledAppList(new ArrayList());
            org.greenrobot.eventbus.c.getDefault().post(new InstalledAppsChangeEvent());
            org.greenrobot.eventbus.c.getDefault().post(new BandCalendarEventChangeEvent());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onUninstallFail(int i8) {
        Log.d("BandAppChangeListener", "onUninstallFail=" + i8);
        org.greenrobot.eventbus.c.getDefault().post(new AppUninstallFailEvent(i8));
    }

    @Override // com.crrepa.ble.conn.listener.CRPAppChangeListener
    public void onUninstallSuccess() {
        Log.d("BandAppChangeListener", "onUninstallSuccess");
        i4.getInstance().querySupportAppInfo();
        org.greenrobot.eventbus.c.getDefault().post(new AppUninstallSuccessEvent());
    }
}
