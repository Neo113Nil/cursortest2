package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f2924f;
    public int g = -1;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f2925i;

    public d(f fVar) {
        this.f2925i = fVar;
        this.f2924f = fVar.h - 1;
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
        int i4 = this.g;
        f fVar = this.f2925i;
        return u2.c.a(key, fVar.f(i4)) && u2.c.a(entry.getValue(), fVar.i(this.g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.f2925i.f(this.g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.f2925i.i(this.g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f2924f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.g;
        f fVar = this.f2925i;
        Object f4 = fVar.f(i4);
        Object i5 = fVar.i(this.g);
        return (f4 == null ? 0 : f4.hashCode()) ^ (i5 != null ? i5.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.f2925i.g(this.g);
        this.g--;
        this.f2924f--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.f2925i.h(this.g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
