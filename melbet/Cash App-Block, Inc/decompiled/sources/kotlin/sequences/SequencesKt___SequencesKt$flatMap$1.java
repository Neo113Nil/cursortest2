package kotlin.sequences;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SequencesKt___SequencesKt$flatMap$1 extends FunctionReferenceImpl implements Function1 {
    public static final SequencesKt___SequencesKt$flatMap$1 INSTANCE = new SequencesKt___SequencesKt$flatMap$1();

    public SequencesKt___SequencesKt$flatMap$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        iterable.getClass();
        return iterable.iterator();
    }
}
