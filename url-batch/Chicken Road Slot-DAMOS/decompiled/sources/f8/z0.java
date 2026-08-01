package f8;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends g0 implements RunnableFuture {

    /* renamed from: w, reason: collision with root package name */
    public volatile q0 f4204w;

    public z0(Callable callable) {
        this.f4204w = new y0(this, callable);
    }

    @Override // f8.r
    public final void c() {
        q0 q0Var;
        if (p() && (q0Var = this.f4204w) != null) {
            q0Var.c();
        }
        this.f4204w = null;
    }

    @Override // f8.r
    public final String j() {
        q0 q0Var = this.f4204w;
        if (q0Var == null) {
            return super.j();
        }
        String valueOf = String.valueOf(q0Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        q0 q0Var = this.f4204w;
        if (q0Var != null) {
            q0Var.run();
        }
        this.f4204w = null;
    }
}
