package r2;

import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f7328f;

    public j(Runnable runnable, long j3, boolean z3) {
        super(j3, z3);
        this.f7328f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7328f.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7328f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0552y.i(runnable));
        sb.append(", ");
        sb.append(this.f7326d);
        sb.append(", ");
        sb.append(this.f7327e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
