package T0;

import M0.AbstractC0063v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f977g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f977g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f977g.run();
        } finally {
            this.f975f.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f977g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0063v.b(runnable));
        sb.append(", ");
        sb.append(this.f974e);
        sb.append(", ");
        sb.append(this.f975f);
        sb.append(']');
        return sb.toString();
    }
}
