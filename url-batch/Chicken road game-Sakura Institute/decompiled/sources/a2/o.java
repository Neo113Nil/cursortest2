package a2;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import z0.o0;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f426c;

    /* renamed from: d, reason: collision with root package name */
    public final float f427d;

    /* renamed from: e, reason: collision with root package name */
    public final float f428e;

    /* renamed from: f, reason: collision with root package name */
    public final int f429f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f430g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f431h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public o(q qVar, long j8, int i7, boolean z8) {
        boolean z9;
        int g9;
        this.f424a = qVar;
        this.f425b = i7;
        if (m2.a.j(j8) != 0 || m2.a.i(j8) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) qVar.f435b;
        int size = arrayList2.size();
        int i8 = 0;
        int i9 = 0;
        float f9 = 0.0f;
        while (i8 < size) {
            s sVar = (s) arrayList2.get(i8);
            i2.d dVar = sVar.f447a;
            int h3 = m2.a.h(j8);
            if (m2.a.c(j8)) {
                g9 = m2.a.g(j8) - ((int) Math.ceil(f9));
                if (g9 < 0) {
                    g9 = 0;
                }
            } else {
                g9 = m2.a.g(j8);
            }
            b bVar = new b(dVar, this.f425b - i9, z8, r4.a.c(h3, g9, 5));
            float b9 = bVar.b() + f9;
            b2.d0 d0Var = bVar.f314d;
            int i10 = i9 + d0Var.f1268f;
            arrayList.add(new r(bVar, sVar.f448b, sVar.f449c, i9, i10, f9, b9));
            if (d0Var.f1265c || (i10 == this.f425b && i8 != e6.m.W((ArrayList) this.f424a.f435b))) {
                z9 = true;
                i9 = i10;
                f9 = b9;
                break;
            } else {
                i8++;
                i9 = i10;
                f9 = b9;
            }
        }
        z9 = false;
        this.f428e = f9;
        this.f429f = i9;
        this.f426c = z9;
        this.f431h = arrayList;
        this.f427d = m2.a.h(j8);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            r rVar = (r) arrayList.get(i11);
            ?? r72 = rVar.f440a.f316f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            for (int i12 = 0; i12 < size3; i12++) {
                y0.d dVar2 = (y0.d) r72.get(i12);
                arrayList4.add(dVar2 != null ? dVar2.h(u3.r.a(0.0f, rVar.f445f)) : null);
            }
            e6.r.c0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f424a.f437d).size()) {
            int size4 = ((List) this.f424a.f437d).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i13 = 0; i13 < size4; i13++) {
                arrayList5.add(null);
            }
            arrayList3 = e6.l.r0(arrayList3, arrayList5);
        }
        this.f430g = arrayList3;
    }

    public static void g(o oVar, z0.r rVar, z0.p pVar, float f9, o0 o0Var, l2.j jVar, b1.f fVar) {
        rVar.o();
        ArrayList arrayList = oVar.f431h;
        if (arrayList.size() <= 1) {
            i2.j.a(oVar, rVar, pVar, f9, o0Var, jVar, fVar);
        } else if (pVar instanceof r0) {
            i2.j.a(oVar, rVar, pVar, f9, o0Var, jVar, fVar);
        } else if (pVar instanceof z0.q) {
            int size = arrayList.size();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i7 = 0; i7 < size; i7++) {
                r rVar2 = (r) arrayList.get(i7);
                f11 += rVar2.f440a.b();
                f10 = Math.max(f10, rVar2.f440a.d());
            }
            v0.d.a(f10, f11);
            Shader shader = ((z0.q) pVar).f10036c;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                b bVar = ((r) arrayList.get(i8)).f440a;
                bVar.g(rVar, new z0.q(shader), f9, o0Var, jVar, fVar);
                rVar.k(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                shader.setLocalMatrix(matrix);
            }
        }
        rVar.n();
    }

    public final void a(long j8, float[] fArr) {
        h(j0.e(j8));
        i(j0.d(j8));
        r6.t tVar = new r6.t();
        tVar.f7966f = 0;
        a8.m.y(this.f431h, j8, new n(j8, fArr, tVar, new r6.s()));
    }

    public final float b(int i7) {
        j(i7);
        ArrayList arrayList = this.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        return bVar.f314d.e(i7 - rVar.f443d) + rVar.f445f;
    }

    public final int c(float f9) {
        ArrayList arrayList = this.f431h;
        r rVar = (r) arrayList.get(a8.m.x(arrayList, f9));
        int i7 = rVar.f442c - rVar.f441b;
        int i8 = rVar.f443d;
        if (i7 == 0) {
            return i8;
        }
        b bVar = rVar.f440a;
        float f10 = f9 - rVar.f445f;
        b2.d0 d0Var = bVar.f314d;
        return d0Var.f1267e.getLineForVertical(((int) f10) - d0Var.f1269g) + i8;
    }

    public final float d(int i7) {
        j(i7);
        ArrayList arrayList = this.f431h;
        r rVar = (r) arrayList.get(a8.m.w(i7, arrayList));
        b bVar = rVar.f440a;
        return bVar.f314d.g(i7 - rVar.f443d) + rVar.f445f;
    }

    public final int e(long j8) {
        float e9 = y0.c.e(j8);
        ArrayList arrayList = this.f431h;
        r rVar = (r) arrayList.get(a8.m.x(arrayList, e9));
        int i7 = rVar.f442c;
        int i8 = rVar.f441b;
        if (i7 - i8 == 0) {
            return i8;
        }
        b bVar = rVar.f440a;
        long a3 = u3.r.a(y0.c.d(j8), y0.c.e(j8) - rVar.f445f);
        b2.d0 d0Var = bVar.f314d;
        int lineForVertical = d0Var.f1267e.getLineForVertical(((int) y0.c.e(a3)) - d0Var.f1269g);
        return d0Var.f1267e.getOffsetForHorizontal(lineForVertical, (d0Var.b(lineForVertical) * (-1)) + y0.c.d(a3)) + i8;
    }

    public final long f(y0.d dVar, int i7, a0.s sVar) {
        long j8;
        long j9;
        float f9 = dVar.f9781b;
        ArrayList arrayList = this.f431h;
        int x8 = a8.m.x(arrayList, f9);
        float f10 = ((r) arrayList.get(x8)).f446g;
        float f11 = dVar.f9783d;
        if (f10 >= f11 || x8 == e6.m.W(arrayList)) {
            r rVar = (r) arrayList.get(x8);
            return rVar.a(rVar.f440a.c(dVar.h(u3.r.a(0.0f, -rVar.f445f)), i7, sVar), true);
        }
        int x9 = a8.m.x(arrayList, f11);
        long j10 = j0.f406b;
        while (true) {
            j8 = j0.f406b;
            if (!j0.a(j10, j8) || x8 > x9) {
                break;
            }
            r rVar2 = (r) arrayList.get(x8);
            j10 = rVar2.a(rVar2.f440a.c(dVar.h(u3.r.a(0.0f, -rVar2.f445f)), i7, sVar), true);
            x8++;
        }
        if (j0.a(j10, j8)) {
            return j8;
        }
        while (true) {
            j9 = j0.f406b;
            if (!j0.a(j8, j9) || x8 > x9) {
                break;
            }
            r rVar3 = (r) arrayList.get(x9);
            j8 = rVar3.a(rVar3.f440a.c(dVar.h(u3.r.a(0.0f, -rVar3.f445f)), i7, sVar), true);
            x9--;
        }
        return j0.a(j8, j9) ? j10 : r4.a.h((int) (j10 >> 32), (int) (4294967295L & j8));
    }

    public final void h(int i7) {
        q qVar = this.f424a;
        if (i7 < 0 || i7 >= ((g) qVar.f436c).f373f.length()) {
            StringBuilder n8 = a0.m.n(i7, "offset(", ") is out of bounds [0, ");
            n8.append(((g) qVar.f436c).f373f.length());
            n8.append(')');
            throw new IllegalArgumentException(n8.toString().toString());
        }
    }

    public final void i(int i7) {
        q qVar = this.f424a;
        if (i7 < 0 || i7 > ((g) qVar.f436c).f373f.length()) {
            StringBuilder n8 = a0.m.n(i7, "offset(", ") is out of bounds [0, ");
            n8.append(((g) qVar.f436c).f373f.length());
            n8.append(']');
            throw new IllegalArgumentException(n8.toString().toString());
        }
    }

    public final void j(int i7) {
        int i8 = this.f429f;
        if (i7 < 0 || i7 >= i8) {
            throw new IllegalArgumentException(("lineIndex(" + i7 + ") is out of bounds [0, " + i8 + ')').toString());
        }
    }
}
