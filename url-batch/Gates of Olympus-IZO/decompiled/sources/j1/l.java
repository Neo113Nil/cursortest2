package j1;

import h.AbstractC0416e;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends AbstractC0416e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0416e f5270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5271b;

    public l(AbstractC0416e abstractC0416e, ThreadPoolExecutor threadPoolExecutor) {
        this.f5270a = abstractC0416e;
        this.f5271b = threadPoolExecutor;
    }

    @Override // h.AbstractC0416e
    public final void x(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5271b;
        try {
            this.f5270a.x(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // h.AbstractC0416e
    public final void y(A2.k kVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f5271b;
        try {
            this.f5270a.y(kVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
