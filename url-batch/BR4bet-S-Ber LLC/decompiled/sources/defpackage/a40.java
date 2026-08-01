package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class a40 extends d40 implements Iterator {
    public b40 f;
    public b40 g;
    public final /* synthetic */ int h;

    public a40(b40 b40Var, b40 b40Var2, int i) {
        this.h = i;
        this.f = b40Var2;
        this.g = b40Var;
    }

    @Override // defpackage.d40
    public final void a(b40 b40Var) {
        b40 b40Var2;
        b40 b40Var3 = null;
        if (this.f == b40Var && b40Var == this.g) {
            this.g = null;
            this.f = null;
        }
        b40 b40Var4 = this.f;
        if (b40Var4 == b40Var) {
            switch (this.h) {
                case 0:
                    b40Var2 = b40Var4.i;
                    break;
                default:
                    b40Var2 = b40Var4.h;
                    break;
            }
            this.f = b40Var2;
        }
        b40 b40Var5 = this.g;
        if (b40Var5 == b40Var) {
            b40 b40Var6 = this.f;
            if (b40Var5 != b40Var6 && b40Var6 != null) {
                b40Var3 = b(b40Var5);
            }
            this.g = b40Var3;
        }
    }

    public final b40 b(b40 b40Var) {
        switch (this.h) {
            case 0:
                return b40Var.h;
            default:
                return b40Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b40 b40Var = this.g;
        b40 b40Var2 = this.f;
        this.g = (b40Var == b40Var2 || b40Var2 == null) ? null : b(b40Var);
        return b40Var;
    }
}
