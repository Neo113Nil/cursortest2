package d0;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f15450i = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private k f15451a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15452b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15453c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15454d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15455e;

    /* renamed from: f, reason: collision with root package name */
    private long f15456f;

    /* renamed from: g, reason: collision with root package name */
    private long f15457g;

    /* renamed from: h, reason: collision with root package name */
    private c f15458h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f15459a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f15460b = false;

        /* renamed from: c, reason: collision with root package name */
        k f15461c = k.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        boolean f15462d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f15463e = false;

        /* renamed from: f, reason: collision with root package name */
        long f15464f = -1;

        /* renamed from: g, reason: collision with root package name */
        long f15465g = -1;

        /* renamed from: h, reason: collision with root package name */
        c f15466h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f15461c = kVar;
            return this;
        }
    }

    public b() {
        this.f15451a = k.NOT_REQUIRED;
        this.f15456f = -1L;
        this.f15457g = -1L;
        this.f15458h = new c();
    }

    b(a aVar) {
        this.f15451a = k.NOT_REQUIRED;
        this.f15456f = -1L;
        this.f15457g = -1L;
        this.f15458h = new c();
        this.f15452b = aVar.f15459a;
        int i7 = Build.VERSION.SDK_INT;
        this.f15453c = i7 >= 23 && aVar.f15460b;
        this.f15451a = aVar.f15461c;
        this.f15454d = aVar.f15462d;
        this.f15455e = aVar.f15463e;
        if (i7 >= 24) {
            this.f15458h = aVar.f15466h;
            this.f15456f = aVar.f15464f;
            this.f15457g = aVar.f15465g;
        }
    }

    public b(b bVar) {
        this.f15451a = k.NOT_REQUIRED;
        this.f15456f = -1L;
        this.f15457g = -1L;
        this.f15458h = new c();
        this.f15452b = bVar.f15452b;
        this.f15453c = bVar.f15453c;
        this.f15451a = bVar.f15451a;
        this.f15454d = bVar.f15454d;
        this.f15455e = bVar.f15455e;
        this.f15458h = bVar.f15458h;
    }

    public c a() {
        return this.f15458h;
    }

    public k b() {
        return this.f15451a;
    }

    public long c() {
        return this.f15456f;
    }

    public long d() {
        return this.f15457g;
    }

    public boolean e() {
        return this.f15458h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15452b == bVar.f15452b && this.f15453c == bVar.f15453c && this.f15454d == bVar.f15454d && this.f15455e == bVar.f15455e && this.f15456f == bVar.f15456f && this.f15457g == bVar.f15457g && this.f15451a == bVar.f15451a) {
            return this.f15458h.equals(bVar.f15458h);
        }
        return false;
    }

    public boolean f() {
        return this.f15454d;
    }

    public boolean g() {
        return this.f15452b;
    }

    public boolean h() {
        return this.f15453c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f15451a.hashCode() * 31) + (this.f15452b ? 1 : 0)) * 31) + (this.f15453c ? 1 : 0)) * 31) + (this.f15454d ? 1 : 0)) * 31) + (this.f15455e ? 1 : 0)) * 31;
        long j7 = this.f15456f;
        int i7 = (hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f15457g;
        return ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f15458h.hashCode();
    }

    public boolean i() {
        return this.f15455e;
    }

    public void j(c cVar) {
        this.f15458h = cVar;
    }

    public void k(k kVar) {
        this.f15451a = kVar;
    }

    public void l(boolean z6) {
        this.f15454d = z6;
    }

    public void m(boolean z6) {
        this.f15452b = z6;
    }

    public void n(boolean z6) {
        this.f15453c = z6;
    }

    public void o(boolean z6) {
        this.f15455e = z6;
    }

    public void p(long j7) {
        this.f15456f = j7;
    }

    public void q(long j7) {
        this.f15457g = j7;
    }
}
