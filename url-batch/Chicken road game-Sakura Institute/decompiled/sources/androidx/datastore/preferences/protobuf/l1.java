package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l1 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public Iterator f862f;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f862f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f862f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
