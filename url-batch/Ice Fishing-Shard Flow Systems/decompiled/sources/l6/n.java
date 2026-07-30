package l6;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class n implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f6322a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f6323b;

    public n(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f6322a = sequence;
        this.f6323b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new m(this);
    }
}
