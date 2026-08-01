package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q1.l f802g;
    public final /* synthetic */ ThreadPoolExecutor h;

    public m(q1.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f802g = lVar;
        this.h = threadPoolExecutor;
    }

    @Override // q1.l
    public final void P(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.h;
        try {
            this.f802g.P(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q1.l
    public final void U(v vVar) {
        ThreadPoolExecutor threadPoolExecutor = this.h;
        try {
            this.f802g.U(vVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
