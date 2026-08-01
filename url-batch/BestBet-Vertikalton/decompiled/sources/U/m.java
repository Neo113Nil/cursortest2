package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H1.d f1101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1102f;

    public m(H1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1101e = dVar;
        this.f1102f = threadPoolExecutor;
    }

    @Override // H1.d
    public final void S(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1102f;
        try {
            this.f1101e.S(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // H1.d
    public final void V(T0.m mVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1102f;
        try {
            this.f1101e.V(mVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
