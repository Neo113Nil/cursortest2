package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uo1 extends o81 implements yt0 {
    public final /* synthetic */ List m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo1(List list, Function1 function1) {
        super(4);
        this.m = list;
        this.n = function1;
    }

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ha1 ha1Var = (ha1) obj;
        int intValue = ((Number) obj2).intValue();
        a00 a00Var = (a00) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (a00Var.f(ha1Var) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= a00Var.d(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            a61 a61Var = (a61) this.m.get(intValue);
            a00Var.X(-1271244506);
            Function1 function1 = this.n;
            boolean f = a00Var.f(function1) | a00Var.f(a61Var);
            Object M = a00Var.M();
            if (f || M == sz.a) {
                M = new sk(function1, a61Var, 2);
                a00Var.i0(M);
            }
            s93.k(a61Var, (Function0) M, a00Var, 0);
            a00Var.q(false);
        }
        return Unit.a;
    }
}
