package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements t30 {
    public final /* synthetic */ b6 d;

    public /* synthetic */ a6(b6 b6Var) {
        this.d = b6Var;
    }

    @Override // defpackage.t30
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        b6 b6Var = this.d;
        dk1 b = ((x10) b6Var.i).b((w10) obj, (x20) obj2, ((t20) obj3).a, ((u20) obj4).a);
        if (b instanceof ck1) {
            Object obj5 = ((ck1) b).d;
            obj5.getClass();
            return (Typeface) obj5;
        }
        i8 i8Var = new i8(b, b6Var.n);
        b6Var.n = i8Var;
        Object obj6 = i8Var.h;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
