package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f6292a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.h1 f6293b = m0.b.q(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f6294c;

    public f1(l1 l1Var, r1 r1Var, String str) {
        this.f6294c = l1Var;
        this.f6292a = r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e1 a(p6.c cVar, p6.c cVar2) {
        m0.h1 h1Var = this.f6293b;
        e1 e1Var = (e1) h1Var.getValue();
        l1 l1Var = this.f6294c;
        if (e1Var == null) {
            Object i = cVar2.i(l1Var.f6346a.b());
            Object i8 = cVar2.i(l1Var.f6346a.b());
            r1 r1Var = this.f6292a;
            p pVar = (p) r1Var.f6413a.i(i8);
            pVar.d();
            i1 i1Var = new i1(l1Var, i, pVar, r1Var);
            e1Var = new e1(this, i1Var, cVar, cVar2);
            h1Var.setValue(e1Var);
            l1Var.i.add(i1Var);
        }
        e1Var.f6287f = (q6.j) cVar2;
        e1Var.f6286e = cVar;
        e1Var.a(l1Var.f());
        return e1Var;
    }
}
