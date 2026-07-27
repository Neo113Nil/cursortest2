package d3;

import A.AbstractC0017m;
import W2.B;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f6123i;

    public j(Runnable runnable, long j4, boolean z4) {
        super(j4, z4);
        this.f6123i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6123i.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f6123i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(B.f(runnable));
        sb.append(", ");
        sb.append(this.f6121d);
        sb.append(", ");
        return AbstractC0017m.m(sb, this.f6122e ? "Blocking" : "Non-blocking", ']');
    }
}
