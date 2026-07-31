package l1;

import a0.g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f4811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i) {
        super(1);
        this.f4810e = i;
        this.f4811f = vVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [p6.a, q6.j] */
    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f4810e) {
            case 0:
                v vVar = this.f4811f;
                vVar.f4814d = true;
                vVar.f4816f.b();
                return c6.m.f1757a;
            default:
                h1.d dVar = (h1.d) obj;
                v vVar2 = this.f4811f;
                b bVar = vVar2.f4812b;
                float f6 = vVar2.f4820k;
                float f8 = vVar2.f4821l;
                g1 y7 = dVar.y();
                long u7 = y7.u();
                y7.m().h();
                try {
                    ((b1.b) y7.f84b).w(f6, f8, 0L);
                    bVar.a(dVar);
                    y7.m().f();
                    y7.M(u7);
                    return c6.m.f1757a;
                } catch (Throwable th) {
                    y7.m().f();
                    y7.M(u7);
                    throw th;
                }
        }
    }
}
