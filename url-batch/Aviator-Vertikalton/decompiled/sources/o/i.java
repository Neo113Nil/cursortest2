package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3696a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0304a f3699d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3698c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3697b = -1;

    public i(C0304a c0304a) {
        this.f3699d = c0304a;
        this.f3696a = c0304a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3698c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f3697b;
        C0304a c0304a = this.f3699d;
        Object b2 = c0304a.b(i, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0304a.b(this.f3697b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3698c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3699d.b(this.f3697b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3698c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3699d.b(this.f3697b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3697b < this.f3696a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3698c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f3697b;
        C0304a c0304a = this.f3699d;
        Object b2 = c0304a.b(i, 0);
        Object b3 = c0304a.b(this.f3697b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3697b++;
        this.f3698c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3698c) {
            throw new IllegalStateException();
        }
        this.f3699d.g(this.f3697b);
        this.f3697b--;
        this.f3696a--;
        this.f3698c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f3698c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0304a c0304a = this.f3699d;
        int i = this.f3697b;
        switch (c0304a.f3667d) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((b) c0304a.f3668e).f3706b;
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
