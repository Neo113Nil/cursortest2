package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class FlatteningSequence implements Sequence {
    public final Function1 iterator;
    public final Sequence sequence;
    public final Function1 transformer;

    public FlatteningSequence(Sequence sequence, Function1 function1, Function1 function12) {
        sequence.getClass();
        function1.getClass();
        this.sequence = sequence;
        this.transformer = function1;
        this.iterator = function12;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new TakeWhileSequence$iterator$1(this);
    }
}
