package c4;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.a f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1771b;

    public n(a.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1770a = aVar;
        this.f1771b = threadPoolExecutor;
    }

    @Override // a.a
    public final void R(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1771b;
        try {
            this.f1770a.R(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.a
    public final void S(c6.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1771b;
        try {
            this.f1770a.S(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
