package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141d implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1673e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f1674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0144g f1675g;

    public C0141d(C0144g c0144g) {
        this.f1675g = c0144g;
        this.f1674f = c0144g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1673e < this.f1674f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1673e;
        if (i2 >= this.f1674f) {
            throw new NoSuchElementException();
        }
        this.f1673e = i2 + 1;
        return Byte.valueOf(this.f1675g.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
