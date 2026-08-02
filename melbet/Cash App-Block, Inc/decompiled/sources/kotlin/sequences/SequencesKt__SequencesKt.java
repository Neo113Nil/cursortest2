package kotlin.sequences;

import java.util.Iterator;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static ConstrainedOnceSequence asSequence(Iterator it) {
        it.getClass();
        return new ConstrainedOnceSequence(new LinesSequence(it, 5));
    }

    public static final FlatteningSequence flatten(Sequence sequence) {
        sequence.getClass();
        InstantKt$$ExternalSyntheticLambda0 instantKt$$ExternalSyntheticLambda0 = new InstantKt$$ExternalSyntheticLambda0(18);
        if (!(sequence instanceof TransformingSequence)) {
            return new FlatteningSequence(sequence, new InstantKt$$ExternalSyntheticLambda0(19), instantKt$$ExternalSyntheticLambda0);
        }
        TransformingSequence transformingSequence = (TransformingSequence) sequence;
        return new FlatteningSequence(transformingSequence.sequence, transformingSequence.transformer, instantKt$$ExternalSyntheticLambda0);
    }

    public static Sequence generateSequence(Function1 function1, Object obj) {
        function1.getClass();
        return obj == null ? EmptySequence.INSTANCE : new GeneratorSequence(new AppUpdateDetector$$ExternalSyntheticLambda0(obj, 12), function1);
    }

    public static ConstrainedOnceSequence generateSequence(Function0 function0) {
        return new ConstrainedOnceSequence(new GeneratorSequence(function0, new Perfs$$ExternalSyntheticLambda2(function0, 4)));
    }
}
