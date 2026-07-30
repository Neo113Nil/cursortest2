package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class k extends S0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0.f f4896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f4897e;

    public k(S0.f fVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4896d = fVar;
        this.f4897e = threadPoolExecutor;
    }

    @Override // S0.f
    public final void o(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4897e;
        try {
            this.f4896d.o(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // S0.f
    public final void p(f4.p pVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f4897e;
        try {
            this.f4896d.p(pVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
