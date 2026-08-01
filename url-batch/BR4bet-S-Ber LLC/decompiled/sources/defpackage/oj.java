package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oj extends b9 {
    public final /* synthetic */ b9 x;
    public final /* synthetic */ ThreadPoolExecutor y;

    public oj(b9 b9Var, ThreadPoolExecutor threadPoolExecutor) {
        this.x = b9Var;
        this.y = threadPoolExecutor;
    }

    @Override // defpackage.b9
    public final void C(rg rgVar) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.C(rgVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.b9
    public final void y(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.y;
        try {
            this.x.y(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
