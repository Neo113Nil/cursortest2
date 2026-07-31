package androidx.compose.foundation.layout;

import j0.j;
import x.f0;
import x.g0;
import x.u;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f502a = new FillElement(u.f8296e, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f503b = new FillElement(u.f8297f, 1.0f);

    public static final g0 a(float f6, float f8, float f9, float f10) {
        return new g0(f6, f8, f9, f10);
    }

    public static g0 b(float f6) {
        return new g0(0, 0, 0, f6);
    }

    public static final m c(m mVar, float f6, float f8) {
        return mVar.d(new UnspecifiedConstraintsElement(f6, f8));
    }

    public static final m d(m mVar, float f6) {
        return mVar.d(f6 == 1.0f ? f502a : new FillElement(u.f8296e, f6));
    }

    public static final m e(m mVar, float f6) {
        return mVar.d(new SizeElement(0.0f, f6, 0.0f, f6, 5));
    }

    public static final m f(m mVar, f0 f0Var) {
        return mVar.d(new PaddingValuesElement(f0Var));
    }

    public static final m g(m mVar, float f6) {
        return mVar.d(new PaddingElement(f6, f6, f6, f6));
    }

    public static m h(m mVar, float f6, float f8, int i) {
        if ((i & 1) != 0) {
            f6 = 0;
        }
        if ((i & 2) != 0) {
            f8 = 0;
        }
        return mVar.d(new PaddingElement(f6, f8, f6, f8));
    }

    public static m i(float f6) {
        return new PaddingElement(0, 0, 0, f6);
    }

    public static final m j(float f6) {
        return new SizeElement(f6, f6, f6, f6);
    }

    public static final m k(m mVar, float f6, float f8) {
        return mVar.d(new SizeElement(f6, f8, f6, f8));
    }

    public static m l(m mVar) {
        return mVar.d(new SizeElement(j.f3706a, Float.NaN, j.f3707b, Float.NaN));
    }

    public static final m m(m mVar, float f6) {
        return mVar.d(new SizeElement(f6, 0.0f, f6, 0.0f, 10));
    }
}
