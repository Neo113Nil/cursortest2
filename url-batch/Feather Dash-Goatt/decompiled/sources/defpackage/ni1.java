package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ni1 extends y61 implements Runnable {
    public final long k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ni1(long j, oi1 oi1Var) {
        super(oi1Var, r0);
        CoroutineContext coroutineContext = oi1Var.e;
        coroutineContext.getClass();
        this.k = j;
    }

    @Override // defpackage.qb0
    public final String a0() {
        return super.a0() + "(timeMillis=" + this.k + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        mo.r(this.i);
        E(new mi1("Timed out waiting for " + this.k + " ms", this));
    }
}
