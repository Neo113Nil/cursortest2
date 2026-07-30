package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t10 implements Sequence {
    public final AtomicReference a;

    public t10(Sequence sequence) {
        this.a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        lh.g("This sequence can be consumed only once.");
        return null;
    }
}
