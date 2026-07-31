package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dx1 {

    /* renamed from: a, reason: collision with root package name */
    private final n80 f4372a;

    dx1(n80 n80Var) {
        this.f4372a = n80Var;
    }

    private final void s(cx1 cx1Var) {
        String a7 = cx1.a(cx1Var);
        io0.f(a7.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(a7) : new String("Dispatching AFMA event on publisher webview: "));
        this.f4372a.s(a7);
    }

    public final void a() {
        s(new cx1("initialize", null));
    }

    public final void b(long j7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdClicked";
        this.f4372a.s(cx1.a(cx1Var));
    }

    public final void c(long j7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdClosed";
        s(cx1Var);
    }

    public final void d(long j7, int i7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdFailedToLoad";
        cx1Var.f3975d = Integer.valueOf(i7);
        s(cx1Var);
    }

    public final void e(long j7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdLoaded";
        s(cx1Var);
    }

    public final void f(long j7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onNativeAdObjectNotAvailable";
        s(cx1Var);
    }

    public final void g(long j7) {
        cx1 cx1Var = new cx1("interstitial", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdOpened";
        s(cx1Var);
    }

    public final void h(long j7) {
        cx1 cx1Var = new cx1("creation", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "nativeObjectCreated";
        s(cx1Var);
    }

    public final void i(long j7) {
        cx1 cx1Var = new cx1("creation", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "nativeObjectNotCreated";
        s(cx1Var);
    }

    public final void j(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdClicked";
        s(cx1Var);
    }

    public final void k(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onRewardedAdClosed";
        s(cx1Var);
    }

    public final void l(long j7, ck0 ck0Var) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onUserEarnedReward";
        cx1Var.f3976e = ck0Var.d();
        cx1Var.f3977f = Integer.valueOf(ck0Var.b());
        s(cx1Var);
    }

    public final void m(long j7, int i7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onRewardedAdFailedToLoad";
        cx1Var.f3975d = Integer.valueOf(i7);
        s(cx1Var);
    }

    public final void n(long j7, int i7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onRewardedAdFailedToShow";
        cx1Var.f3975d = Integer.valueOf(i7);
        s(cx1Var);
    }

    public final void o(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onAdImpression";
        s(cx1Var);
    }

    public final void p(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onRewardedAdLoaded";
        s(cx1Var);
    }

    public final void q(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onNativeAdObjectNotAvailable";
        s(cx1Var);
    }

    public final void r(long j7) {
        cx1 cx1Var = new cx1("rewarded", null);
        cx1Var.f3972a = Long.valueOf(j7);
        cx1Var.f3974c = "onRewardedAdOpened";
        s(cx1Var);
    }
}
