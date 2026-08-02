package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TransformingSequence implements Sequence {
    public final Sequence sequence;
    public final Function1 transformer;

    public TransformingSequence(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        this.sequence = sequence;
        this.transformer = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new TransformingSequence$iterator$1(this);
    }
}
