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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class Yl implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0227he f1135a;
    public final InterfaceC0429pd b;
    public final Ib c = new Ib();

    public Yl(C0227he c0227he, InterfaceC0429pd interfaceC0429pd) {
        this.f1135a = c0227he;
        this.b = interfaceC0429pd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0106cm c0106cm) {
        C0407og c0407og;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.DEVICE_ID), c0106cm.getDeviceId());
        a(builder, C0401oa.I.h(), this.c);
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.APP_SET_ID), c0106cm.getAppSetId());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0106cm.getAppSetIdScope());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.APP_PLATFORM), c0106cm.getAppPlatform());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.PROTOCOL_VERSION), c0106cm.getProtocolVersion());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0106cm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.MODEL), c0106cm.getModel());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.MANUFACTURER), c0106cm.getManufacturer());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.OS_VERSION), c0106cm.getOsVersion());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0106cm.getScreenWidth()));
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0106cm.getScreenHeight()));
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0106cm.getScreenDpi()));
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0106cm.getScaleFactor()));
        builder.appendQueryParameter(this.f1135a.a("locale"), c0106cm.getLocale());
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.DEVICE_TYPE), c0106cm.getDeviceType());
        builder.appendQueryParameter(this.f1135a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("query_hosts"), String.valueOf(2));
        String a2 = this.f1135a.a("features");
        List<String> h = ((C0660yk) this.b).h();
        String[] strArr = {this.f1135a.a("permissions_collecting"), this.f1135a.a("features_collecting"), this.f1135a.a("google_aid"), this.f1135a.a("huawei_oaid"), this.f1135a.a("sim_info"), this.f1135a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a2, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.APP_ID), c0106cm.getPackageName());
        builder.appendQueryParameter(this.f1135a.a("app_debuggable"), ((O5) c0106cm).f983a);
        if (c0106cm.l) {
            String str = c0106cm.m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f1135a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f1135a.a("detect_locale"), String.valueOf(1));
        }
        C0493s3 c0493s3 = c0106cm.i;
        if (!mo.a(c0493s3.f1477a)) {
            builder.appendQueryParameter(this.f1135a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f1135a.a("clids_set"), Gm.a(c0493s3.f1477a));
            int ordinal = c0493s3.b.ordinal();
            builder.appendQueryParameter(this.f1135a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0106cm.f;
            String str3 = c0106cm.g;
            if (TextUtils.isEmpty(str2) && (c0407og = c0106cm.o.b) != null) {
                str2 = c0407og.f1416a;
                str3 = c0407og.d.f1397a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f1135a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = AbstractJsonLexerKt.NULL;
                }
                builder.appendQueryParameter(this.f1135a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0106cm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f1135a.a(InfluenceConstants.TIME), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("app_system_flag"), ((O5) c0106cm).b);
        builder.appendQueryParameter(this.f1135a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f1135a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d = ((C0660yk) this.b).d();
        for (String str4 : d.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d.get(str4)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, Ib ib) {
        ib.getClass();
        AdvertisingIdsHolder identifiers = C0401oa.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f1135a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
