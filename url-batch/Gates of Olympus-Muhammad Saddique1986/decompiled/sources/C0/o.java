package C0;

import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import b0.AbstractC0347p;
import b0.C0348q;
import b0.P;
import b0.T;
import d0.AbstractC0404e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f618a;

    /* renamed from: b, reason: collision with root package name */
    public final int f619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f620c;

    /* renamed from: d, reason: collision with root package name */
    public final float f621d;

    /* renamed from: e, reason: collision with root package name */
    public final float f622e;

    /* renamed from: f, reason: collision with root package name */
    public final int f623f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f624g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f625h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public o(q qVar, long j3, int i3, boolean z3) {
        boolean z4;
        int g3;
        this.f618a = qVar;
        this.f619b = i3;
        if (O0.a.j(j3) != 0 || O0.a.i(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) qVar.f629b;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        while (i4 < size) {
            s sVar = (s) arrayList2.get(i4);
            K0.c cVar = sVar.f641a;
            int h3 = O0.a.h(j3);
            if (O0.a.c(j3)) {
                g3 = O0.a.g(j3) - ((int) Math.ceil(f3));
                if (g3 < 0) {
                    g3 = 0;
                }
            } else {
                g3 = O0.a.g(j3);
            }
            C0026b c0026b = new C0026b(cVar, this.f619b - i5, z3, O2.d.b(h3, g3, 5));
            float b3 = c0026b.b() + f3;
            D0.G g4 = c0026b.f581d;
            int i6 = i5 + g4.f828g;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new r(c0026b, sVar.f642b, sVar.f643c, i5, i6, f3, b3));
            if (g4.f825d || (i6 == this.f619b && i4 != S1.m.z0((ArrayList) this.f618a.f629b))) {
                z4 = true;
                f3 = b3;
                i5 = i6;
                break;
            } else {
                i4++;
                f3 = b3;
                i5 = i6;
                arrayList2 = arrayList3;
            }
        }
        z4 = false;
        this.f622e = f3;
        this.f623f = i5;
        this.f620c = z4;
        this.f625h = arrayList;
        this.f621d = O0.a.h(j3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            r rVar = (r) arrayList.get(i7);
            ?? r7 = rVar.f634a.f583f;
            ArrayList arrayList5 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i8 = 0; i8 < size3; i8++) {
                C0239d c0239d = (C0239d) r7.get(i8);
                arrayList5.add(c0239d != null ? c0239d.h(l0.c.e(0.0f, rVar.f639f)) : null);
            }
            S1.r.G0(arrayList5, arrayList4);
        }
        if (arrayList4.size() < ((List) this.f618a.f631d).size()) {
            int size4 = ((List) this.f618a.f631d).size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                arrayList6.add(null);
            }
            arrayList4 = S1.l.U0(arrayList4, arrayList6);
        }
        this.f624g = arrayList4;
    }

    public static void g(o oVar, b0.r rVar, long j3, P p3, N0.j jVar, AbstractC0404e abstractC0404e) {
        rVar.f();
        ArrayList arrayList = oVar.f625h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            r rVar2 = (r) arrayList.get(i3);
            rVar2.f634a.f(rVar, j3, p3, jVar, abstractC0404e, 3);
            rVar.s(0.0f, rVar2.f634a.b());
        }
        rVar.a();
    }

    public static void h(o oVar, b0.r rVar, AbstractC0347p abstractC0347p, float f3, P p3, N0.j jVar, AbstractC0404e abstractC0404e) {
        rVar.f();
        ArrayList arrayList = oVar.f625h;
        if (arrayList.size() <= 1) {
            K0.i.a(oVar, rVar, abstractC0347p, f3, p3, jVar, abstractC0404e, 3);
        } else if (abstractC0347p instanceof T) {
            K0.i.a(oVar, rVar, abstractC0347p, f3, p3, jVar, abstractC0404e, 3);
        } else if (abstractC0347p instanceof C0348q) {
            int size = arrayList.size();
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                r rVar2 = (r) arrayList.get(i3);
                f5 += rVar2.f634a.b();
                f4 = Math.max(f4, rVar2.f634a.d());
            }
            AbstractC0235a.e(f4, f5);
            Matrix matrix = new Matrix();
            Shader shader = ((C0348q) abstractC0347p).f5431c;
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                r rVar3 = (r) arrayList.get(i4);
                rVar3.f634a.g(rVar, new C0348q(shader), f3, p3, jVar, abstractC0404e, 3);
                C0026b c0026b = rVar3.f634a;
                rVar.s(0.0f, c0026b.b());
                matrix.setTranslate(0.0f, -c0026b.b());
                shader.setLocalMatrix(matrix);
            }
        }
        rVar.a();
    }

    public final void a(long j3, float[] fArr) {
        i(J.e(j3));
        j(J.d(j3));
        f2.s sVar = new f2.s();
        sVar.f5830d = 0;
        l0.c.w(this.f625h, j3, new n(j3, fArr, sVar, new f2.r()));
    }

    public final float b(int i3) {
        k(i3);
        ArrayList arrayList = this.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        return c0026b.f581d.e(i3 - rVar.f637d) + rVar.f639f;
    }

    public final int c(float f3) {
        ArrayList arrayList = this.f625h;
        r rVar = (r) arrayList.get(l0.c.v(arrayList, f3));
        int i3 = rVar.f636c - rVar.f635b;
        int i4 = rVar.f637d;
        if (i3 == 0) {
            return i4;
        }
        float f4 = f3 - rVar.f639f;
        D0.G g3 = rVar.f634a.f581d;
        return i4 + g3.f827f.getLineForVertical(((int) f4) - g3.f829h);
    }

    public final float d(int i3) {
        k(i3);
        ArrayList arrayList = this.f625h;
        r rVar = (r) arrayList.get(l0.c.u(i3, arrayList));
        C0026b c0026b = rVar.f634a;
        return c0026b.f581d.g(i3 - rVar.f637d) + rVar.f639f;
    }

    public final int e(long j3) {
        ArrayList arrayList = this.f625h;
        r rVar = (r) arrayList.get(l0.c.v(arrayList, C0238c.e(j3)));
        int i3 = rVar.f636c;
        int i4 = rVar.f635b;
        if (i3 - i4 == 0) {
            return i4;
        }
        long e3 = l0.c.e(C0238c.d(j3), C0238c.e(j3) - rVar.f639f);
        C0026b c0026b = rVar.f634a;
        int e4 = (int) C0238c.e(e3);
        D0.G g3 = c0026b.f581d;
        int i5 = e4 - g3.f829h;
        Layout layout = g3.f827f;
        int lineForVertical = layout.getLineForVertical(i5);
        return i4 + layout.getOffsetForHorizontal(lineForVertical, (g3.b(lineForVertical) * (-1)) + C0238c.d(e3));
    }

    public final long f(C0239d c0239d, int i3, B.r rVar) {
        long j3;
        long j4;
        ArrayList arrayList = this.f625h;
        int v3 = l0.c.v(arrayList, c0239d.f4725b);
        float f3 = ((r) arrayList.get(v3)).f640g;
        float f4 = c0239d.f4727d;
        if (f3 >= f4 || v3 == S1.m.z0(arrayList)) {
            r rVar2 = (r) arrayList.get(v3);
            return rVar2.a(rVar2.f634a.c(c0239d.h(l0.c.e(0.0f, -rVar2.f639f)), i3, rVar), true);
        }
        int v4 = l0.c.v(arrayList, f4);
        long j5 = J.f567b;
        while (true) {
            j3 = J.f567b;
            if (!J.a(j5, j3) || v3 > v4) {
                break;
            }
            r rVar3 = (r) arrayList.get(v3);
            j5 = rVar3.a(rVar3.f634a.c(c0239d.h(l0.c.e(0.0f, -rVar3.f639f)), i3, rVar), true);
            v3++;
        }
        if (J.a(j5, j3)) {
            return j3;
        }
        while (true) {
            j4 = J.f567b;
            if (!J.a(j3, j4) || v3 > v4) {
                break;
            }
            r rVar4 = (r) arrayList.get(v4);
            j3 = rVar4.a(rVar4.f634a.c(c0239d.h(l0.c.e(0.0f, -rVar4.f639f)), i3, rVar), true);
            v4--;
        }
        return J.a(j3, j4) ? j5 : O2.l.J((int) (j5 >> 32), (int) (4294967295L & j3));
    }

    public final void i(int i3) {
        q qVar = this.f618a;
        if (i3 < 0 || i3 >= ((C0031g) qVar.f630c).f596a.length()) {
            StringBuilder k3 = A.k.k(i3, "offset(", ") is out of bounds [0, ");
            k3.append(((C0031g) qVar.f630c).f596a.length());
            k3.append(')');
            throw new IllegalArgumentException(k3.toString().toString());
        }
    }

    public final void j(int i3) {
        q qVar = this.f618a;
        if (i3 < 0 || i3 > ((C0031g) qVar.f630c).f596a.length()) {
            StringBuilder k3 = A.k.k(i3, "offset(", ") is out of bounds [0, ");
            k3.append(((C0031g) qVar.f630c).f596a.length());
            k3.append(']');
            throw new IllegalArgumentException(k3.toString().toString());
        }
    }

    public final void k(int i3) {
        int i4 = this.f623f;
        if (i3 < 0 || i3 >= i4) {
            throw new IllegalArgumentException(("lineIndex(" + i3 + ") is out of bounds [0, " + i4 + ')').toString());
        }
    }
}
