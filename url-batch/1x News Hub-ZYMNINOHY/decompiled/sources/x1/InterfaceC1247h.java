package x1;

import b0.s;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1247h {
    void a();

    void b();

    default void c(C1244e c1244e, Runnable runnable) {
        d(new C1245f(c1244e == null ? null : new s(c1244e), runnable));
    }

    void d(C1245f c1245f);
}
