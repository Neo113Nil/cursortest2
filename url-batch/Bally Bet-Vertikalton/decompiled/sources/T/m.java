package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.d f737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f738f;

    public m(q1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f737e = dVar;
        this.f738f = threadPoolExecutor;
    }

    @Override // q1.d
    public final void c0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f738f;
        try {
            this.f737e.c0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.d
    public final void f0(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f738f;
        try {
            this.f737e.f0(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
