package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c implements m {
    private final f6.l keySelector;
    private final m source;

    public c(m source, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        this.source = source;
        this.keySelector = keySelector;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new b(this.source.iterator(), this.keySelector);
    }
}
