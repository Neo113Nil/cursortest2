package j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f5153d;

    /* renamed from: e, reason: collision with root package name */
    public int f5154e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0487e f5156g;

    public C0485c(C0487e c0487e) {
        this.f5156g = c0487e;
        this.f5153d = c0487e.f5140f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5155f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f5154e;
        C0487e c0487e = this.f5156g;
        return Z1.i.a(key, c0487e.e(i3)) && Z1.i.a(entry.getValue(), c0487e.h(this.f5154e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f5155f) {
            return this.f5156g.e(this.f5154e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f5155f) {
            return this.f5156g.h(this.f5154e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5154e < this.f5153d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5155f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f5154e;
        C0487e c0487e = this.f5156g;
        Object e3 = c0487e.e(i3);
        Object h3 = c0487e.h(this.f5154e);
        return (e3 == null ? 0 : e3.hashCode()) ^ (h3 != null ? h3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5154e++;
        this.f5155f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5155f) {
            throw new IllegalStateException();
        }
        this.f5156g.f(this.f5154e);
        this.f5154e--;
        this.f5153d--;
        this.f5155f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5155f) {
            return this.f5156g.g(this.f5154e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
