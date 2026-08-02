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

/* loaded from: classes.dex */
public final class Zg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f11389a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f11390b;

    /* renamed from: c, reason: collision with root package name */
    public C0762l7 f11391c;

    /* renamed from: d, reason: collision with root package name */
    public final Hb f11392d;

    /* renamed from: e, reason: collision with root package name */
    public long f11393e;

    public Zg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Hb());
    }

    public final void a(C0762l7 c0762l7) {
        this.f11391c = c0762l7;
    }

    public Zg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Hb hb) {
        this.f11389a = advIdWithLimitedAppender;
        this.f11390b = networkTaskForSendingDataParamsAppender;
        this.f11392d = hb;
    }

    public final void a(long j4) {
        this.f11393e = j4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0746kh c0746kh) {
        builder.path("report");
        this.f11390b.appendEncryptedData(builder);
        C0762l7 c0762l7 = this.f11391c;
        if (c0762l7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0762l7.f12269a, c0746kh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f11391c.f12270b, c0746kh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f11391c.f12271c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f11391c.f12274f, c0746kh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f11391c.f12276h, c0746kh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f11391c.f12277i, c0746kh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f11391c.f12278j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f11391c.f12272d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f11391c.f12273e);
            a(builder, "app_debuggable", this.f11391c.f12275g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f11391c.f12279k, c0746kh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f11391c.f12280l, c0746kh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f11391c.f12281m, c0746kh.getAppFramework()));
            a(builder, "attribution_id", this.f11391c.n);
        }
        builder.appendQueryParameter("api_key_128", c0746kh.f12231m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0746kh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0746kh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0746kh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0746kh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0746kh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0746kh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0746kh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0746kh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0746kh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0746kh.f12232p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0746kh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0746kh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f11389a;
        this.f11392d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0817na.f12417I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f11393e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
