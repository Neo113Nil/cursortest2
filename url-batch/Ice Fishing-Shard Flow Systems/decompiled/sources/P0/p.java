package P0;

import G0.A;
import G0.EnumC0101a;
import G0.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2220a;

    /* renamed from: b, reason: collision with root package name */
    public A f2221b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2222c;

    /* renamed from: d, reason: collision with root package name */
    public String f2223d;

    /* renamed from: e, reason: collision with root package name */
    public G0.h f2224e;

    /* renamed from: f, reason: collision with root package name */
    public final G0.h f2225f;

    /* renamed from: g, reason: collision with root package name */
    public long f2226g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2227h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2228i;
    public G0.e j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2229k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0101a f2230l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2231m;

    /* renamed from: n, reason: collision with root package name */
    public long f2232n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2233o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2234p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2235q;

    /* renamed from: r, reason: collision with root package name */
    public final z f2236r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2237s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2238t;

    static {
        Intrinsics.checkNotNullExpressionValue(G0.s.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String id, A state, String workerClassName, String str, G0.h input, G0.h output, long j, long j7, long j8, G0.e constraints, int i2, EnumC0101a backoffPolicy, long j9, long j10, long j11, long j12, boolean z7, z outOfQuotaPolicy, int i5, int i7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f2220a = id;
        this.f2221b = state;
        this.f2222c = workerClassName;
        this.f2223d = str;
        this.f2224e = input;
        this.f2225f = output;
        this.f2226g = j;
        this.f2227h = j7;
        this.f2228i = j8;
        this.j = constraints;
        this.f2229k = i2;
        this.f2230l = backoffPolicy;
        this.f2231m = j9;
        this.f2232n = j10;
        this.f2233o = j11;
        this.f2234p = j12;
        this.f2235q = z7;
        this.f2236r = outOfQuotaPolicy;
        this.f2237s = i5;
        this.f2238t = i7;
    }

    public final long a() {
        int i2;
        if (this.f2221b == A.f770d && (i2 = this.f2229k) > 0) {
            EnumC0101a enumC0101a = this.f2230l;
            EnumC0101a enumC0101a2 = EnumC0101a.f779e;
            long j = this.f2231m;
            long scalb = enumC0101a == enumC0101a2 ? j * i2 : (long) Math.scalb(j, i2 - 1);
            long j7 = this.f2232n;
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j7 + scalb;
        }
        if (!c()) {
            long j8 = this.f2232n;
            if (j8 == 0) {
                j8 = System.currentTimeMillis();
            }
            return j8 + this.f2226g;
        }
        int i5 = this.f2237s;
        long j9 = this.f2232n;
        if (i5 == 0) {
            j9 += this.f2226g;
        }
        long j10 = this.f2228i;
        long j11 = this.f2227h;
        if (j10 != j11) {
            return j9 + j11 + (i5 == 0 ? (-1) * j10 : 0L);
        }
        return j9 + (i5 != 0 ? j11 : 0L);
    }

    public final boolean b() {
        return !Intrinsics.a(G0.e.f793i, this.j);
    }

    public final boolean c() {
        return this.f2227h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f2220a, pVar.f2220a) && this.f2221b == pVar.f2221b && Intrinsics.a(this.f2222c, pVar.f2222c) && Intrinsics.a(this.f2223d, pVar.f2223d) && Intrinsics.a(this.f2224e, pVar.f2224e) && Intrinsics.a(this.f2225f, pVar.f2225f) && this.f2226g == pVar.f2226g && this.f2227h == pVar.f2227h && this.f2228i == pVar.f2228i && Intrinsics.a(this.j, pVar.j) && this.f2229k == pVar.f2229k && this.f2230l == pVar.f2230l && this.f2231m == pVar.f2231m && this.f2232n == pVar.f2232n && this.f2233o == pVar.f2233o && this.f2234p == pVar.f2234p && this.f2235q == pVar.f2235q && this.f2236r == pVar.f2236r && this.f2237s == pVar.f2237s && this.f2238t == pVar.f2238t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int e7 = C4.p.e(this.f2222c, (this.f2221b.hashCode() + (this.f2220a.hashCode() * 31)) * 31, 31);
        String str = this.f2223d;
        int hashCode = (Long.hashCode(this.f2234p) + ((Long.hashCode(this.f2233o) + ((Long.hashCode(this.f2232n) + ((Long.hashCode(this.f2231m) + ((this.f2230l.hashCode() + ((Integer.hashCode(this.f2229k) + ((this.j.hashCode() + ((Long.hashCode(this.f2228i) + ((Long.hashCode(this.f2227h) + ((Long.hashCode(this.f2226g) + ((this.f2225f.hashCode() + ((this.f2224e.hashCode() + ((e7 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z7 = this.f2235q;
        int i2 = z7;
        if (z7 != 0) {
            i2 = 1;
        }
        return Integer.hashCode(this.f2238t) + ((Integer.hashCode(this.f2237s) + ((this.f2236r.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2220a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(String str, A a7, String str2, String str3, G0.h hVar, G0.h hVar2, long j, long j7, long j8, G0.e eVar, int i2, EnumC0101a enumC0101a, long j9, long j10, long j11, long j12, boolean z7, z zVar, int i5, int i7, int i8) {
        this(str, r4, str2, r6, r7, r8, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j7, (i7 & 256) != 0 ? 0L : j8, (i7 & 512) != 0 ? G0.e.f793i : eVar, (i7 & 1024) != 0 ? 0 : i2, (i7 & 2048) != 0 ? EnumC0101a.f778d : enumC0101a, (i7 & 4096) != 0 ? 30000L : j9, (i7 & 8192) != 0 ? 0L : j10, (i7 & 16384) != 0 ? 0L : j11, (32768 & i7) != 0 ? -1L : j12, (65536 & i7) != 0 ? false : z7, (131072 & i7) != 0 ? z.f838d : zVar, (i7 & 262144) != 0 ? 0 : i5, 0);
        G0.h hVar3;
        G0.h hVar4;
        A a8 = (i7 & 2) != 0 ? A.f770d : a7;
        String str4 = (i7 & 8) != 0 ? null : str3;
        if ((i7 & 16) != 0) {
            G0.h EMPTY = G0.h.f809c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            hVar3 = EMPTY;
        } else {
            hVar3 = hVar;
        }
        if ((i7 & 32) != 0) {
            G0.h EMPTY2 = G0.h.f809c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            hVar4 = EMPTY2;
        } else {
            hVar4 = hVar2;
        }
    }
}
