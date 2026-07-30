package q1;

import e0.c0;
import k1.t;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1116d;

    public h(Runnable runnable, long j2, c0 c0Var) {
        super(j2, c0Var);
        this.f1116d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1116d.run();
        } finally {
            this.f1115c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1116d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(t.a(runnable));
        sb.append(", ");
        sb.append(this.f1114b);
        sb.append(", ");
        sb.append(this.f1115c);
        sb.append(']');
        return sb.toString();
    }
}
