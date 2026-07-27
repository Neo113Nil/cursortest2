package k1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class j extends M1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M1.a f7392j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f7393k;

    public j(M1.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f7392j = aVar;
        this.f7393k = threadPoolExecutor;
    }

    @Override // M1.a
    public final void K(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f7393k;
        try {
            this.f7392j.K(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // M1.a
    public final void L(Y0.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f7393k;
        try {
            this.f7392j.L(bVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
