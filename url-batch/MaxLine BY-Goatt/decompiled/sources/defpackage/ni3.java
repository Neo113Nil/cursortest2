package defpackage;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ni3 {
    public long a;
    public Object b;
    public Serializable c;
    public Serializable d;
    public final /* synthetic */ qk3 e;

    public /* synthetic */ ni3(qi3 qi3Var, long j) {
        this.e = qi3Var;
        ll3.s("health_monitor");
        ll3.p(j > 0);
        this.b = "health_monitor:start";
        this.c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) defpackage.ug3.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) defpackage.ug3.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(long j, cj3 cj3Var) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((cj3) ((ArrayList) this.d).get(0)).u() / 1000) / 60) / 60 == ((cj3Var.u() / 1000) / 60) / 60) {
            long k = this.a + cj3Var.k();
            oq3 oq3Var = (oq3) this.e;
            if (oq3Var.e0().G(null, ug3.d1)) {
                if (!((ArrayList) this.d).isEmpty()) {
                    oq3Var.e0();
                }
                this.a = k;
                ((ArrayList) this.d).add(cj3Var);
                ((ArrayList) this.c).add(Long.valueOf(j));
                int size = ((ArrayList) this.d).size();
                oq3Var.e0();
                if (size < Math.max(1, ((Integer) ug3.k.a(null)).intValue())) {
                    return true;
                }
            } else {
                oq3Var.e0();
            }
        }
        return false;
    }

    public void b() {
        qi3 qi3Var = (qi3) this.e;
        qi3Var.v();
        ((pj3) qi3Var.m).w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = qi3Var.A().edit();
        edit.remove((String) this.c);
        edit.remove((String) this.d);
        edit.putLong((String) this.b, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ ni3(oq3 oq3Var) {
        this.e = oq3Var;
    }
}
