package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2274a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2275b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2276c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f2277d;

    public a0(Y y3) {
        this.f2277d = y3;
    }

    public final Iterator a() {
        if (this.f2276c == null) {
            this.f2276c = this.f2277d.f2267b.entrySet().iterator();
        }
        return this.f2276c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f2274a + 1;
        Y y3 = this.f2277d;
        return i3 < y3.f2266a.size() || (!y3.f2267b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2275b = true;
        int i3 = this.f2274a + 1;
        this.f2274a = i3;
        Y y3 = this.f2277d;
        return i3 < y3.f2266a.size() ? (Map.Entry) y3.f2266a.get(this.f2274a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2275b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2275b = false;
        int i3 = Y.f;
        Y y3 = this.f2277d;
        y3.b();
        if (this.f2274a >= y3.f2266a.size()) {
            a().remove();
            return;
        }
        int i4 = this.f2274a;
        this.f2274a = i4 - 1;
        y3.h(i4);
    }
}
