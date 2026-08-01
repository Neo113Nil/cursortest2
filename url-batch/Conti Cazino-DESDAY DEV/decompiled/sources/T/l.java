package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.d f732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f733f;

    public l(q1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f732e = dVar;
        this.f733f = threadPoolExecutor;
    }

    @Override // q1.d
    public final void c0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f733f;
        try {
            this.f732e.c0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.d
    public final void f0(t tVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f733f;
        try {
            this.f732e.f0(tVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
