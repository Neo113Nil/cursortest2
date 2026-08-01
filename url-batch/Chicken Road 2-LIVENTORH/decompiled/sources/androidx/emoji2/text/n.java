package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n extends a.y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a.y f343n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f344o;

    public n(a.y yVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f343n = yVar;
        this.f344o = threadPoolExecutor;
    }

    @Override // a.y
    public final void L(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f344o;
        try {
            this.f343n.L(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.y
    public final void O(a0.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f344o;
        try {
            this.f343n.O(jVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
