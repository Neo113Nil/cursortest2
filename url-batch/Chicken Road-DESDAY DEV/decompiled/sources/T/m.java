package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l f786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f787f;

    public m(u1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f786e = lVar;
        this.f787f = threadPoolExecutor;
    }

    @Override // u1.l
    public final void K(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f787f;
        try {
            this.f786e.K(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // u1.l
    public final void P(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f787f;
        try {
            this.f786e.P(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
