package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public int f3020f;

    /* renamed from: g, reason: collision with root package name */
    public int f3021g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3022h;
    public final /* synthetic */ f i;

    public d(f fVar) {
        this.i = fVar;
        this.f3020f = fVar.f3036h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3022h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3021g;
        f fVar = this.i;
        return f3.d.a(key, fVar.f(i)) && f3.d.a(entry.getValue(), fVar.i(this.f3021g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f3022h) {
            return this.i.f(this.f3021g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f3022h) {
            return this.i.i(this.f3021g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3021g < this.f3020f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3022h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3021g;
        f fVar = this.i;
        Object f2 = fVar.f(i);
        Object i4 = fVar.i(this.f3021g);
        return (f2 == null ? 0 : f2.hashCode()) ^ (i4 != null ? i4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3021g++;
        this.f3022h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3022h) {
            throw new IllegalStateException();
        }
        this.i.g(this.f3021g);
        this.f3021g--;
        this.f3020f--;
        this.f3022h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3022h) {
            return this.i.h(this.f3021g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
