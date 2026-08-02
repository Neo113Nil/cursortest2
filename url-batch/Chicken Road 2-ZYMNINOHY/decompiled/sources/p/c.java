package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f14642a;

    /* renamed from: b, reason: collision with root package name */
    public int f14643b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f14645d;

    public c(e eVar) {
        this.f14645d = eVar;
        this.f14642a = eVar.f14667c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f14644c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f14643b;
        e eVar = this.f14645d;
        return kotlin.jvm.internal.i.a(key, eVar.f(i4)) && kotlin.jvm.internal.i.a(entry.getValue(), eVar.i(this.f14643b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f14644c) {
            return this.f14645d.f(this.f14643b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f14644c) {
            return this.f14645d.i(this.f14643b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14643b < this.f14642a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f14644c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f14643b;
        e eVar = this.f14645d;
        Object f4 = eVar.f(i4);
        Object i5 = eVar.i(this.f14643b);
        return (f4 == null ? 0 : f4.hashCode()) ^ (i5 != null ? i5.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14643b++;
        this.f14644c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14644c) {
            throw new IllegalStateException();
        }
        this.f14645d.g(this.f14643b);
        this.f14643b--;
        this.f14642a--;
        this.f14644c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f14644c) {
            return this.f14645d.h(this.f14643b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
