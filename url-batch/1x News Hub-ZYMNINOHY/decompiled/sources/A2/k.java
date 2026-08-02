package A2;

import t2.AbstractC1212w;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f60c;

    public k(Runnable runnable, long j3, j jVar) {
        super(j3, jVar);
        this.f60c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f60c.run();
        } finally {
            this.f58b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f60c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1212w.c(runnable));
        sb.append(", ");
        sb.append(this.f57a);
        sb.append(", ");
        sb.append(this.f58b);
        sb.append(']');
        return sb.toString();
    }
}
