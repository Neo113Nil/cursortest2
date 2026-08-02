package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvu {
    public final ehr a;
    public final dvq b;
    public jhy c;
    public dvl d;
    public eba e;
    public Map f;
    public final lao g;
    public final gjl h;
    public final /* synthetic */ fym i;
    private final kvm j;
    private final List k;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public dvu(fym fymVar, kvm kvmVar, ehr ehrVar, List list, gjl gjlVar, dvq dvqVar) {
        this.i = fymVar;
        this.j = kvmVar;
        this.a = ehrVar;
        this.k = list;
        this.h = gjlVar;
        this.b = dvqVar;
        kpk kpkVar = kpk.a;
        kpl kplVar = kpl.a;
        this.g = lak.a(new dvt(kpkVar, kpkVar, kplVar, null));
        this.f = kplVar;
        ixg.i(kvmVar, null, 0, new akn(this, (kqj) null, 7), 3);
        if (ehrVar == null || !fymVar.d.add(ehrVar.c) || dvqVar == null) {
            return;
        }
        String str = ehrVar.c;
        if (dvqVar.o.f() || dvqVar.o.g()) {
            new dvn(str, dvqVar.n, 2, dvqVar.e, 0).a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, jpt] */
    public final void a() {
        jhy jhyVar;
        eba ebaVar;
        eax eaxVar;
        eax eaxVar2;
        ehr ehrVar = this.a;
        fym fymVar = this.i;
        if (ehrVar != null) {
            ehrVar.g((jfi) ((gzp) fymVar.e).e());
            jhyVar = ((dvk) fymVar.f.b()).b(ehrVar, true, this.f, this.h);
        } else {
            jhyVar = null;
        }
        Map j = fymVar.j(this.k, this.f, this.h);
        dvl dvlVar = this.d;
        if (dvlVar == null || (ebaVar = dvlVar.a) == null) {
            ebaVar = this.e;
        }
        boolean isEmpty = ixc.k(j.values()).isEmpty();
        boolean z = (ebaVar == null || (eaxVar2 = ebaVar.b) == null || !eaxVar2.b) ? false : true;
        boolean z2 = (jhyVar == null && isEmpty) ? false : true;
        jhy jhyVar2 = this.c;
        if (jhyVar2 != null && !z2) {
            jhyVar = jhyVar2;
        }
        boolean z3 = (ebaVar == null || (eaxVar = ebaVar.b) == null || !eaxVar.a) ? false : true;
        kpt kptVar = new kpt(10);
        boolean z4 = z && ksp.b(jhyVar, this.c);
        if (z4 && ebaVar != null) {
            kptVar.add(ebaVar.a);
        }
        if (jhyVar != null) {
            kptVar.add(jhyVar);
        }
        if (z3 && !z4 && ebaVar != null) {
            kptVar.add(ebaVar.a);
        }
        List a = ixc.a(kptVar);
        kpt kptVar2 = new kpt(10);
        if (!z3 && ebaVar != null) {
            kptVar2.add(ebaVar.a);
        }
        this.g.d(new dvt(a, ixc.a(kptVar2), j, this.d));
    }
}
