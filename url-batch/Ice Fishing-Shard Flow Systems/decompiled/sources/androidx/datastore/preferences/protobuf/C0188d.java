package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f3491d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f3492e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0191g f3493i;

    public C0188d(C0191g c0191g) {
        this.f3493i = c0191g;
        this.f3492e = c0191g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3491d < this.f3492e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f3491d;
        if (i2 >= this.f3492e) {
            throw new NoSuchElementException();
        }
        this.f3491d = i2 + 1;
        return Byte.valueOf(this.f3493i.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
