package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ert {
    public volatile ery a;
    public volatile boolean b;
    public volatile ero c;

    public ert(final Context context, final Executor executor, final erx erxVar, final jpt jptVar, gzp gzpVar, koe koeVar, final ggw ggwVar) {
        this.a = erx.a;
        this.b = true;
        this.c = new err(1);
        final koe koeVar2 = true == gzpVar.f() ? null : koeVar;
        executor.execute(new Runnable() { // from class: ers
            @Override // java.lang.Runnable
            public final void run() {
                ert ertVar = ert.this;
                jpt jptVar2 = jptVar;
                ggw ggwVar2 = ggwVar;
                Context context2 = context;
                if (djl.i(context2)) {
                    ertVar.c(jptVar2, ggwVar2);
                } else {
                    djl.d(context2, new fv(ertVar, jptVar2, ggwVar2, executor, 6, null));
                }
                if (ertVar.b) {
                    ertVar.b(erxVar, koeVar2);
                }
            }
        });
    }

    public final lgc a(eru eruVar) {
        boolean z = this.b;
        ery eryVar = this.a;
        return z ? eryVar.c(eruVar) : eryVar.d();
    }

    public final void b(erx erxVar, koe koeVar) {
        if (koeVar == null) {
            jkj k = lgc.a.k();
            if (!k.b.M()) {
                k.t();
            }
            lgc lgcVar = (lgc) k.b;
            lgcVar.e = 2;
            lgcVar.b = 2 | lgcVar.b;
            this.a = erxVar.a((lgc) k.q());
            return;
        }
        try {
            this.a = erxVar.a((lgc) koeVar.b());
        } catch (Throwable th) {
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(th)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 142, "Sampler.java")).s("Couldn't get sampling strategy");
            jkj k2 = lgc.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            lgc lgcVar2 = (lgc) k2.b;
            lgcVar2.c = 2;
            lgcVar2.d = 1;
            if (!k2.b.M()) {
                k2.t();
            }
            lgc lgcVar3 = (lgc) k2.b;
            lgcVar3.e = 3;
            lgcVar3.b = 2 | lgcVar3.b;
            this.a = erxVar.a((lgc) k2.q());
        }
    }

    public final void c(jpt jptVar, ggw ggwVar) {
        try {
            elj eljVar = (elj) jptVar.b();
            this.b = eljVar.b();
            final int a = eljVar.a();
            this.c = ggwVar.a ? new err(1) : new erq(new koe() { // from class: erp
                @Override // defpackage.koe, defpackage.kod
                public final Object b() {
                    return Integer.valueOf(a);
                }
            });
        } catch (Throwable th) {
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(th)).i("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'y', "Sampler.java")).s("Couldn't get config");
            this.b = false;
        }
    }

    public ert(erx erxVar, koe koeVar) {
        this.a = erx.a;
        this.b = true;
        this.c = new err(0);
        this.b = true;
        b(erxVar, koeVar);
    }
}
