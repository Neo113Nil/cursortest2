package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import m6.p0;

/* loaded from: classes.dex */
public final class k<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i7, kotlin.jvm.internal.e eVar) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e7) {
        if (p0.a() && !(!(e7 instanceof List))) {
            throw new AssertionError();
        }
        if (obj == null) {
            return a(e7);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e7);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e7);
        return a(arrayList);
    }
}
