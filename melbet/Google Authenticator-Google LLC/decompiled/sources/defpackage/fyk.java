package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyk implements fth, fti {
    private static final hkh a = hkh.l("com/google/apps/tiktok/account/ui/intentselector/IntentAccountSelector");
    private final boolean b;
    private final fwm c;

    public fyk(fwm fwmVar, gzp gzpVar) {
        this.c = fwmVar;
        this.b = ((Boolean) gzpVar.d(false)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fth, defpackage.ftg
    public final hvi a(ftk ftkVar) {
        hvi aJ;
        gty aC = hoq.aC(110, "Get Intent Account");
        try {
            Intent intent = ftkVar.a;
            if (intent.hasExtra("account_id")) {
                aJ = hnu.aJ(ftc.b(intent));
            } else {
                byte[] bArr = null;
                if (this.b && intent.hasExtra("viewerid")) {
                    ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/account/ui/intentselector/IntentAccountSelector", "getSelection", 59, "IntentAccountSelector.java")).s("Found viewerId usage in IntentAccountSelector");
                    hoq.H(intent.hasExtra("viewerid"));
                    String stringExtra = intent.getStringExtra("viewerid");
                    stringExtra.getClass();
                    if (intent.hasExtra("effectiveid")) {
                        stringExtra = intent.getStringExtra("effectiveid");
                        stringExtra.getClass();
                    }
                    Object obj = this.c.b;
                    aJ = hso.f(hoq.at(((iyi) ((fwm) obj).a).h(), new bso(stringExtra, 11, bArr), ((fwm) obj).b), IllegalArgumentException.class, new fxn(3), huf.a);
                    aC.b(aJ);
                } else {
                    aJ = hnu.aJ(null);
                }
            }
            aC.close();
            return aJ;
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fth
    public final /* synthetic */ hvi b(frv frvVar) {
        return hnu.aJ(null);
    }
}
