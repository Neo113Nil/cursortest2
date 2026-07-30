package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ev1 implements Runnable {
    public Object OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;
    public Object wdg6QnbFHrFF;

    public ev1(bi biVar, ex1 ex1Var, a92UlCVFR9N8 a92ulcvfr9n8) {
        this.OPXfSBeufaJ8 = biVar;
        this.wdg6QnbFHrFF = ex1Var;
        this.dgRBjINgWbAK = a92ulcvfr9n8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                try {
                    obj = ((fc0) this.OPXfSBeufaJ8).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.dgRBjINgWbAK).post(new sh(3, (ec0) this.wdg6QnbFHrFF, obj));
                break;
            default:
                bi biVar = (bi) this.OPXfSBeufaJ8;
                try {
                    fx1.uURZJOrwXbxn(biVar.x50lh2ztY7Y5.kpCQ9veP6n3I(ih0.x50lh2ztY7Y5), new e4((ex1) this.wdg6QnbFHrFF, biVar, (a92UlCVFR9N8) this.dgRBjINgWbAK, null, 10));
                    break;
                } catch (Throwable th) {
                    biVar.QrzZRwfaDlRX(th);
                }
        }
    }
}
