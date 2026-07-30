package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i5 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ ij1 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5(ij1 ij1Var, long j, Object obj, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = ij1Var;
        this.p = j;
        this.q = obj;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new i5(this.o, this.p, (Function0) obj2, o30Var, 0);
            default:
                return new i5(this.o, this.p, (a61) obj2, o30Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((i5) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        Object obj2 = this.q;
        final long j = this.p;
        ij1 ij1Var = this.o;
        switch (i) {
            case 0:
                Object obj3 = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    z51 z51Var = ij1Var.c;
                    Object T = l41.T(z51Var.a, new x51(z51Var, j, null), this);
                    if (T != obj3) {
                        T = Unit.a;
                    }
                    if (T != obj3) {
                        T = Unit.a;
                    }
                    if (T == obj3) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                ((Function0) obj2).invoke();
                break;
            default:
                Object obj4 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    final boolean z = !((a61) obj2).l;
                    this.n = 1;
                    Object U = l41.U(this, ij1Var.c.a, new Function1() { // from class: w51
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            boolean z2 = z;
                            long j2 = j;
                            nc2 nc2Var = (nc2) obj5;
                            nc2Var.getClass();
                            uc2 M = nc2Var.M("UPDATE jewelry_item SET favourite = ? WHERE id = ?");
                            try {
                                M.d(z2 ? 1L : 0L, 1);
                                M.d(j2, 2);
                                M.E();
                                M.close();
                                return Unit.a;
                            } catch (Throwable th) {
                                M.close();
                                throw th;
                            }
                        }
                    }, false, true);
                    if (U != obj4) {
                        U = Unit.a;
                    }
                    if (U != obj4) {
                        U = Unit.a;
                    }
                    if (U == obj4) {
                        break;
                    }
                } else if (i3 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }
}
