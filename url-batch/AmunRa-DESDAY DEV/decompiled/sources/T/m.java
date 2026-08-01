package T;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.d f776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f777b;

    public m(s1.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f776a = dVar;
        this.f777b = threadPoolExecutor;
    }

    @Override // s1.d
    public final void T(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f777b;
        try {
            this.f776a.T(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // s1.d
    public final void U(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f777b;
        try {
            this.f776a.U(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
