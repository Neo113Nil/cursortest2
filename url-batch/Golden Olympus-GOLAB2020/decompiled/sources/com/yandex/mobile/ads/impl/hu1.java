package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.iu1;
import com.yandex.mobile.ads.impl.ju1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1803ac f26941a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e50 f26942b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2105n4 f26943c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ou1 f26944d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ju1 f26945e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final aq1 f26946f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final lu1 f26947g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final g22 f26948h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Context f26949i;

    public interface a {
        void a(@NotNull du1 du1Var, @NotNull xq xqVar);

        void a(@NotNull hi2 hi2Var, @NotNull xq xqVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ hu1(Context context, mp1 mp1Var, C1803ac c1803ac, e50 e50Var, C2105n4 c2105n4) {
        this(context, mp1Var, c1803ac, e50Var, c2105n4, r6, r7, aq1.a.a(), new lu1(), new g22(mp1Var));
        ou1 ou1Var = new ou1(context, mp1Var);
        int i4 = ju1.f27825d;
        ju1 a4 = ju1.a.a();
        int i5 = aq1.f23419c;
    }

    public final void a() {
        aq1 aq1Var = this.f26946f;
        Context context = this.f26949i;
        aq1Var.getClass();
        aq1.a(context, this);
    }

    public final void a(@NotNull zw1 sensitiveModeChecker, @NotNull ok0 initializationCallSource, @NotNull iu1.a.b listener) {
        String str;
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(initializationCallSource, "initializationCallSource");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(this.f26949i);
        if (a4 != null && !this.f26944d.a()) {
            listener.a(a4, xq.f34661d);
            return;
        }
        pu1 pu1Var = new pu1(this.f26949i, this.f26945e, listener, this.f26943c);
        this.f26948h.a(initializationCallSource);
        d50 c4 = this.f26942b.c();
        Context context = this.f26949i;
        String a5 = c4.a();
        if (a5 == null || a5.length() == 0) {
            str = null;
        } else {
            String a6 = this.f26947g.a(context, sensitiveModeChecker, this.f26941a, c4);
            StringBuilder sb = new StringBuilder();
            sb.append(a5);
            if (!Intrinsics.areEqual(String.valueOf(StringsKt.d1(sb)), "/")) {
                sb.append("/");
            }
            sb.append("v1/startup");
            sb.append("?");
            sb.append(a6);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            str = sb2;
        }
        if (str == null || str.length() == 0) {
            pu1Var.a((hi2) new C2355y2(EnumC1890e3.f25076j, null));
            return;
        }
        nu1 request = new nu1(this.f26949i, str, this.f26944d, c4.d(), pu1Var, pu1Var);
        request.b(this);
        C2105n4 c2105n4 = this.f26943c;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28855l;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        aq1 aq1Var = this.f26946f;
        Context context2 = this.f26949i;
        synchronized (aq1Var) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            vc1.a(context2).a(request);
        }
    }

    public hu1(@NotNull Context context, @NotNull mp1 reporter, @NotNull C1803ac advertisingConfiguration, @NotNull e50 environmentController, @NotNull C2105n4 adLoadingPhasesManager, @NotNull ou1 requestPolicy, @NotNull ju1 sdkConfigurationProvider, @NotNull aq1 requestManager, @NotNull lu1 queryConfigurator, @NotNull g22 startupRequestReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(sdkConfigurationProvider, "sdkConfigurationProvider");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(queryConfigurator, "queryConfigurator");
        Intrinsics.checkNotNullParameter(startupRequestReporter, "startupRequestReporter");
        this.f26941a = advertisingConfiguration;
        this.f26942b = environmentController;
        this.f26943c = adLoadingPhasesManager;
        this.f26944d = requestPolicy;
        this.f26945e = sdkConfigurationProvider;
        this.f26946f = requestManager;
        this.f26947g = queryConfigurator;
        this.f26948h = startupRequestReporter;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26949i = applicationContext;
    }
}
