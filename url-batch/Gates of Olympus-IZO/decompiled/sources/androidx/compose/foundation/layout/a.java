package androidx.compose.foundation.layout;

import M0.j;
import U.i;
import U.l;
import r.C0797I;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f3644a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f3645b = new FillElement(1.0f, 3);

    public static C0797I a(float f3, int i3) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        float f4 = 0;
        return new C0797I(f3, f4, f3, f4);
    }

    public static final C0797I b(float f3, float f4, float f5, float f6) {
        return new C0797I(f3, f4, f5, f6);
    }

    public static l c(l lVar, float f3) {
        return lVar.e(new AspectRatioElement(f3, false));
    }

    public static final float d(InterfaceC0796H interfaceC0796H, j jVar) {
        return jVar == j.f2775d ? interfaceC0796H.a(jVar) : interfaceC0796H.b(jVar);
    }

    public static final float e(InterfaceC0796H interfaceC0796H, j jVar) {
        return jVar == j.f2775d ? interfaceC0796H.b(jVar) : interfaceC0796H.a(jVar);
    }

    public static final l f(l lVar, float f3, float f4) {
        return lVar.e(new UnspecifiedConstraintsElement(f3, f4));
    }

    public static final l g(l lVar, float f3) {
        return lVar.e(f3 == 1.0f ? f3644a : new FillElement(f3, 2));
    }

    public static /* synthetic */ l h() {
        return g(i.f3302a, 1.0f);
    }

    public static final l i(l lVar, float f3) {
        return lVar.e(new SizeElement(0.0f, f3, 0.0f, f3, 5));
    }

    public static l j(l lVar, float f3) {
        return lVar.e(new SizeElement(0.0f, Float.NaN, 0.0f, f3, 5));
    }

    public static final l k(l lVar, InterfaceC0796H interfaceC0796H) {
        return lVar.e(new PaddingValuesElement(interfaceC0796H));
    }

    public static final l l(l lVar, float f3) {
        return lVar.e(new PaddingElement(f3, f3, f3, f3));
    }

    public static final l m(l lVar, float f3, float f4) {
        return lVar.e(new PaddingElement(f3, f4, f3, f4));
    }

    public static l n(l lVar, float f3, float f4, int i3) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        if ((i3 & 2) != 0) {
            f4 = 0;
        }
        return m(lVar, f3, f4);
    }

    public static final l o(l lVar, float f3, float f4, float f5, float f6) {
        return lVar.e(new PaddingElement(f3, f4, f5, f6));
    }

    public static l p(l lVar, float f3, float f4, float f5, float f6, int i3) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        if ((i3 & 2) != 0) {
            f4 = 0;
        }
        if ((i3 & 4) != 0) {
            f5 = 0;
        }
        if ((i3 & 8) != 0) {
            f6 = 0;
        }
        return o(lVar, f3, f4, f5, f6);
    }

    public static final l q(l lVar, float f3) {
        return lVar.e(new SizeElement(f3, f3, f3, f3));
    }

    public static final l r(l lVar, float f3, float f4) {
        return lVar.e(new SizeElement(f3, f4, f3, f4));
    }

    public static final l s(float f3) {
        return new SizeElement(f3, 0.0f, f3, 0.0f, 10);
    }
}
