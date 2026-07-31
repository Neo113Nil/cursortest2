package m6;

/* loaded from: classes.dex */
public final class n {
    public static final <T> l<T> a(y5.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.f)) {
            return new l<>(dVar, 1);
        }
        l<T> n7 = ((kotlinx.coroutines.internal.f) dVar).n();
        if (n7 == null || !n7.G()) {
            n7 = null;
        }
        return n7 == null ? new l<>(dVar, 2) : n7;
    }
}
