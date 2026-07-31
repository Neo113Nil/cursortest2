package m;

/* loaded from: classes.dex */
public interface g0 {
    default boolean a(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(c());
    }

    Object b();

    Object c();
}
