package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c40 extends d40 implements Iterator {
    public b40 f;
    public boolean g = true;
    public final /* synthetic */ e40 h;

    public c40(e40 e40Var) {
        this.h = e40Var;
    }

    @Override // defpackage.d40
    public final void a(b40 b40Var) {
        b40 b40Var2 = this.f;
        if (b40Var == b40Var2) {
            b40 b40Var3 = b40Var2.i;
            this.f = b40Var3;
            this.g = b40Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        b40 b40Var = this.f;
        return (b40Var == null || b40Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            b40 b40Var = this.f;
            this.f = b40Var != null ? b40Var.h : null;
        }
        return this.f;
    }
}
