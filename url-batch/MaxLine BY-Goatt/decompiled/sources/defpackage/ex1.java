package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ex1 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ du2 o;
    public final /* synthetic */ fk2 p;
    public final /* synthetic */ b41 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(boolean z, b41 b41Var, du2 du2Var, fk2 fk2Var, int i) {
        super(2);
        this.m = i;
        this.n = z;
        this.q = b41Var;
        this.o = du2Var;
        this.p = fk2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    qb2.e0.j(this.n, (bn1) this.q, null, this.o, this.p, 0.0f, 0.0f, a00Var, 100663296, 200);
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    by1.C.l(this.n, this.q, this.o, this.p, a00Var2, 114822144);
                }
                break;
        }
        return Unit.a;
    }
}
