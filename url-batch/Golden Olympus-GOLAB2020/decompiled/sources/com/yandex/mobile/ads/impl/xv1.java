package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xv1 implements InterfaceC2096mi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f34686a;

    public xv1(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f34686a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2096mi
    @NotNull
    public final InterfaceC2072li a(@NotNull C1977hi adViewController) {
        Intrinsics.checkNotNullParameter(adViewController, "adViewController");
        vu1 vu1Var = this.f34686a;
        m91 m91Var = new m91(adViewController.k(), vu1Var, adViewController.e(), adViewController.h());
        C2279ui c2279ui = new C2279ui(adViewController.e());
        i71 i71Var = new i71(adViewController.e());
        rt1 rt1Var = new rt1(adViewController.e());
        p71 p71Var = new p71(adViewController);
        Handler handler = new Handler(Looper.getMainLooper());
        int i4 = ew1.f25476l;
        return new wv1(adViewController, vu1Var, m91Var, c2279ui, i71Var, rt1Var, p71Var, handler, ew1.a.a(), new C2024ji(), new s51());
    }
}
