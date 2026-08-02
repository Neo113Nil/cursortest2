package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuj extends fug {
    public static final hkh b = hkh.l("com/google/apps/tiktok/account/data/AccountDataServiceImpl");
    public static final Duration c = Duration.ofDays(365);
    public final fuy d;
    public final ScheduledExecutorService e;
    private final fuq f;
    private final koe g;
    private final fwm h;

    public fuj(fwm fwmVar, fuy fuyVar, fuq fuqVar, koe koeVar, ScheduledExecutorService scheduledExecutorService) {
        this.h = fwmVar;
        this.d = fuyVar;
        this.f = fuqVar;
        this.g = koeVar;
        this.e = scheduledExecutorService;
    }

    @Override // defpackage.fug
    public final /* bridge */ /* synthetic */ gdn a() {
        return ((fus) this.g).b();
    }

    @Override // defpackage.fug
    public final hvi b(frv frvVar) {
        return hoq.at(this.h.f(frvVar), new esh(9), huf.a);
    }

    @Override // defpackage.fug
    public final hvi c() {
        return this.h.h();
    }

    @Override // defpackage.fug
    public final hvi d() {
        return this.f.a();
    }

    @Override // defpackage.fug
    public final fuf e(frv frvVar) {
        try {
            Object obj = ((fwm) this.h.b).a;
            Object obj2 = ((iyi) obj).c;
            Object obj3 = ((iyi) obj).a;
            obj3.getClass();
            return iyi.j(fwm.a((fxd) ((die) obj2).b(new cbc(obj3, 18)), frvVar));
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public final hvi f(Duration duration, Instant instant) {
        fwm fwmVar = this.h;
        hvi d = this.d.d();
        hvi g = fwmVar.g();
        return hoq.aX(d, g).s(new fuh(d, instant, duration, g, 0), this.e);
    }
}
