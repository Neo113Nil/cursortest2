package l0;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends e6.a {

    /* renamed from: f, reason: collision with root package name */
    public final c f5760f;

    public j(c cVar) {
        this.f5760f = cVar;
    }

    @Override // e6.a
    public final int a() {
        c cVar = this.f5760f;
        cVar.getClass();
        return cVar.f5748g;
    }

    @Override // e6.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5760f.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        k kVar = this.f5760f.f5747f;
        l[] lVarArr = new l[8];
        for (int i7 = 0; i7 < 8; i7++) {
            lVarArr[i7] = new m(2);
        }
        return new i(kVar, lVarArr);
    }
}
