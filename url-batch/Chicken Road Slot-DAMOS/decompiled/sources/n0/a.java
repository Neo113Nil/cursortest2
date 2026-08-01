package n0;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a {
    void b(int i3, Object obj);

    void c(Object obj);

    void d();

    void e(int i3, Object obj);

    void g(int i3, int i10, int i11);

    Object getCurrent();

    void h(int i3, int i10);

    void l();

    default void m(Object obj, Function2 function2) {
        function2.invoke(getCurrent(), obj);
    }

    default void f() {
    }
}
