package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface rh {
    void b(int i, Object obj);

    void c(Object obj);

    void d();

    void f(int i, Object obj);

    void h(int i, int i2, int i3);

    Object i();

    void j(int i, int i2);

    void p();

    default void q(Object obj, Function2 function2) {
        function2.invoke(i(), obj);
    }

    default void g() {
    }
}
