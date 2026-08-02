package f1;

import Y0.AbstractC0127v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f2207g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f2207g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2207g.run();
        } finally {
            this.f2205f.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2207g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0127v.b(runnable));
        sb.append(", ");
        sb.append(this.f2204e);
        sb.append(", ");
        sb.append(this.f2205f);
        sb.append(']');
        return sb.toString();
    }
}
