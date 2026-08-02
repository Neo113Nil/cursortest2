package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Xl implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0640ge f11275a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0846od f11276b;

    /* renamed from: c, reason: collision with root package name */
    public final Hb f11277c = new Hb();

    public Xl(C0640ge c0640ge, InterfaceC0846od interfaceC0846od) {
        this.f11275a = c0640ge;
        this.f11276b = interfaceC0846od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0519bm c0519bm) {
        C0823ng c0823ng;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.DEVICE_ID), c0519bm.getDeviceId());
        a(builder, C0817na.f12417I.h(), this.f11277c);
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.APP_SET_ID), c0519bm.getAppSetId());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0519bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.APP_PLATFORM), c0519bm.getAppPlatform());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.PROTOCOL_VERSION), c0519bm.getProtocolVersion());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0519bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.MODEL), c0519bm.getModel());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.MANUFACTURER), c0519bm.getManufacturer());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.OS_VERSION), c0519bm.getOsVersion());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0519bm.getScreenWidth()));
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0519bm.getScreenHeight()));
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0519bm.getScreenDpi()));
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0519bm.getScaleFactor()));
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.LOCALE), c0519bm.getLocale());
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.DEVICE_TYPE), c0519bm.getDeviceType());
        builder.appendQueryParameter(this.f11275a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("query_hosts"), String.valueOf(2));
        String a3 = this.f11275a.a("features");
        List<String> h2 = ((C1086xk) this.f11276b).h();
        String[] strArr = {this.f11275a.a("permissions_collecting"), this.f11275a.a("features_collecting"), this.f11275a.a("google_aid"), this.f11275a.a("huawei_oaid"), this.f11275a.a("sim_info"), this.f11275a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h2);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a3, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.APP_ID), c0519bm.getPackageName());
        builder.appendQueryParameter(this.f11275a.a("app_debuggable"), ((N5) c0519bm).f10689a);
        if (c0519bm.f11562l) {
            String str = c0519bm.f11563m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f11275a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f11275a.a("detect_locale"), String.valueOf(1));
        }
        C0913r3 c0913r3 = c0519bm.f11559i;
        if (!AbstractC0779lo.a(c0913r3.f12644a)) {
            builder.appendQueryParameter(this.f11275a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f11275a.a("clids_set"), Fm.a(c0913r3.f12644a));
            int ordinal = c0913r3.f12645b.ordinal();
            builder.appendQueryParameter(this.f11275a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0519bm.f11556f;
            String str3 = c0519bm.f11557g;
            if (TextUtils.isEmpty(str2) && (c0823ng = c0519bm.o.f12299b) != null) {
                str2 = c0823ng.f12464a;
                str3 = c0823ng.f12467d.f12365a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f11275a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f11275a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0519bm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f11275a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("app_system_flag"), ((N5) c0519bm).f10690b);
        builder.appendQueryParameter(this.f11275a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f11275a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d4 = ((C1086xk) this.f11276b).d();
        for (String str4 : d4.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d4.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Hb hb) {
        hb.getClass();
        AdvertisingIdsHolder identifiers = C0817na.f12417I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f11275a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
