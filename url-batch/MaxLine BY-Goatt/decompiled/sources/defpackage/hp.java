package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hp extends o81 implements Function1 {
    public final /* synthetic */ n12[] m;
    public final /* synthetic */ List n;
    public final /* synthetic */ qj1 o;
    public final /* synthetic */ a82 p;
    public final /* synthetic */ a82 q;
    public final /* synthetic */ ip r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(n12[] n12VarArr, List list, qj1 qj1Var, a82 a82Var, a82 a82Var2, ip ipVar) {
        super(1);
        this.m = n12VarArr;
        this.n = list;
        this.o = qj1Var;
        this.p = a82Var;
        this.q = a82Var2;
        this.r = ipVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m12 m12Var = (m12) obj;
        n12[] n12VarArr = this.m;
        int length = n12VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i;
            n12 n12Var = n12VarArr[i2];
            n12Var.getClass();
            fp.b(m12Var, n12Var, (jj1) this.n.get(i3), this.o.getLayoutDirection(), this.p.m, this.q.m, this.r.a);
            i2++;
            i = i3 + 1;
        }
        return Unit.a;
    }
}
