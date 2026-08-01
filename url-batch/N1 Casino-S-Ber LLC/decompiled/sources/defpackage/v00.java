package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v00 extends y00 implements Iterator {
    public w00 f;
    public w00 g;
    public final /* synthetic */ int h;

    public v00(w00 w00Var, w00 w00Var2, int i) {
        this.h = i;
        this.f = w00Var2;
        this.g = w00Var;
    }

    @Override // defpackage.y00
    public final void a(w00 w00Var) {
        w00 w00Var2;
        w00 w00Var3 = null;
        if (this.f == w00Var && w00Var == this.g) {
            this.g = null;
            this.f = null;
        }
        w00 w00Var4 = this.f;
        if (w00Var4 == w00Var) {
            switch (this.h) {
                case 0:
                    w00Var2 = w00Var4.i;
                    break;
                default:
                    w00Var2 = w00Var4.h;
                    break;
            }
            this.f = w00Var2;
        }
        w00 w00Var5 = this.g;
        if (w00Var5 == w00Var) {
            w00 w00Var6 = this.f;
            if (w00Var5 != w00Var6 && w00Var6 != null) {
                w00Var3 = b(w00Var5);
            }
            this.g = w00Var3;
        }
    }

    public final w00 b(w00 w00Var) {
        switch (this.h) {
            case 0:
                return w00Var.h;
            default:
                return w00Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        w00 w00Var = this.g;
        w00 w00Var2 = this.f;
        this.g = (w00Var == w00Var2 || w00Var2 == null) ? null : b(w00Var);
        return w00Var;
    }
}
