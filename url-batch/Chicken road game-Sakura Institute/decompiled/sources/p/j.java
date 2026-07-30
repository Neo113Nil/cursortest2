package p;

import d6.z;
import f7.e0;
import f7.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f6976a;

    public j() {
        e0 a3;
        a3 = f0.a((r2 & 1) != 0 ? 0 : 1, (r2 & 2) == 0 ? 16 : 0, e7.a.f2834g);
        this.f6976a = a3;
    }

    @Override // p.i
    public final f7.f a() {
        return this.f6976a;
    }

    public final Object b(h hVar, j6.c cVar) {
        Object k8 = this.f6976a.k(hVar, cVar);
        return k8 == i6.a.f4956f ? k8 : z.f2639a;
    }

    public final void c(h hVar) {
        this.f6976a.i(hVar);
    }
}
