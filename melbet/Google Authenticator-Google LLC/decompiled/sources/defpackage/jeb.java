package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeb {
    private static hel i;
    private static final her j = her.j("optional-module-barcode", "com.google.android.gms.vision.barcode");
    public final String a;
    public final String b;
    public final jdy c;
    public final ikx d;
    public final ddi e;
    public final ddi f;
    public final String g;
    public final int h;

    public jeb(Context context, ikx ikxVar, jdy jdyVar, String str) {
        String str2;
        new HashMap();
        new HashMap();
        this.a = context.getPackageName();
        int i2 = 6;
        try {
            str2 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            fwm fwmVar = iko.a;
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            if (fwmVar.T(6)) {
                Log.e("CommonUtils", fwmVar.S(concat));
            }
            str2 = "";
        }
        this.b = str2;
        this.d = ikxVar;
        this.c = jdyVar;
        jeh.a();
        this.g = str;
        this.e = ikr.b().a(new gqe(this, 5));
        ikr b = ikr.b();
        ikxVar.getClass();
        this.f = b.a(new gqe(ikxVar, i2));
        her herVar = j;
        this.h = herVar.containsKey(str) ? ctg.a(context, (String) herVar.get(str), false) : -1;
    }

    public static synchronized hel a() {
        synchronized (jeb.class) {
            hel helVar = i;
            if (helVar != null) {
                return helVar;
            }
            vv g = pk.g(Resources.getSystem().getConfiguration());
            heg hegVar = new heg(4);
            for (int i2 = 0; i2 < g.a(); i2++) {
                hegVar.h(g.f(i2).toLanguageTag());
            }
            hel g2 = hegVar.g();
            i = g2;
            return g2;
        }
    }
}
