package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cm extends bi {
    public final /* synthetic */ bi o;
    public final /* synthetic */ ThreadPoolExecutor p;

    public cm(bi biVar, ThreadPoolExecutor threadPoolExecutor) {
        this.o = biVar;
        this.p = threadPoolExecutor;
    }

    @Override // defpackage.bi
    public final void L(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.p;
        try {
            this.o.L(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.bi
    public final void Q(wi wiVar) {
        ThreadPoolExecutor threadPoolExecutor = this.p;
        try {
            this.o.Q(wiVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
