package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1505e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1506f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1508h;

    public a0(Y y2) {
        this.f1508h = y2;
    }

    public final Iterator a() {
        if (this.f1507g == null) {
            this.f1507g = this.f1508h.f1498f.entrySet().iterator();
        }
        return this.f1507g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1505e + 1;
        Y y2 = this.f1508h;
        return i2 < y2.f1497e.size() || (!y2.f1498f.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1506f = true;
        int i2 = this.f1505e + 1;
        this.f1505e = i2;
        Y y2 = this.f1508h;
        return i2 < y2.f1497e.size() ? (Map.Entry) y2.f1497e.get(this.f1505e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1506f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1506f = false;
        int i2 = Y.f1496j;
        Y y2 = this.f1508h;
        y2.b();
        if (this.f1505e >= y2.f1497e.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1505e;
        this.f1505e = i3 - 1;
        y2.h(i3);
    }
}
