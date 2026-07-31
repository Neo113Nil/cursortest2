package j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f6271d;

    /* renamed from: e, reason: collision with root package name */
    public int f6272e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0531e f6274g;

    public C0529c(C0531e c0531e) {
        this.f6274g = c0531e;
        this.f6271d = c0531e.f6258f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f6273f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f6272e;
        C0531e c0531e = this.f6274g;
        return f2.j.a(key, c0531e.e(i3)) && f2.j.a(entry.getValue(), c0531e.h(this.f6272e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f6273f) {
            return this.f6274g.e(this.f6272e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6273f) {
            return this.f6274g.h(this.f6272e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6272e < this.f6271d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f6273f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f6272e;
        C0531e c0531e = this.f6274g;
        Object e3 = c0531e.e(i3);
        Object h3 = c0531e.h(this.f6272e);
        return (e3 == null ? 0 : e3.hashCode()) ^ (h3 != null ? h3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6272e++;
        this.f6273f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6273f) {
            throw new IllegalStateException();
        }
        this.f6274g.f(this.f6272e);
        this.f6272e--;
        this.f6271d--;
        this.f6273f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f6273f) {
            return this.f6274g.g(this.f6272e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
