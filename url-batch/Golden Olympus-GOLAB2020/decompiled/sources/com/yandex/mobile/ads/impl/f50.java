package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.yandex.mobile.ads.impl.fs0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lw1 f25616a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw1 f25617b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y00 f25618c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fs0 f25619d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1827bc f25620e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final g50 f25621f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1803ac f25622g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final d50 f25623h;

    static final class a extends kotlin.jvm.internal.s implements Function2<String, String, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri.Builder f25625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Uri.Builder builder) {
            super(2);
            this.f25625c = builder;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String key = (String) obj;
            String str = (String) obj2;
            Intrinsics.checkNotNullParameter(key, "key");
            f50 f50Var = f50.this;
            Uri.Builder builder = this.f25625c;
            f50Var.getClass();
            if (str != null && str.length() != 0) {
                builder.appendQueryParameter(key, str);
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2<String, String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn1 f25626b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cn1 cn1Var) {
            super(2);
            this.f25626b = cn1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String key = (String) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            this.f25626b.a(key, (String) obj2);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f50(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, r3, r4, r5, fs0.a.a(context), new C1827bc(), new h50());
        lw1 lw1Var = new lw1();
        zw1 zw1Var = new zw1();
        y00 y00Var = new y00(0);
        int i4 = fs0.f25910h;
    }

    public final void a(@NotNull Context context, @NotNull Uri.Builder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        a(context, new a(builder));
    }

    public final void a(@NotNull Context context, @NotNull cn1 queryParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        a(context, new b(queryParams));
    }

    private final void a(Context context, Function2<? super String, ? super String, Unit> function2) {
        Location c4;
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        function2.invoke("app_id", packageName);
        function2.invoke("app_version_code", C1997ie.a(context));
        function2.invoke(CommonUrlParts.APP_VERSION, C1997ie.b(context));
        function2.invoke(HianalyticsBaseData.SDK_VERSION, this.f25616a.a());
        function2.invoke("sdk_version_name", this.f25616a.b());
        function2.invoke("sdk_vendor", "yandex");
        function2.invoke(this.f25621f.f(), this.f25618c.b(context));
        function2.invoke(CommonUrlParts.LOCALE, this.f25618c.c(context));
        function2.invoke("content_language", this.f25618c.a(context));
        List<String> d4 = this.f25618c.d(context);
        function2.invoke("device_languages", d4 != null ? CollectionsKt.joinToString$default(d4, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null);
        String b4 = this.f25621f.b();
        this.f25618c.getClass();
        function2.invoke(b4, y00.a());
        String c5 = this.f25621f.c();
        this.f25618c.getClass();
        function2.invoke(c5, Build.MODEL);
        String a4 = this.f25621f.a();
        this.f25618c.getClass();
        function2.invoke(a4, "android");
        String d5 = this.f25621f.d();
        this.f25618c.getClass();
        function2.invoke(d5, Build.VERSION.RELEASE);
        Boolean c6 = ah1.c(context);
        if (c6 != null) {
            function2.invoke("vpn_enabled", c6.booleanValue() ? "1" : "0");
        }
        zw1 zw1Var = this.f25617b;
        zw1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!zw1Var.b(context) && (c4 = this.f25619d.c()) != null) {
            function2.invoke("location_timestamp", String.valueOf(c4.getTime()));
            function2.invoke(com.ironsource.ge.f16493s, String.valueOf(c4.getLatitude()));
            function2.invoke("lon", String.valueOf(c4.getLongitude()));
            function2.invoke("precision", String.valueOf(Math.round(c4.getAccuracy())));
        }
        zw1 zw1Var2 = this.f25617b;
        zw1Var2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!zw1Var2.b(context)) {
            function2.invoke(this.f25621f.e(), this.f25623h.b());
            C1851cc a5 = this.f25622g.a();
            boolean z4 = false;
            if (a5 != null) {
                boolean b5 = a5.b();
                String a6 = a5.a();
                this.f25620e.getClass();
                boolean z5 = (a6 == null || a6.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", a6)) ? false : true;
                if (!b5 && z5) {
                    function2.invoke("google_aid", a6);
                }
            }
            C1851cc c7 = this.f25622g.c();
            if (c7 != null) {
                boolean b6 = c7.b();
                String a7 = c7.a();
                this.f25620e.getClass();
                if (a7 != null && a7.length() != 0 && !Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", a7)) {
                    z4 = true;
                }
                if (!b6 && z4) {
                    function2.invoke("huawei_oaid", a7);
                }
            }
        }
        function2.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(lh2.d(context)));
        function2.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(lh2.b(context)));
        Intrinsics.checkNotNullParameter(context, "context");
        function2.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        function2.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(lh2.a(context)));
    }

    public f50(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull lw1 sdkVersionFormatter, @NotNull zw1 sensitiveModeChecker, @NotNull y00 deviceInfoProvider, @NotNull fs0 locationManager, @NotNull C1827bc advertisingIdValidator, @NotNull g50 environmentParametersProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkVersionFormatter, "sdkVersionFormatter");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(advertisingIdValidator, "advertisingIdValidator");
        Intrinsics.checkNotNullParameter(environmentParametersProvider, "environmentParametersProvider");
        this.f25616a = sdkVersionFormatter;
        this.f25617b = sensitiveModeChecker;
        this.f25618c = deviceInfoProvider;
        this.f25619d = locationManager;
        this.f25620e = advertisingIdValidator;
        this.f25621f = environmentParametersProvider;
        this.f25622g = adConfiguration.e();
        this.f25623h = adConfiguration.j();
    }
}
