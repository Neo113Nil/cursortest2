package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jj implements xm0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ xm0 n;

    public /* synthetic */ jj(xm0 xm0Var, int i) {
        this.m = i;
        this.n = xm0Var;
    }

    @Override // defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        int i = this.m;
        xm0 xm0Var = this.n;
        switch (i) {
            case 0:
                Object a = xm0Var.a(new ij(ym0Var, 0), o30Var);
                if (a != b50.m) {
                    break;
                }
                break;
            default:
                Object a2 = xm0Var.a(new ij(ym0Var, 1), o30Var);
                if (a2 != b50.m) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
