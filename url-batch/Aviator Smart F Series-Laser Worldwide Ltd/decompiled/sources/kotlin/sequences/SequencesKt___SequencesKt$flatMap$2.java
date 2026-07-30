package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements f6.l {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    SequencesKt___SequencesKt$flatMap$2() {
        super(1, m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // f6.l
    public final Iterator<R> invoke(m p02) {
        kotlin.jvm.internal.s.checkNotNullParameter(p02, "p0");
        return p02.iterator();
    }
}
