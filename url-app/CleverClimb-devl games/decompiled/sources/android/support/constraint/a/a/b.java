package android.support.constraint.a.a;

import android.support.constraint.a.a.a;
import java.util.ArrayList;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class b {
    public static float D = 0.5f;
    protected int B;
    protected int C;
    int I;
    int J;
    int K;
    int L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    boolean R;
    boolean U;
    boolean V;
    private int ai;
    private int aj;
    private Object ak;

    /* renamed from: a, reason: collision with root package name */
    public int f1412a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1413b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f1414c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f1415d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    android.support.constraint.a.a.a i = new android.support.constraint.a.a.a(this, a.c.LEFT);
    android.support.constraint.a.a.a j = new android.support.constraint.a.a.a(this, a.c.TOP);
    android.support.constraint.a.a.a k = new android.support.constraint.a.a.a(this, a.c.RIGHT);
    android.support.constraint.a.a.a l = new android.support.constraint.a.a.a(this, a.c.BOTTOM);
    android.support.constraint.a.a.a m = new android.support.constraint.a.a.a(this, a.c.BASELINE);
    android.support.constraint.a.a.a n = new android.support.constraint.a.a.a(this, a.c.CENTER_X);
    android.support.constraint.a.a.a o = new android.support.constraint.a.a.a(this, a.c.CENTER_Y);
    android.support.constraint.a.a.a p = new android.support.constraint.a.a.a(this, a.c.CENTER);
    protected ArrayList<android.support.constraint.a.a.a> q = new ArrayList<>();
    b r = null;
    int s = 0;
    int t = 0;
    protected float u = 0.0f;
    protected int v = -1;
    private int aa = 0;
    private int ab = 0;
    private int ac = 0;
    private int ad = 0;
    protected int w = 0;
    protected int x = 0;
    private int ae = 0;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    protected int y = 0;
    protected int z = 0;
    int A = 0;
    float E = D;
    float F = D;
    a G = a.FIXED;
    a H = a.FIXED;
    private int al = 0;
    private int am = 0;
    private String an = null;
    private String ao = null;
    int S = 0;
    int T = 0;
    float W = 0.0f;
    float X = 0.0f;
    b Y = null;
    b Z = null;

    /* compiled from: ConstraintWidget.java */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public void a() {
        this.i.i();
        this.j.i();
        this.k.i();
        this.l.i();
        this.m.i();
        this.n.i();
        this.o.i();
        this.p.i();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.ai = 0;
        this.aj = 0;
        this.E = D;
        this.F = D;
        this.G = a.FIXED;
        this.H = a.FIXED;
        this.ak = null;
        this.al = 0;
        this.am = 0;
        this.an = null;
        this.ao = null;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = 0.0f;
        this.X = 0.0f;
        this.f1412a = -1;
        this.f1413b = -1;
    }

    public b() {
        D();
    }

    public void a(android.support.constraint.a.c cVar) {
        this.i.a(cVar);
        this.j.a(cVar);
        this.k.a(cVar);
        this.l.a(cVar);
        this.m.a(cVar);
        this.p.a(cVar);
        this.n.a(cVar);
        this.o.a(cVar);
    }

    private void D() {
        this.q.add(this.i);
        this.q.add(this.j);
        this.q.add(this.k);
        this.q.add(this.l);
        this.q.add(this.n);
        this.q.add(this.o);
        this.q.add(this.m);
    }

    public boolean b() {
        return this.r == null;
    }

    public b c() {
        return this.r;
    }

    public void a(b bVar) {
        this.r = bVar;
    }

    public void a(int i) {
        this.am = i;
    }

    public int d() {
        return this.am;
    }

    public String e() {
        return this.an;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.ao != null) {
            str = "type: " + this.ao + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.an != null) {
            str2 = "id: " + this.an + " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(") - (");
        sb.append(this.s);
        sb.append(" x ");
        sb.append(this.t);
        sb.append(")");
        sb.append(" wrap: (");
        sb.append(this.ai);
        sb.append(" x ");
        sb.append(this.aj);
        sb.append(")");
        return sb.toString();
    }

    public int f() {
        return this.w;
    }

    public int g() {
        return this.x;
    }

    public int h() {
        if (this.am == 8) {
            return 0;
        }
        return this.s;
    }

    public int i() {
        int i;
        int i2 = this.s;
        if (this.G != a.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f1414c == 1) {
            i = Math.max(this.e, i2);
        } else if (this.e > 0) {
            i = this.e;
            this.s = i;
        } else {
            i = 0;
        }
        return (this.f <= 0 || this.f >= i) ? i : this.f;
    }

    public int j() {
        int i;
        int i2 = this.t;
        if (this.H != a.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f1415d == 1) {
            i = Math.max(this.g, i2);
        } else if (this.g > 0) {
            i = this.g;
            this.t = i;
        } else {
            i = 0;
        }
        return (this.h <= 0 || this.h >= i) ? i : this.h;
    }

    public int k() {
        return this.ai;
    }

    public int l() {
        if (this.am == 8) {
            return 0;
        }
        return this.t;
    }

    public int m() {
        return this.aj;
    }

    public int n() {
        return this.ae + this.y;
    }

    public int o() {
        return this.af + this.z;
    }

    public int p() {
        return o() + this.ah;
    }

    public int q() {
        return n() + this.ag;
    }

    protected int r() {
        return this.w + this.y;
    }

    protected int s() {
        return this.x + this.z;
    }

    public int t() {
        return f() + this.s;
    }

    public int u() {
        return g() + this.t;
    }

    public boolean v() {
        return this.A > 0;
    }

    public int w() {
        return this.A;
    }

    public Object x() {
        return this.ak;
    }

    public ArrayList<android.support.constraint.a.a.a> y() {
        return this.q;
    }

    public void b(int i) {
        this.w = i;
    }

    public void c(int i) {
        this.x = i;
    }

    public void a(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    public void b(int i, int i2) {
        this.y = i;
        this.z = i2;
    }

    public void z() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.w + this.s;
        int i4 = this.x + this.t;
        this.ae = i;
        this.af = i2;
        this.ag = i3 - i;
        this.ah = i4 - i2;
    }

    public void d(int i) {
        this.s = i;
        if (this.s < this.B) {
            this.s = this.B;
        }
    }

    public void e(int i) {
        this.t = i;
        if (this.t < this.C) {
            this.t = this.C;
        }
    }

    public void a(int i, int i2, int i3) {
        this.f1414c = i;
        this.e = i2;
        this.f = i3;
    }

    public void b(int i, int i2, int i3) {
        this.f1415d = i;
        this.g = i2;
        this.h = i3;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:31:0x0085). Please report as a decompilation issue!!! */
    public void a(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.u = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i3, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i2 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = 0.0f;
        } else {
            String substring4 = str.substring(i3);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.u = f;
            this.v = i2;
        }
    }

    public void a(float f) {
        this.E = f;
    }

    public void b(float f) {
        this.F = f;
    }

    public void f(int i) {
        if (i < 0) {
            this.B = 0;
        } else {
            this.B = i;
        }
    }

    public void g(int i) {
        if (i < 0) {
            this.C = 0;
        } else {
            this.C = i;
        }
    }

    public void h(int i) {
        this.ai = i;
    }

    public void i(int i) {
        this.aj = i;
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.w = i;
        this.x = i2;
        if (this.am == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.G == a.FIXED && i5 < this.s) {
            i5 = this.s;
        }
        if (this.H == a.FIXED && i6 < this.t) {
            i6 = this.t;
        }
        this.s = i5;
        this.t = i6;
        if (this.t < this.C) {
            this.t = this.C;
        }
        if (this.s < this.B) {
            this.s = this.B;
        }
    }

    public void c(int i, int i2) {
        this.w = i;
        this.s = i2 - i;
        if (this.s < this.B) {
            this.s = this.B;
        }
    }

    public void d(int i, int i2) {
        this.x = i;
        this.t = i2 - i;
        if (this.t < this.C) {
            this.t = this.C;
        }
    }

    public void j(int i) {
        this.A = i;
    }

    public void a(Object obj) {
        this.ak = obj;
    }

    public void c(float f) {
        this.W = f;
    }

    public void d(float f) {
        this.X = f;
    }

    public void k(int i) {
        this.S = i;
    }

    public void l(int i) {
        this.T = i;
    }

    public void a(a.c cVar, b bVar, a.c cVar2, int i, int i2) {
        a(cVar).a(bVar.a(cVar2), i, i2, a.b.STRONG, 0, true);
    }

    public void A() {
        b c2 = c();
        if (c2 != null && (c2 instanceof c) && ((c) c()).G()) {
            return;
        }
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.q.get(i).i();
        }
    }

    public android.support.constraint.a.a.a a(a.c cVar) {
        switch (cVar) {
            case LEFT:
                return this.i;
            case TOP:
                return this.j;
            case RIGHT:
                return this.k;
            case BOTTOM:
                return this.l;
            case BASELINE:
                return this.m;
            case CENTER_X:
                return this.n;
            case CENTER_Y:
                return this.o;
            case CENTER:
                return this.p;
            default:
                return null;
        }
    }

    public a B() {
        return this.G;
    }

    public a C() {
        return this.H;
    }

    public void a(a aVar) {
        this.G = aVar;
        if (this.G == a.WRAP_CONTENT) {
            d(this.ai);
        }
    }

    public void b(a aVar) {
        this.H = aVar;
        if (this.H == a.WRAP_CONTENT) {
            e(this.aj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0419, code lost:
    
        if (r14 != (-1)) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x054a, code lost:
    
        if (r9.l.g == r45) goto L275;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0403 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(android.support.constraint.a.e eVar, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        float f;
        boolean z4;
        boolean z5;
        int i5;
        android.support.constraint.a.g gVar;
        android.support.constraint.a.g gVar2;
        android.support.constraint.a.g gVar3;
        android.support.constraint.a.g gVar4;
        int i6;
        android.support.constraint.a.g gVar5;
        int i7;
        boolean z6;
        int i8;
        android.support.constraint.a.g gVar6;
        android.support.constraint.a.g gVar7;
        b bVar;
        android.support.constraint.a.g gVar8;
        android.support.constraint.a.g gVar9;
        b bVar2;
        android.support.constraint.a.g gVar10;
        android.support.constraint.a.g gVar11;
        int i9;
        android.support.constraint.a.g gVar12;
        android.support.constraint.a.g gVar13;
        android.support.constraint.a.g gVar14;
        android.support.constraint.a.e eVar2;
        android.support.constraint.a.a.a aVar;
        int i10;
        android.support.constraint.a.g gVar15;
        android.support.constraint.a.e eVar3;
        boolean z7;
        boolean z8;
        b bVar3 = this;
        android.support.constraint.a.g a2 = (i == Integer.MAX_VALUE || bVar3.i.g == i) ? eVar.a(bVar3.i) : null;
        android.support.constraint.a.g a3 = (i == Integer.MAX_VALUE || bVar3.k.g == i) ? eVar.a(bVar3.k) : null;
        android.support.constraint.a.g a4 = (i == Integer.MAX_VALUE || bVar3.j.g == i) ? eVar.a(bVar3.j) : null;
        android.support.constraint.a.g a5 = (i == Integer.MAX_VALUE || bVar3.l.g == i) ? eVar.a(bVar3.l) : null;
        android.support.constraint.a.g a6 = (i == Integer.MAX_VALUE || bVar3.m.g == i) ? eVar.a(bVar3.m) : null;
        if (bVar3.r != null) {
            if ((bVar3.i.f1398c == null || bVar3.i.f1398c.f1398c != bVar3.i) && (bVar3.k.f1398c == null || bVar3.k.f1398c.f1398c != bVar3.k)) {
                z7 = false;
            } else {
                ((c) bVar3.r).a(bVar3, 0);
                z7 = true;
            }
            if ((bVar3.j.f1398c == null || bVar3.j.f1398c.f1398c != bVar3.j) && (bVar3.l.f1398c == null || bVar3.l.f1398c.f1398c != bVar3.l)) {
                z8 = false;
            } else {
                ((c) bVar3.r).a(bVar3, 1);
                z8 = true;
            }
            if (bVar3.r.B() == a.WRAP_CONTENT && !z7) {
                if (bVar3.i.f1398c == null || bVar3.i.f1398c.f1396a != bVar3.r) {
                    android.support.constraint.a.g a7 = eVar.a(bVar3.r.i);
                    android.support.constraint.a.b b2 = eVar.b();
                    b2.a(a2, a7, eVar.c(), 0);
                    eVar.a(b2);
                } else if (bVar3.i.f1398c != null && bVar3.i.f1398c.f1396a == bVar3.r) {
                    bVar3.i.a(a.EnumC0003a.STRICT);
                }
                if (bVar3.k.f1398c == null || bVar3.k.f1398c.f1396a != bVar3.r) {
                    android.support.constraint.a.g a8 = eVar.a(bVar3.r.k);
                    android.support.constraint.a.b b3 = eVar.b();
                    b3.a(a8, a3, eVar.c(), 0);
                    eVar.a(b3);
                } else if (bVar3.k.f1398c != null && bVar3.k.f1398c.f1396a == bVar3.r) {
                    bVar3.k.a(a.EnumC0003a.STRICT);
                }
            }
            if (bVar3.r.C() == a.WRAP_CONTENT && !z8) {
                if (bVar3.j.f1398c == null || bVar3.j.f1398c.f1396a != bVar3.r) {
                    android.support.constraint.a.g a9 = eVar.a(bVar3.r.j);
                    android.support.constraint.a.b b4 = eVar.b();
                    b4.a(a4, a9, eVar.c(), 0);
                    eVar.a(b4);
                } else if (bVar3.j.f1398c != null && bVar3.j.f1398c.f1396a == bVar3.r) {
                    bVar3.j.a(a.EnumC0003a.STRICT);
                }
                if (bVar3.l.f1398c == null || bVar3.l.f1398c.f1396a != bVar3.r) {
                    android.support.constraint.a.g a10 = eVar.a(bVar3.r.l);
                    android.support.constraint.a.b b5 = eVar.b();
                    b5.a(a10, a5, eVar.c(), 0);
                    eVar.a(b5);
                } else if (bVar3.l.f1398c != null && bVar3.l.f1398c.f1396a == bVar3.r) {
                    bVar3.l.a(a.EnumC0003a.STRICT);
                }
            }
            z = z7;
            z2 = z8;
        } else {
            z = false;
            z2 = false;
        }
        int i11 = bVar3.s;
        if (i11 < bVar3.B) {
            i11 = bVar3.B;
        }
        int i12 = bVar3.t;
        if (i12 < bVar3.C) {
            i12 = bVar3.C;
        }
        boolean z9 = bVar3.G != a.MATCH_CONSTRAINT;
        boolean z10 = bVar3.H != a.MATCH_CONSTRAINT;
        if (!z9 && bVar3.i != null && bVar3.k != null && (bVar3.i.f1398c == null || bVar3.k.f1398c == null)) {
            z9 = true;
        }
        if (!z10 && bVar3.j != null && bVar3.l != null && ((bVar3.j.f1398c == null || bVar3.l.f1398c == null) && (bVar3.A == 0 || (bVar3.m != null && (bVar3.j.f1398c == null || bVar3.m.f1398c == null))))) {
            z10 = true;
        }
        int i13 = bVar3.v;
        float f2 = bVar3.u;
        android.support.constraint.a.g gVar16 = a5;
        if (bVar3.u > 0.0f && bVar3.am != 8) {
            if (bVar3.G != a.MATCH_CONSTRAINT || bVar3.H != a.MATCH_CONSTRAINT) {
                if (bVar3.G == a.MATCH_CONSTRAINT) {
                    i2 = (int) (bVar3.t * f2);
                    i3 = i12;
                    z3 = z10;
                    f = f2;
                    z5 = true;
                    i4 = 0;
                    z4 = false;
                } else if (bVar3.H == a.MATCH_CONSTRAINT) {
                    if (bVar3.v == -1) {
                        f2 = 1.0f / f2;
                    }
                    i2 = i11;
                    i3 = (int) (bVar3.s * f2);
                    z5 = z9;
                    f = f2;
                    i4 = 1;
                    z4 = false;
                    z3 = true;
                }
                boolean z11 = !z4 && (i4 == 0 || i4 == -1);
                boolean z12 = bVar3.G != a.WRAP_CONTENT && (bVar3 instanceof c);
                if (bVar3.f1412a != 2) {
                    if (i != Integer.MAX_VALUE && (bVar3.i.g != i || bVar3.k.g != i)) {
                        i5 = i3;
                        gVar = a6;
                        gVar2 = a4;
                        gVar3 = a3;
                        gVar4 = a2;
                        i6 = i4;
                        gVar5 = gVar16;
                    } else if (z11 && bVar3.i.f1398c != null && bVar3.k.f1398c != null) {
                        android.support.constraint.a.g a11 = eVar.a(bVar3.i);
                        android.support.constraint.a.g a12 = eVar.a(bVar3.k);
                        android.support.constraint.a.g a13 = eVar.a(bVar3.i.f());
                        android.support.constraint.a.g a14 = eVar.a(bVar3.k.f());
                        eVar.a(a11, a13, bVar3.i.d(), 3);
                        eVar.b(a12, a14, bVar3.k.d() * (-1), 3);
                        if (z) {
                            i5 = i3;
                            gVar = a6;
                            gVar5 = gVar16;
                        } else {
                            i5 = i3;
                            gVar = a6;
                            gVar5 = gVar16;
                            eVar.a(a11, a13, bVar3.i.d(), bVar3.E, a14, a12, bVar3.k.d(), 4);
                        }
                        gVar2 = a4;
                        gVar3 = a3;
                        gVar4 = a2;
                        i6 = i4;
                    } else {
                        i5 = i3;
                        gVar = a6;
                        gVar5 = gVar16;
                        gVar2 = a4;
                        gVar3 = a3;
                        gVar4 = a2;
                        i6 = i4;
                        a(eVar, z12, z5, bVar3.i, bVar3.k, bVar3.w, bVar3.w + i2, i2, bVar3.B, bVar3.E, z11, z, bVar3.f1414c, bVar3.e, bVar3.f);
                    }
                    if (bVar3.f1413b != 2) {
                        return;
                    }
                    boolean z13 = bVar3.H == a.WRAP_CONTENT && (bVar3 instanceof c);
                    if (z4) {
                        i7 = i6;
                        if (i7 == 1) {
                        }
                        z6 = true;
                        if (bVar3.A <= 0) {
                            android.support.constraint.a.a.a aVar2 = bVar3.l;
                            if (i == Integer.MAX_VALUE || (bVar3.l.g == i && bVar3.m.g == i)) {
                                gVar14 = gVar2;
                                eVar2 = eVar;
                                eVar2.c(gVar, gVar14, w(), 5);
                            } else {
                                gVar14 = gVar2;
                                eVar2 = eVar;
                            }
                            if (bVar3.m.f1398c != null) {
                                i10 = bVar3.A;
                                aVar = bVar3.m;
                            } else {
                                aVar = aVar2;
                                i10 = i5;
                            }
                            if (i != Integer.MAX_VALUE && (bVar3.j.g != i || aVar.g != i)) {
                                i8 = i7;
                                gVar6 = gVar5;
                                gVar7 = gVar14;
                            } else if (z6 && bVar3.j.f1398c != null && bVar3.l.f1398c != null) {
                                android.support.constraint.a.g a15 = eVar2.a(bVar3.j);
                                android.support.constraint.a.g a16 = eVar2.a(bVar3.l);
                                android.support.constraint.a.g a17 = eVar2.a(bVar3.j.f());
                                android.support.constraint.a.g a18 = eVar2.a(bVar3.l.f());
                                eVar2.a(a15, a17, bVar3.j.d(), 3);
                                eVar2.b(a16, a18, bVar3.l.d() * (-1), 3);
                                if (z2) {
                                    gVar15 = gVar14;
                                    eVar3 = eVar2;
                                } else {
                                    gVar15 = gVar14;
                                    eVar3 = eVar2;
                                    eVar.a(a15, a17, bVar3.j.d(), bVar3.F, a18, a16, bVar3.l.d(), 4);
                                }
                                i8 = i7;
                                gVar6 = gVar5;
                                gVar7 = gVar15;
                            } else {
                                i8 = i7;
                                a(eVar, z13, z3, bVar3.j, aVar, bVar3.x, bVar3.x + i10, i10, bVar3.C, bVar3.F, z6, z2, bVar3.f1415d, bVar3.g, bVar3.h);
                                gVar6 = gVar5;
                                gVar7 = gVar14;
                                eVar.c(gVar6, gVar7, i5, 5);
                            }
                        } else {
                            i8 = i7;
                            int i14 = i5;
                            gVar6 = gVar5;
                            gVar7 = gVar2;
                            if (i != Integer.MAX_VALUE) {
                                bVar = this;
                                if (bVar.j.g == i) {
                                }
                            } else {
                                bVar = this;
                            }
                            if (z6 && bVar.j.f1398c != null && bVar.l.f1398c != null) {
                                android.support.constraint.a.g a19 = eVar.a(bVar.j);
                                android.support.constraint.a.g a20 = eVar.a(bVar.l);
                                android.support.constraint.a.g a21 = eVar.a(bVar.j.f());
                                android.support.constraint.a.g a22 = eVar.a(bVar.l.f());
                                eVar.a(a19, a21, bVar.j.d(), 3);
                                eVar.b(a20, a22, bVar.l.d() * (-1), 3);
                                if (!z2) {
                                    eVar.a(a19, a21, bVar.j.d(), bVar.F, a22, a20, bVar.l.d(), 4);
                                }
                            } else {
                                gVar8 = gVar6;
                                gVar9 = gVar7;
                                a(eVar, z13, z3, bVar.j, bVar.l, bVar.x, bVar.x + i14, i14, bVar.C, bVar.F, z6, z2, bVar.f1415d, bVar.g, bVar.h);
                                if (z4) {
                                    android.support.constraint.a.b b6 = eVar.b();
                                    if (i != Integer.MAX_VALUE) {
                                        bVar2 = this;
                                        if (bVar2.i.g != i || bVar2.k.g != i) {
                                            return;
                                        }
                                    } else {
                                        bVar2 = this;
                                    }
                                    int i15 = i8;
                                    if (i15 == 0) {
                                        eVar.a(b6.a(gVar3, gVar4, gVar8, gVar9, f));
                                        return;
                                    }
                                    if (i15 == 1) {
                                        eVar.a(b6.a(gVar8, gVar9, gVar3, gVar4, f));
                                        return;
                                    }
                                    if (bVar2.e > 0) {
                                        gVar10 = gVar3;
                                        gVar11 = gVar4;
                                        i9 = 3;
                                        eVar.a(gVar10, gVar11, bVar2.e, 3);
                                    } else {
                                        gVar10 = gVar3;
                                        gVar11 = gVar4;
                                        i9 = 3;
                                    }
                                    if (bVar2.g > 0) {
                                        gVar12 = gVar8;
                                        gVar13 = gVar9;
                                        eVar.a(gVar12, gVar13, bVar2.g, i9);
                                    } else {
                                        gVar12 = gVar8;
                                        gVar13 = gVar9;
                                    }
                                    b6.a(gVar10, gVar11, gVar12, gVar13, f);
                                    android.support.constraint.a.g d2 = eVar.d();
                                    android.support.constraint.a.g d3 = eVar.d();
                                    d2.f1446c = 4;
                                    d3.f1446c = 4;
                                    b6.a(d2, d3);
                                    eVar.a(b6);
                                    return;
                                }
                                return;
                            }
                        }
                        gVar8 = gVar6;
                        gVar9 = gVar7;
                        if (z4) {
                        }
                    } else {
                        i7 = i6;
                    }
                    z6 = false;
                    if (bVar3.A <= 0) {
                    }
                    gVar8 = gVar6;
                    gVar9 = gVar7;
                    if (z4) {
                    }
                } else {
                    i5 = i3;
                    gVar = a6;
                    gVar2 = a4;
                    gVar3 = a3;
                    gVar4 = a2;
                    i6 = i4;
                    gVar5 = gVar16;
                }
                bVar3 = this;
                if (bVar3.f1413b != 2) {
                }
            } else {
                if (z9 && !z10) {
                    i2 = i11;
                    i3 = i12;
                    z3 = z10;
                    f = f2;
                    i4 = 0;
                } else if (z9 || !z10) {
                    i2 = i11;
                    i3 = i12;
                    z3 = z10;
                    i4 = i13;
                    f = f2;
                } else {
                    if (bVar3.v == -1) {
                        i2 = i11;
                        i3 = i12;
                        z3 = z10;
                        f = 1.0f / f2;
                    } else {
                        i2 = i11;
                        i3 = i12;
                        z3 = z10;
                        f = f2;
                    }
                    i4 = 1;
                }
                z4 = true;
                z5 = z9;
                if (z4) {
                }
                if (bVar3.G != a.WRAP_CONTENT) {
                }
                if (bVar3.f1412a != 2) {
                }
                bVar3 = this;
                if (bVar3.f1413b != 2) {
                }
            }
        }
        i2 = i11;
        i3 = i12;
        z3 = z10;
        i4 = i13;
        f = f2;
        z4 = false;
        z5 = z9;
        if (z4) {
        }
        if (bVar3.G != a.WRAP_CONTENT) {
        }
        if (bVar3.f1412a != 2) {
        }
        bVar3 = this;
        if (bVar3.f1413b != 2) {
        }
    }

    private void a(android.support.constraint.a.e eVar, boolean z, boolean z2, android.support.constraint.a.a.a aVar, android.support.constraint.a.a.a aVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        boolean z5;
        int i8;
        int i9 = i6;
        android.support.constraint.a.g a2 = eVar.a(aVar);
        android.support.constraint.a.g a3 = eVar.a(aVar2);
        android.support.constraint.a.g a4 = eVar.a(aVar.f());
        android.support.constraint.a.g a5 = eVar.a(aVar2.f());
        int d2 = aVar.d();
        int d3 = aVar2.d();
        if (this.am == 8) {
            z5 = true;
            i8 = 0;
        } else {
            z5 = z2;
            i8 = i3;
        }
        if (a4 == null && a5 == null) {
            eVar.a(eVar.b().b(a2, i));
            if (z3) {
                return;
            }
            if (z) {
                eVar.a(android.support.constraint.a.e.a(eVar, a3, a2, i4, true));
                return;
            } else if (z5) {
                eVar.a(android.support.constraint.a.e.a(eVar, a3, a2, i8, false));
                return;
            } else {
                eVar.a(eVar.b().b(a3, i2));
                return;
            }
        }
        if (a4 != null && a5 == null) {
            eVar.a(eVar.b().a(a2, a4, d2));
            if (z) {
                eVar.a(android.support.constraint.a.e.a(eVar, a3, a2, i4, true));
                return;
            } else {
                if (z3) {
                    return;
                }
                if (z5) {
                    eVar.a(eVar.b().a(a3, a2, i8));
                    return;
                } else {
                    eVar.a(eVar.b().b(a3, i2));
                    return;
                }
            }
        }
        if (a4 == null && a5 != null) {
            eVar.a(eVar.b().a(a3, a5, d3 * (-1)));
            if (z) {
                eVar.a(android.support.constraint.a.e.a(eVar, a3, a2, i4, true));
                return;
            } else {
                if (z3) {
                    return;
                }
                if (z5) {
                    eVar.a(eVar.b().a(a3, a2, i8));
                    return;
                } else {
                    eVar.a(eVar.b().b(a2, i));
                    return;
                }
            }
        }
        if (z5) {
            if (z) {
                eVar.a(android.support.constraint.a.e.a(eVar, a3, a2, i4, true));
            } else {
                eVar.a(eVar.b().a(a3, a2, i8));
            }
            if (aVar.e() == aVar2.e()) {
                if (a4 == a5) {
                    eVar.a(android.support.constraint.a.e.a(eVar, a2, a4, 0, 0.5f, a5, a3, 0, true));
                    return;
                } else {
                    if (z4) {
                        return;
                    }
                    eVar.a(android.support.constraint.a.e.b(eVar, a2, a4, d2, aVar.g() != a.EnumC0003a.STRICT));
                    eVar.a(android.support.constraint.a.e.c(eVar, a3, a5, d3 * (-1), aVar2.g() != a.EnumC0003a.STRICT));
                    eVar.a(android.support.constraint.a.e.a(eVar, a2, a4, d2, f, a5, a3, d3, false));
                    return;
                }
            }
            if (aVar.e() == a.b.STRONG) {
                eVar.a(eVar.b().a(a2, a4, d2));
                android.support.constraint.a.g c2 = eVar.c();
                android.support.constraint.a.b b2 = eVar.b();
                b2.b(a3, a5, c2, d3 * (-1));
                eVar.a(b2);
                return;
            }
            android.support.constraint.a.g c3 = eVar.c();
            android.support.constraint.a.b b3 = eVar.b();
            b3.a(a2, a4, c3, d2);
            eVar.a(b3);
            eVar.a(eVar.b().a(a3, a5, d3 * (-1)));
            return;
        }
        if (z3) {
            eVar.a(a2, a4, d2, 3);
            eVar.b(a3, a5, d3 * (-1), 3);
            eVar.a(android.support.constraint.a.e.a(eVar, a2, a4, d2, f, a5, a3, d3, true));
            return;
        }
        if (z4) {
            return;
        }
        if (i5 != 1) {
            if (i9 == 0 && i7 == 0) {
                eVar.a(eVar.b().a(a2, a4, d2));
                eVar.a(eVar.b().a(a3, a5, d3 * (-1)));
                return;
            }
            if (i7 > 0) {
                eVar.b(a3, a2, i7, 3);
            }
            eVar.a(a2, a4, d2, 2);
            eVar.b(a3, a5, -d3, 2);
            eVar.a(a2, a4, d2, f, a5, a3, d3, 4);
            return;
        }
        if (i9 <= i8) {
            i9 = i8;
        }
        int i10 = i7;
        if (i10 > 0) {
            if (i10 >= i9) {
                eVar.b(a3, a2, i10, 3);
            }
            eVar.c(a3, a2, i10, 3);
            eVar.a(a2, a4, d2, 2);
            eVar.b(a3, a5, -d3, 2);
            eVar.a(a2, a4, d2, f, a5, a3, d3, 4);
        }
        i10 = i9;
        eVar.c(a3, a2, i10, 3);
        eVar.a(a2, a4, d2, 2);
        eVar.b(a3, a5, -d3, 2);
        eVar.a(a2, a4, d2, f, a5, a3, d3, 4);
    }

    public void b(android.support.constraint.a.e eVar, int i) {
        if (i == Integer.MAX_VALUE) {
            a(eVar.b(this.i), eVar.b(this.j), eVar.b(this.k), eVar.b(this.l));
            return;
        }
        if (i == -2) {
            a(this.aa, this.ab, this.ac, this.ad);
            return;
        }
        if (this.i.g == i) {
            this.aa = eVar.b(this.i);
        }
        if (this.j.g == i) {
            this.ab = eVar.b(this.j);
        }
        if (this.k.g == i) {
            this.ac = eVar.b(this.k);
        }
        if (this.l.g == i) {
            this.ad = eVar.b(this.l);
        }
    }
}
