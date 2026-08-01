package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fb0 extends ib0 implements Iterator {
    public gb0 f;
    public gb0 g;
    public final /* synthetic */ int h;

    public fb0(gb0 gb0Var, gb0 gb0Var2, int i) {
        this.h = i;
        this.f = gb0Var2;
        this.g = gb0Var;
    }

    @Override // defpackage.ib0
    public final void a(gb0 gb0Var) {
        gb0 gb0Var2;
        gb0 gb0Var3 = null;
        if (this.f == gb0Var && gb0Var == this.g) {
            this.g = null;
            this.f = null;
        }
        gb0 gb0Var4 = this.f;
        if (gb0Var4 == gb0Var) {
            switch (this.h) {
                case 0:
                    gb0Var2 = gb0Var4.i;
                    break;
                default:
                    gb0Var2 = gb0Var4.h;
                    break;
            }
            this.f = gb0Var2;
        }
        gb0 gb0Var5 = this.g;
        if (gb0Var5 == gb0Var) {
            gb0 gb0Var6 = this.f;
            if (gb0Var5 != gb0Var6 && gb0Var6 != null) {
                gb0Var3 = b(gb0Var5);
            }
            this.g = gb0Var3;
        }
    }

    public final gb0 b(gb0 gb0Var) {
        switch (this.h) {
            case 0:
                return gb0Var.h;
            default:
                return gb0Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        gb0 gb0Var = this.g;
        gb0 gb0Var2 = this.f;
        this.g = (gb0Var == gb0Var2 || gb0Var2 == null) ? null : b(gb0Var);
        return gb0Var;
    }
}
