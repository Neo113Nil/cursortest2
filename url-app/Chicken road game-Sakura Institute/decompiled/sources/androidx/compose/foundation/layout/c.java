package androidx.compose.foundation.layout;

import d0.p0;
import r6.k;
import s0.f;
import s0.g;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f638a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f639b = new FillElement(1.0f, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final FillElement f640c = new FillElement(1.0f, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f641d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f642e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f643f;

    /* renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f644g;

    static {
        f fVar = s0.b.f8088p;
        int i7 = 11;
        f641d = new WrapContentElement(1, new a2.a(i7, fVar), fVar);
        f fVar2 = s0.b.f8087o;
        f642e = new WrapContentElement(1, new a2.a(i7, fVar2), fVar2);
        g gVar = s0.b.f8082j;
        int i8 = 12;
        f643f = new WrapContentElement(3, new a2.a(i8, gVar), gVar);
        g gVar2 = s0.b.f8078f;
        f644g = new WrapContentElement(3, new a2.a(i8, gVar2), gVar2);
    }

    public static final o a(o oVar, float f9, float f10) {
        return oVar.j(new UnspecifiedConstraintsElement(f9, f10));
    }

    public static final o b(o oVar, float f9) {
        return oVar.j(f9 == 1.0f ? f638a : new FillElement(f9, 2));
    }

    public static final o c(float f9) {
        return new SizeElement(0.0f, f9, 0.0f, f9, 5);
    }

    public static final o d(o oVar, float f9, float f10) {
        return oVar.j(new SizeElement(0.0f, f9, 0.0f, f10, 5));
    }

    public static /* synthetic */ o e(o oVar, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f9 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f10 = Float.NaN;
        }
        return d(oVar, f9, f10);
    }

    public static final o f(o oVar) {
        float f9 = p0.f2269b;
        return oVar.j(new SizeElement(f9, f9, f9, f9, false));
    }

    public static o g(o oVar, float f9, float f10, float f11, float f12, int i7) {
        return oVar.j(new SizeElement(f9, (i7 & 2) != 0 ? Float.NaN : f10, (i7 & 4) != 0 ? Float.NaN : f11, (i7 & 8) != 0 ? Float.NaN : f12, false));
    }

    public static final o h(o oVar, float f9) {
        return oVar.j(new SizeElement(f9, f9, f9, f9, true));
    }

    public static final o i(o oVar, float f9, float f10) {
        return oVar.j(new SizeElement(f9, f10, f9, f10, true));
    }

    public static final o j(o oVar, float f9, float f10, float f11, float f12) {
        return oVar.j(new SizeElement(f9, f10, f11, f12, true));
    }

    public static final o k(float f9) {
        return new SizeElement(f9, 0.0f, f9, 0.0f, 10);
    }

    public static o l(o oVar, float f9) {
        return oVar.j(new SizeElement(f9, 0.0f, Float.NaN, 0.0f, 10));
    }

    public static o m(o oVar) {
        f fVar = s0.b.f8088p;
        return oVar.j(k.a(fVar, fVar) ? f641d : k.a(fVar, s0.b.f8087o) ? f642e : new WrapContentElement(1, new a2.a(11, fVar), fVar));
    }

    public static o n(o oVar) {
        g gVar = s0.b.f8082j;
        return oVar.j(gVar.equals(gVar) ? f643f : gVar.equals(s0.b.f8078f) ? f644g : new WrapContentElement(3, new a2.a(12, gVar), gVar));
    }
}
