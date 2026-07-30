package u6;

import n6.AbstractC0792z;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f8113i;

    public j(Runnable runnable, long j, boolean z7) {
        super(j, z7);
        this.f8113i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8113i.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f8113i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0792z.g(runnable));
        sb.append(", ");
        sb.append(this.f8111d);
        sb.append(", ");
        sb.append(this.f8112e ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
