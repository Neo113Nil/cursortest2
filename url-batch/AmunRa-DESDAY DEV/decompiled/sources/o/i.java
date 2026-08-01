package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3324a;
    public final /* synthetic */ C0274a d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3326c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3325b = -1;

    public i(C0274a c0274a) {
        this.d = c0274a;
        this.f3324a = c0274a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3326c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3325b;
        C0274a c0274a = this.d;
        Object b2 = c0274a.b(i, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0274a.b(this.f3325b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3326c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3325b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3326c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.d.b(this.f3325b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3325b < this.f3324a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3326c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3325b;
        C0274a c0274a = this.d;
        Object b2 = c0274a.b(i, 0);
        Object b3 = c0274a.b(this.f3325b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3325b++;
        this.f3326c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3326c) {
            throw new IllegalStateException();
        }
        this.d.g(this.f3325b);
        this.f3325b--;
        this.f3324a--;
        this.f3326c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3326c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0274a c0274a = this.d;
        int i = this.f3325b;
        switch (c0274a.d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((b) c0274a.f3300e).f3332b;
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
