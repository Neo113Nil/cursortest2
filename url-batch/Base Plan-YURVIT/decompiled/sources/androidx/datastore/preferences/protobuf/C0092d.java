package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092d implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1513e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f1514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0095g f1515g;

    public C0092d(C0095g c0095g) {
        this.f1515g = c0095g;
        this.f1514f = c0095g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1513e < this.f1514f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1513e;
        if (i2 >= this.f1514f) {
            throw new NoSuchElementException();
        }
        this.f1513e = i2 + 1;
        return Byte.valueOf(this.f1515g.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
