package com.crrepa.band.my.device.appmarket.openharmony.service;

import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.AppInfo;
import com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCallJavascriptResponse;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GetAppInstallStatusService {
    public static final int APP_STATUS_INSTALLED = 10;
    public static final int APP_STATUS_INSTALLING = 20;
    public static final int APP_STATUS_UNINSTALLED = 0;
    public static final int APP_STATUS_UNINSTALLING = 30;

    public String getAppInstallStatus(JsonObject jsonObject) {
        com.orhanobut.logger.f.i("GetAppInstallStatusService::GetAppInstallStatus", new Object[0]);
        List<CRPAppInfo> installedAppList = AppMarketProvider.getInstalledAppList();
        ArrayList arrayList = new ArrayList();
        for (CRPAppInfo cRPAppInfo : installedAppList) {
            new AppInfo();
            AppInfo appInfo = new AppInfo();
            appInfo.setName("手表应用1");
            appInfo.setPackageName(cRPAppInfo.getPackageName());
            int versionCode = cRPAppInfo.getVersionCode();
            if (versionCode == -1) {
                versionCode = 1;
            }
            appInfo.setVersionCode(Integer.valueOf(versionCode));
            appInfo.setStatus(10);
            arrayList.add(appInfo);
        }
        NativeCallJavascriptResponse nativeCallJavascriptResponse = new NativeCallJavascriptResponse();
        nativeCallJavascriptResponse.setBody(arrayList);
        return s.bean2Json(nativeCallJavascriptResponse);
    }
}
