package K4;

import D4.AbstractC0024y;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1444c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1444c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1444c.run();
        } finally {
            this.f1442b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1444c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0024y.h(runnable));
        sb.append(", ");
        sb.append(this.f1441a);
        sb.append(", ");
        sb.append(this.f1442b);
        sb.append(']');
        return sb.toString();
    }
}
