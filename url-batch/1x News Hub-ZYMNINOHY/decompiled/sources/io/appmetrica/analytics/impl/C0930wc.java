package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930wc extends C0457e5 implements Ta, Sa {

    /* renamed from: w, reason: collision with root package name */
    public final C0779qg f8564w;

    /* renamed from: x, reason: collision with root package name */
    public final C0882ug f8565x;

    /* renamed from: y, reason: collision with root package name */
    public final L6 f8566y;

    public C0930wc(Context context, C0603jm c0603jm, X4 x4, C0896v4 c0896v4, C0779qg c0779qg, L6 l6, AbstractC0406c5 abstractC0406c5) {
        this(context, x4, c0896v4, new C0607k0(), new TimePassedChecker(), new C0981yc(context, x4, c0896v4, abstractC0406c5, c0603jm, new C0800rc(l6), C0876ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0876ua.k().x(), C0876ua.k().l(), new C0645lc()), c0779qg, l6);
    }

    @Override // io.appmetrica.analytics.impl.C0457e5
    public final void C() {
        this.f8564w.a(this.f8565x);
    }

    public final boolean D() {
        boolean optBoolean;
        zo zoVar = this.f7242t;
        synchronized (zoVar) {
            optBoolean = zoVar.f8716a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C0457e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C0896v4 c0896v4) {
        super.a(c0896v4);
        this.f8566y.a(c0896v4.f8484i);
    }

    @Override // io.appmetrica.analytics.impl.C0457e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a() {
        zo zoVar = this.f7242t;
        synchronized (zoVar) {
            Ao ao = zoVar.f8716a;
            ao.a(ao.a().put("referrer_handled", true));
        }
    }

    public C0930wc(Context context, X4 x4, C0896v4 c0896v4, C0607k0 c0607k0, TimePassedChecker timePassedChecker, C0981yc c0981yc, C0779qg c0779qg, L6 l6) {
        super(context, x4, c0607k0, timePassedChecker, c0981yc, c0896v4);
        this.f8564w = c0779qg;
        C0461e9 k3 = k();
        k3.a(EnumC0567ib.EVENT_TYPE_REGULAR, new Mg(k3.b()));
        this.f8565x = c0981yc.a(this);
        this.f8566y = l6;
        C0876ua.k().y().onMainReporterCreated(new Ak(this, c0896v4));
    }
}
