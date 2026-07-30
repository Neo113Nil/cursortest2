package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ nu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(nu nuVar, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.n = nuVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        nu nuVar = this.n;
        switch (i) {
            case 0:
                return new z(nuVar, o30Var, 0);
            default:
                return new z(nuVar, o30Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((z) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        o30 o30Var = null;
        nu nuVar = this.n;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                if (nuVar.N == null) {
                    cy0 cy0Var = new cy0();
                    bn1 bn1Var = nuVar.C;
                    if (bn1Var != null) {
                        z71.H(nuVar.u0(), null, new v(bn1Var, cy0Var, o30Var, 0), 3);
                    }
                    nuVar.N = cy0Var;
                }
                break;
            default:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                cy0 cy0Var2 = nuVar.N;
                if (cy0Var2 != null) {
                    dy0 dy0Var = new dy0(cy0Var2);
                    bn1 bn1Var2 = nuVar.C;
                    if (bn1Var2 != null) {
                        z71.H(nuVar.u0(), null, new v(bn1Var2, dy0Var, o30Var, 1), 3);
                    }
                    nuVar.N = null;
                }
                break;
        }
        return Unit.a;
    }
}
