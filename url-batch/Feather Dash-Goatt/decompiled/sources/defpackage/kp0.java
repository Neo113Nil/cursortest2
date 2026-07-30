package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kp0 {
    public zl0 a;
    public int b;
    public eo0 c;
    public eo0 d;
    public boolean e;
    public final /* synthetic */ l7 f;

    public kp0(l7 l7Var, zl0 zl0Var, int i, eo0 eo0Var, eo0 eo0Var2, boolean z) {
        this.f = l7Var;
        this.a = zl0Var;
        this.b = i;
        this.c = eo0Var;
        this.d = eo0Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        eo0 eo0Var = this.c;
        int i3 = this.b;
        yl0 yl0Var = (yl0) eo0Var.d[i + i3];
        yl0 yl0Var2 = (yl0) this.d.d[i3 + i2];
        return Intrinsics.a(yl0Var, yl0Var2) || yl0Var.getClass() == yl0Var2.getClass();
    }
}
