package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cov implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ cov(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 2) {
            throw new RuntimeException("Someone quit the @LightweightExecutor looper");
        }
        if (i == 5) {
            eti.e();
            return;
        }
        switch (i) {
            case 7:
                Throwable th = new Throwable();
                th.fillInStackTrace();
                ((hkf) ((hkf) ((hkf) gbl.a.f()).h(th)).i("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl$1", "run", (char) 225, "FuturesMixinImpl.java")).s("b/66999648 detected");
                return;
            case 8:
                ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 211, "SyncManagerImpl.java")).s("#sync() complete");
                return;
            case 9:
                gta.j = null;
                return;
            case 10:
                Object remove = gta.d.remove();
                if (remove == gta.f) {
                    gta.e.pop();
                    return;
                } else {
                    gta.e.push((guq) remove);
                    return;
                }
            case 11:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            default:
                return;
        }
    }
}
