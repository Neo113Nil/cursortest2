package l6;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class f implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f6314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6315b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f6316c;

    public f(Sequence sequence, boolean z7, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f6314a = sequence;
        this.f6315b = z7;
        this.f6316c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new e(this);
    }
}
