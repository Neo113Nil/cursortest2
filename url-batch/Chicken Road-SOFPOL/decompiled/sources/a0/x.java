package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final v0.c f167a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f168b;

    /* renamed from: c, reason: collision with root package name */
    public final o.j0 f169c;

    public x(v0.c cVar, c0 c0Var) {
        this.f167a = cVar;
        this.f168b = c0Var;
        long[] jArr = o.r0.f5528a;
        this.f169c = new o.j0();
    }

    public final p6.e a(int i, Object obj, Object obj2) {
        o.j0 j0Var = this.f169c;
        w wVar = (w) j0Var.g(obj);
        if (wVar != null && wVar.f163c == i && q6.i.a(wVar.f162b, obj2)) {
            u0.c cVar = wVar.f164d;
            if (cVar != null) {
                return cVar;
            }
            u0.c cVar2 = new u0.c(818252804, true, new v(0, wVar.f165e, wVar));
            wVar.f164d = cVar2;
            return cVar2;
        }
        w wVar2 = new w(this, i, obj, obj2);
        j0Var.m(obj, wVar2);
        u0.c cVar3 = wVar2.f164d;
        if (cVar3 != null) {
            return cVar3;
        }
        u0.c cVar4 = new u0.c(818252804, true, new v(0, this, wVar2));
        wVar2.f164d = cVar4;
        return cVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = (w) this.f169c.g(obj);
        if (wVar != null) {
            return wVar.f162b;
        }
        z.h hVar = (z.h) this.f168b.b();
        int c8 = hVar.f9021d.c(obj);
        if (c8 != -1) {
            return hVar.b(c8);
        }
        return null;
    }
}
