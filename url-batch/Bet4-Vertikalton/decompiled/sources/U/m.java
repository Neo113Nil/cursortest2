package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w1.l f859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f860f;

    public m(w1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f859e = lVar;
        this.f860f = threadPoolExecutor;
    }

    @Override // w1.l
    public final void H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f860f;
        try {
            this.f859e.H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // w1.l
    public final void K(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f860f;
        try {
            this.f859e.K(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
