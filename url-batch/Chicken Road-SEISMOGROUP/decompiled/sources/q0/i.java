package q0;

import E.D;
import k0.AbstractC0058t;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1217d;

    public i(Runnable runnable, long j2, D d2) {
        super(j2, d2);
        this.f1217d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1217d.run();
        } finally {
            this.f1216c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1217d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0058t.a(runnable));
        sb.append(", ");
        sb.append(this.f1215b);
        sb.append(", ");
        sb.append(this.f1216c);
        sb.append(']');
        return sb.toString();
    }
}
