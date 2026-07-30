package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
class t extends s {
    public static final <T> void forEach(Iterator<? extends T> it, f6.l operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(it, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it) {
        kotlin.jvm.internal.s.checkNotNullParameter(it, "<this>");
        return it;
    }

    public static final <T> Iterator<c0> withIndex(Iterator<? extends T> it) {
        kotlin.jvm.internal.s.checkNotNullParameter(it, "<this>");
        return new e0(it);
    }
}
