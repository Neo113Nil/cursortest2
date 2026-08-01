package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.d f726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f727f;

    public l(q1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f726e = dVar;
        this.f727f = threadPoolExecutor;
    }

    @Override // q1.d
    public final void b0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f727f;
        try {
            this.f726e.b0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.d
    public final void e0(t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f727f;
        try {
            this.f726e.e0(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
