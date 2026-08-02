package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rm {
    public Object a;
    public rq b;
    public rs c = new rs();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        rs rsVar = this.c;
        if (rsVar != null) {
            rsVar.c(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Object obj) {
        this.d = true;
        rq rqVar = this.b;
        if (rqVar == null || !rqVar.b.e(obj)) {
            return;
        }
        b();
    }

    public final void d(Throwable th) {
        this.d = true;
        rq rqVar = this.b;
        if (rqVar == null || !rqVar.a(th)) {
            return;
        }
        b();
    }

    protected final void finalize() {
        rs rsVar;
        rq rqVar = this.b;
        if (rqVar != null && !rqVar.isDone()) {
            rqVar.a(new rn("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(String.valueOf(this.a)))));
        }
        if (this.d || (rsVar = this.c) == null) {
            return;
        }
        rsVar.e(null);
    }
}
