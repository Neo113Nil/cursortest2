package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.impl.C2353y0;
import com.yandex.mobile.ads.impl.C2376z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2145ol {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f30077a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2122nl f30078b;

    public /* synthetic */ C2145ol(vu1 vu1Var) {
        this(vu1Var, vu1Var.c(), new C2122nl(vu1Var.e()));
    }

    public final boolean a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C1871d8 adResultReceiver, @NotNull C2286v2 adConfiguration, @NotNull String browserUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        Intrinsics.checkNotNullParameter(browserUrl, "browserUrl");
        int i4 = C2376z0.f35409d;
        C2376z0 a4 = C2376z0.a.a();
        long a5 = ci0.a();
        Intent a6 = this.f30078b.a(context, browserUrl, a5);
        a4.a(a5, new C2353y0(new C2353y0.a(adResponse, adConfiguration, adResultReceiver)));
        try {
            context.startActivity(a6);
            return true;
        } catch (Exception e4) {
            a4.a(a5);
            e4.toString();
            ap0.b(new Object[0]);
            this.f30077a.reportError("Failed to show Browser", e4);
            return false;
        }
    }

    public C2145ol(@NotNull vu1 sdkEnvironmentModule, @NotNull mp1 reporter, @NotNull C2122nl intentCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(intentCreator, "intentCreator");
        this.f30077a = reporter;
        this.f30078b = intentCreator;
    }
}
