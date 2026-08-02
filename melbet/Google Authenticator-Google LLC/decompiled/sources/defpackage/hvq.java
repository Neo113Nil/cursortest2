package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hvq extends hsv implements Runnable {
    private final Runnable a;

    public hvq(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.hsw
    protected final String a() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            p(th);
            throw th;
        }
    }
}
