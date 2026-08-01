package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3228a;
    public final /* synthetic */ C0265a d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3230c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3229b = -1;

    public i(C0265a c0265a) {
        this.d = c0265a;
        this.f3228a = c0265a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3230c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3229b;
        C0265a c0265a = this.d;
        Object b2 = c0265a.b(i, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0265a.b(this.f3229b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3230c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3229b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3230c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3229b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3229b < this.f3228a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3230c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3229b;
        C0265a c0265a = this.d;
        Object b2 = c0265a.b(i, 0);
        Object b3 = c0265a.b(this.f3229b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3229b++;
        this.f3230c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3230c) {
            throw new IllegalStateException();
        }
        this.d.g(this.f3229b);
        this.f3229b--;
        this.f3228a--;
        this.f3230c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3230c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0265a c0265a = this.d;
        int i = this.f3229b;
        switch (c0265a.d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((b) c0265a.f3204e).f3236b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
