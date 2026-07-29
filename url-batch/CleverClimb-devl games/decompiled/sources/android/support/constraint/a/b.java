package android.support.constraint.a;

import android.support.constraint.a.g;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    final a f1433d;

    /* renamed from: a, reason: collision with root package name */
    g f1430a = null;

    /* renamed from: b, reason: collision with root package name */
    float f1431b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f1432c = false;
    boolean e = false;

    public b(c cVar) {
        this.f1433d = new a(this, cVar);
    }

    void a() {
        this.f1433d.a(this);
    }

    boolean b() {
        return this.f1430a != null && (this.f1430a.f == g.a.UNRESTRICTED || this.f1431b >= 0.0f);
    }

    public String toString() {
        return c();
    }

    String c() {
        boolean z;
        String str = (this.f1430a == null ? "0" : "" + this.f1430a) + " = ";
        if (this.f1431b != 0.0f) {
            str = str + this.f1431b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f1433d.f1388a;
        for (int i2 = 0; i2 < i; i2++) {
            g a2 = this.f1433d.a(i2);
            if (a2 != null) {
                float b2 = this.f1433d.b(i2);
                String gVar = a2.toString();
                if (z) {
                    if (b2 > 0.0f) {
                        str = str + " + ";
                    } else {
                        str = str + " - ";
                        b2 *= -1.0f;
                    }
                } else if (b2 < 0.0f) {
                    str = str + "- ";
                    b2 *= -1.0f;
                }
                str = b2 == 1.0f ? str + gVar : str + b2 + " " + gVar;
                z = true;
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    public void d() {
        this.f1430a = null;
        this.f1433d.a();
        this.f1431b = 0.0f;
        this.e = false;
    }

    boolean a(g gVar) {
        return this.f1433d.b(gVar);
    }

    b a(g gVar, int i) {
        this.f1430a = gVar;
        float f = i;
        gVar.f1447d = f;
        this.f1431b = f;
        this.e = true;
        return this;
    }

    public b b(g gVar, int i) {
        if (i < 0) {
            this.f1431b = i * (-1);
            this.f1433d.a(gVar, 1.0f);
        } else {
            this.f1431b = i;
            this.f1433d.a(gVar, -1.0f);
        }
        return this;
    }

    public b a(g gVar, g gVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1431b = i;
        }
        if (!z) {
            this.f1433d.a(gVar, -1.0f);
            this.f1433d.a(gVar2, 1.0f);
        } else {
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
        }
        return this;
    }

    b c(g gVar, int i) {
        this.f1433d.a(gVar, i);
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1431b = i;
        }
        if (!z) {
            this.f1433d.a(gVar, -1.0f);
            this.f1433d.a(gVar2, 1.0f);
            this.f1433d.a(gVar3, 1.0f);
        } else {
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
            this.f1433d.a(gVar3, -1.0f);
        }
        return this;
    }

    public b b(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1431b = i;
        }
        if (!z) {
            this.f1433d.a(gVar, -1.0f);
            this.f1433d.a(gVar2, 1.0f);
            this.f1433d.a(gVar3, -1.0f);
        } else {
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
            this.f1433d.a(gVar3, 1.0f);
        }
        return this;
    }

    public b a(float f, float f2, float f3, g gVar, int i, g gVar2, int i2, g gVar3, int i3, g gVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f1431b = ((-i) - i2) + i3 + i4;
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
            this.f1433d.a(gVar4, 1.0f);
            this.f1433d.a(gVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f1431b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
            this.f1433d.a(gVar4, f4);
            this.f1433d.a(gVar3, -f4);
        }
        return this;
    }

    b a(g gVar, g gVar2, int i, float f, g gVar3, g gVar4, int i2) {
        if (gVar2 == gVar3) {
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar4, 1.0f);
            this.f1433d.a(gVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f1433d.a(gVar, 1.0f);
            this.f1433d.a(gVar2, -1.0f);
            this.f1433d.a(gVar3, -1.0f);
            this.f1433d.a(gVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f1431b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f1433d.a(gVar, -1.0f);
            this.f1433d.a(gVar2, 1.0f);
            this.f1431b = i;
        } else if (f >= 1.0f) {
            this.f1433d.a(gVar3, -1.0f);
            this.f1433d.a(gVar4, 1.0f);
            this.f1431b = i2;
        } else {
            float f2 = 1.0f - f;
            this.f1433d.a(gVar, f2 * 1.0f);
            this.f1433d.a(gVar2, f2 * (-1.0f));
            this.f1433d.a(gVar3, (-1.0f) * f);
            this.f1433d.a(gVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f1431b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public b a(g gVar, g gVar2) {
        this.f1433d.a(gVar, 1.0f);
        this.f1433d.a(gVar2, -1.0f);
        return this;
    }

    b a(g gVar, g gVar2, g gVar3, float f) {
        this.f1433d.a(gVar, -1.0f);
        this.f1433d.a(gVar2, 1.0f - f);
        this.f1433d.a(gVar3, f);
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.f1433d.a(gVar, -1.0f);
        this.f1433d.a(gVar2, 1.0f);
        this.f1433d.a(gVar3, f);
        this.f1433d.a(gVar4, -f);
        return this;
    }

    boolean a(b bVar) {
        this.f1433d.a(this, bVar);
        return true;
    }

    void e() {
        if (this.f1431b < 0.0f) {
            this.f1431b *= -1.0f;
            this.f1433d.b();
        }
    }

    void f() {
        g c2 = this.f1433d.c();
        if (c2 != null) {
            b(c2);
        }
        if (this.f1433d.f1388a == 0) {
            this.e = true;
        }
    }

    void b(g gVar) {
        if (this.f1430a != null) {
            this.f1433d.a(this.f1430a, -1.0f);
            this.f1430a = null;
        }
        float a2 = this.f1433d.a(gVar) * (-1.0f);
        this.f1430a = gVar;
        if (a2 == 1.0f) {
            return;
        }
        this.f1431b /= a2;
        this.f1433d.a(a2);
    }
}
