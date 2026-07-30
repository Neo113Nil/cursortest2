package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u82 extends a implements u40 {
    public final /* synthetic */ i00 n;
    public final /* synthetic */ v82 o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u82(i00 i00Var, v82 v82Var) {
        super(r0);
        qb2 qb2Var = qb2.M;
        this.n = i00Var;
        this.o = v82Var;
    }

    @Override // defpackage.u40
    public final void L(Throwable th, CoroutineContext coroutineContext) {
        i00 i00Var = this.n;
        v82 v82Var = this.o;
        s93.T(th, new h00(0, i00Var, v82Var));
        CoroutineContext coroutineContext2 = v82Var.n;
        qb2 qb2Var = qb2.M;
        u40 u40Var = (u40) coroutineContext2.m(qb2Var);
        if (u40Var != null) {
            u40Var.L(th, coroutineContext);
            return;
        }
        u40 u40Var2 = (u40) v82Var.m.m(qb2Var);
        if (u40Var2 == null) {
            throw th;
        }
        u40Var2.L(th, coroutineContext);
    }
}
