package l0;

import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    private static final String f18475s = d0.j.f("WorkSpec");

    /* renamed from: t, reason: collision with root package name */
    public static final e.a<List<Object>, List<Object>> f18476t = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f18477a;

    /* renamed from: b, reason: collision with root package name */
    public d0.s f18478b;

    /* renamed from: c, reason: collision with root package name */
    public String f18479c;

    /* renamed from: d, reason: collision with root package name */
    public String f18480d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f18481e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f18482f;

    /* renamed from: g, reason: collision with root package name */
    public long f18483g;

    /* renamed from: h, reason: collision with root package name */
    public long f18484h;

    /* renamed from: i, reason: collision with root package name */
    public long f18485i;

    /* renamed from: j, reason: collision with root package name */
    public d0.b f18486j;

    /* renamed from: k, reason: collision with root package name */
    public int f18487k;

    /* renamed from: l, reason: collision with root package name */
    public d0.a f18488l;

    /* renamed from: m, reason: collision with root package name */
    public long f18489m;

    /* renamed from: n, reason: collision with root package name */
    public long f18490n;

    /* renamed from: o, reason: collision with root package name */
    public long f18491o;

    /* renamed from: p, reason: collision with root package name */
    public long f18492p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18493q;

    /* renamed from: r, reason: collision with root package name */
    public d0.n f18494r;

    class a implements e.a<List<Object>, List<Object>> {
        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f18495a;

        /* renamed from: b, reason: collision with root package name */
        public d0.s f18496b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f18496b != bVar.f18496b) {
                return false;
            }
            return this.f18495a.equals(bVar.f18495a);
        }

        public int hashCode() {
            return (this.f18495a.hashCode() * 31) + this.f18496b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f18478b = d0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f1446c;
        this.f18481e = bVar;
        this.f18482f = bVar;
        this.f18486j = d0.b.f15450i;
        this.f18488l = d0.a.EXPONENTIAL;
        this.f18489m = 30000L;
        this.f18492p = -1L;
        this.f18494r = d0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f18477a = str;
        this.f18479c = str2;
    }

    public p(p pVar) {
        this.f18478b = d0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f1446c;
        this.f18481e = bVar;
        this.f18482f = bVar;
        this.f18486j = d0.b.f15450i;
        this.f18488l = d0.a.EXPONENTIAL;
        this.f18489m = 30000L;
        this.f18492p = -1L;
        this.f18494r = d0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f18477a = pVar.f18477a;
        this.f18479c = pVar.f18479c;
        this.f18478b = pVar.f18478b;
        this.f18480d = pVar.f18480d;
        this.f18481e = new androidx.work.b(pVar.f18481e);
        this.f18482f = new androidx.work.b(pVar.f18482f);
        this.f18483g = pVar.f18483g;
        this.f18484h = pVar.f18484h;
        this.f18485i = pVar.f18485i;
        this.f18486j = new d0.b(pVar.f18486j);
        this.f18487k = pVar.f18487k;
        this.f18488l = pVar.f18488l;
        this.f18489m = pVar.f18489m;
        this.f18490n = pVar.f18490n;
        this.f18491o = pVar.f18491o;
        this.f18492p = pVar.f18492p;
        this.f18493q = pVar.f18493q;
        this.f18494r = pVar.f18494r;
    }

    public long a() {
        if (c()) {
            return this.f18490n + Math.min(18000000L, this.f18488l == d0.a.LINEAR ? this.f18489m * this.f18487k : (long) Math.scalb(this.f18489m, this.f18487k - 1));
        }
        if (!d()) {
            long j7 = this.f18490n;
            if (j7 == 0) {
                j7 = System.currentTimeMillis();
            }
            return j7 + this.f18483g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j8 = this.f18490n;
        long j9 = j8 == 0 ? currentTimeMillis + this.f18483g : j8;
        long j10 = this.f18485i;
        long j11 = this.f18484h;
        if (j10 != j11) {
            return j9 + j11 + (j8 == 0 ? j10 * (-1) : 0L);
        }
        return j9 + (j8 != 0 ? j11 : 0L);
    }

    public boolean b() {
        return !d0.b.f15450i.equals(this.f18486j);
    }

    public boolean c() {
        return this.f18478b == d0.s.ENQUEUED && this.f18487k > 0;
    }

    public boolean d() {
        return this.f18484h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f18483g != pVar.f18483g || this.f18484h != pVar.f18484h || this.f18485i != pVar.f18485i || this.f18487k != pVar.f18487k || this.f18489m != pVar.f18489m || this.f18490n != pVar.f18490n || this.f18491o != pVar.f18491o || this.f18492p != pVar.f18492p || this.f18493q != pVar.f18493q || !this.f18477a.equals(pVar.f18477a) || this.f18478b != pVar.f18478b || !this.f18479c.equals(pVar.f18479c)) {
            return false;
        }
        String str = this.f18480d;
        if (str == null ? pVar.f18480d == null : str.equals(pVar.f18480d)) {
            return this.f18481e.equals(pVar.f18481e) && this.f18482f.equals(pVar.f18482f) && this.f18486j.equals(pVar.f18486j) && this.f18488l == pVar.f18488l && this.f18494r == pVar.f18494r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f18477a.hashCode() * 31) + this.f18478b.hashCode()) * 31) + this.f18479c.hashCode()) * 31;
        String str = this.f18480d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f18481e.hashCode()) * 31) + this.f18482f.hashCode()) * 31;
        long j7 = this.f18483g;
        int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f18484h;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f18485i;
        int hashCode3 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f18486j.hashCode()) * 31) + this.f18487k) * 31) + this.f18488l.hashCode()) * 31;
        long j10 = this.f18489m;
        int i9 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f18490n;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f18491o;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f18492p;
        return ((((i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f18493q ? 1 : 0)) * 31) + this.f18494r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f18477a + "}";
    }
}
