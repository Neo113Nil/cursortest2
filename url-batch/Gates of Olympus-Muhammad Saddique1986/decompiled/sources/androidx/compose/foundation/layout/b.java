package androidx.compose.foundation.layout;

import O0.k;
import U.q;
import r.C0850L;
import r.InterfaceC0849K;

/* loaded from: classes.dex */
public abstract class b {
    public static final C0850L a(float f3, float f4, float f5, float f6) {
        return new C0850L(f3, f4, f5, f6);
    }

    public static C0850L b(float f3) {
        return new C0850L(0, 0, 0, f3);
    }

    public static final float c(InterfaceC0849K interfaceC0849K, k kVar) {
        return kVar == k.f3741d ? interfaceC0849K.a(kVar) : interfaceC0849K.b(kVar);
    }

    public static final float d(InterfaceC0849K interfaceC0849K, k kVar) {
        return kVar == k.f3741d ? interfaceC0849K.b(kVar) : interfaceC0849K.a(kVar);
    }

    public static final q e(q qVar, InterfaceC0849K interfaceC0849K) {
        return qVar.i(new PaddingValuesElement(interfaceC0849K));
    }

    public static final q f(q qVar, float f3) {
        return qVar.i(new PaddingElement(f3, f3, f3, f3));
    }

    public static final q g(q qVar, float f3, float f4) {
        return qVar.i(new PaddingElement(f3, f4, f3, f4));
    }

    public static q h(q qVar, float f3, float f4, int i3) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        if ((i3 & 2) != 0) {
            f4 = 0;
        }
        return g(qVar, f3, f4);
    }

    public static q i(q qVar, float f3, float f4, float f5, int i3) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        if ((i3 & 2) != 0) {
            f4 = 0;
        }
        if ((i3 & 4) != 0) {
            f5 = 0;
        }
        return qVar.i(new PaddingElement(f3, f4, f5, 0));
    }

    public static final q j(q qVar) {
        return qVar.i(new IntrinsicWidthElement());
    }
}
