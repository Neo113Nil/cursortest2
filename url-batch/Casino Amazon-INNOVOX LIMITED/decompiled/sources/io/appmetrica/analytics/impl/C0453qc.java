package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0453qc extends Y4 implements Na, Ma {
    public final C0357mg w;
    public final C0457qg x;
    public final F6 y;

    public C0453qc(Context context, C0209gm c0209gm, R4 r4, C0420p4 c0420p4, C0357mg c0357mg, F6 f6, W4 w4) {
        this(context, r4, c0420p4, new C0290k0(), new TimePassedChecker(), new C0502sc(context, r4, c0420p4, w4, c0209gm, new C0328lc(f6), C0401oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0401oa.k().w(), C0401oa.k().l(), new C0173fc()), c0357mg, f6);
    }

    @Override // io.appmetrica.analytics.impl.Y4
    public final void C() {
        this.w.a(this.x);
    }

    public final boolean D() {
        boolean optBoolean;
        yo yoVar = this.t;
        synchronized (yoVar) {
            optBoolean = yoVar.f1591a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(C0420p4 c0420p4) {
        super.a(c0420p4);
        this.y.a(c0420p4.i);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a() {
        yo yoVar = this.t;
        synchronized (yoVar) {
            zo zoVar = yoVar.f1591a;
            zoVar.a(zoVar.a().put("referrer_handled", true));
        }
    }

    public C0453qc(Context context, R4 r4, C0420p4 c0420p4, C0290k0 c0290k0, TimePassedChecker timePassedChecker, C0502sc c0502sc, C0357mg c0357mg, F6 f6) {
        super(context, r4, c0290k0, timePassedChecker, c0502sc, c0420p4);
        this.w = c0357mg;
        Y8 k = k();
        k.a(EnumC0095cb.EVENT_TYPE_REGULAR, new Ig(k.b()));
        this.x = c0502sc.a(this);
        this.y = f6;
        C0401oa.k().x().onMainReporterCreated(new C0610wk(this, c0420p4));
    }
}
