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
public final class C0620eh implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f8149a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f8150b;

    /* renamed from: c, reason: collision with root package name */
    public C0998t7 f8151c;

    /* renamed from: d, reason: collision with root package name */
    public final Ob f8152d;

    /* renamed from: e, reason: collision with root package name */
    public long f8153e;

    public C0620eh(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ob());
    }

    public final void a(C0998t7 c0998t7) {
        this.f8151c = c0998t7;
    }

    public C0620eh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ob ob) {
        this.f8149a = advIdWithLimitedAppender;
        this.f8150b = networkTaskForSendingDataParamsAppender;
        this.f8152d = ob;
    }

    public final void a(long j2) {
        this.f8153e = j2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0905ph c0905ph) {
        builder.path("report");
        this.f8150b.appendEncryptedData(builder);
        C0998t7 c0998t7 = this.f8151c;
        if (c0998t7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0998t7.f9281a, c0905ph.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f8151c.f9282b, c0905ph.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f8151c.f9283c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f8151c.f9286f, c0905ph.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f8151c.f9288h, c0905ph.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f8151c.f9289i, c0905ph.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f8151c.f9290j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f8151c.f9284d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f8151c.f9285e);
            a(builder, "app_debuggable", this.f8151c.f9287g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f8151c.f9291k, c0905ph.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f8151c.f9292l, c0905ph.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f8151c.f9293m, c0905ph.getAppFramework()));
            a(builder, "attribution_id", this.f8151c.f9294n);
        }
        builder.appendQueryParameter("api_key_128", c0905ph.f9016m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0905ph.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0905ph.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0905ph.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0905ph.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0905ph.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0905ph.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0905ph.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0905ph.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0905ph.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0905ph.f9019p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0905ph.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0905ph.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f8149a;
        this.f8152d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C1027ua.f9366H.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f8153e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
