package y1;

import s1.AbstractC0335s;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4599c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f4599c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4599c.run();
        } finally {
            this.f4597b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4599c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0335s.c(runnable));
        sb.append(", ");
        sb.append(this.f4596a);
        sb.append(", ");
        sb.append(this.f4597b);
        sb.append(']');
        return sb.toString();
    }
}
