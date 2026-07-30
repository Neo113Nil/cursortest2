package kotlin.sequences;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes4.dex */
class r extends q {
    private static final <T> m asSequence(Enumeration<T> enumeration) {
        Iterator it;
        m asSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(enumeration, "<this>");
        it = kotlin.collections.s.iterator(enumeration);
        asSequence = SequencesKt__SequencesKt.asSequence(it);
        return asSequence;
    }
}
