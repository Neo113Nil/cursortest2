package u0;

/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686p {

    /* renamed from: a, reason: collision with root package name */
    public final String f6000a;

    /* renamed from: b, reason: collision with root package name */
    public int f6001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6002c;

    /* renamed from: d, reason: collision with root package name */
    public String f6003d;

    /* renamed from: e, reason: collision with root package name */
    public l0.g f6004e;

    /* renamed from: f, reason: collision with root package name */
    public final l0.g f6005f;

    /* renamed from: g, reason: collision with root package name */
    public long f6006g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6007h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6008i;

    /* renamed from: j, reason: collision with root package name */
    public l0.d f6009j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6010k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6011l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6012m;

    /* renamed from: n, reason: collision with root package name */
    public long f6013n;

    /* renamed from: o, reason: collision with root package name */
    public final long f6014o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6015p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6016q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6017r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6018s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6019t;

    static {
        kotlin.jvm.internal.i.d(l0.q.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public C0686p(String id, int i7, String workerClassName, String str, l0.g input, l0.g output, long j4, long j7, long j8, l0.d constraints, int i8, int i9, long j9, long j10, long j11, long j12, boolean z5, int i10, int i11, int i12) {
        kotlin.jvm.internal.i.e(id, "id");
        W4.o.f("state", i7);
        kotlin.jvm.internal.i.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(output, "output");
        kotlin.jvm.internal.i.e(constraints, "constraints");
        W4.o.f("backoffPolicy", i9);
        W4.o.f("outOfQuotaPolicy", i10);
        this.f6000a = id;
        this.f6001b = i7;
        this.f6002c = workerClassName;
        this.f6003d = str;
        this.f6004e = input;
        this.f6005f = output;
        this.f6006g = j4;
        this.f6007h = j7;
        this.f6008i = j8;
        this.f6009j = constraints;
        this.f6010k = i8;
        this.f6011l = i9;
        this.f6012m = j9;
        this.f6013n = j10;
        this.f6014o = j11;
        this.f6015p = j12;
        this.f6016q = z5;
        this.f6017r = i10;
        this.f6018s = i11;
        this.f6019t = i12;
    }

    public final long a() {
        int i7;
        if (this.f6001b == 1 && (i7 = this.f6010k) > 0) {
            int i8 = this.f6011l;
            long j4 = this.f6012m;
            long scalb = i8 == 2 ? j4 * i7 : (long) Math.scalb(j4, i7 - 1);
            long j7 = this.f6013n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j7 + scalb;
        }
        if (!c()) {
            long j8 = this.f6013n;
            if (j8 == 0) {
                j8 = System.currentTimeMillis();
            }
            return j8 + this.f6006g;
        }
        int i9 = this.f6018s;
        long j9 = this.f6013n;
        if (i9 == 0) {
            j9 += this.f6006g;
        }
        long j10 = this.f6008i;
        long j11 = this.f6007h;
        if (j10 != j11) {
            return j9 + j11 + (i9 == 0 ? (-1) * j10 : 0L);
        }
        return j9 + (i9 != 0 ? j11 : 0L);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.i.a(l0.d.f5254i, this.f6009j);
    }

    public final boolean c() {
        return this.f6007h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0686p)) {
            return false;
        }
        C0686p c0686p = (C0686p) obj;
        return kotlin.jvm.internal.i.a(this.f6000a, c0686p.f6000a) && this.f6001b == c0686p.f6001b && kotlin.jvm.internal.i.a(this.f6002c, c0686p.f6002c) && kotlin.jvm.internal.i.a(this.f6003d, c0686p.f6003d) && kotlin.jvm.internal.i.a(this.f6004e, c0686p.f6004e) && kotlin.jvm.internal.i.a(this.f6005f, c0686p.f6005f) && this.f6006g == c0686p.f6006g && this.f6007h == c0686p.f6007h && this.f6008i == c0686p.f6008i && kotlin.jvm.internal.i.a(this.f6009j, c0686p.f6009j) && this.f6010k == c0686p.f6010k && this.f6011l == c0686p.f6011l && this.f6012m == c0686p.f6012m && this.f6013n == c0686p.f6013n && this.f6014o == c0686p.f6014o && this.f6015p == c0686p.f6015p && this.f6016q == c0686p.f6016q && this.f6017r == c0686p.f6017r && this.f6018s == c0686p.f6018s && this.f6019t == c0686p.f6019t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f6002c.hashCode() + ((N.p.c(this.f6001b) + (this.f6000a.hashCode() * 31)) * 31)) * 31;
        String str = this.f6003d;
        int hashCode2 = (Long.hashCode(this.f6015p) + ((Long.hashCode(this.f6014o) + ((Long.hashCode(this.f6013n) + ((Long.hashCode(this.f6012m) + ((N.p.c(this.f6011l) + ((Integer.hashCode(this.f6010k) + ((this.f6009j.hashCode() + ((Long.hashCode(this.f6008i) + ((Long.hashCode(this.f6007h) + ((Long.hashCode(this.f6006g) + ((this.f6005f.hashCode() + ((this.f6004e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z5 = this.f6016q;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        return Integer.hashCode(this.f6019t) + ((Integer.hashCode(this.f6018s) + ((N.p.c(this.f6017r) + ((hashCode2 + i7) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f6000a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0686p(String str, int i7, String str2, String str3, l0.g gVar, l0.g gVar2, long j4, long j7, long j8, l0.d dVar, int i8, int i9, long j9, long j10, long j11, long j12, boolean z5, int i10, int i11, int i12, int i13) {
        this(str, r5, str2, r7, r8, r9, (i12 & 64) != 0 ? 0L : j4, (i12 & 128) != 0 ? 0L : j7, (i12 & 256) != 0 ? 0L : j8, (i12 & 512) != 0 ? l0.d.f5254i : dVar, (i12 & 1024) != 0 ? 0 : i8, (i12 & 2048) != 0 ? 1 : i9, (i12 & 4096) != 0 ? 30000L : j9, (i12 & 8192) != 0 ? 0L : j10, (i12 & 16384) != 0 ? 0L : j11, (32768 & i12) != 0 ? -1L : j12, (65536 & i12) != 0 ? false : z5, (131072 & i12) != 0 ? 1 : i10, (i12 & 262144) != 0 ? 0 : i11, 0);
        l0.g gVar3;
        l0.g gVar4;
        int i14 = (i12 & 2) != 0 ? 1 : i7;
        String str4 = (i12 & 8) != 0 ? null : str3;
        if ((i12 & 16) != 0) {
            l0.g EMPTY = l0.g.f5270c;
            kotlin.jvm.internal.i.d(EMPTY, "EMPTY");
            gVar3 = EMPTY;
        } else {
            gVar3 = gVar;
        }
        if ((i12 & 32) != 0) {
            l0.g EMPTY2 = l0.g.f5270c;
            kotlin.jvm.internal.i.d(EMPTY2, "EMPTY");
            gVar4 = EMPTY2;
        } else {
            gVar4 = gVar2;
        }
    }
}
