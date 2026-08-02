package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lcn implements Runnable {
    final /* synthetic */ lco a;
    private Runnable b;

    public lcn(lco lcoVar, Runnable runnable) {
        this.a = lcoVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                kvp.i(kqo.a, th);
            }
            lco lcoVar = this.a;
            Runnable e = lcoVar.e();
            if (e == null) {
                return;
            }
            try {
                this.b = e;
                i++;
                if (i >= 16) {
                    kvj kvjVar = lcoVar.a;
                    if (lcd.c(kvjVar, lcoVar)) {
                        lcd.b(kvjVar, lcoVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                lco lcoVar2 = this.a;
                synchronized (lcoVar2.e) {
                    lcoVar2.d.a();
                    throw th2;
                }
            }
        }
    }
}
