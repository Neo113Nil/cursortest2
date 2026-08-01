package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b4.d f463o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f464p;

    public n(b4.d dVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f463o = dVar;
        this.f464p = threadPoolExecutor;
    }

    @Override // b4.d
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f464p;
        try {
            this.f463o.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // b4.d
    public final void K(a0.k kVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f464p;
        try {
            this.f463o.K(kVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
