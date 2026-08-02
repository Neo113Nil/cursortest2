package y0;

import T.C0097o;
import T.InterfaceC0090h;

/* loaded from: classes.dex */
public interface F {
    default void a(int i4, W.u uVar) {
        b(uVar, i4, 0);
    }

    void b(W.u uVar, int i4, int i5);

    void d(C0097o c0097o);

    void e(long j4, int i4, int i5, int i6, E e4);

    int f(InterfaceC0090h interfaceC0090h, int i4, boolean z);

    default int g(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        return f(interfaceC0090h, i4, z);
    }

    default void c(long j4) {
    }
}
