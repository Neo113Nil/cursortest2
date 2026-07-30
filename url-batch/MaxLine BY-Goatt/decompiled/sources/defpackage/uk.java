package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uk extends o81 implements yt0 {
    public final /* synthetic */ List m;
    public final /* synthetic */ nh n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ so2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(List list, nh nhVar, Function1 function1, so2 so2Var) {
        super(4);
        this.m = list;
        this.n = nhVar;
        this.o = function1;
        this.p = so2Var;
    }

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5 = (ha1) obj;
        int intValue = ((Number) obj2).intValue();
        a00 a00Var = (a00) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (a00Var.f(obj5) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= a00Var.d(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            ik ikVar = (ik) this.m.get(intValue);
            a00Var.X(-1708359255);
            vk vkVar = (vk) this.p.getValue();
            String str = ikVar.a;
            vkVar.getClass();
            str.getClass();
            kk kkVar = (kk) vkVar.d.get(str);
            boolean z = kkVar != null && kkVar.b;
            Function1 function1 = this.o;
            boolean f = a00Var.f(function1) | a00Var.h(ikVar);
            Object M = a00Var.M();
            if (f || M == sz.a) {
                M = new sk(function1, ikVar, 0);
                a00Var.i0(M);
            }
            s93.c(ikVar, z, this.n, (Function0) M, a00Var, 0);
            a00Var.q(false);
        }
        return Unit.a;
    }
}
