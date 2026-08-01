package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j80 extends i80 {
    public final Runnable h;

    public j80(Runnable runnable, long j, boolean z) {
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
        sb.append(xf.s(runnable));
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
