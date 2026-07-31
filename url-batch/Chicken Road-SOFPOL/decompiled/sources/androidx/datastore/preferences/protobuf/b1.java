package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f660d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f661e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f663g;

    public b1(z0 z0Var) {
        this.f663g = z0Var;
    }

    public final Iterator a() {
        if (this.f662f == null) {
            this.f662f = this.f663g.f800e.entrySet().iterator();
        }
        return this.f662f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f660d + 1;
        z0 z0Var = this.f663g;
        return i < z0Var.f799d.size() || (!z0Var.f800e.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f661e = true;
        int i = this.f660d + 1;
        this.f660d = i;
        z0 z0Var = this.f663g;
        return i < z0Var.f799d.size() ? (Map.Entry) z0Var.f799d.get(this.f660d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f661e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f661e = false;
        int i = z0.i;
        z0 z0Var = this.f663g;
        z0Var.b();
        if (this.f660d >= z0Var.f799d.size()) {
            a().remove();
            return;
        }
        int i8 = this.f660d;
        this.f660d = i8 - 1;
        z0Var.h(i8);
    }
}
