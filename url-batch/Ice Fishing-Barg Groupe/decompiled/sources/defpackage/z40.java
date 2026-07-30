package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z40 extends bs0 {
    public final /* synthetic */ bs0 kpCQ9veP6n3I;
    public final /* synthetic */ ThreadPoolExecutor rZjpSjn4zoMv;

    public z40(bs0 bs0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.kpCQ9veP6n3I = bs0Var;
        this.rZjpSjn4zoMv = threadPoolExecutor;
    }

    @Override // defpackage.bs0
    public final void IAToe7bXGz4N(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.rZjpSjn4zoMv;
        try {
            this.kpCQ9veP6n3I.IAToe7bXGz4N(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.bs0
    public final void e6tOsSdd2EFb(e0 e0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.rZjpSjn4zoMv;
        try {
            this.kpCQ9veP6n3I.e6tOsSdd2EFb(e0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
