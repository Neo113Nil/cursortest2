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

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397bm implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0699ne f7103a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0905vd f7104b;

    /* renamed from: c, reason: collision with root package name */
    public final Ob f7105c = new Ob();

    public C0397bm(C0699ne c0699ne, InterfaceC0905vd interfaceC0905vd) {
        this.f7103a = c0699ne;
        this.f7104b = interfaceC0905vd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0500fm c0500fm) {
        C0830sg c0830sg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.DEVICE_ID), c0500fm.getDeviceId());
        a(builder, C0876ua.f8420H.h(), this.f7105c);
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.APP_SET_ID), c0500fm.getAppSetId());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0500fm.getAppSetIdScope());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.APP_PLATFORM), c0500fm.getAppPlatform());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.PROTOCOL_VERSION), c0500fm.getProtocolVersion());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0500fm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.MODEL), c0500fm.getModel());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.MANUFACTURER), c0500fm.getManufacturer());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.OS_VERSION), c0500fm.getOsVersion());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0500fm.getScreenWidth()));
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0500fm.getScreenHeight()));
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0500fm.getScreenDpi()));
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0500fm.getScaleFactor()));
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.LOCALE), c0500fm.getLocale());
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.DEVICE_TYPE), c0500fm.getDeviceType());
        builder.appendQueryParameter(this.f7103a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("query_hosts"), String.valueOf(2));
        String a3 = this.f7103a.a("features");
        List<String> h3 = ((Ck) this.f7104b).h();
        String[] strArr = {this.f7103a.a("permissions_collecting"), this.f7103a.a("features_collecting"), this.f7103a.a("google_aid"), this.f7103a.a("huawei_oaid"), this.f7103a.a("sim_info"), this.f7103a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h3);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a3, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.APP_ID), c0500fm.getPackageName());
        builder.appendQueryParameter(this.f7103a.a("app_debuggable"), ((U5) c0500fm).f6755a);
        if (c0500fm.f7335l) {
            String str = c0500fm.f7336m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f7103a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f7103a.a("detect_locale"), String.valueOf(1));
        }
        C0997z3 c0997z3 = c0500fm.f7332i;
        if (!AbstractC0709no.a(c0997z3.f8660a)) {
            builder.appendQueryParameter(this.f7103a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f7103a.a("clids_set"), Jm.a(c0997z3.f8660a));
            int ordinal = c0997z3.f8661b.ordinal();
            builder.appendQueryParameter(this.f7103a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0500fm.f;
            String str3 = c0500fm.f7330g;
            if (TextUtils.isEmpty(str2) && (c0830sg = c0500fm.o.f8170b) != null) {
                str2 = c0830sg.f8315a;
                str3 = c0830sg.f8318d.f8242a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f7103a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f7103a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0500fm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f7103a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("app_system_flag"), ((U5) c0500fm).f6756b);
        builder.appendQueryParameter(this.f7103a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f7103a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d3 = ((Ck) this.f7104b).d();
        for (String str4 : d3.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d3.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Ob ob) {
        ob.getClass();
        AdvertisingIdsHolder identifiers = C0876ua.f8420H.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f7103a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
