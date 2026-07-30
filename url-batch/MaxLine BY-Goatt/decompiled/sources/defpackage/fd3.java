package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fd3 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final jd3 f;

    public fd3(pj3 pj3Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        jd3 jd3Var;
        ll3.s(str2);
        ll3.s(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.u.c(vh3.E(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            jd3Var = new jd3(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.b("Param name can't be null");
                    it.remove();
                } else {
                    zq3 zq3Var = pj3Var.u;
                    pj3.k(zq3Var);
                    Object D = zq3Var.D(bundle2.get(next), next);
                    if (D == null) {
                        vh3 vh3Var3 = pj3Var.r;
                        pj3.m(vh3Var3);
                        vh3Var3.u.c(pj3Var.v.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zq3 zq3Var2 = pj3Var.u;
                        pj3.k(zq3Var2);
                        zq3Var2.L(bundle2, next, D);
                    }
                }
            }
            jd3Var = new jd3(bundle2);
        }
        this.f = jd3Var;
    }

    public final fd3 a(pj3 pj3Var, long j) {
        return new fd3(pj3Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String jd3Var = this.f.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + jd3Var.length() + 1);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(jd3Var);
        sb.append("}");
        return sb.toString();
    }

    public fd3(pj3 pj3Var, String str, String str2, String str3, long j, long j2, jd3 jd3Var) {
        ll3.s(str2);
        ll3.s(str3);
        ll3.v(jd3Var);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.u.d(vh3.E(str2), vh3.E(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f = jd3Var;
    }
}
