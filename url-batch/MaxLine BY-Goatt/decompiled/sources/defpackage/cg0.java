package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cg0 extends s93 {
    public final /* synthetic */ s93 s;
    public final /* synthetic */ ThreadPoolExecutor t;

    public cg0(s93 s93Var, ThreadPoolExecutor threadPoolExecutor) {
        this.s = s93Var;
        this.t = threadPoolExecutor;
    }

    @Override // defpackage.s93
    public final void K(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.t;
        try {
            this.s.K(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.s93
    public final void L(js0 js0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.t;
        try {
            this.s.L(js0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
