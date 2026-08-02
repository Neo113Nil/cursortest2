package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldq extends ldp {
    public final Runnable a;

    public ldq(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String a = kvp.a(runnable);
        String b = kvp.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = ldr.a;
        return "Task[" + a + "@" + b + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
