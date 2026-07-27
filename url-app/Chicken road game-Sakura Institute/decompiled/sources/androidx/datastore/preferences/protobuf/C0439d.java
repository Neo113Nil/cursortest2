package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f5327d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f5328e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0442g f5329i;

    public C0439d(C0442g c0442g) {
        this.f5329i = c0442g;
        this.f5328e = c0442g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5327d < this.f5328e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f5327d;
        if (i2 >= this.f5328e) {
            throw new NoSuchElementException();
        }
        this.f5327d = i2 + 1;
        return Byte.valueOf(this.f5329i.B(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
