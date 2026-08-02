package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqx {
    private static final String a = "dqx";

    private dqx() {
    }

    public static void a(View view, String str, iiw iiwVar) {
        bd d = d(view);
        Intent ag = dih.ag(str, iiwVar, gyf.a);
        Activity D = d != null ? d.D() : null;
        if (D == null) {
            D = c(view.getContext());
        }
        D.startActivityForResult(ag, 51332);
    }

    public static void b(View view, int i, dov dovVar, Object obj, String str) {
        if (obj == null || !dovVar.i(obj)) {
            bd d = d(view);
            Activity D = d != null ? d.D() : null;
            if (D == null) {
                D = c(view.getContext());
            }
            try {
                new byo().v().m(D, Uri.parse(str));
                return;
            } catch (ActivityNotFoundException e) {
                Log.e(a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", str), e);
                return;
            }
        }
        String d2 = dovVar.d(obj);
        jkj k = iiw.a.k();
        int i2 = i - 1;
        if (!k.b.M()) {
            k.t();
        }
        iiw iiwVar = (iiw) k.b;
        iiwVar.b = 1 | iiwVar.b;
        iiwVar.c = i2;
        a(view, d2, (iiw) k.q());
    }

    private static Activity c(Context context) {
        Activity activity = (Activity) dih.al(context, Activity.class);
        activity.getClass();
        return activity;
    }

    private static bd d(View view) {
        try {
            bd e = by.e(view);
            if (e != null) {
                return e;
            }
            throw new IllegalStateException(a.ab(view, "View ", " does not have a Fragment set"));
        } catch (IllegalStateException e2) {
            Log.e(a, "Failed to find Fragment for view", e2);
            return null;
        }
    }
}
