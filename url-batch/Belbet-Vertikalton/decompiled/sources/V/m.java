package V;

import a.AbstractC0058a;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends AbstractC0058a {
    public final /* synthetic */ AbstractC0058a e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1287f;

    public m(AbstractC0058a abstractC0058a, ThreadPoolExecutor threadPoolExecutor) {
        this.e = abstractC0058a;
        this.f1287f = threadPoolExecutor;
    }

    @Override // a.AbstractC0058a
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1287f;
        try {
            this.e.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.AbstractC0058a
    public final void P(v vVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1287f;
        try {
            this.e.P(vVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
