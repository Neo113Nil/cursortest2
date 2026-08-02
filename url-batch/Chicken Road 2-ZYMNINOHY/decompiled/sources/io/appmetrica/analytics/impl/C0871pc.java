package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871pc extends X4 implements Ma, La {

    /* renamed from: w, reason: collision with root package name */
    public final C0771lg f12575w;

    /* renamed from: x, reason: collision with root package name */
    public final C0875pg f12576x;

    /* renamed from: y, reason: collision with root package name */
    public final E6 f12577y;

    public C0871pc(Context context, C0622fm c0622fm, Q4 q4, C0837o4 c0837o4, C0771lg c0771lg, E6 e6, V4 v4) {
        this(context, q4, c0837o4, new C0729k0(), new TimePassedChecker(), new C0922rc(context, q4, c0837o4, v4, c0622fm, new C0741kc(e6), C0817na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0817na.k().w(), C0817na.k().l(), new C0586ec()), c0771lg, e6);
    }

    @Override // io.appmetrica.analytics.impl.X4
    public final void C() {
        this.f12575w.a(this.f12576x);
    }

    public final boolean D() {
        boolean optBoolean;
        C1090xo c1090xo = this.f11239t;
        synchronized (c1090xo) {
            optBoolean = c1090xo.f13040a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(C0837o4 c0837o4) {
        super.a(c0837o4);
        this.f12577y.a(c0837o4.f12492i);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a() {
        C1090xo c1090xo = this.f11239t;
        synchronized (c1090xo) {
            C1116yo c1116yo = c1090xo.f13040a;
            c1116yo.a(c1116yo.a().put("referrer_handled", true));
        }
    }

    public C0871pc(Context context, Q4 q4, C0837o4 c0837o4, C0729k0 c0729k0, TimePassedChecker timePassedChecker, C0922rc c0922rc, C0771lg c0771lg, E6 e6) {
        super(context, q4, c0729k0, timePassedChecker, c0922rc, c0837o4);
        this.f12575w = c0771lg;
        X8 k4 = k();
        k4.a(EnumC0508bb.EVENT_TYPE_REGULAR, new Hg(k4.b()));
        this.f12576x = c0922rc.a(this);
        this.f12577y = e6;
        C0817na.k().x().onMainReporterCreated(new C1034vk(this, c0837o4));
    }
}
