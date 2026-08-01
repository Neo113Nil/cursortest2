package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l f801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f802f;

    public m(u1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f801e = lVar;
        this.f802f = threadPoolExecutor;
    }

    @Override // u1.l
    public final void U(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f802f;
        try {
            this.f801e.U(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // u1.l
    public final void Z(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f802f;
        try {
            this.f801e.Z(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
