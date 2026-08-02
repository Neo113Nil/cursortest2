package n;

import I.C0079n;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274g implements Iterator, Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    public int f3246e;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0079n f3249h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3248g = false;

    /* renamed from: f, reason: collision with root package name */
    public int f3247f = -1;

    public C0274g(C0079n c0079n) {
        this.f3249h = c0079n;
        this.f3246e = ((C0268a) c0079n.f692h).f3257g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3248g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f3247f;
        C0079n c0079n = this.f3249h;
        Object a2 = c0079n.a(i2, 0);
        if (key != a2 && (key == null || !key.equals(a2))) {
            return false;
        }
        Object value = entry.getValue();
        Object a3 = c0079n.a(this.f3247f, 1);
        return value == a3 || (value != null && value.equals(a3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3248g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3249h.a(this.f3247f, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3248g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3249h.a(this.f3247f, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3247f < this.f3246e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3248g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f3247f;
        C0079n c0079n = this.f3249h;
        Object a2 = c0079n.a(i2, 0);
        Object a3 = c0079n.a(this.f3247f, 1);
        return (a2 == null ? 0 : a2.hashCode()) ^ (a3 != null ? a3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3247f++;
        this.f3248g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3248g) {
            throw new IllegalStateException();
        }
        this.f3249h.b(this.f3247f);
        this.f3247f--;
        this.f3246e--;
        this.f3248g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3248g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f3247f << 1) + 1;
        Object[] objArr = ((C0268a) this.f3249h.f692h).f3256f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
