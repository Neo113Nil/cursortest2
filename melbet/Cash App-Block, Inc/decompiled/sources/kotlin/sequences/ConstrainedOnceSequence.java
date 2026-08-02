package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ConstrainedOnceSequence implements Sequence {
    public final AtomicReference sequenceRef;

    public ConstrainedOnceSequence(Sequence sequence) {
        this.sequenceRef = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.sequenceRef.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        a$$ExternalSyntheticBUOutline0.m$1("This sequence can be consumed only once.");
        return null;
    }
}
