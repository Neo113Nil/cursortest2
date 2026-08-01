package s7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f8907b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f8908c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f8909d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final h1 f8910a;

    public p0(h1 h1Var) {
        this.f8910a = h1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        c7.c0.g(atomicReference);
        c7.c0.b(strArr.length == strArr2.length);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (Objects.equals(str, strArr[i3])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i3];
                        if (str2 == null) {
                            str2 = strArr2[i3] + "(" + strArr[i3] + ")";
                            strArr3[i3] = str2;
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
        return !this.f8910a.b() ? str : g(str, d2.f8585f, d2.f8580a, f8907b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8910a.b() ? str : g(str, d2.f8587i, d2.f8586h, f8908c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8910a.b() ? str : str.startsWith("_exp_") ? n0.l.g("experiment_id(", str, ")") : g(str, d2.f8590m, d2.f8589l, f8909d);
    }

    public final String d(u uVar) {
        h1 h1Var = this.f8910a;
        if (!h1Var.b()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(uVar.f9037i);
        sb2.append(",name=");
        sb2.append(a(uVar.f9035d));
        sb2.append(",params=");
        t tVar = uVar.f9036e;
        sb2.append(tVar == null ? null : !h1Var.b() ? tVar.f9010d.toString() : e(tVar.f()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f8910a.b()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String e2 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e2 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(e2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
