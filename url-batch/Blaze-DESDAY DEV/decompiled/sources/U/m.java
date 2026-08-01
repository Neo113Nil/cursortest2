package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.l f868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f869f;

    public m(z1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f868e = lVar;
        this.f869f = threadPoolExecutor;
    }

    @Override // z1.l
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f869f;
        try {
            this.f868e.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // z1.l
    public final void J(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f869f;
        try {
            this.f868e.J(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
