package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f5423d;

    /* renamed from: e, reason: collision with root package name */
    public int f5424e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f5426g;

    public c(e eVar) {
        this.f5426g = eVar;
        this.f5423d = eVar.f5542f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5425f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f5424e;
        e eVar = this.f5426g;
        return q6.i.a(key, eVar.f(i)) && q6.i.a(entry.getValue(), eVar.i(this.f5424e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f5425f) {
            return this.f5426g.f(this.f5424e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f5425f) {
            return this.f5426g.i(this.f5424e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5424e < this.f5423d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5425f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f5424e;
        e eVar = this.f5426g;
        Object f6 = eVar.f(i);
        Object i8 = eVar.i(this.f5424e);
        return (f6 == null ? 0 : f6.hashCode()) ^ (i8 != null ? i8.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5424e++;
        this.f5425f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5425f) {
            throw new IllegalStateException();
        }
        this.f5426g.g(this.f5424e);
        this.f5424e--;
        this.f5423d--;
        this.f5425f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5425f) {
            return this.f5426g.h(this.f5424e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
