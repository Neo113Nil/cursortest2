package defpackage;

import com.google.android.apps.authenticator2.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfk extends gff implements aec {
    private final gff a;
    private final Executor b;
    private final Map c;
    private final iwq d;

    public gfk(gff gffVar, cka ckaVar, iwq iwqVar, Executor executor, aer aerVar) {
        this.a = gffVar;
        this.d = iwqVar;
        this.b = executor;
        this.c = (Map) ckaVar.n(R.id.result_propagator_map, aerVar, new gfi(0), new gfj(0));
        aerVar.L().a(this);
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        fao.c();
        for (gfv gfvVar : this.c.values()) {
            fao.c();
            hoq.H(!gfvVar.d);
            gfvVar.f = null;
        }
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        fao.c();
        for (gfv gfvVar : this.c.values()) {
            fao.c();
            gfvVar.c = true;
            gfu gfuVar = gfvVar.b;
            if (gfuVar != null) {
                gfuVar.b();
            }
        }
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        fao.c();
        for (gfv gfvVar : this.c.values()) {
            fao.c();
            gfvVar.c = false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [gew, java.lang.Object] */
    @Override // defpackage.gff
    public final hnu h(int i, gex gexVar, gzp gzpVar) {
        fao.c();
        Map map = this.c;
        hnu h = this.a.h(i, gexVar, gzpVar);
        Integer valueOf = Integer.valueOf(i);
        gfv gfvVar = (gfv) map.get(valueOf);
        if (gfvVar == null) {
            gfv gfvVar2 = new gfv(this.d, this.b);
            map.put(valueOf, gfvVar2);
            ?? r3 = ((gzs) gzpVar).a;
            fao.c();
            hoq.H(!gfvVar2.d);
            gfu gfuVar = gfvVar2.b;
            if (gfuVar != null) {
                gfuVar.close();
                iwq iwqVar = gfvVar2.e;
                gfu gfuVar2 = gfvVar2.b;
                iwqVar.m(gfuVar2.a, gfuVar2);
            }
            gfvVar2.b = new gfu(gfvVar2, r3, gfvVar2.a);
            iwq iwqVar2 = gfvVar2.e;
            gfu gfuVar3 = gfvVar2.b;
            iwqVar2.l(gfuVar3.a, gfuVar3);
            gfvVar = gfvVar2;
        }
        fao.c();
        hoq.H(!gfvVar.d);
        gfvVar.f = h;
        gfu gfuVar4 = gfvVar.b;
        if (gfuVar4 != null) {
            gfuVar4.b();
        }
        return new hnu(null, null, null, null);
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }
}
