package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pg1 extends mg1 {
    public final Runnable g;

    public pg1(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(op.y(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
