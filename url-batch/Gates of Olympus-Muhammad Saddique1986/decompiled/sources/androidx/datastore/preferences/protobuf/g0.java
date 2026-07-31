package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f5068d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5069e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f5070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0248b0 f5071g;

    public g0(C0248b0 c0248b0) {
        this.f5071g = c0248b0;
    }

    public final Iterator a() {
        if (this.f5070f == null) {
            this.f5070f = this.f5071g.f5047f.entrySet().iterator();
        }
        return this.f5070f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f5068d + 1;
        C0248b0 c0248b0 = this.f5071g;
        if (i3 >= c0248b0.f5046e.size()) {
            return !c0248b0.f5047f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f5069e = true;
        int i3 = this.f5068d + 1;
        this.f5068d = i3;
        C0248b0 c0248b0 = this.f5071g;
        return i3 < c0248b0.f5046e.size() ? (Map.Entry) c0248b0.f5046e.get(this.f5068d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5069e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f5069e = false;
        int i3 = C0248b0.f5044j;
        C0248b0 c0248b0 = this.f5071g;
        c0248b0.b();
        if (this.f5068d >= c0248b0.f5046e.size()) {
            a().remove();
            return;
        }
        int i4 = this.f5068d;
        this.f5068d = i4 - 1;
        c0248b0.g(i4);
    }
}
