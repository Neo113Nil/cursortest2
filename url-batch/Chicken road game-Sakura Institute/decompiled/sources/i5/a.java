package i5;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public int f4931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f4933h;

    public a(b bVar, int i7, boolean z8) {
        this.f4933h = bVar;
        this.f4932g = z8;
        this.f4931f = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4932g ? this.f4931f >= 0 : this.f4931f < this.f4933h.f4934f.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b bVar = this.f4933h;
        Object[] objArr = bVar.f4934f;
        int i7 = this.f4931f;
        Object obj = objArr[i7];
        Object obj2 = bVar.f4935g[i7];
        this.f4931f = this.f4932g ? i7 - 1 : i7 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
