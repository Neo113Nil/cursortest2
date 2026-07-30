package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class b extends kotlin.collections.a {
    private final f6.l keySelector;
    private final HashSet<Object> observed;
    private final Iterator<Object> source;

    public b(Iterator<Object> source, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        this.source = source;
        this.keySelector = keySelector;
        this.observed = new HashSet<>();
    }

    @Override // kotlin.collections.a
    protected void computeNext() {
        while (this.source.hasNext()) {
            Object next = this.source.next();
            if (this.observed.add(this.keySelector.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
