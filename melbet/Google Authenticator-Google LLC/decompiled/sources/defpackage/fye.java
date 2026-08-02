package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fye implements fth, fti {
    public final String a;
    public final fcu b;
    public final fwm c;

    public fye(Context context, fcu fcuVar, fwm fwmVar) {
        this.b = fcuVar;
        this.a = context.getPackageName();
        this.c = fwmVar;
    }

    @Override // defpackage.fth, defpackage.ftg
    public final hvi a(ftk ftkVar) {
        gty aC = hoq.aC(109, "Get Default Account");
        try {
            hvi f = hti.f(this.b.d(), gvx.a(new fyc(this, 1)), huf.a);
            aC.b(f);
            aC.close();
            return f;
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
