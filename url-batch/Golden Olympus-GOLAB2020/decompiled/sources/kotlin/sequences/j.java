package kotlin.sequences;

import a2.AbstractC1241b;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class j {
    public abstract Object a(Object obj, kotlin.coroutines.d dVar);

    public abstract Object b(Iterator it, kotlin.coroutines.d dVar);

    public final Object c(Sequence sequence, kotlin.coroutines.d dVar) {
        Object b4 = b(sequence.iterator(), dVar);
        return b4 == AbstractC1241b.f() ? b4 : Unit.f41027a;
    }
}
