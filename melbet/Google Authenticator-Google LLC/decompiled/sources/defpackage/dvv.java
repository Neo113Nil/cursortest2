package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvv {
    public final dvi a;
    public Map b;
    public Map c;
    public final lao d;
    public final /* synthetic */ fym e;
    private final kvm f;
    private final eht g;
    private final ehr h;
    private final gjl i;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public dvv(fym fymVar, kvm kvmVar, eht ehtVar, gjl gjlVar, ehr ehrVar, dvi dviVar) {
        this.e = fymVar;
        this.f = kvmVar;
        this.g = ehtVar;
        this.i = gjlVar;
        this.h = ehrVar;
        this.a = dviVar;
        kpk kpkVar = kpk.a;
        kpl kplVar = kpl.a;
        this.d = lak.a(new dvt(kpkVar, kpkVar, kplVar, null));
        this.b = kplVar;
        this.c = kplVar;
        ixg.i(kvmVar, null, 0, new akn(this, (kqj) null, 8), 3);
        if (ehrVar == null || !fymVar.d.add(ehrVar.c) || dviVar == null) {
            return;
        }
        String str = ehrVar.c;
        if (dviVar.d.k()) {
            return;
        }
        if (dviVar.d.f() || dviVar.d.g()) {
            dviVar.d(str, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, jpt] */
    public final void a() {
        jhy jhyVar;
        dvt dvtVar;
        boolean z;
        Map map = this.b;
        Map map2 = this.c;
        fym fymVar = this.e;
        ehr ehrVar = this.h;
        if (ehrVar != null) {
            ehrVar.g((jfi) ((gzp) fymVar.e).e());
            jhyVar = ((dvk) fymVar.f.b()).b(ehrVar, true, map, this.i);
        } else {
            jhyVar = null;
        }
        Map j = fymVar.j(this.g.b, map, this.i);
        if (ehrVar == null) {
            lao laoVar = this.d;
            kpk kpkVar = kpk.a;
            laoVar.d(new dvt(kpkVar, kpkVar, j, null));
            return;
        }
        cvc cvcVar = (cvc) map2.get(ehrVar.c);
        ijx D = cvcVar != null ? dih.D(cvcVar) : null;
        dvi dviVar = this.a;
        if (dviVar != null) {
            ArrayList arrayList = new ArrayList();
            if (jhyVar != null) {
                arrayList.add(jhyVar);
            }
            ArrayList arrayList2 = new ArrayList();
            if (D == null) {
                dvtVar = new dvt(arrayList, arrayList2, j, null);
            } else {
                Collection values = j.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((jhy) it.next()) != null) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                boolean z2 = jhyVar != null || z;
                ijs ijsVar = D.d;
                if (ijsVar == null) {
                    ijsVar = ijs.a;
                }
                ijsVar.getClass();
                jkx jkxVar = ijsVar.b;
                jkxVar.getClass();
                HashSet hashSet = new HashSet();
                ArrayList<ijr> arrayList3 = new ArrayList();
                for (Object obj : jkxVar) {
                    ijq b = ijq.b(((ijr) obj).c);
                    if (b == null) {
                        b = ijq.CARD_LOCATION_UNSPECIFIED;
                    }
                    if (hashSet.add(b)) {
                        arrayList3.add(obj);
                    }
                }
                for (ijr ijrVar : arrayList3) {
                    ijq b2 = ijq.b(ijrVar.c);
                    if (b2 == null) {
                        b2 = ijq.CARD_LOCATION_UNSPECIFIED;
                    }
                    int ordinal = b2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            jkx jkxVar2 = ijrVar.b;
                            jkxVar2.getClass();
                            dviVar.c(jkxVar2, arrayList, z2, ehrVar);
                        } else {
                            if (ordinal != 2) {
                                throw new koj();
                            }
                            jkx jkxVar3 = ijrVar.b;
                            jkxVar3.getClass();
                            dviVar.c(jkxVar3, arrayList2, false, ehrVar);
                        }
                    }
                }
                dvtVar = new dvt(arrayList, arrayList2, j, null);
            }
        } else {
            kpk kpkVar2 = kpk.a;
            dvtVar = new dvt(kpkVar2, kpkVar2, j, null);
        }
        this.d.d(dvtVar);
    }
}
