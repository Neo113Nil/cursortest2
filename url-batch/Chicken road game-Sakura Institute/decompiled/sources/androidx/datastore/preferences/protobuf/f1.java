package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public int f812f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f813g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f814h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1 f815i;

    public f1(a1 a1Var) {
        this.f815i = a1Var;
    }

    public final Iterator a() {
        if (this.f814h == null) {
            this.f814h = this.f815i.f780h.entrySet().iterator();
        }
        return this.f814h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f812f + 1;
        a1 a1Var = this.f815i;
        return i7 < a1Var.f779g.size() || (!a1Var.f780h.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f813g = true;
        int i7 = this.f812f + 1;
        this.f812f = i7;
        a1 a1Var = this.f815i;
        return i7 < a1Var.f779g.size() ? (Map.Entry) a1Var.f779g.get(this.f812f) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f813g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f813g = false;
        int i7 = a1.f777l;
        a1 a1Var = this.f815i;
        a1Var.b();
        if (this.f812f >= a1Var.f779g.size()) {
            a().remove();
            return;
        }
        int i8 = this.f812f;
        this.f812f = i8 - 1;
        a1Var.g(i8);
    }
}
