package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qk2 implements ec0 {
    public final sk2 m;
    public final long n;
    public final Object o;
    public final fs p;

    public qk2(sk2 sk2Var, long j, Object obj, fs fsVar) {
        this.m = sk2Var;
        this.n = j;
        this.o = obj;
        this.p = fsVar;
    }

    @Override // defpackage.ec0
    public final void a() {
        sk2 sk2Var = this.m;
        synchronized (sk2Var) {
            if (this.n < sk2Var.o()) {
                return;
            }
            Object[] objArr = sk2Var.t;
            objArr.getClass();
            long j = this.n;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            s93.w(objArr, j, s93.m);
            sk2Var.j();
            Unit unit = Unit.a;
        }
    }
}
