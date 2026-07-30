package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hb1 implements Iterator {
    public int d = -1;
    public boolean e;
    public Iterator g;
    public final /* synthetic */ fb1 h;

    public hb1(fb1 fb1Var) {
        this.h = fb1Var;
    }

    public final Iterator a() {
        if (this.g == null) {
            this.g = this.h.e.entrySet().iterator();
        }
        return this.g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d + 1;
        fb1 fb1Var = this.h;
        return i < fb1Var.d.size() || (!fb1Var.e.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.e = true;
        int i = this.d + 1;
        this.d = i;
        fb1 fb1Var = this.h;
        return i < fb1Var.d.size() ? (Map.Entry) fb1Var.d.get(this.d) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            dd0.j("remove() was called before next()");
            return;
        }
        this.e = false;
        int i = fb1.j;
        fb1 fb1Var = this.h;
        fb1Var.b();
        if (this.d >= fb1Var.d.size()) {
            a().remove();
            return;
        }
        int i2 = this.d;
        this.d = i2 - 1;
        fb1Var.h(i2);
    }
}
