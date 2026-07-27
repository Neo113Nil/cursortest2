package r;

import X.m;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: r.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f11702a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f11705d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11704c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f11703b = -1;

    public C1399i(m mVar) {
        this.f11705d = mVar;
        this.f11702a = mVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f11704c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f11703b;
        m mVar = this.f11705d;
        Object c2 = mVar.c(i2, 0);
        if (key != c2 && (key == null || !key.equals(c2))) {
            return false;
        }
        Object value = entry.getValue();
        Object c6 = mVar.c(this.f11703b, 1);
        return value == c6 || (value != null && value.equals(c6));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f11704c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f11705d.c(this.f11703b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f11704c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f11705d.c(this.f11703b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11703b < this.f11702a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f11704c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f11703b;
        m mVar = this.f11705d;
        Object c2 = mVar.c(i2, 0);
        Object c6 = mVar.c(this.f11703b, 1);
        return (c2 == null ? 0 : c2.hashCode()) ^ (c6 != null ? c6.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11703b++;
        this.f11704c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11704c) {
            throw new IllegalStateException();
        }
        this.f11705d.i(this.f11703b);
        this.f11703b--;
        this.f11702a--;
        this.f11704c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f11704c) {
            return this.f11705d.j(this.f11703b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
