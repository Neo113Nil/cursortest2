package U;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V6.b f2676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2677c;

    public l(V6.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        super(10);
        this.f2676b = bVar;
        this.f2677c = threadPoolExecutor;
    }

    @Override // V6.b
    public final void G(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f2677c;
        try {
            this.f2676b.G(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // V6.b
    public final void H(P0.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f2677c;
        try {
            this.f2676b.H(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
