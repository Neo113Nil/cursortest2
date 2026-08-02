package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbs extends kum implements kxm {
    public final lbr b;

    public lbs(kqn kqnVar) {
        super(kqnVar, true);
        this.b = new lbr(this);
    }

    @Override // defpackage.kum
    protected final void bZ(Throwable th, boolean z) {
        lbr lbrVar = this.b;
        if (th instanceof CancellationException) {
            lbrVar.a.o(new lbq((CancellationException) th));
        } else if (lbrVar.a.p(th)) {
            lbrVar.b = true;
        }
    }

    @Override // defpackage.kqx
    public final /* synthetic */ StackTraceElement f() {
        return kxp.a(this);
    }

    @Override // defpackage.kqx
    public final /* synthetic */ kqx g() {
        return ixi.f(this);
    }

    @Override // defpackage.kum
    protected final void k(Object obj) {
        this.b.a.o(obj);
    }

    @Override // defpackage.kxr
    public final /* synthetic */ StackTraceElement m() {
        return kxq.d;
    }
}
