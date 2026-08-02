package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlk {
    public final dkj a;
    public final dlg b;
    public boolean d = false;
    public boolean e = false;
    public final kee j = new kee(this);
    public int f = 0;
    public Runnable g = null;
    public int h = 0;
    public Runnable i = null;
    public final dln c = new dln();

    public dlk(dkj dkjVar, dlg dlgVar) {
        this.a = dkjVar;
        this.b = dlgVar;
    }

    public final void a() {
        this.g = null;
        if (this.c.c()) {
            gty aC = hoq.aC(54, "GIL:AutoProcessBatch");
            try {
                this.a.b(new dli(this, 1));
                aC.close();
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void b() {
        if (this.g != null) {
            return;
        }
        Runnable a = this.b.a(new ath(this, 19));
        this.g = a;
        int i = this.f;
        if (i > 0) {
            fao.d(a, i);
        } else {
            fao.e(a);
        }
    }
}
