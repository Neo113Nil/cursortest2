package O0;

/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private c0 f1122a;

    /* renamed from: b, reason: collision with root package name */
    private c0 f1123b;

    /* renamed from: c, reason: collision with root package name */
    private c0 f1124c;

    /* renamed from: d, reason: collision with root package name */
    private c0 f1125d;

    public J(String str) {
    }

    public c0 a() {
        return this.f1124c;
    }

    public c0 b(String str) {
        if (str.equals("oper")) {
            return f();
        }
        if (str.equals("maint")) {
            return d();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return g();
        }
        j0.m("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void c(c0 c0Var) {
        this.f1122a = c0Var;
    }

    public c0 d() {
        return this.f1122a;
    }

    public void e(c0 c0Var) {
        this.f1123b = c0Var;
    }

    public c0 f() {
        return this.f1123b;
    }

    public c0 g() {
        return this.f1125d;
    }
}
