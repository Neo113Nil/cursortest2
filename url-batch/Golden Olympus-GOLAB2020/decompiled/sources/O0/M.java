package O0;

/* loaded from: classes.dex */
public class M {

    /* renamed from: b, reason: collision with root package name */
    private static M f1134b = new M();

    /* renamed from: a, reason: collision with root package name */
    private a f1135a = new a();

    class a {

        /* renamed from: a, reason: collision with root package name */
        String f1136a;

        /* renamed from: b, reason: collision with root package name */
        String f1137b;

        /* renamed from: c, reason: collision with root package name */
        long f1138c = 0;

        a() {
        }

        void a(long j4) {
            M.this.f1135a.f1138c = j4;
        }

        void b(String str) {
            M.this.f1135a.f1137b = str;
        }

        void c(String str) {
            M.this.f1135a.f1136a = str;
        }
    }

    public static M f() {
        return f1134b;
    }

    public String b() {
        return this.f1135a.f1137b;
    }

    public void c(String str, String str2) {
        long d4 = d();
        String d5 = l0.d(str, str2);
        if (d5 == null || d5.isEmpty()) {
            j0.l("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (d4 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String e4 = S0.a.e(16);
            String a4 = AbstractC0422w.a(d5, e4);
            this.f1135a.a(currentTimeMillis);
            this.f1135a.c(e4);
            this.f1135a.b(a4);
            return;
        }
        if (System.currentTimeMillis() - d4 > 43200000) {
            String e5 = S0.a.e(16);
            String a5 = AbstractC0422w.a(d5, e5);
            this.f1135a.a(d4);
            this.f1135a.c(e5);
            this.f1135a.b(a5);
        }
    }

    public long d() {
        return this.f1135a.f1138c;
    }

    public String e() {
        return this.f1135a.f1136a;
    }
}
