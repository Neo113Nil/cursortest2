package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kes extends kgv {
    private final kfr a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile kbq c;

    public kes(kfr kfrVar, String str) {
        this.a = kfrVar;
        str.getClass();
    }

    @Override // defpackage.kgv, defpackage.kfj
    public final kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        return this.b.get() >= 0 ? new kgp(this.c, jxbVarArr) : this.a.a(kaeVar, kaaVar, jwwVar, jxbVarArr);
    }

    @Override // defpackage.kgv
    protected final kfr d() {
        return this.a;
    }

    @Override // defpackage.kgv, defpackage.kjb
    public final void e(kbq kbqVar) {
        kbqVar.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.b;
            if (atomicInteger.get() < 0) {
                this.c = kbqVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    return;
                }
                super.e(kbqVar);
            }
        }
    }
}
