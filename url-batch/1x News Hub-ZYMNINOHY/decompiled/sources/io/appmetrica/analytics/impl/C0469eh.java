package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469eh implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f7283b;

    /* renamed from: c, reason: collision with root package name */
    public C0847t7 f7284c;

    /* renamed from: d, reason: collision with root package name */
    public final Ob f7285d;

    /* renamed from: e, reason: collision with root package name */
    public long f7286e;

    public C0469eh(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ob());
    }

    public final void a(C0847t7 c0847t7) {
        this.f7284c = c0847t7;
    }

    public C0469eh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ob ob) {
        this.f7282a = advIdWithLimitedAppender;
        this.f7283b = networkTaskForSendingDataParamsAppender;
        this.f7285d = ob;
    }

    public final void a(long j3) {
        this.f7286e = j3;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0754ph c0754ph) {
        builder.path("report");
        this.f7283b.appendEncryptedData(builder);
        C0847t7 c0847t7 = this.f7284c;
        if (c0847t7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0847t7.f8340a, c0754ph.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f7284c.f8341b, c0754ph.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f7284c.f8342c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f7284c.f, c0754ph.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f7284c.f8346h, c0754ph.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f7284c.f8347i, c0754ph.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f7284c.f8348j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f7284c.f8343d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f7284c.f8344e);
            a(builder, "app_debuggable", this.f7284c.f8345g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f7284c.f8349k, c0754ph.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f7284c.f8350l, c0754ph.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f7284c.f8351m, c0754ph.getAppFramework()));
            a(builder, "attribution_id", this.f7284c.f8352n);
        }
        builder.appendQueryParameter("api_key_128", c0754ph.f8090m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0754ph.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0754ph.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0754ph.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0754ph.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0754ph.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0754ph.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0754ph.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0754ph.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0754ph.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0754ph.f8092p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0754ph.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0754ph.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f7282a;
        this.f7285d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0876ua.f8420H.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f7286e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
