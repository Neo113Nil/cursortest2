package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081wc extends C0608e5 implements Ta, Sa {

    /* renamed from: w, reason: collision with root package name */
    public final C0930qg f9518w;

    /* renamed from: x, reason: collision with root package name */
    public final C1033ug f9519x;

    /* renamed from: y, reason: collision with root package name */
    public final L6 f9520y;

    public C1081wc(Context context, C0754jm c0754jm, X4 x42, C1047v4 c1047v4, C0930qg c0930qg, L6 l6, AbstractC0557c5 abstractC0557c5) {
        this(context, x42, c1047v4, new C0758k0(), new TimePassedChecker(), new C1132yc(context, x42, c1047v4, abstractC0557c5, c0754jm, new C0951rc(l6), C1027ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C1027ua.k().x(), C1027ua.k().l(), new C0796lc()), c0930qg, l6);
    }

    @Override // io.appmetrica.analytics.impl.C0608e5
    public final void C() {
        this.f9518w.a(this.f9519x);
    }

    public final boolean D() {
        boolean optBoolean;
        zo zoVar = this.f8104t;
        synchronized (zoVar) {
            optBoolean = zoVar.f9678a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C0608e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C1047v4 c1047v4) {
        super.a(c1047v4);
        this.f9520y.a(c1047v4.f9434i);
    }

    @Override // io.appmetrica.analytics.impl.C0608e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a() {
        zo zoVar = this.f8104t;
        synchronized (zoVar) {
            Ao ao = zoVar.f9678a;
            ao.a(ao.a().put("referrer_handled", true));
        }
    }

    public C1081wc(Context context, X4 x42, C1047v4 c1047v4, C0758k0 c0758k0, TimePassedChecker timePassedChecker, C1132yc c1132yc, C0930qg c0930qg, L6 l6) {
        super(context, x42, c0758k0, timePassedChecker, c1132yc, c1047v4);
        this.f9518w = c0930qg;
        C0612e9 k3 = k();
        k3.a(EnumC0718ib.EVENT_TYPE_REGULAR, new Mg(k3.b()));
        this.f9519x = c1132yc.a(this);
        this.f9520y = l6;
        C1027ua.k().y().onMainReporterCreated(new Ak(this, c1047v4));
    }
}
