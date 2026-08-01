package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f3103f;

    /* renamed from: g, reason: collision with root package name */
    public int f3104g = -1;
    public boolean h;
    public final /* synthetic */ f i;

    public d(f fVar) {
        this.i = fVar;
        this.f3103f = fVar.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3104g;
        f fVar = this.i;
        return i3.d.a(key, fVar.f(i)) && i3.d.a(entry.getValue(), fVar.i(this.f3104g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.i.f(this.f3104g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.i.i(this.f3104g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3104g < this.f3103f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3104g;
        f fVar = this.i;
        Object f5 = fVar.f(i);
        Object i4 = fVar.i(this.f3104g);
        return (f5 == null ? 0 : f5.hashCode()) ^ (i4 != null ? i4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3104g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.i.g(this.f3104g);
        this.f3104g--;
        this.f3103f--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.i.h(this.f3104g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
