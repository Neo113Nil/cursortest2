package l3;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends a8.m {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a8.m f5918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5919h;

    public m(a8.m mVar, ThreadPoolExecutor threadPoolExecutor) {
        super(16);
        this.f5918g = mVar;
        this.f5919h = threadPoolExecutor;
    }

    @Override // a8.m
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5919h;
        try {
            this.f5918g.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a8.m
    public final void G(g3.k kVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5919h;
        try {
            this.f5918g.G(kVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
