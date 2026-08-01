package s7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l9;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f4 extends z3 {
    public static final boolean v(String str) {
        String str2 = (String) e0.f8650t.a(null);
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
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.I().t()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e4 t(String str) {
        q1 q1Var = (q1) this.f1478d;
        j4 j4Var = this.f9150e;
        m mVar = j4Var.f8762i;
        k1 k1Var = j4Var.f8760d;
        j4.T(mVar);
        a1 w02 = mVar.w0(str);
        x2 x2Var = x2.GOOGLE_ANALYTICS;
        e4 e4Var = null;
        if (w02 == null || !w02.z()) {
            return new e4(u(str), Collections.EMPTY_MAP, x2Var, null);
        }
        k9 u2 = l9.u();
        u2.b();
        ((l9) u2.f2389e).z(2);
        int b10 = v4.a.b(w02.t());
        if (b10 == 0) {
            a2.r.j("null reference");
        }
        u2.g(b10);
        String F = w02.F();
        j4.T(k1Var);
        a8 E = k1Var.E(str);
        if (E != null) {
            m mVar2 = j4Var.f8762i;
            j4.T(mVar2);
            a1 w03 = mVar2.w0(str);
            if (w03 != null) {
                if (!E.H() || E.I().t() != 100) {
                    p4 p4Var = q1Var.f8940w;
                    q1.j(p4Var);
                    if (!p4Var.X(str, w03.D())) {
                        if (!TextUtils.isEmpty(F)) {
                        }
                    }
                }
                String E2 = w02.E();
                u2.b();
                ((l9) u2.f2389e).z(2);
                j4.T(k1Var);
                a8 E3 = k1Var.E(w02.E());
                if (E3 == null || !E3.H()) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.B.b(E2, "[sgtm] Missing sgtm_setting in remote config. appId");
                    u2.b();
                    ((l9) u2.f2389e).A(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(w02.D())) {
                        hashMap.put("x-gtm-server-preview", w02.D());
                    }
                    String u10 = E3.I().u();
                    int b11 = v4.a.b(w02.t());
                    if (b11 != 0 && b11 != 2) {
                        u2.g(b11);
                    } else if (v(w02.E())) {
                        u2.g(11);
                    } else if (TextUtils.isEmpty(u10)) {
                        u2.g(12);
                    } else {
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.B.b(E2, "[sgtm] Eligible for client side upload. appId");
                        u2.b();
                        ((l9) u2.f2389e).z(3);
                        u2.g(2);
                        e4Var = new e4(u10, hashMap, x2.SGTM_CLIENT, (l9) u2.d());
                    }
                    E3.I().getClass();
                    E3.I().getClass();
                    q1Var.getClass();
                    v0 v0Var3 = q1Var.f8937t;
                    if (TextUtils.isEmpty(u10)) {
                        u2.b();
                        ((l9) u2.f2389e).A(6);
                        q1.l(v0Var3);
                        v0Var3.B.b(w02.E(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        q1.l(v0Var3);
                        v0Var3.B.b(E2, "[sgtm] Eligible for local service direct upload. appId");
                        u2.b();
                        ((l9) u2.f2389e).z(5);
                        u2.b();
                        ((l9) u2.f2389e).A(2);
                        e4Var = new e4(u10, hashMap, x2.SGTM, (l9) u2.d());
                    }
                }
                return e4Var != null ? e4Var : new e4(u(str), Collections.EMPTY_MAP, x2Var, (l9) u2.d());
            }
        }
        u2.b();
        ((l9) u2.f2389e).A(3);
        return new e4(u(str), Collections.EMPTY_MAP, x2Var, (l9) u2.d());
    }

    public final String u(String str) {
        k1 k1Var = this.f9150e.f8760d;
        j4.T(k1Var);
        String F = k1Var.F(str);
        if (TextUtils.isEmpty(F)) {
            return (String) e0.f8646r.a(null);
        }
        Uri parse = Uri.parse((String) e0.f8646r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(F).length() + 1 + String.valueOf(authority).length());
        sb2.append(F);
        sb2.append(".");
        sb2.append(authority);
        buildUpon.authority(sb2.toString());
        return buildUpon.build().toString();
    }
}
