package l;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class D extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f6438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(F f3, long j3, int i3) {
        super(1);
        this.f6437e = i3;
        this.f6438f = f3;
        this.f6439g = j3;
    }

    /* JADX WARN: Type inference failed for: r15v14, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r15v24, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r15v6, types: [e2.c, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int ordinal;
        switch (this.f6437e) {
            case 0:
                F f3 = this.f6438f;
                f3.getClass();
                int ordinal2 = ((x) obj).ordinal();
                long j3 = this.f6439g;
                if (ordinal2 == 0) {
                    v vVar = f3.f6445t.f6453a.f6469b;
                    if (vVar != null) {
                        j3 = ((O0.j) vVar.f6540b.n(new O0.j(j3))).f3740a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new C1.c();
                    }
                    v vVar2 = f3.f6446u.f6456a.f6469b;
                    if (vVar2 != null) {
                        j3 = ((O0.j) vVar2.f6540b.n(new O0.j(j3))).f3740a;
                    }
                }
                return new O0.j(j3);
            default:
                x xVar = (x) obj;
                F f4 = this.f6438f;
                long j4 = 0;
                if (f4.f6450y != null && f4.y0() != null && !f2.j.a(f4.f6450y, f4.y0()) && (ordinal = xVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C1.c();
                    }
                    v vVar3 = f4.f6446u.f6456a.f6469b;
                    if (vVar3 != null) {
                        long j5 = this.f6439g;
                        long j6 = ((O0.j) vVar3.f6540b.n(new O0.j(j5))).f3740a;
                        U.d y02 = f4.y0();
                        f2.j.c(y02);
                        O0.k kVar = O0.k.f3741d;
                        long a3 = ((U.i) y02).a(j5, j6, kVar);
                        U.d dVar = f4.f6450y;
                        f2.j.c(dVar);
                        j4 = O0.h.b(a3, dVar.a(j5, j6, kVar));
                    }
                }
                return new O0.h(j4);
        }
    }
}
