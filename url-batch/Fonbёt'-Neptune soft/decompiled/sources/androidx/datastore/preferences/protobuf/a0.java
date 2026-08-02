package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1665e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1666f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1668h;

    public a0(Y y2) {
        this.f1668h = y2;
    }

    public final Iterator a() {
        if (this.f1667g == null) {
            this.f1667g = this.f1668h.f1658f.entrySet().iterator();
        }
        return this.f1667g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1665e + 1;
        Y y2 = this.f1668h;
        if (i2 >= y2.f1657e.size()) {
            return !y2.f1658f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1666f = true;
        int i2 = this.f1665e + 1;
        this.f1665e = i2;
        Y y2 = this.f1668h;
        return i2 < y2.f1657e.size() ? (Map.Entry) y2.f1657e.get(this.f1665e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1666f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1666f = false;
        int i2 = Y.f1656j;
        Y y2 = this.f1668h;
        y2.b();
        if (this.f1665e >= y2.f1657e.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1665e;
        this.f1665e = i3 - 1;
        y2.h(i3);
    }
}
