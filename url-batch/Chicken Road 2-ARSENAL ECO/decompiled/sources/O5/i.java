package O5;

import D3.A;
import H5.AbstractC0165z;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f1821h;

    public i(Runnable runnable, long j4, A a7) {
        super(j4, a7);
        this.f1821h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1821h.run();
        } finally {
            this.f1820g.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1821h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0165z.g(runnable));
        sb.append(", ");
        sb.append(this.f1819f);
        sb.append(", ");
        sb.append(this.f1820g);
        sb.append(']');
        return sb.toString();
    }
}
