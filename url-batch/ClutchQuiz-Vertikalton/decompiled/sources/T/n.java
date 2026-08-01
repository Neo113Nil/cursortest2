package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class n extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f829b;

    public n(d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f828a = dVar;
        this.f829b = threadPoolExecutor;
    }

    @Override // T.d
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f829b;
        try {
            this.f828a.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // T.d
    public final void E(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f829b;
        try {
            this.f828a.E(wVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
