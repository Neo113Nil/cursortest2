package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2810mh implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f39449a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f39450b;

    /* renamed from: c, reason: collision with root package name */
    public H7 f39451c;

    /* renamed from: d, reason: collision with root package name */
    public final C2543cc f39452d;

    /* renamed from: e, reason: collision with root package name */
    public long f39453e;

    public C2810mh(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new C2543cc());
    }

    public final void a(@NonNull H7 h7) {
        this.f39451c = h7;
    }

    public C2810mh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, C2543cc c2543cc) {
        this.f39449a = advIdWithLimitedAppender;
        this.f39450b = networkTaskForSendingDataParamsAppender;
        this.f39452d = c2543cc;
    }

    public final void a(long j4) {
        this.f39453e = j4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C3095xh c3095xh) {
        builder.path("report");
        this.f39450b.appendEncryptedData(builder);
        H7 h7 = this.f39451c;
        if (h7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(h7.f37608a, c3095xh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f39451c.f37609b, c3095xh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f39451c.f37610c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f39451c.f37613f, c3095xh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f39451c.f37615h, c3095xh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f39451c.f37616i, c3095xh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f39451c.f37617j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f39451c.f37611d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f39451c.f37612e);
            a(builder, "app_debuggable", this.f39451c.f37614g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f39451c.f37618k, c3095xh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f39451c.f37619l, c3095xh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f39451c.f37620m, c3095xh.getAppFramework()));
            a(builder, "attribution_id", this.f39451c.f37621n);
        }
        builder.appendQueryParameter("api_key_128", c3095xh.f40186m);
        builder.appendQueryParameter("app_id", c3095xh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c3095xh.getAppPlatform());
        builder.appendQueryParameter("model", c3095xh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c3095xh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c3095xh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c3095xh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c3095xh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c3095xh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c3095xh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c3095xh.f40189p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c3095xh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c3095xh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f39449a;
        this.f39452d.getClass();
        advIdWithLimitedAppender.appendParams(builder, Ia.f37730F.b().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f39453e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
