package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public int f798f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f800h;

    public d(g gVar) {
        this.f800h = gVar;
        this.f799g = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f798f < this.f799g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f798f;
        if (i7 >= this.f799g) {
            throw new NoSuchElementException();
        }
        this.f798f = i7 + 1;
        return Byte.valueOf(this.f800h.y(i7));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
