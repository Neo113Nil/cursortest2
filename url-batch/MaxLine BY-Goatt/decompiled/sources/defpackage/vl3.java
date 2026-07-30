package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.ServiceStarter;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vl3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Bundle n;
    public final /* synthetic */ jm3 o;

    public /* synthetic */ vl3(jm3 jm3Var, Bundle bundle, int i) {
        this.m = i;
        this.n = bundle;
        this.o = jm3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i = this.m;
        Bundle bundle2 = this.n;
        jm3 jm3Var = this.o;
        switch (i) {
            case 0:
                jm3Var.v();
                jm3Var.x();
                String string = bundle2.getString("name");
                String string2 = bundle2.getString(FirebaseAnalytics.Param.ORIGIN);
                ll3.s(string);
                ll3.s(string2);
                ll3.v(bundle2.get("value"));
                pj3 pj3Var = (pj3) jm3Var.m;
                if (!pj3Var.b()) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.z.b("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    tq3 tq3Var = new tq3(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        zq3 zq3Var = pj3Var.u;
                        pj3.k(zq3Var);
                        bundle2.getString("app_id");
                        kd3 Z = zq3Var.Z(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        pj3.k(zq3Var);
                        bundle2.getString("app_id");
                        kd3 Z2 = zq3Var.Z(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        pj3Var.p().P(new yb3(bundle2.getString("app_id"), string2, tq3Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), Z2, bundle2.getLong("trigger_timeout"), Z, bundle2.getLong("time_to_live"), zq3Var.Z(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                jm3Var.v();
                jm3Var.x();
                String string3 = bundle2.getString("name");
                ll3.s(string3);
                pj3 pj3Var2 = (pj3) jm3Var.m;
                if (!pj3Var2.b()) {
                    vh3 vh3Var2 = pj3Var2.r;
                    pj3.m(vh3Var2);
                    vh3Var2.z.b("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    tq3 tq3Var2 = new tq3(0L, null, string3, BuildConfig.FLAVOR);
                    try {
                        zq3 zq3Var2 = pj3Var2.u;
                        pj3.k(zq3Var2);
                        bundle2.getString("app_id");
                        pj3Var2.p().P(new yb3(bundle2.getString("app_id"), BuildConfig.FLAVOR, tq3Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), zq3Var2.Z(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle2.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                ot2 ot2Var = jm3Var.I;
                pj3 pj3Var3 = (pj3) jm3Var.m;
                if (bundle2.isEmpty()) {
                    bundle = bundle2;
                } else {
                    qi3 qi3Var = pj3Var3.q;
                    zq3 zq3Var3 = pj3Var3.u;
                    ec3 ec3Var = pj3Var3.p;
                    vh3 vh3Var3 = pj3Var3.r;
                    pj3.k(qi3Var);
                    bundle = new Bundle(qi3Var.K.G());
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            pj3.k(zq3Var3);
                            if (zq3.F0(obj)) {
                                zq3.M(ot2Var, null, 27, null, null, 0);
                            }
                            pj3.m(vh3Var3);
                            vh3Var3.w.d(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (zq3.V(str)) {
                            pj3.m(vh3Var3);
                            vh3Var3.w.c(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            pj3.k(zq3Var3);
                            ec3Var.getClass();
                            if (zq3Var3.G0("param", str, ServiceStarter.ERROR_UNKNOWN, obj)) {
                                zq3Var3.L(bundle, str, obj);
                            }
                        }
                    }
                    pj3.k(zq3Var3);
                    zq3 zq3Var4 = ((pj3) ec3Var.m).u;
                    pj3.k(zq3Var4);
                    int i2 = zq3Var4.c0(201500000) ? 100 : 25;
                    if (bundle.size() > i2) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i3++;
                            if (i3 > i2) {
                                bundle.remove(str2);
                            }
                        }
                        pj3.k(zq3Var3);
                        zq3.M(ot2Var, null, 26, null, null, 0);
                        pj3.m(vh3Var3);
                        vh3Var3.w.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                qi3 qi3Var2 = pj3Var3.q;
                pj3.k(qi3Var2);
                qi3Var2.K.K(bundle);
                if (!bundle2.isEmpty() || pj3Var3.p.G(null, ug3.W0)) {
                    pj3Var3.p().B(bundle);
                    break;
                }
                break;
        }
    }
}
