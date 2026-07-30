package m2;

import B2.J;
import O2.w;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import k2.C4636g;
import k2.s;
import q2.r;
import u2.AbstractC5108b;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4778b {
    public static void b(Context context, String str, C4636g c4636g, AbstractC4777a abstractC4777a) {
        w.i(context, "Context cannot be null.");
        w.i(str, "adUnitId cannot be null.");
        w.i(c4636g, "AdRequest cannot be null.");
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25569d.r()).booleanValue()) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new J(context, str, c4636g, abstractC4777a, 7));
                return;
            }
        }
        new A3(context, str, c4636g.f38704a, abstractC4777a).b();
    }

    public abstract s a();

    public abstract void c(Activity activity);
}
