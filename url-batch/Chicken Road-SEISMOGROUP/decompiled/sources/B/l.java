package B;

/* loaded from: classes.dex */
public interface l {
    void a(h hVar);

    void b();

    void c();

    default void d(g gVar, Runnable runnable) {
        a(new h(gVar == null ? null : new k(0, gVar), runnable));
    }
}
