package c6;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1839a;

    /* renamed from: b, reason: collision with root package name */
    public int f1840b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1841c;

    /* renamed from: d, reason: collision with root package name */
    public String f1842d;

    /* renamed from: e, reason: collision with root package name */
    public t5.e f1843e;

    /* renamed from: f, reason: collision with root package name */
    public final t5.e f1844f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1845h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1846i;
    public t5.d j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1847k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1848l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1849m;

    /* renamed from: n, reason: collision with root package name */
    public long f1850n;

    /* renamed from: o, reason: collision with root package name */
    public final long f1851o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1852p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1853q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1854r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1855s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1856t;

    static {
        t5.o.f("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, int i3, String str2, String str3, t5.e eVar, t5.e eVar2, long j, long j3, long j10, t5.d dVar, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, int i12, int i13, int i14, int i15) {
        this(str, r5, str2, r7, r8, r9, (i14 & 64) != 0 ? 0L : j, (i14 & 128) != 0 ? 0L : j3, (i14 & 256) != 0 ? 0L : j10, (i14 & 512) != 0 ? t5.d.f9292i : dVar, (i14 & 1024) != 0 ? 0 : i10, (i14 & 2048) != 0 ? 1 : i11, (i14 & 4096) != 0 ? 30000L : j11, (i14 & 8192) != 0 ? 0L : j12, (i14 & 16384) != 0 ? 0L : j13, (32768 & i14) != 0 ? -1L : j14, (65536 & i14) != 0 ? false : z10, (131072 & i14) != 0 ? 1 : i12, (i14 & 262144) != 0 ? 0 : i13, 0);
        t5.e eVar3;
        t5.e eVar4;
        int i16 = (i14 & 2) != 0 ? 1 : i3;
        String str4 = (i14 & 8) != 0 ? null : str3;
        if ((i14 & 16) != 0) {
            t5.e eVar5 = t5.e.f9301c;
            eVar5.getClass();
            eVar3 = eVar5;
        } else {
            eVar3 = eVar;
        }
        if ((i14 & 32) != 0) {
            t5.e eVar6 = t5.e.f9301c;
            eVar6.getClass();
            eVar4 = eVar6;
        } else {
            eVar4 = eVar2;
        }
    }

    public final long a() {
        int i3;
        if (this.f1840b == 1 && (i3 = this.f1847k) > 0) {
            int i10 = this.f1848l;
            long j = this.f1849m;
            long scalb = i10 == 2 ? j * i3 : (long) Math.scalb(j, i3 - 1);
            long j3 = this.f1850n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j3 + scalb;
        }
        if (!c()) {
            long j10 = this.f1850n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.g;
        }
        long j11 = this.f1850n;
        int i11 = this.f1855s;
        if (i11 == 0) {
            j11 += this.g;
        }
        long j12 = this.f1846i;
        long j13 = this.f1845h;
        if (j12 != j13) {
            return j11 + j13 + (i11 == 0 ? (-1) * j12 : 0L);
        }
        return j11 + (i11 != 0 ? j13 : 0L);
    }

    public final boolean b() {
        return !Intrinsics.a(t5.d.f9292i, this.j);
    }

    public final boolean c() {
        return this.f1845h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f1839a, pVar.f1839a) && this.f1840b == pVar.f1840b && Intrinsics.a(this.f1841c, pVar.f1841c) && Intrinsics.a(this.f1842d, pVar.f1842d) && Intrinsics.a(this.f1843e, pVar.f1843e) && Intrinsics.a(this.f1844f, pVar.f1844f) && this.g == pVar.g && this.f1845h == pVar.f1845h && this.f1846i == pVar.f1846i && Intrinsics.a(this.j, pVar.j) && this.f1847k == pVar.f1847k && this.f1848l == pVar.f1848l && this.f1849m == pVar.f1849m && this.f1850n == pVar.f1850n && this.f1851o == pVar.f1851o && this.f1852p == pVar.f1852p && this.f1853q == pVar.f1853q && this.f1854r == pVar.f1854r && this.f1855s == pVar.f1855s && this.f1856t == pVar.f1856t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f1841c.hashCode() + ((a4.i.b(this.f1840b) + (this.f1839a.hashCode() * 31)) * 31)) * 31;
        String str = this.f1842d;
        int c10 = n0.l.c(n0.l.c(n0.l.c(n0.l.c((a4.i.b(this.f1848l) + v4.a.x(this.f1847k, (this.j.hashCode() + n0.l.c(n0.l.c(n0.l.c((this.f1844f.hashCode() + ((this.f1843e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.f1845h), 31, this.f1846i)) * 31, 31)) * 31, 31, this.f1849m), 31, this.f1850n), 31, this.f1851o), 31, this.f1852p);
        boolean z10 = this.f1853q;
        int i3 = z10;
        if (z10 != 0) {
            i3 = 1;
        }
        return Integer.hashCode(this.f1856t) + v4.a.x(this.f1855s, (a4.i.b(this.f1854r) + ((c10 + i3) * 31)) * 31, 31);
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("{WorkSpec: "), this.f1839a, '}');
    }

    public p(String str, int i3, String str2, String str3, t5.e eVar, t5.e eVar2, long j, long j3, long j10, t5.d dVar, int i10, int i11, long j11, long j12, long j13, long j14, boolean z10, int i12, int i13, int i14) {
        str.getClass();
        if (i3 == 0) {
            throw null;
        }
        str2.getClass();
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        if (i11 == 0) {
            throw null;
        }
        if (i12 != 0) {
            this.f1839a = str;
            this.f1840b = i3;
            this.f1841c = str2;
            this.f1842d = str3;
            this.f1843e = eVar;
            this.f1844f = eVar2;
            this.g = j;
            this.f1845h = j3;
            this.f1846i = j10;
            this.j = dVar;
            this.f1847k = i10;
            this.f1848l = i11;
            this.f1849m = j11;
            this.f1850n = j12;
            this.f1851o = j13;
            this.f1852p = j14;
            this.f1853q = z10;
            this.f1854r = i12;
            this.f1855s = i13;
            this.f1856t = i14;
            return;
        }
        throw null;
    }
}
