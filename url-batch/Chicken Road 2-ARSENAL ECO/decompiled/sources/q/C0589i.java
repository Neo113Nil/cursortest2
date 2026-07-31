package q;

import Q.n;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589i implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f5733f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f5736i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5735h = false;

    /* renamed from: g, reason: collision with root package name */
    public int f5734g = -1;

    public C0589i(n nVar) {
        this.f5736i = nVar;
        this.f5733f = nVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5735h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f5734g;
        n nVar = this.f5736i;
        Object c7 = nVar.c(i7, 0);
        if (key != c7 && (key == null || !key.equals(c7))) {
            return false;
        }
        Object value = entry.getValue();
        Object c8 = nVar.c(this.f5734g, 1);
        return value == c8 || (value != null && value.equals(c8));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f5735h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5736i.c(this.f5734g, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f5735h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5736i.c(this.f5734g, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5734g < this.f5733f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5735h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f5734g;
        n nVar = this.f5736i;
        Object c7 = nVar.c(i7, 0);
        Object c8 = nVar.c(this.f5734g, 1);
        return (c7 == null ? 0 : c7.hashCode()) ^ (c8 != null ? c8.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5734g++;
        this.f5735h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5735h) {
            throw new IllegalStateException();
        }
        this.f5736i.i(this.f5734g);
        this.f5734g--;
        this.f5733f--;
        this.f5735h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5735h) {
            return this.f5736i.j(this.f5734g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
