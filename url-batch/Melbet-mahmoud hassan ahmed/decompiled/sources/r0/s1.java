package r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r0.i;

/* loaded from: classes.dex */
public final class s1 implements i {
    private static final s1 L = new b().E();
    public static final i.a<s1> M = new i.a() { // from class: r0.r1
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            s1 e7;
            e7 = s1.e(bundle);
            return e7;
        }
    };
    public final byte[] A;
    public final int B;
    public final p2.c C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    private int K;

    /* renamed from: f, reason: collision with root package name */
    public final String f20945f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20946g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20947h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20948i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20949j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20950k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20951l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20952m;

    /* renamed from: n, reason: collision with root package name */
    public final String f20953n;

    /* renamed from: o, reason: collision with root package name */
    public final j1.a f20954o;

    /* renamed from: p, reason: collision with root package name */
    public final String f20955p;

    /* renamed from: q, reason: collision with root package name */
    public final String f20956q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20957r;

    /* renamed from: s, reason: collision with root package name */
    public final List<byte[]> f20958s;

    /* renamed from: t, reason: collision with root package name */
    public final v0.m f20959t;

    /* renamed from: u, reason: collision with root package name */
    public final long f20960u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20961v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20962w;

    /* renamed from: x, reason: collision with root package name */
    public final float f20963x;

    /* renamed from: y, reason: collision with root package name */
    public final int f20964y;

    /* renamed from: z, reason: collision with root package name */
    public final float f20965z;

    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* renamed from: a, reason: collision with root package name */
        private String f20966a;

        /* renamed from: b, reason: collision with root package name */
        private String f20967b;

        /* renamed from: c, reason: collision with root package name */
        private String f20968c;

        /* renamed from: d, reason: collision with root package name */
        private int f20969d;

        /* renamed from: e, reason: collision with root package name */
        private int f20970e;

        /* renamed from: f, reason: collision with root package name */
        private int f20971f;

        /* renamed from: g, reason: collision with root package name */
        private int f20972g;

        /* renamed from: h, reason: collision with root package name */
        private String f20973h;

        /* renamed from: i, reason: collision with root package name */
        private j1.a f20974i;

        /* renamed from: j, reason: collision with root package name */
        private String f20975j;

        /* renamed from: k, reason: collision with root package name */
        private String f20976k;

        /* renamed from: l, reason: collision with root package name */
        private int f20977l;

        /* renamed from: m, reason: collision with root package name */
        private List<byte[]> f20978m;

        /* renamed from: n, reason: collision with root package name */
        private v0.m f20979n;

        /* renamed from: o, reason: collision with root package name */
        private long f20980o;

        /* renamed from: p, reason: collision with root package name */
        private int f20981p;

        /* renamed from: q, reason: collision with root package name */
        private int f20982q;

        /* renamed from: r, reason: collision with root package name */
        private float f20983r;

        /* renamed from: s, reason: collision with root package name */
        private int f20984s;

        /* renamed from: t, reason: collision with root package name */
        private float f20985t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f20986u;

        /* renamed from: v, reason: collision with root package name */
        private int f20987v;

        /* renamed from: w, reason: collision with root package name */
        private p2.c f20988w;

        /* renamed from: x, reason: collision with root package name */
        private int f20989x;

        /* renamed from: y, reason: collision with root package name */
        private int f20990y;

        /* renamed from: z, reason: collision with root package name */
        private int f20991z;

        public b() {
            this.f20971f = -1;
            this.f20972g = -1;
            this.f20977l = -1;
            this.f20980o = Long.MAX_VALUE;
            this.f20981p = -1;
            this.f20982q = -1;
            this.f20983r = -1.0f;
            this.f20985t = 1.0f;
            this.f20987v = -1;
            this.f20989x = -1;
            this.f20990y = -1;
            this.f20991z = -1;
            this.C = -1;
            this.D = 0;
        }

        private b(s1 s1Var) {
            this.f20966a = s1Var.f20945f;
            this.f20967b = s1Var.f20946g;
            this.f20968c = s1Var.f20947h;
            this.f20969d = s1Var.f20948i;
            this.f20970e = s1Var.f20949j;
            this.f20971f = s1Var.f20950k;
            this.f20972g = s1Var.f20951l;
            this.f20973h = s1Var.f20953n;
            this.f20974i = s1Var.f20954o;
            this.f20975j = s1Var.f20955p;
            this.f20976k = s1Var.f20956q;
            this.f20977l = s1Var.f20957r;
            this.f20978m = s1Var.f20958s;
            this.f20979n = s1Var.f20959t;
            this.f20980o = s1Var.f20960u;
            this.f20981p = s1Var.f20961v;
            this.f20982q = s1Var.f20962w;
            this.f20983r = s1Var.f20963x;
            this.f20984s = s1Var.f20964y;
            this.f20985t = s1Var.f20965z;
            this.f20986u = s1Var.A;
            this.f20987v = s1Var.B;
            this.f20988w = s1Var.C;
            this.f20989x = s1Var.D;
            this.f20990y = s1Var.E;
            this.f20991z = s1Var.F;
            this.A = s1Var.G;
            this.B = s1Var.H;
            this.C = s1Var.I;
            this.D = s1Var.J;
        }

        public s1 E() {
            return new s1(this);
        }

        public b F(int i7) {
            this.C = i7;
            return this;
        }

        public b G(int i7) {
            this.f20971f = i7;
            return this;
        }

        public b H(int i7) {
            this.f20989x = i7;
            return this;
        }

        public b I(String str) {
            this.f20973h = str;
            return this;
        }

        public b J(p2.c cVar) {
            this.f20988w = cVar;
            return this;
        }

        public b K(String str) {
            this.f20975j = str;
            return this;
        }

        public b L(int i7) {
            this.D = i7;
            return this;
        }

        public b M(v0.m mVar) {
            this.f20979n = mVar;
            return this;
        }

        public b N(int i7) {
            this.A = i7;
            return this;
        }

        public b O(int i7) {
            this.B = i7;
            return this;
        }

        public b P(float f7) {
            this.f20983r = f7;
            return this;
        }

        public b Q(int i7) {
            this.f20982q = i7;
            return this;
        }

        public b R(int i7) {
            this.f20966a = Integer.toString(i7);
            return this;
        }

        public b S(String str) {
            this.f20966a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f20978m = list;
            return this;
        }

        public b U(String str) {
            this.f20967b = str;
            return this;
        }

        public b V(String str) {
            this.f20968c = str;
            return this;
        }

        public b W(int i7) {
            this.f20977l = i7;
            return this;
        }

        public b X(j1.a aVar) {
            this.f20974i = aVar;
            return this;
        }

        public b Y(int i7) {
            this.f20991z = i7;
            return this;
        }

        public b Z(int i7) {
            this.f20972g = i7;
            return this;
        }

        public b a0(float f7) {
            this.f20985t = f7;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f20986u = bArr;
            return this;
        }

        public b c0(int i7) {
            this.f20970e = i7;
            return this;
        }

        public b d0(int i7) {
            this.f20984s = i7;
            return this;
        }

        public b e0(String str) {
            this.f20976k = str;
            return this;
        }

        public b f0(int i7) {
            this.f20990y = i7;
            return this;
        }

        public b g0(int i7) {
            this.f20969d = i7;
            return this;
        }

        public b h0(int i7) {
            this.f20987v = i7;
            return this;
        }

        public b i0(long j7) {
            this.f20980o = j7;
            return this;
        }

        public b j0(int i7) {
            this.f20981p = i7;
            return this;
        }
    }

    private s1(b bVar) {
        this.f20945f = bVar.f20966a;
        this.f20946g = bVar.f20967b;
        this.f20947h = o2.m0.D0(bVar.f20968c);
        this.f20948i = bVar.f20969d;
        this.f20949j = bVar.f20970e;
        int i7 = bVar.f20971f;
        this.f20950k = i7;
        int i8 = bVar.f20972g;
        this.f20951l = i8;
        this.f20952m = i8 != -1 ? i8 : i7;
        this.f20953n = bVar.f20973h;
        this.f20954o = bVar.f20974i;
        this.f20955p = bVar.f20975j;
        this.f20956q = bVar.f20976k;
        this.f20957r = bVar.f20977l;
        this.f20958s = bVar.f20978m == null ? Collections.emptyList() : bVar.f20978m;
        v0.m mVar = bVar.f20979n;
        this.f20959t = mVar;
        this.f20960u = bVar.f20980o;
        this.f20961v = bVar.f20981p;
        this.f20962w = bVar.f20982q;
        this.f20963x = bVar.f20983r;
        this.f20964y = bVar.f20984s == -1 ? 0 : bVar.f20984s;
        this.f20965z = bVar.f20985t == -1.0f ? 1.0f : bVar.f20985t;
        this.A = bVar.f20986u;
        this.B = bVar.f20987v;
        this.C = bVar.f20988w;
        this.D = bVar.f20989x;
        this.E = bVar.f20990y;
        this.F = bVar.f20991z;
        this.G = bVar.A == -1 ? 0 : bVar.A;
        this.H = bVar.B != -1 ? bVar.B : 0;
        this.I = bVar.C;
        this.J = (bVar.D != 0 || mVar == null) ? bVar.D : 1;
    }

    private static <T> T d(T t6, T t7) {
        return t6 != null ? t6 : t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s1 e(Bundle bundle) {
        b bVar = new b();
        o2.c.a(bundle);
        int i7 = 0;
        String string = bundle.getString(h(0));
        s1 s1Var = L;
        bVar.S((String) d(string, s1Var.f20945f)).U((String) d(bundle.getString(h(1)), s1Var.f20946g)).V((String) d(bundle.getString(h(2)), s1Var.f20947h)).g0(bundle.getInt(h(3), s1Var.f20948i)).c0(bundle.getInt(h(4), s1Var.f20949j)).G(bundle.getInt(h(5), s1Var.f20950k)).Z(bundle.getInt(h(6), s1Var.f20951l)).I((String) d(bundle.getString(h(7)), s1Var.f20953n)).X((j1.a) d((j1.a) bundle.getParcelable(h(8)), s1Var.f20954o)).K((String) d(bundle.getString(h(9)), s1Var.f20955p)).e0((String) d(bundle.getString(h(10)), s1Var.f20956q)).W(bundle.getInt(h(11), s1Var.f20957r));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i7));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i7++;
        }
        b M2 = bVar.T(arrayList).M((v0.m) bundle.getParcelable(h(13)));
        String h7 = h(14);
        s1 s1Var2 = L;
        M2.i0(bundle.getLong(h7, s1Var2.f20960u)).j0(bundle.getInt(h(15), s1Var2.f20961v)).Q(bundle.getInt(h(16), s1Var2.f20962w)).P(bundle.getFloat(h(17), s1Var2.f20963x)).d0(bundle.getInt(h(18), s1Var2.f20964y)).a0(bundle.getFloat(h(19), s1Var2.f20965z)).b0(bundle.getByteArray(h(20))).h0(bundle.getInt(h(21), s1Var2.B));
        Bundle bundle2 = bundle.getBundle(h(22));
        if (bundle2 != null) {
            bVar.J(p2.c.f19979k.a(bundle2));
        }
        bVar.H(bundle.getInt(h(23), s1Var2.D)).f0(bundle.getInt(h(24), s1Var2.E)).Y(bundle.getInt(h(25), s1Var2.F)).N(bundle.getInt(h(26), s1Var2.G)).O(bundle.getInt(h(27), s1Var2.H)).F(bundle.getInt(h(28), s1Var2.I)).L(bundle.getInt(h(29), s1Var2.J));
        return bVar.E();
    }

    private static String h(int i7) {
        return Integer.toString(i7, 36);
    }

    private static String i(int i7) {
        return h(12) + "_" + Integer.toString(i7, 36);
    }

    public b b() {
        return new b();
    }

    public s1 c(int i7) {
        return b().L(i7).E();
    }

    public boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        int i8 = this.K;
        return (i8 == 0 || (i7 = s1Var.K) == 0 || i8 == i7) && this.f20948i == s1Var.f20948i && this.f20949j == s1Var.f20949j && this.f20950k == s1Var.f20950k && this.f20951l == s1Var.f20951l && this.f20957r == s1Var.f20957r && this.f20960u == s1Var.f20960u && this.f20961v == s1Var.f20961v && this.f20962w == s1Var.f20962w && this.f20964y == s1Var.f20964y && this.B == s1Var.B && this.D == s1Var.D && this.E == s1Var.E && this.F == s1Var.F && this.G == s1Var.G && this.H == s1Var.H && this.I == s1Var.I && this.J == s1Var.J && Float.compare(this.f20963x, s1Var.f20963x) == 0 && Float.compare(this.f20965z, s1Var.f20965z) == 0 && o2.m0.c(this.f20945f, s1Var.f20945f) && o2.m0.c(this.f20946g, s1Var.f20946g) && o2.m0.c(this.f20953n, s1Var.f20953n) && o2.m0.c(this.f20955p, s1Var.f20955p) && o2.m0.c(this.f20956q, s1Var.f20956q) && o2.m0.c(this.f20947h, s1Var.f20947h) && Arrays.equals(this.A, s1Var.A) && o2.m0.c(this.f20954o, s1Var.f20954o) && o2.m0.c(this.C, s1Var.C) && o2.m0.c(this.f20959t, s1Var.f20959t) && g(s1Var);
    }

    public int f() {
        int i7;
        int i8 = this.f20961v;
        if (i8 == -1 || (i7 = this.f20962w) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public boolean g(s1 s1Var) {
        if (this.f20958s.size() != s1Var.f20958s.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f20958s.size(); i7++) {
            if (!Arrays.equals(this.f20958s.get(i7), s1Var.f20958s.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.K == 0) {
            String str = this.f20945f;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20946g;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f20947h;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f20948i) * 31) + this.f20949j) * 31) + this.f20950k) * 31) + this.f20951l) * 31;
            String str4 = this.f20953n;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            j1.a aVar = this.f20954o;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f20955p;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f20956q;
            this.K = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f20957r) * 31) + ((int) this.f20960u)) * 31) + this.f20961v) * 31) + this.f20962w) * 31) + Float.floatToIntBits(this.f20963x)) * 31) + this.f20964y) * 31) + Float.floatToIntBits(this.f20965z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J;
        }
        return this.K;
    }

    public s1 j(s1 s1Var) {
        String str;
        if (this == s1Var) {
            return this;
        }
        int k7 = o2.v.k(this.f20956q);
        String str2 = s1Var.f20945f;
        String str3 = s1Var.f20946g;
        if (str3 == null) {
            str3 = this.f20946g;
        }
        String str4 = this.f20947h;
        if ((k7 == 3 || k7 == 1) && (str = s1Var.f20947h) != null) {
            str4 = str;
        }
        int i7 = this.f20950k;
        if (i7 == -1) {
            i7 = s1Var.f20950k;
        }
        int i8 = this.f20951l;
        if (i8 == -1) {
            i8 = s1Var.f20951l;
        }
        String str5 = this.f20953n;
        if (str5 == null) {
            String L2 = o2.m0.L(s1Var.f20953n, k7);
            if (o2.m0.S0(L2).length == 1) {
                str5 = L2;
            }
        }
        j1.a aVar = this.f20954o;
        j1.a c7 = aVar == null ? s1Var.f20954o : aVar.c(s1Var.f20954o);
        float f7 = this.f20963x;
        if (f7 == -1.0f && k7 == 2) {
            f7 = s1Var.f20963x;
        }
        return b().S(str2).U(str3).V(str4).g0(this.f20948i | s1Var.f20948i).c0(this.f20949j | s1Var.f20949j).G(i7).Z(i8).I(str5).X(c7).M(v0.m.h(s1Var.f20959t, this.f20959t)).P(f7).E();
    }

    public String toString() {
        return "Format(" + this.f20945f + ", " + this.f20946g + ", " + this.f20955p + ", " + this.f20956q + ", " + this.f20953n + ", " + this.f20952m + ", " + this.f20947h + ", [" + this.f20961v + ", " + this.f20962w + ", " + this.f20963x + "], [" + this.D + ", " + this.E + "])";
    }
}
