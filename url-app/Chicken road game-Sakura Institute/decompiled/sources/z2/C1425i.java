package z2;

import java.util.Iterator;

/* renamed from: z2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425i extends AbstractC1431o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1423g f11949e;

    public C1425i(AbstractC1423g abstractC1423g) {
        this.f11949e = abstractC1423g;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11949e.containsKey(obj);
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f11949e.d();
    }

    @Override // z2.AbstractC1431o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1424h(((L.j) this.f11949e.b()).iterator(), 0);
    }
}
