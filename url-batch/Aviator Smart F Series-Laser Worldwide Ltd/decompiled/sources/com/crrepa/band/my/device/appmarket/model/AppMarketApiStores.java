package com.crrepa.band.my.device.appmarket.model;

import io.reactivex.Observable;
import r7.e;
import r7.f;
import r7.o;
import r7.s;
import r7.t;

/* loaded from: classes2.dex */
public interface AppMarketApiStores {
    public static final String BASE_URL = "https://api.moyoung.com/";

    @e
    @o("app-store/record")
    Observable<AppMarketRecordResp> reportAppInstallationEvent(@r7.c("app_id") int i8, @r7.c("version_id") int i9, @r7.c("version_name") String str, @r7.c("mac") String str2, @r7.c("firmware_name") String str3);

    @f("app-store/app")
    Observable<AppMarketAllAppResp> requestAllAppList(@t("tpl_id") int i8, @t("lang") String str, @t("page") int i9, @t("per_page") int i10, @t("api_version") int i11, @t("mac") String str2);

    @f("app-store/{version_id}/app")
    Observable<AppMarketAppDetailResp> requestAppDetail(@s("version_id") int i8, @t("lang") String str);

    @f("app-store/tags")
    Observable<AppMarketMixResp> requestAppMarketMixMsg(@t("tpl_id") int i8, @t("lang") String str, @t("vids") String str2, @t("api_version") int i9, @t("mac") String str3);

    @f("app-store/installed")
    Observable<AppMarketInstalledAppsResp> requestInstalledApps(@t("tpl_id") int i8, @t("lang") String str, @t("bundle_name") String str2, @t("api_version") int i9);
}
