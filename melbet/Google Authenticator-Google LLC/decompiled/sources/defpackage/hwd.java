package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwd extends hun implements RunnableFuture {
    private volatile hvg a;

    public hwd(htq htqVar) {
        this.a = new hwb(this, htqVar);
    }

    public static hwd d(Runnable runnable, Object obj) {
        return new hwd(Executors.callable(runnable, obj));
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvg hvgVar = this.a;
        return hvgVar != null ? a.aa(hvgVar, "task=[", "]") : super.a();
    }

    @Override // defpackage.hsw
    protected final void b() {
        hvg hvgVar;
        if (r() && (hvgVar = this.a) != null) {
            hvgVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        hvg hvgVar = this.a;
        if (hvgVar != null) {
            hvgVar.run();
        }
        this.a = null;
    }

    public hwd(Callable callable) {
        this.a = new hwc(this, callable);
    }
}
