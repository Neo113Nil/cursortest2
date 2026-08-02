package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class GeneratorSequence implements Sequence {
    public final Function0 getInitialValue;
    public final Function1 getNextValue;

    public GeneratorSequence(Function0 function0, Function1 function1) {
        function1.getClass();
        this.getInitialValue = function0;
        this.getNextValue = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new GeneratorSequence$iterator$1(this);
    }
}
