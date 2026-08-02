package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glz extends jqi {
    public glz(ng ngVar) {
        super(ngVar, new jqm(ngVar), new gmd(ngVar, ngVar), new gmc(ngVar, new jpu(ngVar, null, null)));
    }

    @Override // defpackage.jqi
    protected final Object a() {
        gty aC = hoq.aC(194, "Act#comp");
        try {
            Activity activity = this.a;
            hoq.M(activity.getApplication() instanceof glp, "TikTok activity, %s, cannot be attached to a non-TikTok application, %s.", activity.getClass().getSimpleName(), activity.getApplication().getClass().getSimpleName());
            Object a = super.a();
            aC.close();
            return a;
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
