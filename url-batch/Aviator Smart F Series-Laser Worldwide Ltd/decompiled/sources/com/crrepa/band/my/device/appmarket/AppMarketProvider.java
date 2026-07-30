package com.crrepa.band.my.device.appmarket;

import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.crrepa.ble.conn.bean.CRPAppStoreInfo;
import com.crrepa.ble.conn.bean.CRPSupportAppInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes2.dex */
public class AppMarketProvider {
    public static final String APP_STORE_INFO = "app_store_info";
    public static final String AVAILABLE_SIZE = "available_size_app_market";
    public static final String INSTALLED_APP_LIST = "installed_app_list";
    public static final String SUPPORT_APP_INFO = "support_app_info";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(SUPPORT_APP_INFO);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(AVAILABLE_SIZE);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(INSTALLED_APP_LIST);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(APP_STORE_INFO);
    }

    public static int getApiVersion() {
        CRPSupportAppInfo supportAppInfo = getSupportAppInfo();
        if (supportAppInfo == null) {
            return -1;
        }
        return supportAppInfo.getVersion();
    }

    public static CRPAppStoreInfo getAppStoreInfo() {
        return (CRPAppStoreInfo) com.moyoung.dafit.module.common.utils.s.json2Bean(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(APP_STORE_INFO, ""), CRPAppStoreInfo.class);
    }

    public static int getAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(AVAILABLE_SIZE, 0) * 1024;
    }

    public static List<CRPAppInfo> getInstalledAppList() {
        return (List) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(INSTALLED_APP_LIST, ""), new TypeToken<List<CRPAppInfo>>() { // from class: com.crrepa.band.my.device.appmarket.AppMarketProvider.1
        }.getType());
    }

    public static CRPSupportAppInfo getSupportAppInfo() {
        return (CRPSupportAppInfo) new Gson().fromJson(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(SUPPORT_APP_INFO, ""), CRPSupportAppInfo.class);
    }

    public static int getTplId() {
        CRPSupportAppInfo supportAppInfo = getSupportAppInfo();
        if (supportAppInfo == null) {
            return -1;
        }
        return supportAppInfo.getTemplateID();
    }

    public static boolean isSupport() {
        return getSupportAppInfo() != null;
    }

    public static void saveAppStoreInfo(CRPAppStoreInfo cRPAppStoreInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(APP_STORE_INFO, com.moyoung.dafit.module.common.utils.s.bean2Json(cRPAppStoreInfo));
    }

    public static void saveAvailableSize(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(AVAILABLE_SIZE, i8);
    }

    public static void saveInstalledAppList(List<CRPAppInfo> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(INSTALLED_APP_LIST, new Gson().toJson(list));
    }

    public static void saveSupportAppInfo(CRPSupportAppInfo cRPSupportAppInfo) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(SUPPORT_APP_INFO, new Gson().toJson(cRPSupportAppInfo));
    }
}
