package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public int f1417e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1418f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f1419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1420h;

    public a0(Y y2) {
        this.f1420h = y2;
    }

    public final Iterator a() {
        if (this.f1419g == null) {
            this.f1419g = this.f1420h.f1410f.entrySet().iterator();
        }
        return this.f1419g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f1417e + 1;
        Y y2 = this.f1420h;
        if (i2 >= y2.f1409e.size()) {
            return !y2.f1410f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1418f = true;
        int i2 = this.f1417e + 1;
        this.f1417e = i2;
        Y y2 = this.f1420h;
        return i2 < y2.f1409e.size() ? (Map.Entry) y2.f1409e.get(this.f1417e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1418f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1418f = false;
        int i2 = Y.f1408j;
        Y y2 = this.f1420h;
        y2.b();
        if (this.f1417e >= y2.f1409e.size()) {
            a().remove();
            return;
        }
        int i3 = this.f1417e;
        this.f1417e = i3 - 1;
        y2.h(i3);
    }
}
