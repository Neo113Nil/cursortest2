package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fdo extends hsw implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final fde b;

    public fdo(fde fdeVar) {
        this.b = fdeVar;
    }

    @Override // defpackage.hsw
    public final String a() {
        return "query=[" + ((String) this.b.b) + "]";
    }

    protected abstract void d(fde fdeVar);

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            fde fdeVar = this.b;
            gty aC = hoq.aC(68, a.ah((String) fdeVar.b, "Query: "));
            try {
                d(fdeVar);
                aC.close();
            } finally {
            }
        } catch (Throwable th) {
            p(th);
        }
    }
}
