package e;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026e implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f537b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.e f540e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f539d = false;

    /* renamed from: c, reason: collision with root package name */
    public int f538c = -1;

    public C0026e(A.e eVar) {
        this.f540e = eVar;
        this.f537b = ((C0022a) eVar.f10e).f526d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f539d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f538c;
        A.e eVar = this.f540e;
        Object d2 = eVar.d(i2, 0);
        if (key != d2 && (key == null || !key.equals(d2))) {
            return false;
        }
        Object value = entry.getValue();
        Object d3 = eVar.d(this.f538c, 1);
        return value == d3 || (value != null && value.equals(d3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f539d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f540e.d(this.f538c, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f539d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f540e.d(this.f538c, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f538c < this.f537b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f539d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f538c;
        A.e eVar = this.f540e;
        Object d2 = eVar.d(i2, 0);
        Object d3 = eVar.d(this.f538c, 1);
        return (d2 == null ? 0 : d2.hashCode()) ^ (d3 != null ? d3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f538c++;
        this.f539d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f539d) {
            throw new IllegalStateException();
        }
        this.f540e.e(this.f538c);
        this.f538c--;
        this.f537b--;
        this.f539d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f539d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f538c << 1) + 1;
        Object[] objArr = ((C0022a) this.f540e.f10e).f525c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
