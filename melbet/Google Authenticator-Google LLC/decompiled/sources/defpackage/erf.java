package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erf extends erd implements emk {
    public final emi a;
    public final jpt b;
    private final hac c;
    private final koe d;
    private final hvm e;

    public erf(ldt ldtVar, hvm hvmVar, jpt jptVar, koe koeVar, koe koeVar2, koe koeVar3) {
        this.e = hvmVar;
        this.b = jptVar;
        this.d = koeVar3;
        this.a = ldtVar.n(hvmVar, jptVar, koeVar);
        this.c = hoq.v(new dsr(ldtVar, hvmVar, jptVar, koeVar2, 2));
    }

    @Override // defpackage.erd
    public final void a(lhg lhgVar, final String str, eoc eocVar, lew lewVar) {
        if (lhgVar.d.size() == 0) {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", 80, "TraceMetricServiceImpl.java")).s("Invalid traces were logged.");
            hvi hviVar = hve.a;
            return;
        }
        final eme a = emf.a();
        jkj k = lgv.a.k();
        if (!k.b.M()) {
            k.t();
        }
        lgv lgvVar = (lgv) k.b;
        lhgVar.getClass();
        lgvVar.n = lhgVar;
        lgvVar.b |= 2048;
        a.f((lgv) k.q());
        if (eocVar != null) {
            a.e = eocVar;
        }
        if (lewVar != null) {
            a.b = lewVar;
        }
        emi emiVar = null;
        if (((Boolean) this.d.b()).booleanValue() && lhgVar.m.size() > 0) {
            emiVar = (emi) this.c.bB();
        }
        final emi emiVar2 = emiVar;
        final hfm hfmVar = (hfm) Collection.EL.stream(lhgVar.d).filter(new eoe(2)).map(new ejs(7)).collect(hby.b);
        final long j = lhgVar.c;
        hnu.aN(new htq() { // from class: ere
            @Override // defpackage.htq
            public final hvi a() {
                emi emiVar3 = emiVar2;
                erf erfVar = erf.this;
                if (emiVar3 == null) {
                    emiVar3 = erfVar.a;
                }
                String str2 = str;
                eme emeVar = a;
                Set set = hfmVar;
                if (set.isEmpty() && (((erc) erfVar.b.b()).a instanceof erb)) {
                    eru a2 = emiVar3.a(str2);
                    if (a2.e()) {
                        return hve.a;
                    }
                    emeVar.d = a2;
                } else {
                    emeVar.d(true);
                }
                if (!((erc) erfVar.b.b()).b()) {
                    return hve.a;
                }
                long j2 = j;
                hkh hkhVar = eiu.a;
                ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 145, "TraceMetricServiceImpl.java")).D(j2, str2);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 147, "TraceMetricServiceImpl.java")).u("Trace may be available in Dapper: http://go/trace/0x%X", (Long) it.next());
                }
                return emiVar3.b(emeVar.a());
            }
        }, this.e);
    }

    @Override // defpackage.emk
    public final /* synthetic */ void k() {
    }
}
