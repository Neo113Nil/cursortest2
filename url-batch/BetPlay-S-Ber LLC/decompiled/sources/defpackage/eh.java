package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class eh extends j8 {
    public final /* synthetic */ j8 k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public eh(j8 j8Var, ThreadPoolExecutor threadPoolExecutor) {
        this.k = j8Var;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.j8
    public final void G(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.G(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.j8
    public final void H(h8 h8Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.H(h8Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
