package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f6233a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6234b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6235c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.h1 f6236d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.h1 f6237e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f6238f;

    /* renamed from: g, reason: collision with root package name */
    public final p f6239g;

    /* renamed from: h, reason: collision with root package name */
    public final p f6240h;
    public final p i;

    /* renamed from: j, reason: collision with root package name */
    public final p f6241j;

    public /* synthetic */ c(Object obj, r1 r1Var, Float f6, int i) {
        this(obj, r1Var, (i & 4) != 0 ? null : f6);
    }

    public static final Object a(c cVar, Object obj) {
        r1 r1Var = cVar.f6233a;
        p pVar = cVar.f6241j;
        p pVar2 = cVar.i;
        if (!q6.i.a(pVar2, cVar.f6239g) || !q6.i.a(pVar, cVar.f6240h)) {
            p pVar3 = (p) r1Var.f6413a.i(obj);
            int b8 = pVar3.b();
            boolean z3 = false;
            for (int i = 0; i < b8; i++) {
                if (pVar3.a(i) < pVar2.a(i) || pVar3.a(i) > pVar.a(i)) {
                    pVar3.e(i, r2.o.s(pVar3.a(i), pVar2.a(i), pVar.a(i)));
                    z3 = true;
                }
            }
            if (z3) {
                return r1Var.f6414b.i(pVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        k kVar = cVar.f6235c;
        kVar.f6332f.d();
        kVar.f6333g = Long.MIN_VALUE;
        cVar.f6236d.setValue(Boolean.FALSE);
    }

    public static Object c(c cVar, Object obj, j jVar, p6.c cVar2, i6.i iVar, int i) {
        Object i8 = cVar.f6233a.f6414b.i(cVar.f6235c.f6332f);
        p6.c cVar3 = (i & 8) != 0 ? null : cVar2;
        Object d8 = cVar.d();
        r1 r1Var = cVar.f6233a;
        return h0.a(cVar.f6238f, new a(cVar, i8, new c1(jVar, r1Var, d8, obj, (p) r1Var.f6413a.i(i8)), cVar.f6235c.f6333g, cVar3, null), iVar);
    }

    public final Object d() {
        return this.f6235c.f6331e.getValue();
    }

    public final Object e(Object obj, i6.i iVar) {
        Object a8 = h0.a(this.f6238f, new b(this, obj, null), iVar);
        return a8 == h6.a.f3204d ? a8 : c6.m.f1757a;
    }

    public c(Object obj, r1 r1Var, Object obj2) {
        this.f6233a = r1Var;
        this.f6234b = obj2;
        k kVar = new k(r1Var, obj, null, 60);
        this.f6235c = kVar;
        this.f6236d = m0.b.q(Boolean.FALSE);
        this.f6237e = m0.b.q(obj);
        this.f6238f = new h0();
        new u0(1.0f, 1500.0f, obj2);
        p pVar = kVar.f6332f;
        boolean z3 = pVar instanceof l;
        p pVar2 = z3 ? d.f6258e : pVar instanceof m ? d.f6259f : pVar instanceof n ? d.f6260g : d.f6261h;
        this.f6239g = pVar2;
        p pVar3 = z3 ? d.f6254a : pVar instanceof m ? d.f6255b : pVar instanceof n ? d.f6256c : d.f6257d;
        this.f6240h = pVar3;
        this.i = pVar2;
        this.f6241j = pVar3;
    }
}
