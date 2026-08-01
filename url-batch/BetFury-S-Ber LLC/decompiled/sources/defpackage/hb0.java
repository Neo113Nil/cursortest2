package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hb0 extends ib0 implements Iterator {
    public gb0 f;
    public boolean g = true;
    public final /* synthetic */ jb0 h;

    public hb0(jb0 jb0Var) {
        this.h = jb0Var;
    }

    @Override // defpackage.ib0
    public final void a(gb0 gb0Var) {
        gb0 gb0Var2 = this.f;
        if (gb0Var == gb0Var2) {
            gb0 gb0Var3 = gb0Var2.i;
            this.f = gb0Var3;
            this.g = gb0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        gb0 gb0Var = this.f;
        return (gb0Var == null || gb0Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            gb0 gb0Var = this.f;
            this.f = gb0Var != null ? gb0Var.h : null;
        }
        return this.f;
    }
}
