package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsl {
    public static final String a = "dsl";
    public final by b;
    public final dsf c;
    public final bg d;
    public final duh e;
    public final gjl f;

    public dsl(by byVar, dsf dsfVar, bg bgVar, duh duhVar, gjl gjlVar) {
        this.b = byVar;
        this.c = dsfVar;
        this.d = bgVar;
        this.e = duhVar;
        this.f = gjlVar;
        eb a2 = a(byVar);
        if (a2 != null && (a2 instanceof dtw)) {
            b((dtw) a2, duhVar, dsfVar, gjlVar);
        }
    }

    public static eb a(by byVar) {
        return (eb) byVar.d(a);
    }

    public static void b(dtw dtwVar, duh duhVar, dsf dsfVar, gjl gjlVar) {
        Object b = duhVar.a().a.b();
        b.getClass();
        iyh iyhVar = (iyh) b;
        iyhVar.c = new dus(dsfVar);
        gzp gzpVar = dsfVar.l;
        gzpVar.getClass();
        iyhVar.b = gzpVar;
        gzp gzpVar2 = dsfVar.m;
        gzpVar2.getClass();
        iyhVar.a = gzpVar2;
        dtwVar.ak = duhVar;
        dtwVar.ar = gjlVar;
        dtwVar.as.E();
    }
}
