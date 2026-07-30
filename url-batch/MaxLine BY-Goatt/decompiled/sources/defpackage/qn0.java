package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qn0 implements xm0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ xm0 n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ tt0 p;

    public /* synthetic */ qn0(xm0 xm0Var, Object obj, tt0 tt0Var, int i) {
        this.m = i;
        this.n = xm0Var;
        this.o = obj;
        this.p = tt0Var;
    }

    @Override // defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        int i = this.m;
        tt0 tt0Var = this.p;
        Object obj = this.o;
        xm0 xm0Var = this.n;
        switch (i) {
            case 0:
                Object j = z71.j(o30Var, ym0Var, new xk((wk) tt0Var, (o30) null, 5), new xm0[]{(vo2) xm0Var, (vo2) obj});
                if (j != b50.m) {
                    break;
                }
                break;
            default:
                Object a = xm0Var.a(new dd(ym0Var, (lb2) obj, (Function1) tt0Var, 2), o30Var);
                if (a != b50.m) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
