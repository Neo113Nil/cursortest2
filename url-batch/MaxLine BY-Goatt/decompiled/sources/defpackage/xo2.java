package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xo2 extends ap2 {
    public w0 c;
    public int d;
    public int e;

    public xo2(long j, w0 w0Var) {
        super(j);
        this.c = w0Var;
    }

    @Override // defpackage.ap2
    public final void a(ap2 ap2Var) {
        synchronized (tk3.j) {
            ap2Var.getClass();
            this.c = ((xo2) ap2Var).c;
            this.d = ((xo2) ap2Var).d;
            this.e = ((xo2) ap2Var).e;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.ap2
    public final ap2 b(long j) {
        return new xo2(j, this.c);
    }
}
