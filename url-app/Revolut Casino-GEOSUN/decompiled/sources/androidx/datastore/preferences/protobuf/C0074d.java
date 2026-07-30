package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074d implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1425e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f1426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0077g f1427g;

    public C0074d(C0077g c0077g) {
        this.f1427g = c0077g;
        this.f1426f = c0077g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1425e < this.f1426f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1425e;
        if (i2 >= this.f1426f) {
            throw new NoSuchElementException();
        }
        this.f1425e = i2 + 1;
        return Byte.valueOf(this.f1427g.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
