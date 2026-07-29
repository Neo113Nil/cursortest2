package android.support.constraint.a;

import android.support.constraint.a.g;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static int f1438d = 1000;

    /* renamed from: c, reason: collision with root package name */
    final c f1441c;
    private b[] i;

    /* renamed from: a, reason: collision with root package name */
    int f1439a = 0;
    private HashMap<String, g> e = null;
    private d f = new d();
    private int g = 32;
    private int h = this.g;
    private boolean[] j = new boolean[this.g];

    /* renamed from: b, reason: collision with root package name */
    int f1440b = 1;
    private int k = 0;
    private int l = this.g;
    private g[] m = new g[f1438d];
    private int n = 0;
    private b[] o = new b[this.g];

    public e() {
        this.i = null;
        this.i = new b[this.g];
        h();
        this.f1441c = new c();
    }

    private void g() {
        this.g *= 2;
        this.i = (b[]) Arrays.copyOf(this.i, this.g);
        this.f1441c.f1436c = (g[]) Arrays.copyOf(this.f1441c.f1436c, this.g);
        this.j = new boolean[this.g];
        this.h = this.g;
        this.l = this.g;
        this.f.f1437a.clear();
    }

    private void h() {
        for (int i = 0; i < this.i.length; i++) {
            b bVar = this.i[i];
            if (bVar != null) {
                this.f1441c.f1434a.a(bVar);
            }
            this.i[i] = null;
        }
    }

    public void a() {
        for (int i = 0; i < this.f1441c.f1436c.length; i++) {
            g gVar = this.f1441c.f1436c[i];
            if (gVar != null) {
                gVar.c();
            }
        }
        this.f1441c.f1435b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.f1441c.f1436c, (Object) null);
        if (this.e != null) {
            this.e.clear();
        }
        this.f1439a = 0;
        this.f.f1437a.clear();
        this.f1440b = 1;
        for (int i2 = 0; i2 < this.k; i2++) {
            this.i[i2].f1432c = false;
        }
        h();
        this.k = 0;
    }

    public g a(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1440b + 1 >= this.h) {
            g();
        }
        if (obj instanceof android.support.constraint.a.a.a) {
            android.support.constraint.a.a.a aVar = (android.support.constraint.a.a.a) obj;
            gVar = aVar.a();
            if (gVar == null) {
                aVar.a(this.f1441c);
                gVar = aVar.a();
            }
            if (gVar.f1444a == -1 || gVar.f1444a > this.f1439a || this.f1441c.f1436c[gVar.f1444a] == null) {
                if (gVar.f1444a != -1) {
                    gVar.c();
                }
                this.f1439a++;
                this.f1440b++;
                gVar.f1444a = this.f1439a;
                gVar.f = g.a.UNRESTRICTED;
                this.f1441c.f1436c[this.f1439a] = gVar;
            }
        }
        return gVar;
    }

    public b b() {
        b a2 = this.f1441c.f1434a.a();
        if (a2 == null) {
            return new b(this.f1441c);
        }
        a2.d();
        return a2;
    }

    public g c() {
        if (this.f1440b + 1 >= this.h) {
            g();
        }
        g a2 = a(g.a.SLACK);
        this.f1439a++;
        this.f1440b++;
        a2.f1444a = this.f1439a;
        this.f1441c.f1436c[this.f1439a] = a2;
        return a2;
    }

    private void b(b bVar) {
        bVar.a(d(), d());
    }

    private void a(b bVar, int i) {
        bVar.c(d(), i);
    }

    public g d() {
        if (this.f1440b + 1 >= this.h) {
            g();
        }
        g a2 = a(g.a.ERROR);
        this.f1439a++;
        this.f1440b++;
        a2.f1444a = this.f1439a;
        this.f1441c.f1436c[this.f1439a] = a2;
        return a2;
    }

    private g a(g.a aVar) {
        g a2 = this.f1441c.f1435b.a();
        if (a2 == null) {
            a2 = new g(aVar);
        } else {
            a2.c();
            a2.a(aVar);
        }
        if (this.n >= f1438d) {
            f1438d *= 2;
            this.m = (g[]) Arrays.copyOf(this.m, f1438d);
        }
        g[] gVarArr = this.m;
        int i = this.n;
        this.n = i + 1;
        gVarArr[i] = a2;
        return a2;
    }

    b a(int i) {
        return this.i[i];
    }

    public int b(Object obj) {
        g a2 = ((android.support.constraint.a.a.a) obj).a();
        if (a2 != null) {
            return (int) (a2.f1447d + 0.5f);
        }
        return 0;
    }

    public void e() throws Exception {
        a(this.f);
    }

    void a(d dVar) throws Exception {
        dVar.a(this);
        c(dVar);
        b(dVar);
        i();
    }

    private void c(b bVar) {
        if (this.k > 0) {
            bVar.f1433d.a(bVar, this.i);
            if (bVar.f1433d.f1388a == 0) {
                bVar.e = true;
            }
        }
    }

    public void a(b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.k + 1 >= this.l || this.f1440b + 1 >= this.h) {
            g();
        }
        if (!bVar.e) {
            c(bVar);
            bVar.e();
            bVar.f();
            if (!bVar.b()) {
                return;
            }
        }
        if (this.i[this.k] != null) {
            this.f1441c.f1434a.a(this.i[this.k]);
        }
        if (!bVar.e) {
            bVar.a();
        }
        this.i[this.k] = bVar;
        bVar.f1430a.f1445b = this.k;
        this.k++;
        int i = bVar.f1430a.h;
        if (i > 0) {
            while (this.o.length < i) {
                this.o = new b[this.o.length * 2];
            }
            b[] bVarArr = this.o;
            for (int i2 = 0; i2 < i; i2++) {
                bVarArr[i2] = bVar.f1430a.g[i2];
            }
            for (int i3 = 0; i3 < i; i3++) {
                b bVar2 = bVarArr[i3];
                if (bVar2 != bVar) {
                    bVar2.f1433d.a(bVar2, bVar);
                    bVar2.a();
                }
            }
        }
    }

    private int b(d dVar) {
        for (int i = 0; i < this.f1440b; i++) {
            this.j[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            i2++;
            g a2 = dVar.a();
            if (a2 != null) {
                if (this.j[a2.f1444a]) {
                    a2 = null;
                } else {
                    this.j[a2.f1444a] = true;
                    i3++;
                    if (i3 >= this.f1440b) {
                        z = true;
                    }
                }
            }
            if (a2 != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.k; i5++) {
                    b bVar = this.i[i5];
                    if (bVar.f1430a.f != g.a.UNRESTRICTED && bVar.a(a2)) {
                        float c2 = bVar.f1433d.c(a2);
                        if (c2 < 0.0f) {
                            float f2 = (-bVar.f1431b) / c2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar2 = this.i[i4];
                    bVar2.f1430a.f1445b = -1;
                    bVar2.b(a2);
                    bVar2.f1430a.f1445b = i4;
                    for (int i6 = 0; i6 < this.k; i6++) {
                        this.i[i6].a(bVar2);
                    }
                    dVar.a(this);
                    try {
                        c(dVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            z = true;
        }
        return i2;
    }

    private int c(d dVar) throws Exception {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.k) {
                z = false;
                break;
            }
            if (this.i[i2].f1430a.f != g.a.UNRESTRICTED && this.i[i2].f1431b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            i = 0;
            while (!z2) {
                i++;
                int i3 = -1;
                int i4 = -1;
                float f = Float.MAX_VALUE;
                int i5 = 0;
                for (int i6 = 0; i6 < this.k; i6++) {
                    b bVar = this.i[i6];
                    if (bVar.f1430a.f != g.a.UNRESTRICTED && bVar.f1431b < 0.0f) {
                        int i7 = i5;
                        float f2 = f;
                        int i8 = i4;
                        int i9 = i3;
                        for (int i10 = 1; i10 < this.f1440b; i10++) {
                            g gVar = this.f1441c.f1436c[i10];
                            float c2 = bVar.f1433d.c(gVar);
                            if (c2 > 0.0f) {
                                int i11 = i7;
                                float f3 = f2;
                                int i12 = i8;
                                int i13 = i9;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    float f4 = gVar.e[i14] / c2;
                                    if ((f4 < f3 && i14 == i11) || i14 > i11) {
                                        f3 = f4;
                                        i13 = i6;
                                        i12 = i10;
                                        i11 = i14;
                                    }
                                }
                                i9 = i13;
                                i8 = i12;
                                f2 = f3;
                                i7 = i11;
                            }
                        }
                        i3 = i9;
                        i4 = i8;
                        f = f2;
                        i5 = i7;
                    }
                }
                if (i3 != -1) {
                    b bVar2 = this.i[i3];
                    bVar2.f1430a.f1445b = -1;
                    bVar2.b(this.f1441c.f1436c[i4]);
                    bVar2.f1430a.f1445b = i3;
                    for (int i15 = 0; i15 < this.k; i15++) {
                        this.i[i15].a(bVar2);
                    }
                    dVar.a(this);
                } else {
                    z2 = true;
                }
            }
        } else {
            i = 0;
        }
        for (int i16 = 0; i16 < this.k && (this.i[i16].f1430a.f == g.a.UNRESTRICTED || this.i[i16].f1431b >= 0.0f); i16++) {
        }
        return i;
    }

    private void i() {
        for (int i = 0; i < this.k; i++) {
            b bVar = this.i[i];
            bVar.f1430a.f1447d = bVar.f1431b;
        }
    }

    public c f() {
        return this.f1441c;
    }

    public void a(g gVar, g gVar2, int i, int i2) {
        b b2 = b();
        g c2 = c();
        c2.f1446c = i2;
        b2.a(gVar, gVar2, c2, i);
        a(b2);
    }

    public void b(g gVar, g gVar2, int i, int i2) {
        b b2 = b();
        g c2 = c();
        c2.f1446c = i2;
        b2.b(gVar, gVar2, c2, i);
        a(b2);
    }

    public void a(g gVar, g gVar2, int i, float f, g gVar3, g gVar4, int i2, int i3) {
        b b2 = b();
        b2.a(gVar, gVar2, i, f, gVar3, gVar4, i2);
        g d2 = d();
        g d3 = d();
        d2.f1446c = i3;
        d3.f1446c = i3;
        b2.a(d2, d3);
        a(b2);
    }

    public b c(g gVar, g gVar2, int i, int i2) {
        b b2 = b();
        b2.a(gVar, gVar2, i);
        g d2 = d();
        g d3 = d();
        d2.f1446c = i2;
        d3.f1446c = i2;
        b2.a(d2, d3);
        a(b2);
        return b2;
    }

    public void a(g gVar, int i) {
        int i2 = gVar.f1445b;
        if (gVar.f1445b != -1) {
            b bVar = this.i[i2];
            if (bVar.e) {
                bVar.f1431b = i;
                return;
            }
            b b2 = b();
            b2.b(gVar, i);
            a(b2);
            return;
        }
        b b3 = b();
        b3.a(gVar, i);
        a(b3);
    }

    public static b a(e eVar, g gVar, g gVar2, int i, boolean z) {
        b b2 = eVar.b();
        b2.a(gVar, gVar2, i);
        if (z) {
            eVar.a(b2, 1);
        }
        return b2;
    }

    public static b a(e eVar, g gVar, g gVar2, g gVar3, float f, boolean z) {
        b b2 = eVar.b();
        if (z) {
            eVar.b(b2);
        }
        return b2.a(gVar, gVar2, gVar3, f);
    }

    public static b b(e eVar, g gVar, g gVar2, int i, boolean z) {
        g c2 = eVar.c();
        b b2 = eVar.b();
        b2.a(gVar, gVar2, c2, i);
        if (z) {
            eVar.a(b2, (int) (b2.f1433d.c(c2) * (-1.0f)));
        }
        return b2;
    }

    public static b c(e eVar, g gVar, g gVar2, int i, boolean z) {
        g c2 = eVar.c();
        b b2 = eVar.b();
        b2.b(gVar, gVar2, c2, i);
        if (z) {
            eVar.a(b2, (int) (b2.f1433d.c(c2) * (-1.0f)));
        }
        return b2;
    }

    public static b a(e eVar, g gVar, g gVar2, int i, float f, g gVar3, g gVar4, int i2, boolean z) {
        b b2 = eVar.b();
        b2.a(gVar, gVar2, i, f, gVar3, gVar4, i2);
        if (z) {
            g d2 = eVar.d();
            g d3 = eVar.d();
            d2.f1446c = 4;
            d3.f1446c = 4;
            b2.a(d2, d3);
        }
        return b2;
    }
}
