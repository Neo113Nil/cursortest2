package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i11 {
    public tl a;
    public int b;
    public d3 c;
    public Function2 d;
    public int e;
    public ln0 f;
    public vn0 g;

    public i11(tl tlVar) {
        this.a = tlVar;
    }

    public final boolean a() {
        if (this.a != null) {
            d3 d3Var = this.c;
            if (d3Var != null ? d3Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final wa0 b(Object obj) {
        wa0 s;
        tl tlVar = this.a;
        return (tlVar == null || (s = tlVar.s(this, obj)) == null) ? wa0.d : s;
    }

    public final void c() {
        tl tlVar = this.a;
        if (tlVar != null) {
            tlVar.s = true;
            tlVar.x.n();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
