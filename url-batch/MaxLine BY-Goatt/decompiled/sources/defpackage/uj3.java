package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uj3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public uj3(dn3 dn3Var, Bundle bundle, tm3 tm3Var, tm3 tm3Var2, long j) {
        this.m = 2;
        this.n = bundle;
        this.o = tm3Var;
        this.q = tm3Var2;
        this.p = j;
        Objects.requireNonNull(dn3Var);
        this.r = dn3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.q;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                String str = (String) obj2;
                mk3 mk3Var = (mk3) obj4;
                String str2 = (String) obj3;
                if (str2 != null) {
                    tm3 tm3Var = new tm3((String) obj, str2, this.p);
                    oq3 oq3Var = mk3Var.g;
                    oq3Var.c().v();
                    String str3 = oq3Var.S;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    oq3Var.S = str;
                    oq3Var.R = tm3Var;
                    break;
                } else {
                    oq3 oq3Var2 = mk3Var.g;
                    oq3Var2.c().v();
                    String str4 = oq3Var2.S;
                    if (str4 == null || str4.equals(str)) {
                        oq3Var2.S = str;
                        oq3Var2.R = null;
                        break;
                    }
                }
                break;
            case 1:
                String str5 = (String) obj2;
                Object obj5 = this.q;
                ((jm3) obj4).H(this.p, obj5, (String) obj3, str5);
                break;
            default:
                dn3 dn3Var = (dn3) obj4;
                Bundle bundle = (Bundle) obj3;
                dn3Var.getClass();
                bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
                bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
                zq3 zq3Var = ((pj3) dn3Var.m).u;
                pj3.k(zq3Var);
                dn3Var.G((tm3) obj2, (tm3) obj, this.p, true, zq3Var.E(FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
                break;
        }
    }

    public /* synthetic */ uj3(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.m = i;
        this.n = str;
        this.o = str2;
        this.q = obj2;
        this.p = j;
        this.r = obj;
    }
}
