package o;

import h0.r;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3582a;
    public final /* synthetic */ r d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3584c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3583b = -1;

    public i(r rVar) {
        this.d = rVar;
        this.f3582a = rVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3584c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3583b;
        r rVar = this.d;
        Object c2 = rVar.c(i, 0);
        if (key != c2 && (key == null || !key.equals(c2))) {
            return false;
        }
        Object value = entry.getValue();
        Object c3 = rVar.c(this.f3583b, 1);
        return value == c3 || (value != null && value.equals(c3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3584c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.c(this.f3583b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3584c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.c(this.f3583b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3583b < this.f3582a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3584c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3583b;
        r rVar = this.d;
        Object c2 = rVar.c(i, 0);
        Object c3 = rVar.c(this.f3583b, 1);
        return (c2 == null ? 0 : c2.hashCode()) ^ (c3 != null ? c3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3583b++;
        this.f3584c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3584c) {
            throw new IllegalStateException();
        }
        this.d.i(this.f3583b);
        this.f3583b--;
        this.f3582a--;
        this.f3584c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3584c) {
            return this.d.j(this.f3583b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
