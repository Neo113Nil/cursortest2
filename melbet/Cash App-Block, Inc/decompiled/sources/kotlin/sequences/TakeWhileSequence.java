package kotlin.sequences;

import java.util.Iterator;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$2;

/* loaded from: classes9.dex */
public final class TakeWhileSequence implements Sequence {
    public final /* synthetic */ int $r8$classId = 1;
    public final Function predicate;
    public final Sequence sequence;

    public TakeWhileSequence(Sequence sequence, Function1 function1) {
        sequence.getClass();
        this.sequence = sequence;
        this.predicate = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new TakeWhileSequence$iterator$1(this);
            default:
                return new SubSequence$iterator$1(this);
        }
    }

    public TakeWhileSequence(FlatteningSequence flatteningSequence, ConvertFromMetadataKt$$Lambda$2 convertFromMetadataKt$$Lambda$2) {
        this.sequence = flatteningSequence;
        this.predicate = convertFromMetadataKt$$Lambda$2;
    }
}
