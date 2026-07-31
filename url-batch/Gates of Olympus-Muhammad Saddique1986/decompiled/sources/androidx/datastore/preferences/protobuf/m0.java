package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m0 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public Iterator f5106d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5106d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f5106d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
