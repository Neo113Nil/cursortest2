package com.crrepa.band.my.device.appmarket.model;

import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.band.my.device.appmarket.model.AppMarketAppDetailResp;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.moyoung.dafit.module.common.utils.ServerLanguageUtil;
import com.moyoung.dafit.module.common.utils.x0;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BlockingBaseObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class AppMarketModel {
    private static final int NET_RESULT_OK = 1;
    private final AppMarketApiStores apiStores = AppMarketRetrofitClient.get().getApiStores();

    private static String getAppBundleNames(List<CRPAppInfo> list) {
        if (x0.isEmpty(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (CRPAppInfo cRPAppInfo : list) {
            if (sb.length() == 0) {
                sb = new StringBuilder(cRPAppInfo.getPackageName());
            } else {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(cRPAppInfo.getPackageName());
            }
        }
        return sb.toString();
    }

    private static String getAppVersionIds(List<Integer> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            if (sb.length() == 0) {
                sb = new StringBuilder(num.intValue());
            } else {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(num);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestAllAppList$1(AppMarketAllAppResp appMarketAllAppResp) {
        List<AppMarketAppBean> list;
        if (appMarketAllAppResp == null || appMarketAllAppResp.code != 1 || (list = appMarketAllAppResp.apps) == null) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AppMarketAppDetailResp.Data lambda$requestAppDetail$2(AppMarketAppDetailResp appMarketAppDetailResp) {
        AppMarketAppDetailResp.Data data;
        if (appMarketAppDetailResp == null || appMarketAppDetailResp.code != 1 || (data = appMarketAppDetailResp.data) == null) {
            return null;
        }
        return data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AppMarketMixResp lambda$requestAppMarketMixMsg$0(AppMarketMixResp appMarketMixResp) {
        if (appMarketMixResp == null || appMarketMixResp.code != 1) {
            return null;
        }
        return appMarketMixResp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$requestInstalledAppList$3(AppMarketInstalledAppsResp appMarketInstalledAppsResp) {
        List<AppMarketAppBean> list;
        if (appMarketInstalledAppsResp == null || appMarketInstalledAppsResp.code != 1 || (list = appMarketInstalledAppsResp.apps) == null) {
            return null;
        }
        return list;
    }

    public List<AppMarketAppBean> getLatestAppList(List<CRPAppInfo> list, List<AppMarketAppBean> list2) {
        ArrayList arrayList = new ArrayList();
        for (AppMarketAppBean appMarketAppBean : list2) {
            Iterator<CRPAppInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    CRPAppInfo next = it.next();
                    if (next.getPackageName().equals(appMarketAppBean.version.bundle_name)) {
                        if (appMarketAppBean.version.version_name.equals(next.getVersion())) {
                            arrayList.add(appMarketAppBean);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public List<AppMarketAppBean> getToBeUpdateAppList(List<CRPAppInfo> list, List<AppMarketAppBean> list2) {
        ArrayList arrayList = new ArrayList();
        for (AppMarketAppBean appMarketAppBean : list2) {
            Iterator<CRPAppInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    CRPAppInfo next = it.next();
                    if (next.getPackageName().equals(appMarketAppBean.version.bundle_name)) {
                        if (!appMarketAppBean.version.version_name.equals(next.getVersion())) {
                            arrayList.add(appMarketAppBean);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void reportAppInstallationEvent(int i8, int i9, String str) {
        f.d("app app_id: " + i8);
        f.d("app version_id: " + i9);
        f.d("app version_name: " + str);
        this.apiStores.reportAppInstallationEvent(i8, i9, str, com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress(), com.crrepa.band.my.ble.band.utils.a.getInstance().getFirmwareVersion()).subscribeOn(Schedulers.io()).subscribe(new BlockingBaseObserver<AppMarketRecordResp>() { // from class: com.crrepa.band.my.device.appmarket.model.AppMarketModel.1
            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                th.printStackTrace();
            }

            @Override // io.reactivex.Observer
            public void onNext(AppMarketRecordResp appMarketRecordResp) {
                f.d("appMarketRecordResp: " + appMarketRecordResp.getCode());
            }
        });
    }

    public Observable<List<AppMarketAppBean>> requestAllAppList() {
        int tplId = AppMarketProvider.getTplId();
        int apiVersion = AppMarketProvider.getApiVersion();
        return this.apiStores.requestAllAppList(tplId, ServerLanguageUtil.getRequestLanguage(), 1, 50, apiVersion, com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.crrepa.band.my.device.appmarket.model.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestAllAppList$1;
                lambda$requestAllAppList$1 = AppMarketModel.lambda$requestAllAppList$1((AppMarketAllAppResp) obj);
                return lambda$requestAllAppList$1;
            }
        });
    }

    public Observable<AppMarketAppDetailResp.Data> requestAppDetail(int i8) {
        return this.apiStores.requestAppDetail(i8, ServerLanguageUtil.getRequestLanguage()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.crrepa.band.my.device.appmarket.model.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AppMarketAppDetailResp.Data lambda$requestAppDetail$2;
                lambda$requestAppDetail$2 = AppMarketModel.lambda$requestAppDetail$2((AppMarketAppDetailResp) obj);
                return lambda$requestAppDetail$2;
            }
        });
    }

    public Observable<AppMarketMixResp> requestAppMarketMixMsg(List<Integer> list) {
        int tplId = AppMarketProvider.getTplId();
        int apiVersion = AppMarketProvider.getApiVersion();
        return this.apiStores.requestAppMarketMixMsg(tplId, ServerLanguageUtil.getRequestLanguage(), getAppVersionIds(list), apiVersion, com.crrepa.band.my.ble.band.utils.a.getInstance().getAddress()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.crrepa.band.my.device.appmarket.model.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AppMarketMixResp lambda$requestAppMarketMixMsg$0;
                lambda$requestAppMarketMixMsg$0 = AppMarketModel.lambda$requestAppMarketMixMsg$0((AppMarketMixResp) obj);
                return lambda$requestAppMarketMixMsg$0;
            }
        });
    }

    public Observable<List<AppMarketAppBean>> requestInstalledAppList(List<CRPAppInfo> list) {
        int tplId = AppMarketProvider.getTplId();
        int apiVersion = AppMarketProvider.getApiVersion();
        return this.apiStores.requestInstalledApps(tplId, ServerLanguageUtil.getRequestLanguage(), getAppBundleNames(list), apiVersion).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: com.crrepa.band.my.device.appmarket.model.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestInstalledAppList$3;
                lambda$requestInstalledAppList$3 = AppMarketModel.lambda$requestInstalledAppList$3((AppMarketInstalledAppsResp) obj);
                return lambda$requestInstalledAppList$3;
            }
        });
    }
}
