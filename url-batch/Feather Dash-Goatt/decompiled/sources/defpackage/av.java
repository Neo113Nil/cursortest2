package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class av extends la0 {
    public final /* synthetic */ la0 x;
    public final /* synthetic */ ThreadPoolExecutor y;

    public av(la0 la0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.x = la0Var;
        this.y = threadPoolExecutor;
    }

    @Override // defpackage.la0
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.la0
    public final void P(o91 o91Var) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.P(o91Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
