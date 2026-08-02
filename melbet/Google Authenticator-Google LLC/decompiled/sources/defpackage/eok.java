package defpackage;

import j$.util.Collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eok extends eoi implements emk {
    public final AtomicReference a = new AtomicReference(null);
    final Deque b = new ArrayDeque();
    private final emi c;
    private final jpt d;
    private final bry e;

    static {
        new LinkedHashSet();
    }

    public eok(ldt ldtVar, jpt jptVar, Executor executor, bry bryVar) {
        this.c = ldtVar.n(executor, jptVar, null);
        this.d = jptVar;
        this.e = bryVar;
    }

    private static long c(long j, int i) {
        return (j * 1000000) + i;
    }

    @Override // defpackage.eoi
    public final void a(eog eogVar, gvy gvyVar) {
        hoq.H(((leu) eogVar.a.getAndSet(leu.INCOMPLETE)) == null);
        Deque deque = this.b;
        synchronized (deque) {
            hoq.s(deque.remove(eogVar));
        }
        eogVar.a().getClass();
        Queue queue = eogVar.b;
        leu leuVar = leu.INCOMPLETE;
        eof eofVar = (eof) Collection.EL.stream(queue).filter(new eoe(0)).collect(hht.b);
        eofVar.c = 8;
        eofVar.b = leuVar;
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (gtx gtxVar : gvyVar.e) {
            long c = c(gtxVar.f, gtxVar.g);
            j2 = Math.min(j2, c);
            j = Math.max(j, c + c(gtxVar.h, gtxVar.i));
        }
        eogVar.a().getClass();
        b(Long.valueOf(hoq.aj(gvyVar)), leuVar, 8, gvyVar.e.size() > 0 ? jmv.b(j - j2) : null);
    }

    public final void b(Long l, leu leuVar, int i, jkb jkbVar) {
        jkj k = lev.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lev levVar = (lev) jkpVar;
        levVar.b |= 1;
        levVar.c = 0;
        if (!jkpVar.M()) {
            k.t();
        }
        lev levVar2 = (lev) k.b;
        levVar2.f = leuVar.h;
        levVar2.b |= 8;
        long longValue = l.longValue();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        lev levVar3 = (lev) jkpVar2;
        levVar3.b |= 4;
        levVar3.e = longValue;
        if (jkbVar != null) {
            if (!jkpVar2.M()) {
                k.t();
            }
            lev levVar4 = (lev) k.b;
            levVar4.d = jkbVar;
            levVar4.b |= 2;
        }
        if (i != 0) {
            hoq.s(leuVar == leu.INCOMPLETE);
            if (!k.b.M()) {
                k.t();
            }
            lev levVar5 = (lev) k.b;
            levVar5.g = i - 1;
            levVar5.b |= 16;
        }
        lev levVar6 = (lev) k.q();
        emi emiVar = this.c;
        eme a = emf.a();
        a.d(true);
        jkj k2 = lgv.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        lgv lgvVar = (lgv) k2.b;
        levVar6.getClass();
        lgvVar.p = levVar6;
        lgvVar.b |= 524288;
        a.f((lgv) k2.q());
        a.b = null;
        emiVar.b(a.a());
    }

    @Override // defpackage.emk
    public final void k() {
        this.e.g(new eoj(this));
        Thread.setDefaultUncaughtExceptionHandler(new ewu(this, Thread.getDefaultUncaughtExceptionHandler(), 1));
    }
}
