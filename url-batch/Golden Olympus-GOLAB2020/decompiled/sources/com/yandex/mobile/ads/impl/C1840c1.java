package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1309o0;
import androidx.core.view.WindowInsetsCompat;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1840c1 implements InterfaceC1984i1, mr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RelativeLayout f23999a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f24000b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Window f24001c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final du1 f24002d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final df1 f24003e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final lc0 f24004f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final xc0 f24005g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f24006h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final av1 f24007i;

    public C1840c1(@NotNull Context context, @NotNull RelativeLayout rootLayout, @NotNull C2193r1 adActivityListener, @NotNull Window window, @NotNull uc0 fullScreenDataHolder, @Nullable du1 du1Var, @NotNull df1 orientationConfigurator, @NotNull lc0 fullScreenBackButtonController, @NotNull xc0 fullScreenInsetsController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(fullScreenDataHolder, "fullScreenDataHolder");
        Intrinsics.checkNotNullParameter(orientationConfigurator, "orientationConfigurator");
        Intrinsics.checkNotNullParameter(fullScreenBackButtonController, "fullScreenBackButtonController");
        Intrinsics.checkNotNullParameter(fullScreenInsetsController, "fullScreenInsetsController");
        this.f23999a = rootLayout;
        this.f24000b = adActivityListener;
        this.f24001c = window;
        this.f24002d = du1Var;
        this.f24003e = orientationConfigurator;
        this.f24004f = fullScreenBackButtonController;
        this.f24005g = fullScreenInsetsController;
        this.f24006h = fullScreenDataHolder.a();
        av1 b4 = fullScreenDataHolder.b();
        this.f24007i = b4;
        b4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void a() {
        this.f24000b.a(2, null);
        this.f24007i.i();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void b() {
        this.f24000b.a(3, null);
        this.f24007i.g();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void c() {
        this.f24007i.a(this.f23999a);
        Bundle bundle = new Bundle();
        Map<String, String> a4 = this.f24007i.f().a();
        bundle.putSerializable("extra_tracking_parameters", a4 instanceof Serializable ? (Serializable) a4 : null);
        this.f24000b.a(0, bundle);
        this.f24000b.a(5, null);
        ap0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void d() {
        this.f24007i.d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final boolean e() {
        if (this.f24004f.a()) {
            return (this.f24007i.f().b() && this.f24006h.Q()) ? false : true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.mr
    public final void f() {
        this.f24000b.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void g() {
        this.f24001c.requestFeature(1);
        this.f24001c.addFlags(1024);
        this.f24001c.addFlags(16777216);
        du1 du1Var = this.f24002d;
        if (du1Var != null && du1Var.x()) {
            xc0 xc0Var = this.f24005g;
            Window window = this.f24001c;
            xc0Var.getClass();
            Intrinsics.checkNotNullParameter(window, "window");
            androidx.core.view.S0 a4 = AbstractC1309o0.a(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(a4, "getInsetsController(...)");
            a4.b(2);
            a4.a(WindowInsetsCompat.Type.navigationBars());
        }
        this.f24005g.a(this.f24001c, this.f23999a);
        this.f24003e.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void onAdClosed() {
        this.f24000b.a(4, null);
    }
}
