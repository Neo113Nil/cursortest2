package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ept extends epq implements emk {
    public final hvm a;
    public final jpt b;
    public final emi c;
    public final epx d;
    private final eiw e;
    private final boolean f;
    private final epp g;

    public ept(ldt ldtVar, epp eppVar, hvm hvmVar, jpt jptVar, epx epxVar, eiw eiwVar, koe koeVar, Executor executor, gzp gzpVar) {
        new AtomicReference(epl.a);
        new ConcurrentHashMap();
        this.g = eppVar;
        this.e = eiwVar;
        this.c = ldtVar.n(executor, jptVar, koeVar);
        this.a = hvmVar;
        this.b = jptVar;
        this.d = epxVar;
        this.f = ((Boolean) gzpVar.d(false)).booleanValue();
    }

    public static final boolean c(int i) {
        return i != 1;
    }

    @Override // defpackage.epq
    public final void a() {
        epo epoVar = new epo() { // from class: epr
            @Override // defpackage.epo
            public final void a(int i, String str) {
                ept.this.d(null, i, str);
            }
        };
        epp eppVar = this.g;
        eppVar.d = epoVar;
        if (eppVar.c.getAndSet(true)) {
            return;
        }
        hnu.aN(new cbc(eppVar, 8), eppVar.b);
    }

    @Override // defpackage.epq
    public final void b(eik eikVar) {
        d(eikVar.a, 1, null);
    }

    public final void d(String str, int i, String str2) {
        if (this.e.a) {
            hnu.aH();
        } else {
            hnu.aN(new fcg(this, i, str, str2, 1), this.a);
        }
    }

    @Override // defpackage.emk
    public final void k() {
        if (this.f) {
            a();
        }
    }
}
