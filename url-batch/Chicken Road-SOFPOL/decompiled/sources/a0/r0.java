package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f136e;

    public /* synthetic */ r0(u0 u0Var, int i) {
        this.f135d = i;
        this.f136e = u0Var;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f135d) {
            case 0:
                z.h hVar = (z.h) this.f136e.f148r.b();
                int c8 = hVar.c();
                int i = 0;
                while (true) {
                    if (i >= c8) {
                        i = -1;
                    } else if (!hVar.d(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Integer) obj).intValue();
                u0 u0Var = this.f136e;
                z.h hVar2 = (z.h) u0Var.f148r.b();
                if (intValue < 0 || intValue >= hVar2.c()) {
                    StringBuilder l3 = q.l("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    l3.append(hVar2.c());
                    l3.append(')');
                    w.a.a(l3.toString());
                }
                a7.x.n(u0Var.f0(), null, new t0(u0Var, intValue, (g6.c) null), 3);
                return Boolean.TRUE;
        }
    }
}
