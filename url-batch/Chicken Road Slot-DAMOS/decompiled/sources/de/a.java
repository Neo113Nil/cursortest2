package de;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i0;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3702a;

    public a(Sequence sequence) {
        this.f3702a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.f3702a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        i0.l("This sequence can be consumed only once.");
        return null;
    }
}
