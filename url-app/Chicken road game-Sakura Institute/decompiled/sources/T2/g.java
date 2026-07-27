package T2;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
/* loaded from: classes.dex */
public final class g<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final s f4046a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f4047b;

    public g(s sequence) {
        q predicate = q.f4053d;
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f4046a = sequence;
        this.f4047b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
