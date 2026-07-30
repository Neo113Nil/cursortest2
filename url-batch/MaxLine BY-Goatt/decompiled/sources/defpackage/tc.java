package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tc extends o81 implements Function1 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(n12[] n12VarArr, uc ucVar, int i, int i2) {
        super(1);
        this.p = n12VarArr;
        this.q = ucVar;
        this.n = i;
        this.o = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r3 == null) goto L9;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object k80Var;
        int i = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        int i2 = this.o;
        int i3 = this.n;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                uc ucVar = (uc) obj2;
                for (n12 n12Var : (n12[]) obj3) {
                    if (n12Var != null) {
                        long a = ucVar.a.b.a(zm3.d(n12Var.m, n12Var.n), zm3.d(i3, i2), u81.m);
                        m12.g(m12Var, n12Var, (int) (a >> 32), (int) (a & 4294967295L));
                    }
                }
                break;
            default:
                g41 g41Var = (g41) obj;
                Function1 key = g41Var.c.getKey();
                int i4 = g41Var.a;
                int max = Math.max(i3, i4);
                int min = Math.min(i2, (g41Var.b + i4) - 1);
                if (max <= min) {
                    while (true) {
                        if (key != null) {
                            k80Var = key.invoke(Integer.valueOf(max - i4));
                            break;
                        }
                        k80Var = new k80(max);
                        ((hn1) obj3).h(max, k80Var);
                        yf yfVar = (yf) obj2;
                        ((Object[]) yfVar.p)[max - yfVar.n] = k80Var;
                        if (max != min) {
                            max++;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(int i, int i2, hn1 hn1Var, yf yfVar) {
        super(1);
        this.n = i;
        this.o = i2;
        this.p = hn1Var;
        this.q = yfVar;
    }
}
