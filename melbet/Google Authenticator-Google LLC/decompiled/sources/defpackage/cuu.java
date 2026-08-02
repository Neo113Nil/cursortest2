package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuu extends cms {
    public final Activity k;

    public cuu(Context context) {
        super(context, null, cuf.a, null, cmr.a);
        this.k = null;
    }

    public final void a(Intent intent) {
        oy.at(this.k);
        cpa cpaVar = new cpa();
        cpaVar.a = new cik(this, intent, 4);
        cpaVar.c = 34401;
        super.i(1, cpaVar.a());
    }

    public cuu(Activity activity) {
        super(activity, activity, cuf.a, null, cmr.a);
        this.k = activity;
    }
}
