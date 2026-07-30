package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface b9 {
    void a(int i, Object obj);

    void b(Object obj);

    void c();

    void d(int i, Object obj);

    void f(int i, int i2, int i3);

    Object g();

    void h(int i, int i2);

    void i();

    default void j(Object obj, Function2 function2) {
        function2.b(g(), obj);
    }

    default void e() {
    }
}
