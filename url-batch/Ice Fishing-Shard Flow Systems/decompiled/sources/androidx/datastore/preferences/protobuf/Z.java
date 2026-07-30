package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f3476d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3477e;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f3478i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X f3479l;

    public Z(X x7) {
        this.f3479l = x7;
    }

    public final Iterator a() {
        if (this.f3478i == null) {
            this.f3478i = this.f3479l.f3469e.entrySet().iterator();
        }
        return this.f3478i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f3476d + 1;
        X x7 = this.f3479l;
        return i2 < x7.f3468d.size() || (!x7.f3469e.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f3477e = true;
        int i2 = this.f3476d + 1;
        this.f3476d = i2;
        X x7 = this.f3479l;
        return i2 < x7.f3468d.size() ? (Map.Entry) x7.f3468d.get(this.f3476d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3477e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f3477e = false;
        int i2 = X.f3467n;
        X x7 = this.f3479l;
        x7.b();
        if (this.f3476d >= x7.f3468d.size()) {
            a().remove();
            return;
        }
        int i5 = this.f3476d;
        this.f3476d = i5 - 1;
        x7.h(i5);
    }
}
