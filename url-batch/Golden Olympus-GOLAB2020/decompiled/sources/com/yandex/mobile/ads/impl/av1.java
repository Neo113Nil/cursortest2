package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C2353y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class av1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23476a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f23477b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f23478c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1871d8 f23479d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wc0 f23480e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ad0 f23481f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final mc0 f23482g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final fg0 f23483h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final hd0 f23484i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f23485j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ed0 f23486k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final vc0 f23487l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final tr f23488m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final pc0 f23489n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final View f23490o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final tv f23491p;

    public av1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<String> adResponse, @NotNull String htmlResponse, @NotNull C1871d8 adResultReceiver, @NotNull wc0 fullScreenHtmlWebViewListener, @NotNull ad0 fullScreenMobileAdsSchemeListener, @NotNull mc0 fullScreenCloseButtonListener, @NotNull fg0 htmlWebViewAdapterFactoryProvider, @NotNull hd0 fullscreenAdActivityLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        Intrinsics.checkNotNullParameter(fullScreenHtmlWebViewListener, "fullScreenHtmlWebViewListener");
        Intrinsics.checkNotNullParameter(fullScreenMobileAdsSchemeListener, "fullScreenMobileAdsSchemeListener");
        Intrinsics.checkNotNullParameter(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        Intrinsics.checkNotNullParameter(htmlWebViewAdapterFactoryProvider, "htmlWebViewAdapterFactoryProvider");
        Intrinsics.checkNotNullParameter(fullscreenAdActivityLauncher, "fullscreenAdActivityLauncher");
        this.f23476a = adConfiguration;
        this.f23477b = adResponse;
        this.f23478c = htmlResponse;
        this.f23479d = adResultReceiver;
        this.f23480e = fullScreenHtmlWebViewListener;
        this.f23481f = fullScreenMobileAdsSchemeListener;
        this.f23482g = fullScreenCloseButtonListener;
        this.f23483h = htmlWebViewAdapterFactoryProvider;
        this.f23484i = fullscreenAdActivityLauncher;
        this.f23485j = context.getApplicationContext();
        ed0 b4 = b();
        this.f23486k = b4;
        this.f23491p = new uv(context, adConfiguration, new xq1().b(adResponse, adConfiguration)).a();
        this.f23487l = c();
        tr a4 = a();
        this.f23488m = a4;
        pc0 pc0Var = new pc0(a4);
        this.f23489n = pc0Var;
        fullScreenCloseButtonListener.a(pc0Var);
        fullScreenHtmlWebViewListener.a(pc0Var);
        this.f23490o = a4.a(b4, adResponse);
    }

    private final tr a() {
        boolean a4 = y11.a(this.f23478c);
        Context context = this.f23485j;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        C2337x7 c2337x7 = new C2337x7(context, null, 6, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int a5 = lh2.a(context, 25.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a5, a5);
        layoutParams.gravity = 17;
        int a6 = lh2.a(context, 19.5f);
        layoutParams.setMargins(a6, a6, a6, a6);
        frameLayout.addView(c2337x7, layoutParams);
        c2337x7.setTag(jh2.a("close_button"));
        c2337x7.setBorderWidth(1.0f);
        frameLayout.setOnClickListener(new dp(this.f23482g, this.f23487l, this.f23491p));
        return new ur(new fp()).a(frameLayout, this.f23477b, this.f23491p, a4, this.f23477b.T());
    }

    private final ed0 b() {
        fd0 fd0Var = new fd0();
        Context context = this.f23485j;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return fd0Var.a(context, this.f23477b, this.f23476a);
    }

    private final vc0 c() {
        boolean a4 = y11.a(this.f23478c);
        this.f23483h.getClass();
        eg0 d21Var = a4 ? new d21() : new C2280uj();
        ed0 ed0Var = this.f23486k;
        wc0 wc0Var = this.f23480e;
        ad0 ad0Var = this.f23481f;
        return d21Var.a(ed0Var, wc0Var, ad0Var, this.f23482g, ad0Var);
    }

    public final void d() {
        this.f23482g.a((mr) null);
        this.f23480e.a((sr) null);
        this.f23487l.invalidate();
        this.f23488m.d();
    }

    @Nullable
    public final String e() {
        return this.f23477b.e();
    }

    @NotNull
    public final oc0 f() {
        return this.f23489n.a();
    }

    public final void g() {
        this.f23488m.b();
        this.f23486k.e();
    }

    public final void h() {
        this.f23487l.a(this.f23478c);
    }

    public final void i() {
        this.f23486k.f();
        this.f23488m.a();
    }

    public final void a(@Nullable mr mrVar) {
        this.f23482g.a(mrVar);
    }

    public final void a(@Nullable sr srVar) {
        this.f23480e.a(srVar);
    }

    public final void a(@NotNull RelativeLayout rootLayout) {
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        this.f23488m.a(rootLayout);
        rootLayout.addView(this.f23490o);
        this.f23488m.c();
    }

    @NotNull
    public final Object a(@NotNull Context context, @Nullable C1871d8 c1871d8) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23479d.a(c1871d8);
        return this.f23484i.a(context, new C2353y0(new C2353y0.a(this.f23477b, this.f23476a, this.f23479d).a(this)));
    }
}
