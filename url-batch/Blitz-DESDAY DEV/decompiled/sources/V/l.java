package V;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.d f896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f897f;

    public l(z1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f896e = dVar;
        this.f897f = threadPoolExecutor;
    }

    @Override // z1.d
    public final void M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f897f;
        try {
            this.f896e.M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // z1.d
    public final void N(T0.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f897f;
        try {
            this.f896e.N(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
