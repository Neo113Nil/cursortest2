package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m21 extends a implements mn {
    public final /* synthetic */ rl e;
    public final /* synthetic */ n21 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m21(rl rlVar, n21 n21Var) {
        super(r0);
        j50 j50Var = j50.u;
        this.e = rlVar;
        this.g = n21Var;
    }

    @Override // defpackage.mn
    public final void y(Throwable th, CoroutineContext coroutineContext) {
        rl rlVar = this.e;
        n21 n21Var = this.g;
        yr1.e0(th, new vc(rlVar, 1, n21Var));
        CoroutineContext coroutineContext2 = n21Var.e;
        j50 j50Var = j50.u;
        mn mnVar = (mn) coroutineContext2.d(j50Var);
        if (mnVar != null) {
            mnVar.y(th, coroutineContext);
            return;
        }
        mn mnVar2 = (mn) n21Var.d.d(j50Var);
        if (mnVar2 == null) {
            throw th;
        }
        mnVar2.y(th, coroutineContext);
    }
}
