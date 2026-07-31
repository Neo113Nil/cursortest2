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

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0049ah implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f1167a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public C0348m7 c;
    public final Ib d;
    public long e;

    public C0049ah(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ib());
    }

    public final void a(C0348m7 c0348m7) {
        this.c = c0348m7;
    }

    public C0049ah(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ib ib) {
        this.f1167a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
        this.d = ib;
    }

    public final void a(long j) {
        this.e = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C0333lh c0333lh) {
        builder.path("report");
        this.b.appendEncryptedData(builder);
        C0348m7 c0348m7 = this.c;
        if (c0348m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0348m7.f1372a, c0333lh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.c.b, c0333lh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.c.c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.c.f, c0333lh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.c.h, c0333lh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.c.i, c0333lh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.c.j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.c.d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.c.e);
            a(builder, "app_debuggable", this.c.g);
            builder.appendQueryParameter("locale", StringUtils.ifIsEmptyToDef(this.c.k, c0333lh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.c.l, c0333lh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.c.m, c0333lh.getAppFramework()));
            a(builder, "attribution_id", this.c.n);
        }
        builder.appendQueryParameter("api_key_128", c0333lh.m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0333lh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0333lh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0333lh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0333lh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0333lh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0333lh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0333lh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0333lh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0333lh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0333lh.p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0333lh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0333lh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f1167a;
        this.d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0401oa.I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
