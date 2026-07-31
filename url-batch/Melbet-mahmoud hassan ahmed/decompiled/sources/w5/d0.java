package w5;

import java.util.Set;

/* loaded from: classes.dex */
class d0 extends c0 {
    public static <T> Set<T> b() {
        return u.f23037f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        Set<T> b7;
        kotlin.jvm.internal.i.d(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : c0.a(set.iterator().next());
        }
        b7 = b();
        return b7;
    }
}
