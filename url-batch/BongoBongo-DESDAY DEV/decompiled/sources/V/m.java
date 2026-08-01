package V;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A1.m f910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f911b;

    public m(A1.m mVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f910a = mVar;
        this.f911b = threadPoolExecutor;
    }

    @Override // A1.m
    public final void N(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f911b;
        try {
            this.f910a.N(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // A1.m
    public final void Q(S0.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f911b;
        try {
            this.f910a.Q(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
