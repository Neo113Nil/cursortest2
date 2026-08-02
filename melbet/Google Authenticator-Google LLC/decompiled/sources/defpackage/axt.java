package defpackage;

import androidx.work.OverwritingInputMerger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axt {
    public static final String a = asq.b("WorkSpec");
    public final String b;
    public atb c;
    public String d;
    public String e;
    public asa f;
    public asa g;
    public long h;
    public long i;
    public long j;
    public ary k;
    public int l;
    public art m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public Boolean y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ axt(String str, atb atbVar, String str2, String str3, asa asaVar, asa asaVar2, long j, long j2, long j3, ary aryVar, int i, art artVar, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6) {
        this(str, r4, str2, r6, (i6 & 16) != 0 ? asa.a : asaVar, (i6 & 32) != 0 ? asa.a : asaVar2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? ary.a : aryVar, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? art.a : artVar, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, ((65536 & i6) == 0) & z, (131072 & i6) != 0 ? 1 : i2, (262144 & i6) != 0 ? 0 : i3, 0, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & 16777216) != 0 ? false : bool);
        String str5;
        atb atbVar2 = (i6 & 2) != 0 ? atb.a : atbVar;
        if ((i6 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ axt e(axt axtVar, String str, atb atbVar, String str2, asa asaVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3;
        Throwable th;
        long j3;
        String str4 = (i5 & 1) != 0 ? axtVar.b : str;
        atb atbVar2 = (i5 & 2) != 0 ? axtVar.c : atbVar;
        String str5 = (i5 & 4) != 0 ? axtVar.d : str2;
        String str6 = (i5 & 8) != 0 ? axtVar.e : null;
        asa asaVar2 = (i5 & 16) != 0 ? axtVar.f : asaVar;
        asa asaVar3 = (i5 & 32) != 0 ? axtVar.g : null;
        long j4 = (i5 & 64) != 0 ? axtVar.h : 0L;
        long j5 = (i5 & 128) != 0 ? axtVar.i : 0L;
        if ((i5 & 256) != 0) {
            str3 = str4;
            th = null;
            j3 = axtVar.j;
        } else {
            str3 = str4;
            th = null;
            j3 = 0;
        }
        ary aryVar = (i5 & 512) != 0 ? axtVar.k : th;
        int i6 = (i5 & 1024) != 0 ? axtVar.l : i;
        art artVar = (i5 & 2048) != 0 ? axtVar.m : th;
        long j6 = (i5 & 4096) != 0 ? axtVar.n : 0L;
        long j7 = (i5 & 8192) != 0 ? axtVar.o : j;
        long j8 = (i5 & 16384) != 0 ? axtVar.p : 0L;
        long j9 = (32768 & i5) != 0 ? axtVar.q : 0L;
        boolean z = (65536 & i5) != 0 ? axtVar.r : false;
        int i7 = (131072 & i5) != 0 ? axtVar.z : 0;
        int i8 = (262144 & i5) != 0 ? axtVar.s : i2;
        int i9 = (524288 & i5) != 0 ? axtVar.t : i3;
        long j10 = (1048576 & i5) != 0 ? axtVar.u : j2;
        int i10 = (i5 & 2097152) != 0 ? axtVar.v : i4;
        int i11 = axtVar.w;
        String str7 = axtVar.x;
        Boolean bool = axtVar.y;
        str3.getClass();
        atbVar2.getClass();
        str5.getClass();
        str6.getClass();
        asaVar2.getClass();
        asaVar3.getClass();
        aryVar.getClass();
        artVar.getClass();
        if (i7 != 0) {
            return new axt(str3, atbVar2, str5, str6, asaVar2, asaVar3, j4, j5, j3, aryVar, i6, artVar, j6, j7, j8, j9, z, i7, i8, i9, j10, i10, i11, str7, bool);
        }
        throw th;
    }

    public final long a() {
        return aei.l(c(), this.l, this.m, this.n, this.o, this.s, d(), this.h, this.j, this.i, this.u);
    }

    public final boolean b() {
        return !ksp.b(ary.a, this.k);
    }

    public final boolean c() {
        return this.c == atb.a && this.l > 0;
    }

    public final boolean d() {
        return this.i != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt)) {
            return false;
        }
        axt axtVar = (axt) obj;
        return ksp.b(this.b, axtVar.b) && this.c == axtVar.c && ksp.b(this.d, axtVar.d) && ksp.b(this.e, axtVar.e) && ksp.b(this.f, axtVar.f) && ksp.b(this.g, axtVar.g) && this.h == axtVar.h && this.i == axtVar.i && this.j == axtVar.j && ksp.b(this.k, axtVar.k) && this.l == axtVar.l && this.m == axtVar.m && this.n == axtVar.n && this.o == axtVar.o && this.p == axtVar.p && this.q == axtVar.q && this.r == axtVar.r && this.z == axtVar.z && this.s == axtVar.s && this.t == axtVar.t && this.u == axtVar.u && this.v == axtVar.v && this.w == axtVar.w && ksp.b(this.x, axtVar.x) && ksp.b(this.y, axtVar.y);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        int v = abf.v(this.h);
        int v2 = (((((((((((hashCode * 31) + v) * 31) + abf.v(this.i)) * 31) + abf.v(this.j)) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m.hashCode();
        int v3 = abf.v(this.n);
        int v4 = abf.v(this.o);
        int v5 = abf.v(this.p);
        int v6 = abf.v(this.q);
        int m = a.m(this.r);
        int i = this.z;
        a.I(i);
        int v7 = (((((((((((((((((((v2 * 31) + v3) * 31) + v4) * 31) + v5) * 31) + v6) * 31) + m) * 31) + i) * 31) + this.s) * 31) + this.t) * 31) + abf.v(this.u)) * 31) + this.v;
        String str = this.x;
        int hashCode2 = ((((v7 * 31) + this.w) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.b + "}";
    }

    public axt(String str, atb atbVar, String str2, String str3, asa asaVar, asa asaVar2, long j, long j2, long j3, ary aryVar, int i, art artVar, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool) {
        atbVar.getClass();
        str2.getClass();
        str3.getClass();
        asaVar.getClass();
        asaVar2.getClass();
        aryVar.getClass();
        artVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        this.b = str;
        this.c = atbVar;
        this.d = str2;
        this.e = str3;
        this.f = asaVar;
        this.g = asaVar2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = aryVar;
        this.l = i;
        this.m = artVar;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = z;
        this.z = i2;
        this.s = i3;
        this.t = i4;
        this.u = j8;
        this.v = i5;
        this.w = i6;
        this.x = str4;
        this.y = bool;
    }
}
