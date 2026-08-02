package defpackage;

import android.content.Intent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayb implements krt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ayb(asa asaVar, String str, int i) {
        this.d = i;
        this.a = "UPDATE workspec SET output=? WHERE id=?";
        this.b = asaVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, krz] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        amh a;
        int i;
        int i2;
        int i3 = this.d;
        int i4 = 1;
        if (i3 == 0) {
            ana anaVar = (ana) obj;
            anaVar.getClass();
            a = anaVar.a((String) this.a);
            Object obj2 = this.c;
            try {
                a.g(1, abf.j((atb) this.b));
                a.i(2, (String) obj2);
                a.l();
                int e = afg.e(anaVar);
                a.close();
                return Integer.valueOf(e);
            } finally {
            }
        }
        if (i3 == 1) {
            ana anaVar2 = (ana) obj;
            anaVar2.getClass();
            a = anaVar2.a((String) this.a);
            Object obj3 = this.c;
            try {
                a.e(1, yn.i((asa) this.b));
                a.i(2, (String) obj3);
                a.l();
                a.close();
                return kow.a;
            } finally {
            }
        }
        int i5 = 4;
        if (i3 == 2) {
            gzp gzpVar = (gzp) obj;
            gzpVar.getClass();
            Object obj4 = this.c;
            Object obj5 = this.b;
            Object d = gzpVar.d(new drl(obj4, obj5, i5));
            eat eatVar = (eat) obj5;
            eatVar.d.c((jiu) this.a, eatVar.e.a(d));
            return kow.a;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                ful fulVar = ((fuf) obj).b;
                giv givVar = (giv) this.a;
                return givVar.b.a((etm) this.b, (jjq) this.c, givVar.e.d(fulVar), givVar.d);
            }
            frv frvVar = (frv) obj;
            giv givVar2 = (giv) this.a;
            Object obj6 = ((jrx) givVar2.c).a;
            obj6.getClass();
            Optional optional = (Optional) obj6;
            boolean isPresent = optional.isPresent();
            Object obj7 = this.c;
            Object obj8 = this.b;
            return isPresent ? hoq.au(((fth) optional.get()).a(new ftk(new Intent())), gvx.c(new git(givVar2, (jjq) obj7, (etm) obj8)), huf.a) : givVar2.c((jjq) obj7, frvVar, givVar2.a, (etm) obj8);
        }
        iae iaeVar = (iae) obj;
        Object obj9 = this.a;
        Object obj10 = this.b;
        gid gidVar = (gid) obj10;
        String str = (String) obj9;
        byte[] bArr = null;
        if (gidVar.c(str, iaeVar)) {
            return hnu.aJ(null);
        }
        hvi a2 = gidVar.a(str, iaeVar);
        if (iaeVar == null) {
            i = gidVar.d;
        } else {
            if (iaeVar.c != 2) {
                i2 = 0;
                hvi au = hoq.au(a2, new fvr(new gjy((krz) this.c, str, i2, gidVar, iaeVar, 1), 13), gidVar.b);
                brn aV = hoq.aV(au);
                gib gibVar = new gib(obj10, obj9, i4, bArr);
                huf hufVar = huf.a;
                return hoq.aX(au, aV.t(gibVar, hufVar)).s(new avc(au, 19), hufVar);
            }
            i = ((Integer) iaeVar.d).intValue();
        }
        i2 = i;
        hvi au2 = hoq.au(a2, new fvr(new gjy((krz) this.c, str, i2, gidVar, iaeVar, 1), 13), gidVar.b);
        brn aV2 = hoq.aV(au2);
        gib gibVar2 = new gib(obj10, obj9, i4, bArr);
        huf hufVar2 = huf.a;
        return hoq.aX(au2, aV2.t(gibVar2, hufVar2)).s(new avc(au2, 19), hufVar2);
    }

    public /* synthetic */ ayb(atb atbVar, String str, int i) {
        this.d = i;
        this.a = "UPDATE workspec SET state=? WHERE id=?";
        this.b = atbVar;
        this.c = str;
    }

    public /* synthetic */ ayb(giv givVar, etm etmVar, jjq jjqVar, int i) {
        this.d = i;
        this.a = givVar;
        this.b = etmVar;
        this.c = jjqVar;
    }

    public /* synthetic */ ayb(giv givVar, jjq jjqVar, etm etmVar, int i) {
        this.d = i;
        this.a = givVar;
        this.c = jjqVar;
        this.b = etmVar;
    }

    public /* synthetic */ ayb(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
