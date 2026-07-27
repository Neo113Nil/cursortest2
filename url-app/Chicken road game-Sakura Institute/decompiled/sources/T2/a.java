package T2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class a implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4034a;

    public a(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f4034a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.f4034a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
