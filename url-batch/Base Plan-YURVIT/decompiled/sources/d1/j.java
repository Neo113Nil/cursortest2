package d1;

import W0.AbstractC0081v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f1837g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1837g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1837g.run();
        } finally {
            this.f1835f.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1837g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0081v.b(runnable));
        sb.append(", ");
        sb.append(this.f1834e);
        sb.append(", ");
        sb.append(this.f1835f);
        sb.append(']');
        return sb.toString();
    }
}
