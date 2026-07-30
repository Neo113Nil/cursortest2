package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zp3 extends lp3 {
    public static final boolean z(String str) {
        String str2 = (String) ug3.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xp3 x(String str) {
        pj3 pj3Var = (pj3) this.m;
        oq3 oq3Var = this.n;
        tc3 tc3Var = oq3Var.o;
        dj3 dj3Var = oq3Var.m;
        oq3.U(tc3Var);
        di3 y0 = tc3Var.y0(str);
        sm3 sm3Var = sm3.GOOGLE_ANALYTICS;
        xp3 xp3Var = null;
        if (y0 == null || !y0.y()) {
            return new xp3(y(str), Collections.EMPTY_MAP, sm3Var, null);
        }
        bk3 q = ck3.q();
        q.b();
        ((ck3) q.n).v(2);
        int d = in1.d(y0.t());
        if (d == 0) {
            ch2.l("null reference");
        }
        q.g(d);
        String E = y0.E();
        oq3.U(dj3Var);
        mh3 I = dj3Var.I(str);
        if (I != null) {
            tc3 tc3Var2 = oq3Var.o;
            oq3.U(tc3Var2);
            di3 y02 = tc3Var2.y0(str);
            if (y02 != null) {
                if (!I.D() || I.E().p() != 100) {
                    zq3 zq3Var = pj3Var.u;
                    pj3.k(zq3Var);
                    if (!zq3Var.X(str, y02.C())) {
                        if (!TextUtils.isEmpty(E)) {
                        }
                    }
                }
                String D = y0.D();
                q.b();
                ((ck3) q.n).v(2);
                oq3.U(dj3Var);
                mh3 I2 = dj3Var.I(y0.D());
                if (I2 == null || !I2.D()) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.z.c(D, "[sgtm] Missing sgtm_setting in remote config. appId");
                    q.b();
                    ((ck3) q.n).w(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(y0.C())) {
                        hashMap.put("x-gtm-server-preview", y0.C());
                    }
                    String q2 = I2.E().q();
                    int d2 = in1.d(y0.t());
                    if (d2 != 0 && d2 != 2) {
                        q.g(d2);
                    } else if (z(y0.D())) {
                        q.g(11);
                    } else if (TextUtils.isEmpty(q2)) {
                        q.g(12);
                    } else {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.z.c(D, "[sgtm] Eligible for client side upload. appId");
                        q.b();
                        ((ck3) q.n).v(3);
                        q.g(2);
                        xp3Var = new xp3(q2, hashMap, sm3.SGTM_CLIENT, (ck3) q.d());
                    }
                    I2.E().getClass();
                    I2.E().getClass();
                    pj3Var.getClass();
                    vh3 vh3Var3 = pj3Var.r;
                    if (TextUtils.isEmpty(q2)) {
                        q.b();
                        ((ck3) q.n).w(6);
                        pj3.m(vh3Var3);
                        vh3Var3.z.c(y0.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        pj3.m(vh3Var3);
                        vh3Var3.z.c(D, "[sgtm] Eligible for local service direct upload. appId");
                        q.b();
                        ((ck3) q.n).v(5);
                        q.b();
                        ((ck3) q.n).w(2);
                        xp3Var = new xp3(q2, hashMap, sm3.SGTM, (ck3) q.d());
                    }
                }
                return xp3Var != null ? xp3Var : new xp3(y(str), Collections.EMPTY_MAP, sm3Var, (ck3) q.d());
            }
        }
        q.b();
        ((ck3) q.n).w(3);
        return new xp3(y(str), Collections.EMPTY_MAP, sm3Var, (ck3) q.d());
    }

    public final String y(String str) {
        dj3 dj3Var = this.n.m;
        oq3.U(dj3Var);
        String J = dj3Var.J(str);
        if (TextUtils.isEmpty(J)) {
            return (String) ug3.r.a(null);
        }
        Uri parse = Uri.parse((String) ug3.r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(J).length() + 1 + String.valueOf(authority).length());
        sb.append(J);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
