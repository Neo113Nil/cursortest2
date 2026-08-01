package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ih0 extends hh0 {
    public final Runnable h;

    public ih0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(bi.D(runnable));
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
