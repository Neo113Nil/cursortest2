package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.ServiceStarter;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dn3 extends xg3 {
    public volatile tm3 o;
    public volatile tm3 p;
    public tm3 q;
    public final ConcurrentHashMap r;
    public ze3 s;
    public volatile boolean t;
    public volatile tm3 u;
    public tm3 v;
    public boolean w;
    public final Object x;

    public dn3(pj3 pj3Var) {
        super(pj3Var);
        this.x = new Object();
        this.r = new ConcurrentHashMap();
    }

    public final void A(tm3 tm3Var, boolean z, long j) {
        pj3 pj3Var = (pj3) this.m;
        se3 se3Var = pj3Var.z;
        pj3.j(se3Var);
        pj3Var.w.getClass();
        se3Var.z(SystemClock.elapsedRealtime());
        boolean z2 = tm3Var != null && tm3Var.d;
        ep3 ep3Var = pj3Var.t;
        pj3.l(ep3Var);
        if (!ep3Var.r.b(z2, z, j) || tm3Var == null) {
            return;
        }
        tm3Var.d = false;
    }

    public final tm3 B(ze3 ze3Var) {
        ll3.v(ze3Var);
        Integer valueOf = Integer.valueOf(ze3Var.m);
        ConcurrentHashMap concurrentHashMap = this.r;
        tm3 tm3Var = (tm3) concurrentHashMap.get(valueOf);
        if (tm3Var == null) {
            String D = D(ze3Var.n);
            zq3 zq3Var = ((pj3) this.m).u;
            pj3.k(zq3Var);
            tm3 tm3Var2 = new tm3(null, D, zq3Var.t0());
            concurrentHashMap.put(valueOf, tm3Var2);
            tm3Var = tm3Var2;
        }
        return this.u != null ? this.u : tm3Var;
    }

    public final tm3 C(boolean z) {
        x();
        v();
        tm3 tm3Var = this.q;
        return !z ? tm3Var : tm3Var != null ? tm3Var : this.v;
    }

    public final String D(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        pj3 pj3Var = (pj3) this.m;
        int length2 = str2.length();
        pj3Var.p.getClass();
        if (length2 <= 500) {
            return str2;
        }
        pj3Var.p.getClass();
        return str2.substring(0, ServiceStarter.ERROR_UNKNOWN);
    }

    public final void E(ze3 ze3Var, Bundle bundle) {
        Bundle bundle2;
        if (!((pj3) this.m).p.K() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.r.put(Integer.valueOf(ze3Var.m), new tm3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void F(String str, tm3 tm3Var, boolean z) {
        tm3 tm3Var2;
        tm3 tm3Var3 = this.o == null ? this.p : this.o;
        if (tm3Var.b == null) {
            tm3Var2 = new tm3(tm3Var.a, str != null ? D(str) : null, tm3Var.c, tm3Var.e, tm3Var.f);
        } else {
            tm3Var2 = tm3Var;
        }
        this.p = this.o;
        this.o = tm3Var2;
        pj3 pj3Var = (pj3) this.m;
        pj3Var.w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lj3 lj3Var = pj3Var.s;
        pj3.m(lj3Var);
        lj3Var.F(new vm3(this, tm3Var2, tm3Var3, elapsedRealtime, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(tm3 tm3Var, tm3 tm3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        boolean z3 = tm3Var.e;
        pj3 pj3Var = (pj3) this.m;
        v();
        boolean z4 = false;
        if (tm3Var2 != null) {
            if (tm3Var2.c == tm3Var.c && Objects.equals(tm3Var2.b, tm3Var.b) && Objects.equals(tm3Var2.a, tm3Var.a)) {
                z2 = false;
                if (z && this.q != null) {
                    z4 = true;
                }
                if (z2) {
                    Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                    zq3.o0(tm3Var, bundle2, true);
                    if (tm3Var2 != null) {
                        String str = tm3Var2.a;
                        if (str != null) {
                            bundle2.putString("_pn", str);
                        }
                        String str2 = tm3Var2.b;
                        if (str2 != null) {
                            bundle2.putString("_pc", str2);
                        }
                        bundle2.putLong("_pi", tm3Var2.c);
                    }
                    if (z4) {
                        ep3 ep3Var = pj3Var.t;
                        pj3.l(ep3Var);
                        o42 o42Var = ep3Var.r;
                        long j2 = j - o42Var.b;
                        o42Var.b = j;
                        if (j2 > 0) {
                            zq3 zq3Var = pj3Var.u;
                            pj3.k(zq3Var);
                            zq3Var.e0(bundle2, j2);
                        }
                    }
                    if (!pj3Var.p.K()) {
                        bundle2.putLong("_mst", 1L);
                    }
                    String str3 = true != z3 ? "auto" : "app";
                    pj3Var.w.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z3) {
                        long j3 = tm3Var.f;
                        if (j3 != 0) {
                            currentTimeMillis = j3;
                        }
                    }
                    jm3 jm3Var = pj3Var.y;
                    pj3.l(jm3Var);
                    jm3Var.E(str3, "_vs", bundle2, currentTimeMillis);
                }
                if (z4) {
                    A(this.q, true, j);
                }
                this.q = tm3Var;
                if (z3) {
                    this.v = tm3Var;
                }
                jo3 p = pj3Var.p();
                p.v();
                p.x();
                p.K(new pn3(p, tm3Var));
            }
        }
        z2 = true;
        if (z) {
            z4 = true;
        }
        if (z2) {
        }
        if (z4) {
        }
        this.q = tm3Var;
        if (z3) {
        }
        jo3 p2 = pj3Var.p();
        p2.v();
        p2.x();
        p2.K(new pn3(p2, tm3Var));
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return false;
    }
}
