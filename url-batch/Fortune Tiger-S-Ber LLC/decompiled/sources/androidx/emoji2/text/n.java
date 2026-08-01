package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k3.m f348k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f349l;

    public n(k3.m mVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f348k = mVar;
        this.f349l = threadPoolExecutor;
    }

    @Override // k3.m
    public final void J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f349l;
        try {
            this.f348k.J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // k3.m
    public final void M(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f349l;
        try {
            this.f348k.M(wVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
