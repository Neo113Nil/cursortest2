package i;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f4726f;

    /* renamed from: g, reason: collision with root package name */
    public int f4727g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f4729i;

    public c(e eVar) {
        this.f4729i = eVar;
        this.f4726f = eVar.f4744h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4728h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f4727g;
        e eVar = this.f4729i;
        return r6.k.a(key, eVar.e(i7)) && r6.k.a(entry.getValue(), eVar.h(this.f4727g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4728h) {
            return this.f4729i.e(this.f4727g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4728h) {
            return this.f4729i.h(this.f4727g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4727g < this.f4726f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4728h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f4727g;
        e eVar = this.f4729i;
        Object e9 = eVar.e(i7);
        Object h3 = eVar.h(this.f4727g);
        return (e9 == null ? 0 : e9.hashCode()) ^ (h3 != null ? h3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4727g++;
        this.f4728h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4728h) {
            throw new IllegalStateException();
        }
        this.f4729i.f(this.f4727g);
        this.f4727g--;
        this.f4726f--;
        this.f4728h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4728h) {
            return this.f4729i.g(this.f4727g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
