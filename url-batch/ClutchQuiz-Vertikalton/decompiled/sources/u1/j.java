package u1;

import o1.AbstractC0299s;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3771c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f3771c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3771c.run();
        } finally {
            this.f3769b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3771c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0299s.d(runnable));
        sb.append(", ");
        sb.append(this.f3768a);
        sb.append(", ");
        sb.append(this.f3769b);
        sb.append(']');
        return sb.toString();
    }
}
