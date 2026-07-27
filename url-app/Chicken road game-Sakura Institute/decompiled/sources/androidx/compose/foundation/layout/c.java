package androidx.compose.foundation.layout;

import A0.C0030a;
import S.f;
import S.g;
import S.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f5081a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f5082b = new FillElement(1.0f, 3);

    /* renamed from: c, reason: collision with root package name */
    public static final WrapContentElement f5083c;

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f5084d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f5085e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f5086f;

    static {
        f fVar = S.b.f3962q;
        f5083c = new WrapContentElement(1, false, new C0030a(10, fVar), fVar);
        f fVar2 = S.b.f3961p;
        f5084d = new WrapContentElement(1, false, new C0030a(10, fVar2), fVar2);
        g gVar = S.b.f3956k;
        f5085e = new WrapContentElement(3, false, new C0030a(11, gVar), gVar);
        g gVar2 = S.b.f3952d;
        f5086f = new WrapContentElement(3, false, new C0030a(11, gVar2), gVar2);
    }

    public static final o a(o oVar, float f4, float f5) {
        return oVar.h(new UnspecifiedConstraintsElement(f4, f5));
    }

    public static final o b(o oVar, float f4) {
        return oVar.h(new SizeElement(0.0f, f4, 0.0f, f4, 5));
    }

    public static final o c(o oVar, float f4, float f5) {
        return oVar.h(new SizeElement(0.0f, f4, 0.0f, f5, 5));
    }

    public static /* synthetic */ o d(o oVar, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f5 = Float.NaN;
        }
        return c(oVar, f4, f5);
    }

    public static final o e(o oVar, float f4, float f5) {
        return oVar.h(new SizeElement(f4, f5, f4, f5, false));
    }

    public static o f(o oVar, float f4, float f5, float f6, float f7, int i2) {
        return oVar.h(new SizeElement(f4, (i2 & 2) != 0 ? Float.NaN : f5, (i2 & 4) != 0 ? Float.NaN : f6, (i2 & 8) != 0 ? Float.NaN : f7, false));
    }

    public static final o g(o oVar, float f4) {
        return oVar.h(new SizeElement(f4, f4, f4, f4, true));
    }

    public static final o h(o oVar, float f4, float f5) {
        return oVar.h(new SizeElement(f4, f5, f4, f5, true));
    }

    public static final o i(o oVar, float f4, float f5, float f6, float f7) {
        return oVar.h(new SizeElement(f4, f5, f6, f7, true));
    }

    public static final o j(o oVar, float f4) {
        return oVar.h(new SizeElement(f4, 0.0f, f4, 0.0f, 10));
    }

    public static o k(o oVar) {
        f fVar = S.b.f3962q;
        return oVar.h(Intrinsics.a(fVar, fVar) ? f5083c : Intrinsics.a(fVar, S.b.f3961p) ? f5084d : new WrapContentElement(1, false, new C0030a(10, fVar), fVar));
    }

    public static o l(o oVar, g gVar) {
        return oVar.h(gVar.equals(S.b.f3956k) ? f5085e : gVar.equals(S.b.f3952d) ? f5086f : new WrapContentElement(3, false, new C0030a(11, gVar), gVar));
    }
}
