package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f5053d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f5054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0253g f5055f;

    public C0250d(C0253g c0253g) {
        this.f5055f = c0253g;
        this.f5054e = c0253g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5053d < this.f5054e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f5053d;
        if (i3 >= this.f5054e) {
            throw new NoSuchElementException();
        }
        this.f5053d = i3 + 1;
        return Byte.valueOf(this.f5055f.k(i3));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
