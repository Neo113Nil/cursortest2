package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.crrepa.ble.conn.bean.CRPSupportAppInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPAppChangeListener {
    void onAppStoreInfo(CRPAppStoreInfo cRPAppStoreInfo);

    void onAvailableSize(int i8);

    void onInstalledAppList(List<CRPAppInfo> list);

    void onSupportAppInfo(CRPSupportAppInfo cRPSupportAppInfo);

    void onUninstallFail(int i8);

    void onUninstallSuccess();
}
