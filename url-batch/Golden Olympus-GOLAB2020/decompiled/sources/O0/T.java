package O0;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class T {

    /* renamed from: c, reason: collision with root package name */
    private static T f1146c;

    /* renamed from: a, reason: collision with root package name */
    private String f1147a;

    /* renamed from: b, reason: collision with root package name */
    private String f1148b;

    private String b(String str) {
        String d4 = i() ? R0.a.d("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(d4)) {
            return d4;
        }
        j0.h("hmsSdk", "deCrypt work key first");
        String b4 = Q.b(str, h());
        if (!TextUtils.isEmpty(b4)) {
            if (i()) {
                f(c(b4));
                n0.i();
            }
            return b4;
        }
        String e4 = S0.a.e(16);
        f(c(e4));
        if (i()) {
            n0.i();
        }
        return e4;
    }

    private String c(String str) {
        return i() ? R0.a.g("analytics_keystore", str) : Q.d(str, h());
    }

    private String e() {
        String b4 = AbstractC0413m.b(Y.q(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(b4)) {
            return b(b4);
        }
        String e4 = S0.a.e(16);
        f(c(e4));
        return e4;
    }

    private boolean f(String str) {
        j0.h("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            j0.h("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        AbstractC0413m.g(Y.q(), "Privacy_MY", "PrivacyData", str);
        AbstractC0413m.f(Y.q(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static T g() {
        if (f1146c == null) {
            j();
        }
        return f1146c;
    }

    private String h() {
        if (TextUtils.isEmpty(this.f1148b)) {
            this.f1148b = new n0().a();
        }
        return this.f1148b;
    }

    private boolean i() {
        return true;
    }

    private static synchronized void j() {
        synchronized (T.class) {
            if (f1146c == null) {
                f1146c = new T();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f1147a)) {
            this.f1147a = e();
        }
        return this.f1147a;
    }

    public void d() {
        String e4 = S0.a.e(16);
        if (f(c(e4))) {
            this.f1147a = e4;
        }
    }
}
