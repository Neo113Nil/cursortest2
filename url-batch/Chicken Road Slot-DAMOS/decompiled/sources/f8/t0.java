package f8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 extends k implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f4181v;

    public t0(Runnable runnable) {
        runnable.getClass();
        this.f4181v = runnable;
    }

    @Override // f8.r
    public final String j() {
        String valueOf = String.valueOf(this.f4181v);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
        sb2.append("task=[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4181v.run();
        } catch (Throwable th) {
            m(th);
            Object obj = a8.q.f367a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
