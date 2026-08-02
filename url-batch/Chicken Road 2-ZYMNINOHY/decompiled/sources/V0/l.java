package V0;

import W.InterfaceC0113f;
import v2.F;
import v2.I;

/* loaded from: classes.dex */
public interface l {
    default d a(byte[] bArr, int i4, int i5) {
        F j4 = I.j();
        b(bArr, 0, i5, k.f3207c, new D0.a(7, j4));
        return new b(j4.f());
    }

    void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f);

    int c();

    default void reset() {
    }
}
