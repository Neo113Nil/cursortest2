package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
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
public final class C0548bm implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0850ne f7957a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1056vd f7958b;

    /* renamed from: c, reason: collision with root package name */
    public final Ob f7959c = new Ob();

    public C0548bm(C0850ne c0850ne, InterfaceC1056vd interfaceC1056vd) {
        this.f7957a = c0850ne;
        this.f7958b = interfaceC1056vd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0651fm c0651fm) {
        C0981sg c0981sg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.DEVICE_ID), c0651fm.getDeviceId());
        a(builder, C1027ua.f9366H.h(), this.f7959c);
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.APP_SET_ID), c0651fm.getAppSetId());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0651fm.getAppSetIdScope());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.APP_PLATFORM), c0651fm.getAppPlatform());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.PROTOCOL_VERSION), c0651fm.getProtocolVersion());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0651fm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.MODEL), c0651fm.getModel());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.MANUFACTURER), c0651fm.getManufacturer());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.OS_VERSION), c0651fm.getOsVersion());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0651fm.getScreenWidth()));
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0651fm.getScreenHeight()));
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0651fm.getScreenDpi()));
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0651fm.getScaleFactor()));
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.LOCALE), c0651fm.getLocale());
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.DEVICE_TYPE), c0651fm.getDeviceType());
        builder.appendQueryParameter(this.f7957a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("query_hosts"), String.valueOf(2));
        String a6 = this.f7957a.a("features");
        List<String> h3 = ((Ck) this.f7958b).h();
        String[] strArr = {this.f7957a.a("permissions_collecting"), this.f7957a.a("features_collecting"), this.f7957a.a("google_aid"), this.f7957a.a("huawei_oaid"), this.f7957a.a("sim_info"), this.f7957a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h3);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a6, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.APP_ID), c0651fm.getPackageName());
        builder.appendQueryParameter(this.f7957a.a("app_debuggable"), ((U5) c0651fm).f7587a);
        if (c0651fm.f8203l) {
            String str = c0651fm.f8204m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f7957a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f7957a.a("detect_locale"), String.valueOf(1));
        }
        C1148z3 c1148z3 = c0651fm.f8200i;
        if (!AbstractC0860no.a(c1148z3.f9617a)) {
            builder.appendQueryParameter(this.f7957a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f7957a.a("clids_set"), Jm.a(c1148z3.f9617a));
            int ordinal = c1148z3.f9618b.ordinal();
            builder.appendQueryParameter(this.f7957a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0651fm.f8197f;
            String str3 = c0651fm.f8198g;
            if (TextUtils.isEmpty(str2) && (c0981sg = c0651fm.f8206o.f9104b) != null) {
                str2 = c0981sg.f9256a;
                str3 = c0981sg.f9259d.f9177a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f7957a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f7957a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0651fm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f7957a.a(InfluenceConstants.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("app_system_flag"), ((U5) c0651fm).f7588b);
        builder.appendQueryParameter(this.f7957a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f7957a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d6 = ((Ck) this.f7958b).d();
        for (String str4 : d6.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d6.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Ob ob) {
        ob.getClass();
        AdvertisingIdsHolder identifiers = C1027ua.f9366H.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f7957a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
