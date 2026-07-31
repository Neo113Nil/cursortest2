package h7;

import a7.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f3243f;

    public j(Runnable runnable, long j7, boolean z3) {
        super(j7, z3);
        this.f3243f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3243f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3243f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(x.g(runnable));
        sb.append(", ");
        sb.append(this.f3241d);
        sb.append(", ");
        sb.append(this.f3242e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
