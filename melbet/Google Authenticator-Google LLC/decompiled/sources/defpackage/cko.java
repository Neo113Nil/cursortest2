package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cko implements cjt {
    public static final ConcurrentHashMap a;
    static Boolean b;
    static Long c;
    public static final iyi e;
    public final Context d;

    static {
        iyi iyiVar = new iyi(etb.a("com.google.android.gms.clearcut.public"), "", "", (int[]) null);
        iyi iyiVar2 = new iyi(iyiVar.c, "gms:playlog:service:samplingrules_", iyiVar.b, (int[]) null);
        e = new iyi(iyiVar2.c, iyiVar2.a, "LogSamplingRulesV2__", (int[]) null);
        a = new ConcurrentHashMap();
        b = null;
        c = null;
    }

    public cko(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        if (applicationContext != null) {
            eti.f(applicationContext);
        }
    }
}
