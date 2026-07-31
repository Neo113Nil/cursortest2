package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f3852d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f3853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0197g f3854f;

    public C0194d(C0197g c0197g) {
        this.f3854f = c0197g;
        this.f3853e = c0197g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3852d < this.f3853e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f3852d;
        if (i3 >= this.f3853e) {
            throw new NoSuchElementException();
        }
        this.f3852d = i3 + 1;
        return Byte.valueOf(this.f3854f.k(i3));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
