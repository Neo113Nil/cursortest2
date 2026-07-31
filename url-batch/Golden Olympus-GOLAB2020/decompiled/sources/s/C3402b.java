package s;

import java.util.ArrayList;
import s.C3404d;
import s.i;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3402b implements C3404d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f45879e;

    /* renamed from: a, reason: collision with root package name */
    i f45875a = null;

    /* renamed from: b, reason: collision with root package name */
    float f45876b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f45877c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f45878d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f45880f = false;

    /* renamed from: s.b$a */
    public interface a {
        void a(i iVar, float f4);

        int b();

        float c(C3402b c3402b, boolean z4);

        void clear();

        float d(i iVar, boolean z4);

        i e(int i4);

        float f(i iVar);

        void g();

        float h(int i4);

        boolean i(i iVar);

        void j(float f4);

        void k(i iVar, float f4, boolean z4);
    }

    public C3402b() {
    }

    private boolean v(i iVar, C3404d c3404d) {
        return iVar.f45931m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int b4 = this.f45879e.b();
        i iVar2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < b4; i4++) {
            float h4 = this.f45879e.h(i4);
            if (h4 < 0.0f) {
                i e4 = this.f45879e.e(i4);
                if ((zArr == null || !zArr[e4.f45921c]) && e4 != iVar && (((aVar = e4.f45928j) == i.a.SLACK || aVar == i.a.ERROR) && h4 < f4)) {
                    f4 = h4;
                    iVar2 = e4;
                }
            }
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String A() {
        boolean z4;
        String str = (this.f45875a == null ? "0" : "" + this.f45875a) + " = ";
        if (this.f45876b != 0.0f) {
            str = str + this.f45876b;
            z4 = true;
        } else {
            z4 = false;
        }
        int b4 = this.f45879e.b();
        for (int i4 = 0; i4 < b4; i4++) {
            i e4 = this.f45879e.e(i4);
            if (e4 != null) {
                float h4 = this.f45879e.h(i4);
                if (h4 != 0.0f) {
                    String iVar = e4.toString();
                    if (!z4) {
                        if (h4 < 0.0f) {
                            str = str + "- ";
                            h4 *= -1.0f;
                        }
                        str = h4 == 1.0f ? str + iVar : str + h4 + " " + iVar;
                        z4 = true;
                    } else if (h4 > 0.0f) {
                        str = str + " + ";
                        if (h4 == 1.0f) {
                        }
                        z4 = true;
                    } else {
                        str = str + " - ";
                        h4 *= -1.0f;
                        if (h4 == 1.0f) {
                        }
                        z4 = true;
                    }
                }
            }
        }
        if (z4) {
            return str;
        }
        return str + "0.0";
    }

    public void B(C3404d c3404d, i iVar, boolean z4) {
        if (iVar.f45925g) {
            this.f45876b += iVar.f45924f * this.f45879e.f(iVar);
            this.f45879e.d(iVar, z4);
            if (z4) {
                iVar.c(this);
            }
        }
    }

    public void C(C3402b c3402b, boolean z4) {
        this.f45876b += c3402b.f45876b * this.f45879e.c(c3402b, z4);
        if (z4) {
            c3402b.f45875a.c(this);
        }
    }

    public void D(C3404d c3404d) {
        if (c3404d.f45894f.length == 0) {
            return;
        }
        boolean z4 = false;
        while (!z4) {
            int b4 = this.f45879e.b();
            for (int i4 = 0; i4 < b4; i4++) {
                i e4 = this.f45879e.e(i4);
                if (e4.f45922d != -1 || e4.f45925g) {
                    this.f45878d.add(e4);
                }
            }
            if (this.f45878d.size() > 0) {
                ArrayList arrayList = this.f45878d;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    i iVar = (i) obj;
                    if (iVar.f45925g) {
                        B(c3404d, iVar, true);
                    } else {
                        C(c3404d.f45894f[iVar.f45922d], true);
                    }
                }
                this.f45878d.clear();
            } else {
                z4 = true;
            }
        }
    }

    @Override // s.C3404d.a
    public void a(i iVar) {
        int i4 = iVar.f45923e;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f45879e.a(iVar, f4);
    }

    @Override // s.C3404d.a
    public i b(C3404d c3404d, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // s.C3404d.a
    public void c(C3404d.a aVar) {
        if (aVar instanceof C3402b) {
            C3402b c3402b = (C3402b) aVar;
            this.f45875a = null;
            this.f45879e.clear();
            for (int i4 = 0; i4 < c3402b.f45879e.b(); i4++) {
                this.f45879e.k(c3402b.f45879e.e(i4), c3402b.f45879e.h(i4), true);
            }
        }
    }

    @Override // s.C3404d.a
    public void clear() {
        this.f45879e.clear();
        this.f45875a = null;
        this.f45876b = 0.0f;
    }

    public C3402b d(C3404d c3404d, int i4) {
        this.f45879e.a(c3404d.o(i4, "ep"), 1.0f);
        this.f45879e.a(c3404d.o(i4, "em"), -1.0f);
        return this;
    }

    C3402b e(i iVar, int i4) {
        this.f45879e.a(iVar, i4);
        return this;
    }

    boolean f(C3404d c3404d) {
        boolean z4;
        i g4 = g(c3404d);
        if (g4 == null) {
            z4 = true;
        } else {
            y(g4);
            z4 = false;
        }
        if (this.f45879e.b() == 0) {
            this.f45880f = true;
        }
        return z4;
    }

    i g(C3404d c3404d) {
        boolean v4;
        boolean v5;
        int b4 = this.f45879e.b();
        i iVar = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        i iVar2 = null;
        for (int i4 = 0; i4 < b4; i4++) {
            float h4 = this.f45879e.h(i4);
            i e4 = this.f45879e.e(i4);
            if (e4.f45928j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    v5 = v(e4, c3404d);
                } else if (f4 > h4) {
                    v5 = v(e4, c3404d);
                } else if (!z4 && v(e4, c3404d)) {
                    f4 = h4;
                    iVar = e4;
                    z4 = true;
                }
                z4 = v5;
                f4 = h4;
                iVar = e4;
            } else if (iVar == null && h4 < 0.0f) {
                if (iVar2 == null) {
                    v4 = v(e4, c3404d);
                } else if (f5 > h4) {
                    v4 = v(e4, c3404d);
                } else if (!z5 && v(e4, c3404d)) {
                    f5 = h4;
                    iVar2 = e4;
                    z5 = true;
                }
                z5 = v4;
                f5 = h4;
                iVar2 = e4;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // s.C3404d.a
    public i getKey() {
        return this.f45875a;
    }

    C3402b h(i iVar, i iVar2, int i4, float f4, i iVar3, i iVar4, int i5) {
        if (iVar2 == iVar3) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar4, 1.0f);
            this.f45879e.a(iVar2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            this.f45879e.a(iVar3, -1.0f);
            this.f45879e.a(iVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f45876b = (-i4) + i5;
                return this;
            }
        } else {
            if (f4 <= 0.0f) {
                this.f45879e.a(iVar, -1.0f);
                this.f45879e.a(iVar2, 1.0f);
                this.f45876b = i4;
                return this;
            }
            if (f4 >= 1.0f) {
                this.f45879e.a(iVar4, -1.0f);
                this.f45879e.a(iVar3, 1.0f);
                this.f45876b = -i5;
                return this;
            }
            float f5 = 1.0f - f4;
            this.f45879e.a(iVar, f5 * 1.0f);
            this.f45879e.a(iVar2, f5 * (-1.0f));
            this.f45879e.a(iVar3, (-1.0f) * f4);
            this.f45879e.a(iVar4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f45876b = ((-i4) * f5) + (i5 * f4);
                return this;
            }
        }
        return this;
    }

    C3402b i(i iVar, int i4) {
        this.f45875a = iVar;
        float f4 = i4;
        iVar.f45924f = f4;
        this.f45876b = f4;
        this.f45880f = true;
        return this;
    }

    C3402b j(i iVar, i iVar2, float f4) {
        this.f45879e.a(iVar, -1.0f);
        this.f45879e.a(iVar2, f4);
        return this;
    }

    public C3402b k(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f45879e.a(iVar, -1.0f);
        this.f45879e.a(iVar2, 1.0f);
        this.f45879e.a(iVar3, f4);
        this.f45879e.a(iVar4, -f4);
        return this;
    }

    public C3402b l(float f4, float f5, float f6, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f45876b = 0.0f;
        if (f5 == 0.0f || f4 == f6) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            this.f45879e.a(iVar4, 1.0f);
            this.f45879e.a(iVar3, -1.0f);
            return this;
        }
        if (f4 == 0.0f) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            return this;
        }
        if (f6 == 0.0f) {
            this.f45879e.a(iVar3, 1.0f);
            this.f45879e.a(iVar4, -1.0f);
            return this;
        }
        float f7 = (f4 / f5) / (f6 / f5);
        this.f45879e.a(iVar, 1.0f);
        this.f45879e.a(iVar2, -1.0f);
        this.f45879e.a(iVar4, f7);
        this.f45879e.a(iVar3, -f7);
        return this;
    }

    public C3402b m(i iVar, int i4) {
        if (i4 < 0) {
            this.f45876b = i4 * (-1);
            this.f45879e.a(iVar, 1.0f);
            return this;
        }
        this.f45876b = i4;
        this.f45879e.a(iVar, -1.0f);
        return this;
    }

    public C3402b n(i iVar, i iVar2, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f45876b = i4;
        }
        if (z4) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            return this;
        }
        this.f45879e.a(iVar, -1.0f);
        this.f45879e.a(iVar2, 1.0f);
        return this;
    }

    public C3402b o(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f45876b = i4;
        }
        if (z4) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            this.f45879e.a(iVar3, -1.0f);
            return this;
        }
        this.f45879e.a(iVar, -1.0f);
        this.f45879e.a(iVar2, 1.0f);
        this.f45879e.a(iVar3, 1.0f);
        return this;
    }

    public C3402b p(i iVar, i iVar2, i iVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f45876b = i4;
        }
        if (z4) {
            this.f45879e.a(iVar, 1.0f);
            this.f45879e.a(iVar2, -1.0f);
            this.f45879e.a(iVar3, 1.0f);
            return this;
        }
        this.f45879e.a(iVar, -1.0f);
        this.f45879e.a(iVar2, 1.0f);
        this.f45879e.a(iVar3, -1.0f);
        return this;
    }

    public C3402b q(i iVar, i iVar2, i iVar3, i iVar4, float f4) {
        this.f45879e.a(iVar3, 0.5f);
        this.f45879e.a(iVar4, 0.5f);
        this.f45879e.a(iVar, -0.5f);
        this.f45879e.a(iVar2, -0.5f);
        this.f45876b = -f4;
        return this;
    }

    void r() {
        float f4 = this.f45876b;
        if (f4 < 0.0f) {
            this.f45876b = f4 * (-1.0f);
            this.f45879e.g();
        }
    }

    boolean s() {
        i iVar = this.f45875a;
        if (iVar != null) {
            return iVar.f45928j == i.a.UNRESTRICTED || this.f45876b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f45879e.i(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f45875a == null && this.f45876b == 0.0f && this.f45879e.b() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    void y(i iVar) {
        i iVar2 = this.f45875a;
        if (iVar2 != null) {
            this.f45879e.a(iVar2, -1.0f);
            this.f45875a = null;
        }
        float d4 = this.f45879e.d(iVar, true) * (-1.0f);
        this.f45875a = iVar;
        if (d4 == 1.0f) {
            return;
        }
        this.f45876b /= d4;
        this.f45879e.j(d4);
    }

    public void z() {
        this.f45875a = null;
        this.f45879e.clear();
        this.f45876b = 0.0f;
        this.f45880f = false;
    }

    public C3402b(C3403c c3403c) {
        this.f45879e = new C3401a(this, c3403c);
    }
}
