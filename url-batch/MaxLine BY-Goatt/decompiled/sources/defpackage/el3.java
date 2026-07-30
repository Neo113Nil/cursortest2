package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class el3 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final ye3 d;
    public final boolean e;
    public final Long f;
    public final String g;

    public el3(Context context, ye3 ye3Var, Long l) {
        this.e = true;
        ll3.v(context);
        Context applicationContext = context.getApplicationContext();
        ll3.v(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (ye3Var != null) {
            this.d = ye3Var;
            this.e = ye3Var.o;
            this.c = ye3Var.n;
            this.g = ye3Var.q;
            Bundle bundle = ye3Var.p;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
