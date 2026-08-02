package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fuh implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fuh(esk eskVar, hvi hviVar, hvi hviVar2, hvi hviVar3, int i) {
        this.e = i;
        this.a = eskVar;
        this.d = hviVar;
        this.c = hviVar2;
        this.b = hviVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v20, types: [idh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.time.temporal.TemporalAmount, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        int i = this.e;
        boolean z2 = true;
        if (i == 0) {
            ?? r1 = this.a;
            hkh hkhVar = fuj.b;
            fuz fuzVar = (fuz) hnu.aR(r1);
            int i2 = fuzVar.b & 1;
            ?? r4 = this.c;
            Object obj = this.b;
            if (i2 != 0 && !Instant.ofEpochMilli(fuzVar.c).isBefore(((Instant) obj).minus(r4))) {
                return (List) hnu.aR(this.d);
            }
            int i3 = fuzVar.b;
            if (1 != (i3 & 1)) {
                z = true;
                z2 = false;
            } else {
                z = true;
            }
            long j = fuzVar.c;
            if ((i3 & 2) == 0) {
                z = false;
            }
            throw new fui(z2, j, z, fuzVar.d, ((Instant) obj).toEpochMilli(), ((Duration) r4).toMillis());
        }
        if (i != 1) {
            boolean booleanValue = ((Boolean) ((jww) ((iwq) this.b).b).e(idg.a)).booleanValue();
            Object obj2 = this.a;
            ?? r3 = this.c;
            Object obj3 = this.d;
            if (booleanValue) {
                idg idgVar = (idg) obj3;
                if (!idgVar.g.g()) {
                    return r3.a((idf) obj2, idgVar.f);
                }
            }
            return r3.c((idf) obj2, ((idg) obj3).f);
        }
        jkj k = esj.a.k();
        boolean M = k.b.M();
        ?? r42 = this.b;
        ?? r5 = this.c;
        ?? r6 = this.d;
        if (!M) {
            k.t();
        }
        Object obj4 = this.a;
        esj esjVar = (esj) k.b;
        esjVar.b = 1 | esjVar.b;
        esk eskVar = (esk) obj4;
        esjVar.c = eskVar.c;
        k.y(eskVar.a);
        k.y(eskVar.b);
        if (!k.b.M()) {
            k.t();
        }
        boolean z3 = eskVar.d;
        jkp jkpVar = k.b;
        esj esjVar2 = (esj) jkpVar;
        esjVar2.b |= 2;
        esjVar2.d = z3;
        boolean z4 = eskVar.e;
        if (!jkpVar.M()) {
            k.t();
        }
        esj esjVar3 = (esj) k.b;
        esjVar3.b |= 16;
        esjVar3.h = z4;
        try {
            gzp gzpVar = (gzp) hnu.aR(r6);
            if (gzpVar.f()) {
                String str = (String) gzpVar.b();
                if (!k.b.M()) {
                    k.t();
                }
                esj esjVar4 = (esj) k.b;
                esjVar4.b |= 8;
                esjVar4.f = str;
            }
        } catch (Exception e) {
            ((hkf) ((hkf) ((hkf) eiu.a.b()).h(e)).i("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'b', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set Account Name, falling back to Zwieback logging.");
        }
        try {
            List list = (List) hnu.aR(r5);
            if (!k.b.M()) {
                k.t();
            }
            esj esjVar5 = (esj) k.b;
            jkt jktVar = esjVar5.g;
            if (!jktVar.c()) {
                esjVar5.g = jkp.y(jktVar);
            }
            jiz.f(list, esjVar5.g);
        } catch (Exception e2) {
            ((hkf) ((hkf) ((hkf) eiu.a.b()).h(e2)).i("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 'j', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set external Experiment Ids.");
        }
        try {
            gzp gzpVar2 = (gzp) hnu.aR(r42);
            if (gzpVar2.f()) {
                String str2 = (String) gzpVar2.b();
                if (!k.b.M()) {
                    k.t();
                }
                esj esjVar6 = (esj) k.b;
                esjVar6.b |= 4;
                esjVar6.e = str2;
            }
        } catch (Exception e3) {
            ((hkf) ((hkf) ((hkf) eiu.a.b()).h(e3)).i("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotBuilder", "buildExtension", 't', "ClearcutMetricSnapshotBuilder.java")).s("Failed to set Zwieback.");
        }
        jkl jklVar = (jkl) esd.a.k();
        jklVar.ao(esj.j, (esj) k.q());
        return (esd) jklVar.q();
    }

    public /* synthetic */ fuh(hvi hviVar, Instant instant, Duration duration, hvi hviVar2, int i) {
        this.e = i;
        this.a = hviVar;
        this.b = instant;
        this.c = duration;
        this.d = hviVar2;
    }

    public /* synthetic */ fuh(idg idgVar, iwq iwqVar, idh idhVar, idf idfVar, int i) {
        this.e = i;
        this.d = idgVar;
        this.b = iwqVar;
        this.c = idhVar;
        this.a = idfVar;
    }
}
