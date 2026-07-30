package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class su2 extends o81 implements xt0 {
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ch2 p;
    public final /* synthetic */ bn1 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ fk2 t;
    public final /* synthetic */ du2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(String str, boolean z, boolean z2, ch2 ch2Var, bn1 bn1Var, Function2 function2, Function2 function22, fk2 fk2Var, du2 du2Var) {
        super(3);
        this.m = str;
        this.n = z;
        this.o = z2;
        this.p = ch2Var;
        this.q = bn1Var;
        this.r = function2;
        this.s = function22;
        this.t = fk2Var;
        this.u = du2Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        a00 a00Var = (a00) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= a00Var.h(function2) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            by1.C.m(this.m, function2, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, null, null, a00Var, (intValue << 3) & 112);
        }
        return Unit.a;
    }
}
