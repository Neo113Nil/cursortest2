package ne;

import ge.a0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f7282i;

    public i(Runnable runnable, long j, boolean z10) {
        super(z10, j);
        this.f7282i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7282i.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f7282i;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(a0.m(runnable));
        sb2.append(", ");
        sb2.append(this.f7280d);
        sb2.append(", ");
        return n0.l.h(sb2, this.f7281e ? "Blocking" : "Non-blocking", ']');
    }
}
