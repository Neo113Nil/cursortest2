package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.d f813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f814f;

    public m(x1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f813e = dVar;
        this.f814f = threadPoolExecutor;
    }

    @Override // x1.d
    public final void M(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f814f;
        try {
            this.f813e.M(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // x1.d
    public final void R(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f814f;
        try {
            this.f813e.R(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
