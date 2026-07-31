package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wt1 implements cv1<vt1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f34179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34180b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1977hi f34181c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private vt1 f34182d;

    public wt1(@NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C1977hi adLoadController) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadController, "adLoadController");
        this.f34179a = sdkEnvironmentModule;
        this.f34180b = adConfiguration;
        this.f34181c = adLoadController;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a() {
        vt1 vt1Var = this.f34182d;
        if (vt1Var != null) {
            vt1Var.a();
        }
        this.f34182d = null;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a(@NotNull C2360y7<String> adResponse, @NotNull vy1 sizeInfo, @NotNull String htmlResponse, @NotNull ev1<vt1> creationListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Intrinsics.checkNotNullParameter(creationListener, "creationListener");
        Context k4 = this.f34181c.k();
        vo0 B4 = this.f34181c.B();
        fe2 C4 = this.f34181c.C();
        vu1 vu1Var = this.f34179a;
        C2286v2 c2286v2 = this.f34180b;
        vt1 vt1Var = new vt1(k4, vu1Var, c2286v2, adResponse, B4, this.f34181c, new C2024ji(), new y11(), new fg0(), new C2371yi(k4, c2286v2), new C1929fi());
        this.f34182d = vt1Var;
        vt1Var.a(sizeInfo, htmlResponse, C4, creationListener);
    }
}
