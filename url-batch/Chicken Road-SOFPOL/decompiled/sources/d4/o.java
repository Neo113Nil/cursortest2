package d4;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends a.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a.a f2280k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2281l;

    public o(a.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2280k = aVar;
        this.f2281l = threadPoolExecutor;
    }

    @Override // a.a
    public final void t(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2281l;
        try {
            this.f2280k.t(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.a
    public final void u(c5.x xVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f2281l;
        try {
            this.f2280k.u(xVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
