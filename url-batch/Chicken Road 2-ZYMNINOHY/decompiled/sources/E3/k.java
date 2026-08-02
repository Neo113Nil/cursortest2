package E3;

import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f717c;

    public k(Runnable runnable, long j4, j jVar) {
        super(j4, jVar);
        this.f717c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f717c.run();
        } finally {
            this.f715b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f717c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1562w.c(runnable));
        sb.append(", ");
        sb.append(this.f714a);
        sb.append(", ");
        sb.append(this.f715b);
        sb.append(']');
        return sb.toString();
    }
}
