package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public float f2035a;

    /* renamed from: b, reason: collision with root package name */
    public float f2036b;

    /* renamed from: c, reason: collision with root package name */
    public float f2037c;

    /* renamed from: d, reason: collision with root package name */
    public float f2038d;

    /* renamed from: e, reason: collision with root package name */
    public final l.d f2039e;

    /* renamed from: f, reason: collision with root package name */
    public p.h f2040f;

    /* renamed from: g, reason: collision with root package name */
    public p.h f2041g;

    public i1(float f9, float f10, float f11, float f12) {
        this.f2035a = f9;
        this.f2036b = f10;
        this.f2037c = f11;
        this.f2038d = f12;
        this.f2039e = new l.d(new m2.e(f9), l.x1.f5724c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p.h hVar, j6.c cVar) {
        g1 g1Var;
        int i7;
        i1 i1Var;
        l.d dVar = this.f2039e;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i8 = g1Var.f1980j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                g1Var.f1980j = i8 - Integer.MIN_VALUE;
                Object obj = g1Var.f1978h;
                i7 = g1Var.f1980j;
                if (i7 != 0) {
                    d6.a.e(obj);
                    float f9 = hVar instanceof p.l ? this.f2036b : hVar instanceof p.f ? this.f2037c : hVar instanceof p.d ? this.f2038d : this.f2035a;
                    this.f2041g = hVar;
                    try {
                        if (!m2.e.a(((m2.e) dVar.f5429e.getValue()).f6312f, f9)) {
                            p.h hVar2 = this.f2040f;
                            g1Var.f1976f = this;
                            g1Var.f1977g = hVar;
                            g1Var.f1980j = 1;
                            Object a3 = e0.b.a(dVar, f9, hVar2, hVar, g1Var);
                            i6.a aVar = i6.a.f4956f;
                            if (a3 == aVar) {
                                return aVar;
                            }
                        }
                        i1Var = this;
                    } catch (Throwable th) {
                        th = th;
                        i1Var = this;
                        i1Var.f2040f = hVar;
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = g1Var.f1977g;
                    i1Var = g1Var.f1976f;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        i1Var.f2040f = hVar;
                        throw th;
                    }
                }
                i1Var.f2040f = hVar;
                return d6.z.f2639a;
            }
        }
        g1Var = new g1(this, cVar);
        Object obj2 = g1Var.f1978h;
        i7 = g1Var.f1980j;
        if (i7 != 0) {
        }
        i1Var.f2040f = hVar;
        return d6.z.f2639a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j6.c cVar) {
        h1 h1Var;
        int i7;
        i1 i1Var;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i8 = h1Var.f2008i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                h1Var.f2008i = i8 - Integer.MIN_VALUE;
                Object obj = h1Var.f2006g;
                i7 = h1Var.f2008i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    p.h hVar = this.f2041g;
                    float f9 = hVar instanceof p.l ? this.f2036b : hVar instanceof p.f ? this.f2037c : hVar instanceof p.d ? this.f2038d : this.f2035a;
                    l.d dVar = this.f2039e;
                    if (!m2.e.a(((m2.e) dVar.f5429e.getValue()).f6312f, f9)) {
                        try {
                            m2.e eVar = new m2.e(f9);
                            h1Var.f2005f = this;
                            h1Var.f2008i = 1;
                            Object e9 = dVar.e(h1Var, eVar);
                            i6.a aVar = i6.a.f4956f;
                            if (e9 == aVar) {
                                return aVar;
                            }
                            i1Var = this;
                        } catch (Throwable th) {
                            th = th;
                            i1Var = this;
                            i1Var.f2040f = i1Var.f2041g;
                            throw th;
                        }
                    }
                    return d6.z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i1Var = h1Var.f2005f;
                try {
                    d6.a.e(obj);
                } catch (Throwable th2) {
                    th = th2;
                    i1Var.f2040f = i1Var.f2041g;
                    throw th;
                }
                i1Var.f2040f = i1Var.f2041g;
                return d6.z.f2639a;
            }
        }
        h1Var = new h1(this, cVar);
        Object obj2 = h1Var.f2006g;
        i7 = h1Var.f2008i;
        if (i7 != 0) {
        }
        i1Var.f2040f = i1Var.f2041g;
        return d6.z.f2639a;
    }
}
