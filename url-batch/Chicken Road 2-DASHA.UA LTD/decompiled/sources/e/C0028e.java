package e;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028e implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f481a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B.e f484d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f483c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f482b = -1;

    public C0028e(B.e eVar) {
        this.f484d = eVar;
        this.f481a = ((C0024a) eVar.f10d).f470d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f483c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f482b;
        B.e eVar = this.f484d;
        Object b2 = eVar.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = eVar.b(this.f482b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f483c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f484d.b(this.f482b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f483c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f484d.b(this.f482b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f482b < this.f481a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f483c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f482b;
        B.e eVar = this.f484d;
        Object b2 = eVar.b(i2, 0);
        Object b3 = eVar.b(this.f482b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f482b++;
        this.f483c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f483c) {
            throw new IllegalStateException();
        }
        this.f484d.c(this.f482b);
        this.f482b--;
        this.f481a--;
        this.f483c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f483c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f482b << 1) + 1;
        Object[] objArr = ((C0024a) this.f484d.f10d).f469c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
