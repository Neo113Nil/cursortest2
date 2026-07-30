package l6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671a implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f6306a;

    public C0671a(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f6306a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.f6306a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
