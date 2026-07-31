package m6;

/* loaded from: classes.dex */
public interface k<T> extends y5.d<T> {

    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int i7, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i7 & 2) != 0) {
                obj2 = null;
            }
            return kVar.a(obj, obj2);
        }
    }

    Object a(T t6, Object obj);

    Object d(T t6, Object obj, f6.l<? super Throwable, v5.q> lVar);

    void e(T t6, f6.l<? super Throwable, v5.q> lVar);

    void g(f6.l<? super Throwable, v5.q> lVar);

    Object j(Throwable th);

    void k(Object obj);
}
