package m1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends O2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O2.l f6960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6961h;

    public l(O2.l lVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6960g = lVar;
        this.f6961h = threadPoolExecutor;
    }

    @Override // O2.l
    public final void o0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6961h;
        try {
            this.f6960g.o0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // O2.l
    public final void p0(G1.g gVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f6961h;
        try {
            this.f6960g.p0(gVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
