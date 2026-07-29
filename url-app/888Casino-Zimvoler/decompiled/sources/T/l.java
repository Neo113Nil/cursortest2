package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.d f727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f728f;

    public l(q1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f727e = dVar;
        this.f728f = threadPoolExecutor;
    }

    @Override // q1.d
    public final void b0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f728f;
        try {
            this.f727e.b0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.d
    public final void e0(t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f728f;
        try {
            this.f727e.e0(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
