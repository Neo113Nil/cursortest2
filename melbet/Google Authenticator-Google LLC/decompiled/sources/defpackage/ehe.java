package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehe implements egc {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    private final Object d;

    public ehe(ExecutorService executorService, hac hacVar, int i) {
        this.c = i;
        this.b = new AtomicReference();
        this.d = hnu.aB(executorService);
        this.a = hoq.v(hacVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final hvi g(gzf gzfVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        return atomicReference.get() != null ? (hvi) gzfVar.a((egc) atomicReference.get()) : gwu.g(hoq.ar(new avc(this.a, 8), this.d)).i(new egl(this, gzfVar, 1), huf.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [hvl, java.lang.Object] */
    private final void h(Runnable runnable) {
        if (((AtomicReference) this.b).get() != null) {
            runnable.run();
        } else {
            this.d.execute(gvx.h(new drn(this, runnable, 13)));
        }
    }

    @Override // defpackage.egc
    public final hvi a() {
        return this.c != 0 ? g(new drv(4)) : ((gva) this.b).g(true);
    }

    @Override // defpackage.egc
    public final hvi b() {
        return this.c != 0 ? g(new drv(5)) : ((gva) this.b).g(false);
    }

    @Override // defpackage.egc
    public final hvi c(String str, int i) {
        return this.c != 0 ? g(new ege(str, i, 1)) : ((gva) this.d).h(true, str, i);
    }

    @Override // defpackage.egc
    public final hvi d(String str, int i) {
        return this.c != 0 ? g(new ege(str, i, 0)) : ((gva) this.d).h(false, str, i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [egc, java.lang.Object] */
    @Override // defpackage.egc
    public final void e(ehn ehnVar) {
        if (this.c != 0) {
            h(new drn(this, ehnVar, 14, null));
        } else {
            this.a.e(ehnVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [egc, java.lang.Object] */
    @Override // defpackage.egc
    public final void f(ehn ehnVar) {
        if (this.c != 0) {
            h(new drn(this, ehnVar, 12, null));
        } else {
            this.a.f(ehnVar);
        }
    }

    public ehe(egc egcVar, int i, fwm fwmVar, String str, int i2) {
        this.c = i2;
        this.a = egcVar;
        this.b = new gva(egcVar, i, fwmVar, str);
        this.d = new gva(egcVar, i, fwmVar, str);
    }
}
