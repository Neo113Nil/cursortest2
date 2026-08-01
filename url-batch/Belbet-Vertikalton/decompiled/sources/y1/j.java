package y1;

import r1.AbstractC0369t;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4754c;

    public j(Runnable runnable, long j, i iVar) {
        super(j, iVar);
        this.f4754c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4754c.run();
        } finally {
            this.f4752b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4754c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0369t.c(runnable));
        sb.append(", ");
        sb.append(this.f4751a);
        sb.append(", ");
        sb.append(this.f4752b);
        sb.append(']');
        return sb.toString();
    }
}
