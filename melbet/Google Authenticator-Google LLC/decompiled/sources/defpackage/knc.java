package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knc extends ixf {
    final /* synthetic */ kwu a;
    final /* synthetic */ kys b;
    final /* synthetic */ kbg c;
    final /* synthetic */ kuq d;
    private boolean e = true;

    public knc(kwu kwuVar, kys kysVar, kbg kbgVar, kuq kuqVar) {
        this.a = kwuVar;
        this.b = kysVar;
        this.c = kbgVar;
        this.d = kuqVar;
    }

    @Override // defpackage.ixf
    public final void a() {
        this.a.s(ixh.c("Cancellation received from client", null));
    }

    @Override // defpackage.ixf
    public final void c() {
        this.b.u(null);
    }

    @Override // defpackage.ixf
    public final void d(Object obj) {
        if (this.e) {
            Object j = this.b.j(obj);
            boolean z = j instanceof kyv;
            this.e = !z;
            if (z) {
                Throwable b = kyw.b(j);
                if (!(b instanceof CancellationException)) {
                    throw new kbr(kbq.k.e("onMessage should never be called when requestsChannel is unready").d(b));
                }
            }
        }
        if (this.e) {
            return;
        }
        this.c.f();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kys] */
    @Override // defpackage.ixf
    public final void e() {
        Object j = this.d.a.j(kow.a);
        if (j instanceof kyv) {
            Throwable b = kyw.b(j);
            if (b != null) {
                throw b;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
