package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dv1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24973a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2246t8 f24974b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cv1<T> f24975c;

    public dv1(@NotNull C2286v2 adConfiguration, @NotNull InterfaceC2246t8 sizeValidator, @NotNull cv1<T> sdkHtmlAdCreateController) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sizeValidator, "sizeValidator");
        Intrinsics.checkNotNullParameter(sdkHtmlAdCreateController, "sdkHtmlAdCreateController");
        this.f24973a = adConfiguration;
        this.f24974b = sizeValidator;
        this.f24975c = sdkHtmlAdCreateController;
    }

    public final void a() {
        this.f24975c.a();
    }

    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull ev1<T> creationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(creationListener, "creationListener");
        String I3 = adResponse.I();
        vy1 M3 = adResponse.M();
        boolean a4 = this.f24974b.a(context, M3);
        vy1 q4 = this.f24973a.q();
        if (!a4) {
            creationListener.a(C1942g7.k());
            return;
        }
        if (q4 == null) {
            creationListener.a(C1942g7.m());
            return;
        }
        if (!xy1.a(context, adResponse, M3, this.f24974b, q4)) {
            creationListener.a(C1942g7.a(q4.c(context), q4.a(context), M3.getWidth(), M3.getHeight(), lh2.d(context), lh2.b(context)));
            return;
        }
        if (I3 == null || StringsKt.z(I3)) {
            creationListener.a(C1942g7.k());
        } else {
            if (!C2362y9.a(context)) {
                creationListener.a(C1942g7.z());
                return;
            }
            try {
                this.f24975c.a(adResponse, q4, I3, creationListener);
            } catch (ij2 unused) {
                creationListener.a(C1942g7.y());
            }
        }
    }
}
