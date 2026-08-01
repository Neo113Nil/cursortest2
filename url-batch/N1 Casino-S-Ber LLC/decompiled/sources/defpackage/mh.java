package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mh extends zo {
    public final /* synthetic */ zo r;
    public final /* synthetic */ ThreadPoolExecutor s;

    public mh(zo zoVar, ThreadPoolExecutor threadPoolExecutor) {
        this.r = zoVar;
        this.s = threadPoolExecutor;
    }

    @Override // defpackage.zo
    public final void A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.s;
        try {
            this.r.A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.zo
    public final void D(we weVar) {
        ThreadPoolExecutor threadPoolExecutor = this.s;
        try {
            this.r.D(weVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
