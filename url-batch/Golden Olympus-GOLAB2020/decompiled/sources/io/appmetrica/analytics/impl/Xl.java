package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
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

/* loaded from: classes3.dex */
public final class Xl implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C3040ve f38539a;

    /* renamed from: b, reason: collision with root package name */
    public final Ed f38540b;

    /* renamed from: c, reason: collision with root package name */
    public final C2543cc f38541c = new C2543cc();

    public Xl(@NonNull C3040ve c3040ve, @NonNull Ed ed) {
        this.f38539a = c3040ve;
        this.f38540b = ed;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C2526bm c2526bm) {
        Ag ag;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.DEVICE_ID), c2526bm.getDeviceId());
        a(builder, Ia.f37730F.g(), this.f38541c);
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.APP_SET_ID), c2526bm.getAppSetId());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.APP_SET_ID_SCOPE), c2526bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.APP_PLATFORM), c2526bm.getAppPlatform());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.PROTOCOL_VERSION), c2526bm.getProtocolVersion());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c2526bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f38539a.a("model"), c2526bm.getModel());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.MANUFACTURER), c2526bm.getManufacturer());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.OS_VERSION), c2526bm.getOsVersion());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c2526bm.getScreenWidth()));
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c2526bm.getScreenHeight()));
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c2526bm.getScreenDpi()));
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c2526bm.getScaleFactor()));
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.LOCALE), c2526bm.getLocale());
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.DEVICE_TYPE), c2526bm.getDeviceType());
        builder.appendQueryParameter(this.f38539a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("query_hosts"), String.valueOf(2));
        String a4 = this.f38539a.a("features");
        List<String> h4 = ((C3124yk) this.f38540b).h();
        String[] strArr = {this.f38539a.a("permissions_collecting"), this.f38539a.a("features_collecting"), this.f38539a.a("google_aid"), this.f38539a.a("huawei_oaid"), this.f38539a.a("sim_info"), this.f38539a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h4);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a4, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f38539a.a("app_id"), c2526bm.getPackageName());
        builder.appendQueryParameter(this.f38539a.a("app_debuggable"), ((C2721j6) c2526bm).f39261a);
        if (c2526bm.f38750l) {
            String str = c2526bm.f38751m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f38539a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f38539a.a("detect_locale"), String.valueOf(1));
        }
        N3 n32 = c2526bm.f38747i;
        if (!AbstractC2713io.a(n32.f37991a)) {
            builder.appendQueryParameter(this.f38539a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f38539a.a("clids_set"), Gm.a(n32.f37991a));
            int ordinal = n32.f37992b.ordinal();
            builder.appendQueryParameter(this.f38539a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c2526bm.f38744f;
            String str3 = c2526bm.f38745g;
            if (TextUtils.isEmpty(str2) && (ag = c2526bm.f38753o.f40280b) != null) {
                str2 = ag.f37183a;
                str3 = ag.f37186d.f40388a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f38539a.a(ReferrerDetails.KEY_INSTALL_REFERRER), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f38539a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c2526bm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f38539a.a(CrashHianalyticsData.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("app_system_flag"), ((C2721j6) c2526bm).f39262b);
        builder.appendQueryParameter(this.f38539a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a(com.ironsource.c9.f15699c), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f38539a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d4 = ((C3124yk) this.f38540b).d();
        for (String str4 : d4.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d4.get(str4)));
        }
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull C2543cc c2543cc) {
        c2543cc.getClass();
        AdvertisingIdsHolder identifiers = Ia.f37730F.b().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f38539a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
