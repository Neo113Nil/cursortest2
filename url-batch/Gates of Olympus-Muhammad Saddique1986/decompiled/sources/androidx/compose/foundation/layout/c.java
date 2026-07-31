package androidx.compose.foundation.layout;

import C0.C0025a;
import F.AbstractC0110n0;
import U.h;
import U.q;
import f2.j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f4828a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f4829b = new FillElement(1.0f, 3);

    /* renamed from: c, reason: collision with root package name */
    public static final WrapContentElement f4830c;

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f4831d;

    static {
        h hVar = U.b.f4471n;
        f4830c = new WrapContentElement(1, false, new C0025a(10, hVar), hVar);
        h hVar2 = U.b.f4470m;
        f4831d = new WrapContentElement(1, false, new C0025a(10, hVar2), hVar2);
    }

    public static final q a(q qVar, float f3, float f4) {
        return qVar.i(new UnspecifiedConstraintsElement(f3, f4));
    }

    public static /* synthetic */ q b(q qVar, float f3, float f4, int i3) {
        if ((i3 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 2) != 0) {
            f4 = Float.NaN;
        }
        return a(qVar, f3, f4);
    }

    public static final q c(q qVar, float f3) {
        return qVar.i(f3 == 1.0f ? f4828a : new FillElement(f3, 2));
    }

    public static final q d(q qVar, float f3) {
        return qVar.i(new SizeElement(0.0f, f3, 0.0f, f3, 5));
    }

    public static final q e(q qVar, float f3, float f4) {
        return qVar.i(new SizeElement(0.0f, f3, 0.0f, f4, 5));
    }

    public static /* synthetic */ q f(q qVar, float f3, float f4, int i3) {
        if ((i3 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i3 & 2) != 0) {
            f4 = Float.NaN;
        }
        return e(qVar, f3, f4);
    }

    public static q g(q qVar, float f3, float f4, float f5, float f6, int i3) {
        return qVar.i(new SizeElement(f3, (i3 & 2) != 0 ? Float.NaN : f4, (i3 & 4) != 0 ? Float.NaN : f5, (i3 & 8) != 0 ? Float.NaN : f6, false));
    }

    public static final q h(q qVar, float f3) {
        return qVar.i(new SizeElement(f3, f3, f3, f3, true));
    }

    public static final q i(q qVar, float f3, float f4) {
        return qVar.i(new SizeElement(f3, f4, f3, f4, true));
    }

    public static final q j(q qVar, float f3, float f4, float f5, float f6) {
        return qVar.i(new SizeElement(f3, f4, f5, f6, true));
    }

    public static /* synthetic */ q k(q qVar, float f3, float f4, float f5, int i3) {
        if ((i3 & 2) != 0) {
            f4 = Float.NaN;
        }
        if ((i3 & 4) != 0) {
            f5 = Float.NaN;
        }
        return j(qVar, f3, f4, f5, Float.NaN);
    }

    public static final q l() {
        float f3 = AbstractC0110n0.f1691b;
        return new SizeElement(f3, 0.0f, f3, 0.0f, 10);
    }

    public static q m(q qVar) {
        h hVar = U.b.f4471n;
        return qVar.i(j.a(hVar, hVar) ? f4830c : j.a(hVar, U.b.f4470m) ? f4831d : new WrapContentElement(1, false, new C0025a(10, hVar), hVar));
    }
}
