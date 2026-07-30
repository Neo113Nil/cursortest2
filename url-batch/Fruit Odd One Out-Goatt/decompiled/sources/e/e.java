package e;

import f0.l;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f113b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.e f116e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f115d = false;

    /* renamed from: c, reason: collision with root package name */
    public int f114c = -1;

    public e(c0.e eVar) {
        this.f116e = eVar;
        this.f113b = ((a) eVar.f73d).f102d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f115d) {
            l.b("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f114c;
        c0.e eVar = this.f116e;
        Object b2 = eVar.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = eVar.b(this.f114c, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f115d) {
            return this.f116e.b(this.f114c, 0);
        }
        l.b("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f115d) {
            return this.f116e.b(this.f114c, 1);
        }
        l.b("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f114c < this.f113b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f115d) {
            l.b("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i2 = this.f114c;
        c0.e eVar = this.f116e;
        Object b2 = eVar.b(i2, 0);
        Object b3 = eVar.b(this.f114c, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f114c++;
        this.f115d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f115d) {
            throw new IllegalStateException();
        }
        this.f116e.c(this.f114c);
        this.f114c--;
        this.f113b--;
        this.f115d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f115d) {
            l.b("This container does not support retaining Map.Entry objects");
            return null;
        }
        int i2 = (this.f114c << 1) + 1;
        Object[] objArr = ((a) this.f116e.f73d).f101c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
