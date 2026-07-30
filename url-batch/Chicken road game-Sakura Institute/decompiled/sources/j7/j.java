package j7;

import c7.a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f5158h;

    public j(Runnable runnable, long j8, boolean z8) {
        super(j8, z8);
        this.f5158h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5158h.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5158h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.i(runnable));
        sb.append(", ");
        sb.append(this.f5156f);
        sb.append(", ");
        sb.append(this.f5157g ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
