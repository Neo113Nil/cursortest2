package A0;

import A.AbstractC0017m;
import A.C0022s;
import Z.AbstractC0319p;
import Z.C0320q;
import Z.O;
import Z.S;
import a.AbstractC0345a;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import b0.AbstractC0497e;
import java.util.ArrayList;
import java.util.List;
import z2.C1400D;
import z2.C1403G;
import z2.C1441y;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352c;

    /* renamed from: d, reason: collision with root package name */
    public final float f353d;

    /* renamed from: e, reason: collision with root package name */
    public final float f354e;

    /* renamed from: f, reason: collision with root package name */
    public final int f355f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f356g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f357h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public o(q qVar, long j4, int i2, boolean z4) {
        boolean z5;
        int h4;
        this.f350a = qVar;
        this.f351b = i2;
        if (M0.a.k(j4) != 0 || M0.a.j(j4) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) qVar.f361b;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        float f4 = 0.0f;
        while (i4 < size) {
            s sVar = (s) arrayList2.get(i4);
            I0.c cVar = sVar.f373a;
            int i6 = M0.a.i(j4);
            if (M0.a.d(j4)) {
                h4 = M0.a.h(j4) - ((int) Math.ceil(f4));
                if (h4 < 0) {
                    h4 = 0;
                }
            } else {
                h4 = M0.a.h(j4);
            }
            C0031b c0031b = new C0031b(cVar, this.f351b - i5, z4, u3.d.b(i6, h4, 5));
            float b4 = c0031b.b() + f4;
            B0.F f5 = c0031b.f313d;
            int i7 = i5 + f5.f906g;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new r(c0031b, sVar.f374b, sVar.f375c, i5, i7, f4, b4));
            if (f5.f903d || (i7 == this.f351b && i4 != C1441y.d((ArrayList) this.f350a.f361b))) {
                z5 = true;
                f4 = b4;
                i5 = i7;
                break;
            } else {
                i4++;
                f4 = b4;
                i5 = i7;
                arrayList2 = arrayList3;
            }
        }
        z5 = false;
        this.f354e = f4;
        this.f355f = i5;
        this.f352c = z5;
        this.f357h = arrayList;
        this.f353d = M0.a.i(j4);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            r rVar = (r) arrayList.get(i8);
            ?? r7 = rVar.f366a.f315f;
            ArrayList arrayList5 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Y.d dVar = (Y.d) r7.get(i9);
                arrayList5.add(dVar != null ? dVar.h(AbstractC0345a.c(0.0f, rVar.f371f)) : null);
            }
            C1400D.j(arrayList5, arrayList4);
        }
        if (arrayList4.size() < ((List) this.f350a.f363d).size()) {
            int size4 = ((List) this.f350a.f363d).size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList6.add(null);
            }
            arrayList4 = C1403G.B(arrayList4, arrayList6);
        }
        this.f356g = arrayList4;
    }

    public static void g(o oVar, Z.r rVar, long j4, O o4, L0.j jVar, AbstractC0497e abstractC0497e) {
        rVar.g();
        ArrayList arrayList = oVar.f357h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar2 = (r) arrayList.get(i2);
            rVar2.f366a.f(rVar, j4, o4, jVar, abstractC0497e, 3);
            rVar.q(0.0f, rVar2.f366a.b());
        }
        rVar.b();
    }

    public static void h(o oVar, Z.r rVar, AbstractC0319p abstractC0319p, float f4, O o4, L0.j jVar, AbstractC0497e abstractC0497e) {
        rVar.g();
        ArrayList arrayList = oVar.f357h;
        if (arrayList.size() <= 1) {
            I0.j.a(oVar, rVar, abstractC0319p, f4, o4, jVar, abstractC0497e, 3);
        } else if (abstractC0319p instanceof S) {
            I0.j.a(oVar, rVar, abstractC0319p, f4, o4, jVar, abstractC0497e, 3);
        } else if (abstractC0319p instanceof Z.N) {
            int size = arrayList.size();
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                r rVar2 = (r) arrayList.get(i2);
                f6 += rVar2.f366a.b();
                f5 = Math.max(f5, rVar2.f366a.d());
            }
            Shader b4 = ((Z.N) abstractC0319p).b(u3.l.N(f5, f6));
            Matrix matrix = new Matrix();
            b4.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                r rVar3 = (r) arrayList.get(i4);
                rVar3.f366a.g(rVar, new C0320q(b4), f4, o4, jVar, abstractC0497e, 3);
                C0031b c0031b = rVar3.f366a;
                rVar.q(0.0f, c0031b.b());
                matrix.setTranslate(0.0f, -c0031b.b());
                b4.setLocalMatrix(matrix);
            }
        }
        rVar.b();
    }

    public final void a(long j4, float[] fArr) {
        i(K.e(j4));
        j(K.d(j4));
        M2.C c4 = new M2.C();
        c4.f3578d = 0;
        u3.d.A(this.f357h, j4, new C0043n(j4, fArr, c4, new M2.B()));
    }

    public final float b(int i2) {
        k(i2);
        ArrayList arrayList = this.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        return c0031b.f313d.e(i2 - rVar.f369d) + rVar.f371f;
    }

    public final int c(float f4) {
        ArrayList arrayList = this.f357h;
        r rVar = (r) arrayList.get(u3.d.z(arrayList, f4));
        int i2 = rVar.f368c - rVar.f367b;
        int i4 = rVar.f369d;
        if (i2 == 0) {
            return i4;
        }
        float f5 = f4 - rVar.f371f;
        B0.F f6 = rVar.f366a.f313d;
        return i4 + f6.f905f.getLineForVertical(((int) f5) - f6.f907h);
    }

    public final float d(int i2) {
        k(i2);
        ArrayList arrayList = this.f357h;
        r rVar = (r) arrayList.get(u3.d.y(i2, arrayList));
        C0031b c0031b = rVar.f366a;
        return c0031b.f313d.g(i2 - rVar.f369d) + rVar.f371f;
    }

    public final int e(long j4) {
        ArrayList arrayList = this.f357h;
        r rVar = (r) arrayList.get(u3.d.z(arrayList, Y.c.e(j4)));
        int i2 = rVar.f368c;
        int i4 = rVar.f367b;
        if (i2 - i4 == 0) {
            return i4;
        }
        long c4 = AbstractC0345a.c(Y.c.d(j4), Y.c.e(j4) - rVar.f371f);
        C0031b c0031b = rVar.f366a;
        int e4 = (int) Y.c.e(c4);
        B0.F f4 = c0031b.f313d;
        int i5 = e4 - f4.f907h;
        Layout layout = f4.f905f;
        int lineForVertical = layout.getLineForVertical(i5);
        return i4 + layout.getOffsetForHorizontal(lineForVertical, (f4.b(lineForVertical) * (-1)) + Y.c.d(c4));
    }

    public final long f(Y.d dVar, int i2, C0022s c0022s) {
        long j4;
        long j5;
        ArrayList arrayList = this.f357h;
        int z4 = u3.d.z(arrayList, dVar.f4375b);
        float f4 = ((r) arrayList.get(z4)).f372g;
        float f5 = dVar.f4377d;
        if (f4 >= f5 || z4 == C1441y.d(arrayList)) {
            r rVar = (r) arrayList.get(z4);
            return rVar.a(rVar.f366a.c(dVar.h(AbstractC0345a.c(0.0f, -rVar.f371f)), i2, c0022s), true);
        }
        int z5 = u3.d.z(arrayList, f5);
        long j6 = K.f299b;
        while (true) {
            j4 = K.f299b;
            if (!K.a(j6, j4) || z4 > z5) {
                break;
            }
            r rVar2 = (r) arrayList.get(z4);
            j6 = rVar2.a(rVar2.f366a.c(dVar.h(AbstractC0345a.c(0.0f, -rVar2.f371f)), i2, c0022s), true);
            z4++;
        }
        if (K.a(j6, j4)) {
            return j4;
        }
        while (true) {
            j5 = K.f299b;
            if (!K.a(j4, j5) || z4 > z5) {
                break;
            }
            r rVar3 = (r) arrayList.get(z5);
            j4 = rVar3.a(rVar3.f366a.c(dVar.h(AbstractC0345a.c(0.0f, -rVar3.f371f)), i2, c0022s), true);
            z5--;
        }
        return K.a(j4, j5) ? j6 : M1.a.j((int) (j6 >> 32), (int) (4294967295L & j4));
    }

    public final void i(int i2) {
        q qVar = this.f350a;
        if (i2 < 0 || i2 >= ((C0036g) qVar.f362c).f328a.length()) {
            StringBuilder o4 = AbstractC0017m.o(i2, "offset(", ") is out of bounds [0, ");
            o4.append(((C0036g) qVar.f362c).f328a.length());
            o4.append(')');
            throw new IllegalArgumentException(o4.toString().toString());
        }
    }

    public final void j(int i2) {
        q qVar = this.f350a;
        if (i2 < 0 || i2 > ((C0036g) qVar.f362c).f328a.length()) {
            StringBuilder o4 = AbstractC0017m.o(i2, "offset(", ") is out of bounds [0, ");
            o4.append(((C0036g) qVar.f362c).f328a.length());
            o4.append(']');
            throw new IllegalArgumentException(o4.toString().toString());
        }
    }

    public final void k(int i2) {
        int i4 = this.f355f;
        if (i2 < 0 || i2 >= i4) {
            throw new IllegalArgumentException(("lineIndex(" + i2 + ") is out of bounds [0, " + i4 + ')').toString());
        }
    }
}
