package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class fl3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ jm3 n;

    public /* synthetic */ fl3(jm3 jm3Var, int i) {
        this.m = i;
        this.n = jm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        jm3 jm3Var = this.n;
        switch (i) {
            case 0:
                jm3Var.T();
                break;
            case 1:
                ti3 ti3Var = jm3Var.D;
                pj3 pj3Var = ti3Var.n;
                lj3 lj3Var = pj3Var.s;
                jm3 jm3Var2 = pj3Var.y;
                qi3 qi3Var = pj3Var.q;
                pj3.m(lj3Var);
                lj3Var.v();
                if (ti3Var.e()) {
                    if (ti3Var.d()) {
                        pj3.k(qi3Var);
                        qi3Var.I.e(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", SDKConstants.PARAM_INTENT);
                        bundle.putLong("_cc", 1L);
                        pj3.l(jm3Var2);
                        jm3Var2.D("auto", "_cmpx", bundle);
                    } else {
                        pj3.k(qi3Var);
                        w50 w50Var = qi3Var.I;
                        String d = w50Var.d();
                        if (TextUtils.isEmpty(d)) {
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            vh3Var.s.b("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long a = qi3Var.J.a() / 3600000;
                            Uri parse = Uri.parse(d);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (a - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            pj3.l(jm3Var2);
                            jm3Var2.D(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                        }
                        w50Var.e(null);
                    }
                    pj3.k(qi3Var);
                    qi3Var.J.b(0L);
                    break;
                }
                break;
            case 2:
                jm3Var.v();
                pj3 pj3Var2 = (pj3) jm3Var.m;
                qi3 qi3Var2 = pj3Var2.q;
                vh3 vh3Var2 = pj3Var2.r;
                pj3.k(qi3Var2);
                ii3 ii3Var = qi3Var2.F;
                if (ii3Var.a()) {
                    pj3.m(vh3Var2);
                    vh3Var2.y.b("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    li3 li3Var = qi3Var2.G;
                    long a2 = li3Var.a();
                    li3Var.b(1 + a2);
                    if (a2 >= 5) {
                        pj3.m(vh3Var2);
                        vh3Var2.u.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        ii3Var.b(true);
                        break;
                    } else {
                        if (jm3Var.F == null) {
                            jm3Var.F = new hl3(jm3Var, pj3Var2, 3);
                        }
                        jm3Var.F.b(0L);
                        break;
                    }
                }
            default:
                jm3Var.T();
                break;
        }
    }
}
