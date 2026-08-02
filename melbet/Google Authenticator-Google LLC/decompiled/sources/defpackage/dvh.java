package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvh extends kra implements kry {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(dtw dtwVar, kqj kqjVar, int i) {
        super(3, kqjVar);
        this.d = i;
        this.c = dtwVar;
    }

    @Override // defpackage.kry
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i == 0) {
            dvh dvhVar = new dvh((dvi) this.c, (kqj) obj3, 0);
            dvhVar.a = (ehv) obj;
            dvhVar.b = (Map) obj2;
            return dvhVar.b(kow.a);
        }
        if (i != 1) {
            dvh dvhVar2 = new dvh((dvq) this.c, (kqj) obj3, 2);
            dvhVar2.a = (ehv) obj;
            dvhVar2.b = (Map) obj2;
            return dvhVar2.b(kow.a);
        }
        dvh dvhVar3 = new dvh((dtw) this.c, (kqj) obj3, 1);
        dvhVar3.a = (jgc) obj;
        dvhVar3.b = (dyd) obj2;
        return dvhVar3.b(kow.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ehv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [ehv, java.lang.Object] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        int i = this.d;
        if (i == 0) {
            ixc.Y(obj);
            ?? r11 = this.a;
            ?? r0 = this.b;
            ehs b = r11.b();
            if (b != null) {
                Object obj2 = this.c;
                String str = b.a.c;
                cvc cvcVar = (cvc) r0.get(str);
                if (cvcVar != null) {
                    ijx D = dih.D(cvcVar);
                    if (D != null) {
                        ijd ijdVar = D.b;
                        if (ijdVar == null) {
                            ijdVar = ijd.a;
                        }
                        if (ijdVar != null) {
                            return dja.C(ijdVar, ((dvi) obj2).b);
                        }
                    }
                } else {
                    dvi dviVar = (dvi) obj2;
                    if (dviVar.c.putIfAbsent(str, true) == null) {
                        dviVar.d(str, 3);
                    }
                }
            }
            return null;
        }
        if (i == 1) {
            ixc.Y(obj);
            Object obj3 = this.a;
            boolean z = obj3 instanceof jgb;
            Object obj4 = this.b;
            if (z) {
                Object b2 = ((dtw) this.c).aG().a().c.b();
                b2.getClass();
                ((dyc) b2).c(obj4, obj3);
            }
            return kow.a;
        }
        ixc.Y(obj);
        ?? r112 = this.a;
        ?? r02 = this.b;
        ehs b3 = r112.b();
        if (b3 != null) {
            dvq dvqVar = (dvq) this.c;
            jfi jfiVar = (jfi) dvqVar.f.orElse(null);
            ehr ehrVar = b3.a;
            ehrVar.g(jfiVar);
            String str2 = ehrVar.c;
            cvc cvcVar2 = (cvc) r02.get(str2);
            if (cvcVar2 != null) {
                ijx D2 = dih.D(cvcVar2);
                if (D2 != null) {
                    ijd ijdVar2 = D2.b;
                    if (ijdVar2 == null) {
                        ijdVar2 = ijd.a;
                    }
                    if (ijdVar2 != null) {
                        return dja.C(ijdVar2, dvqVar.d);
                    }
                }
                return null;
            }
            if (!ksp.b(dvq.a.get(str2), true)) {
                new dvn(str2, dvqVar.n, 3, dvqVar.e, 0).a();
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(dvi dviVar, kqj kqjVar, int i) {
        super(3, kqjVar);
        this.d = i;
        this.c = dviVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvh(dvq dvqVar, kqj kqjVar, int i) {
        super(3, kqjVar);
        this.d = i;
        this.c = dvqVar;
    }
}
