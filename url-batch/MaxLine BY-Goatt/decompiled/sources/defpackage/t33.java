package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t33 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ u33 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t33(u33 u33Var, int i) {
        super(1);
        this.m = i;
        this.n = u33Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        u33 u33Var = this.n;
        switch (i) {
            case 0:
                u33Var.d = true;
                u33Var.f.invoke();
                return Unit.a;
            default:
                yd0 yd0Var = (yd0) obj;
                ow0 ow0Var = u33Var.b;
                float f = u33Var.k;
                float f2 = u33Var.l;
                mh F = yd0Var.F();
                long v = F.v();
                F.o().m();
                try {
                    ((ar0) F.n).y(f, f2, 0L);
                    ow0Var.a(yd0Var);
                    F.o().j();
                    F.J(v);
                    return Unit.a;
                } catch (Throwable th) {
                    F.o().j();
                    F.J(v);
                    throw th;
                }
        }
    }
}
