package x2;

import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f10353f;

    public j(Runnable runnable, long j3, boolean z3) {
        super(j3, z3);
        this.f10353f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10353f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f10353f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0837y.j(runnable));
        sb.append(", ");
        sb.append(this.f10351d);
        sb.append(", ");
        sb.append(this.f10352e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
