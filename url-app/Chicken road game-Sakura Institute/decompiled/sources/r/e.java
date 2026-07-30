package r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a0.l f7597a = new a0.l();

    public e(q6.c cVar) {
        cVar.f(this);
    }

    public final void a(int i7, q6.c cVar, q6.c cVar2, o0.a aVar) {
        b1.b bVar = new b1.b(cVar, cVar2, aVar);
        a0.l lVar = this.f7597a;
        lVar.getClass();
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("size should be >=0, but was ", i7).toString());
        }
        if (i7 == 0) {
            return;
        }
        s.g gVar = new s.g(lVar.f100g, i7, bVar);
        lVar.f100g += i7;
        ((i0.d) lVar.f101h).b(gVar);
    }
}
