package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1309o0;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1936g1 implements InterfaceC1984i1, mr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RelativeLayout f25969b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Window f25970c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f61 f25971d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f25972e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2286v2 f25973f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final du1 f25974g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final lc0 f25975h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final xc0 f25976i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final nd0 f25977j;

    public C1936g1(@NotNull Context context, @NotNull RelativeLayout container, @NotNull Window window, @NotNull f61 nativeAdPrivate, @NotNull C2360y7 adResponse, @NotNull C2193r1 adActivityListener, @NotNull C1792a1 eventController, @NotNull C2286v2 adConfiguration, int i4, @Nullable du1 du1Var, @NotNull lc0 fullScreenBackButtonController, @NotNull xc0 fullScreenInsetsController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenBackButtonController, "fullScreenBackButtonController");
        Intrinsics.checkNotNullParameter(fullScreenInsetsController, "fullScreenInsetsController");
        this.f25968a = context;
        this.f25969b = container;
        this.f25970c = window;
        this.f25971d = nativeAdPrivate;
        this.f25972e = adActivityListener;
        this.f25973f = adConfiguration;
        this.f25974g = du1Var;
        this.f25975h = fullScreenBackButtonController;
        this.f25976i = fullScreenInsetsController;
        this.f25977j = new sd0(context, adResponse, container, this, eventController, i4, adActivityListener, adConfiguration).a(context, nativeAdPrivate, this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void a() {
        this.f25972e.a(2, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void b() {
        this.f25972e.a(3, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void c() {
        if (this.f25973f.b() != gs.f26285i) {
            this.f25969b.setBackground(C2291v7.f33538a);
        }
        this.f25977j.c();
        this.f25972e.a(0, null);
        this.f25972e.a(5, null);
        Object[] args = new Object[0];
        int i4 = ap0.f23396b;
        Intrinsics.checkNotNullParameter(args, "args");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void d() {
        this.f25977j.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final boolean e() {
        return this.f25975h.a();
    }

    @Override // com.yandex.mobile.ads.impl.mr
    public final void f() {
        this.f25972e.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void g() {
        this.f25972e.a(this.f25968a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f25970c.requestFeature(1);
        this.f25970c.addFlags(1024);
        this.f25970c.addFlags(16777216);
        du1 du1Var = this.f25974g;
        if (du1Var != null && du1Var.x()) {
            xc0 xc0Var = this.f25976i;
            Window window = this.f25970c;
            xc0Var.getClass();
            Intrinsics.checkNotNullParameter(window, "window");
            androidx.core.view.S0 a4 = AbstractC1309o0.a(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(a4, "getInsetsController(...)");
            a4.b(2);
            a4.a(WindowInsetsCompat.Type.navigationBars());
        }
        this.f25976i.a(this.f25970c, this.f25969b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void onAdClosed() {
        this.f25971d.destroy();
        this.f25972e.a(4, null);
    }
}
