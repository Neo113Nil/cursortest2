package k6;

import f6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {
    public static <T, R> b<R> c(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        kotlin.jvm.internal.i.d(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C d(b<? extends T> bVar, C c7) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        kotlin.jvm.internal.i.d(c7, "destination");
        Iterator<? extends T> it = bVar.iterator();
        while (it.hasNext()) {
            c7.add(it.next());
        }
        return c7;
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        return w5.i.e(f(bVar));
    }

    public static final <T> List<T> f(b<? extends T> bVar) {
        kotlin.jvm.internal.i.d(bVar, "<this>");
        return (List) d(bVar, new ArrayList());
    }
}
