package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nh3 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final ti3 a;

    public nh3(ti3 ti3Var) {
        this.a = ti3Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        ll3.v(atomicReference);
        ll3.p(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : g(str, s93.p, s93.n, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : g(str, bd3.i, bd3.h, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.b() ? str : str.startsWith("_exp_") ? q40.m("experiment_id(", str, ")") : g(str, tk3.l, tk3.k, d);
    }

    public final String d(kd3 kd3Var) {
        ti3 ti3Var = this.a;
        if (!ti3Var.b()) {
            return kd3Var.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(kd3Var.o);
        sb.append(",name=");
        sb.append(a(kd3Var.m));
        sb.append(",params=");
        jd3 jd3Var = kd3Var.n;
        sb.append(jd3Var == null ? null : !ti3Var.b() ? jd3Var.m.toString() : e(jd3Var.d()));
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String e = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
