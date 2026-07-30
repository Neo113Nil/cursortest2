package v2;

import B2.J;
import O2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2549Fc;
import k2.AbstractC4642m;
import k2.C4636g;
import k2.s;
import q2.r;
import u2.AbstractC5108b;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5123a {
    public static void b(Context context, String str, C4636g c4636g, AbstractC5124b abstractC5124b) {
        w.i(context, "Context cannot be null.");
        w.i(str, "AdUnitId cannot be null.");
        w.i(c4636g, "AdRequest cannot be null.");
        w.i(abstractC5124b, "LoadCallback cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.i.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new J(context, str, c4636g, abstractC5124b, 8));
                return;
            }
        }
        new C2549Fc(context, str).e(c4636g.f38704a, abstractC5124b);
    }

    public abstract s a();

    public abstract void c(AbstractC4642m abstractC4642m);

    public abstract void d(Activity activity);
}
