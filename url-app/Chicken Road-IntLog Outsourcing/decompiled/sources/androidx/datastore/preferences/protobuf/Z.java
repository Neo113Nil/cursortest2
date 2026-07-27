package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4414a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4415b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f4416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f4417d;

    public Z(X x5) {
        this.f4417d = x5;
    }

    public final Iterator a() {
        if (this.f4416c == null) {
            this.f4416c = this.f4417d.f4407b.entrySet().iterator();
        }
        return this.f4416c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f4414a + 1;
        X x5 = this.f4417d;
        if (i2 >= x5.f4406a.size()) {
            return !x5.f4407b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4415b = true;
        int i2 = this.f4414a + 1;
        this.f4414a = i2;
        X x5 = this.f4417d;
        return i2 < x5.f4406a.size() ? (Map.Entry) x5.f4406a.get(this.f4414a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4415b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f4415b = false;
        int i2 = X.f4405f;
        X x5 = this.f4417d;
        x5.c();
        if (this.f4414a >= x5.f4406a.size()) {
            a().remove();
            return;
        }
        int i3 = this.f4414a;
        this.f4414a = i3 - 1;
        x5.i(i3);
    }
}
