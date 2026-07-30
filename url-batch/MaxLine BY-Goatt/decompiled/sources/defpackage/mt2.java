package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mt2 extends ht2 {
    public final Runnable o;

    public mt2(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.o;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(o70.x(runnable));
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        return in1.m(sb, this.n ? "Blocking" : "Non-blocking", ']');
    }
}
