package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f668d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f670f;

    public d(g gVar) {
        this.f670f = gVar;
        this.f669e = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f668d < this.f669e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f668d;
        if (i >= this.f669e) {
            throw new NoSuchElementException();
        }
        this.f668d = i + 1;
        return Byte.valueOf(this.f670f.g(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
