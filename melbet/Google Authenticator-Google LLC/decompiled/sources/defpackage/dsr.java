package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dsr implements hac {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dsr(iyi iyiVar, Object obj, dtp dtpVar, SelectedAccountDisc selectedAccountDisc, int i) {
        this.e = i;
        this.a = iyiVar;
        this.b = obj;
        this.c = dtpVar;
        this.d = selectedAccountDisc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, koe, krt] */
    @Override // defpackage.hac
    public final Object bB() {
        kzq laeVar;
        int i = this.e;
        if (i == 0) {
            dvq dvqVar = (dvq) this.b;
            if (!dvqVar.c.isPresent()) {
                bst bstVar = dvqVar.o;
                if (!bstVar.f() && !bstVar.g()) {
                    laeVar = new azc(null, 3);
                    Object obj = this.d;
                    return new dsq((iyi) this.a, laeVar, ((SelectedAccountDisc) obj).a());
                }
            }
            Object obj2 = this.c;
            laeVar = new lae(((dtp) obj2).b.g, dvqVar.m, new dvh(dvqVar, (kqj) null, 2), 0);
            Object obj3 = this.d;
            return new dsq((iyi) this.a, laeVar, ((SelectedAccountDisc) obj3).a());
        }
        if (i == 1) {
            dvi dviVar = (dvi) this.b;
            lae laeVar2 = new lae(((dtp) this.c).b.g, dviVar.a(), new dvh(dviVar, (kqj) null, 0), 0);
            return new dsq((iyi) this.a, laeVar2, ((SelectedAccountDisc) this.d).a());
        }
        ?? r2 = this.b;
        if (i == 2) {
            ?? r0 = this.c;
            return ((ldt) this.d).n(this.a, r0, r2);
        }
        Object obj4 = this.a;
        Object obj5 = this.d;
        return iwq.p((String) this.c, (die) obj5, (iyi) obj4, r2, ggz.a);
    }

    public /* synthetic */ dsr(String str, die dieVar, iyi iyiVar, krt krtVar, int i) {
        this.e = i;
        this.c = str;
        this.d = dieVar;
        this.a = iyiVar;
        this.b = krtVar;
    }

    public /* synthetic */ dsr(ldt ldtVar, hvm hvmVar, jpt jptVar, koe koeVar, int i) {
        this.e = i;
        this.d = ldtVar;
        this.a = hvmVar;
        this.c = jptVar;
        this.b = koeVar;
    }
}
