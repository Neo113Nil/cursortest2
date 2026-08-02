package kotlin.sequences;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public class SequencesKt__SequenceBuilderKt {
    public static SequenceBuilderIterator iterator(Function2 function2) {
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.nextStep = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(sequenceBuilderIterator, sequenceBuilderIterator, function2);
        return sequenceBuilderIterator;
    }
}
