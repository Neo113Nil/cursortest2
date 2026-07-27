package androidx.compose.foundation.layout;

import M0.k;
import Q.C0267c;
import S.o;
import kotlin.jvm.functions.Function1;
import q.C1033l;
import q.InterfaceC1021Z;
import q.a0;

/* loaded from: classes.dex */
public abstract class b {
    public static a0 a(float f4, int i2) {
        if ((i2 & 1) != 0) {
            f4 = 0;
        }
        float f5 = 0;
        return new a0(f4, f5, f4, f5);
    }

    public static final a0 b(float f4, float f5, float f6, float f7) {
        return new a0(f4, f5, f6, f7);
    }

    public static a0 c(float f4) {
        return new a0(0, 0, 0, f4);
    }

    public static final float d(InterfaceC1021Z interfaceC1021Z, k kVar) {
        return kVar == k.f3555d ? interfaceC1021Z.a(kVar) : interfaceC1021Z.b(kVar);
    }

    public static final float e(InterfaceC1021Z interfaceC1021Z, k kVar) {
        return kVar == k.f3555d ? interfaceC1021Z.b(kVar) : interfaceC1021Z.a(kVar);
    }

    public static final o f(o oVar, Function1 function1) {
        return oVar.h(new OffsetPxElement(function1, new C0267c(3, function1)));
    }

    public static final o g(o oVar, InterfaceC1021Z interfaceC1021Z) {
        return oVar.h(new PaddingValuesElement(interfaceC1021Z, new C1033l(1, 8)));
    }

    public static final o h(o oVar, float f4) {
        return oVar.h(new PaddingElement(f4, f4, f4, f4, new C1033l(1, 7)));
    }

    public static final o i(o oVar, float f4, float f5) {
        return oVar.h(new PaddingElement(f4, f5, f4, f5, new C1033l(1, 6)));
    }

    public static o j(o oVar, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f4 = 0;
        }
        if ((i2 & 2) != 0) {
            f5 = 0;
        }
        return i(oVar, f4, f5);
    }

    public static o k(o oVar, float f4, float f5, float f6, int i2) {
        if ((i2 & 1) != 0) {
            f4 = 0;
        }
        float f7 = f4;
        if ((i2 & 2) != 0) {
            f5 = 0;
        }
        float f8 = f5;
        if ((i2 & 4) != 0) {
            f6 = 0;
        }
        return oVar.h(new PaddingElement(f7, f8, f6, 0, new C1033l(1, 5)));
    }

    public static final o l(o oVar) {
        return oVar.h(new IntrinsicWidthElement());
    }
}
