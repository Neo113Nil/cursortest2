package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f10183a;

    /* renamed from: b, reason: collision with root package name */
    public int f10184b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1169e f10186d;

    public C1167c(C1169e c1169e) {
        this.f10186d = c1169e;
        this.f10183a = c1169e.f10206c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f10185c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f10184b;
        C1169e c1169e = this.f10186d;
        return kotlin.jvm.internal.j.a(key, c1169e.e(i3)) && kotlin.jvm.internal.j.a(entry.getValue(), c1169e.h(this.f10184b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f10185c) {
            return this.f10186d.e(this.f10184b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f10185c) {
            return this.f10186d.h(this.f10184b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10184b < this.f10183a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f10185c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f10184b;
        C1169e c1169e = this.f10186d;
        Object e3 = c1169e.e(i3);
        Object h3 = c1169e.h(this.f10184b);
        return (e3 == null ? 0 : e3.hashCode()) ^ (h3 != null ? h3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10184b++;
        this.f10185c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10185c) {
            throw new IllegalStateException();
        }
        this.f10186d.f(this.f10184b);
        this.f10184b--;
        this.f10183a--;
        this.f10185c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f10185c) {
            return this.f10186d.g(this.f10184b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
