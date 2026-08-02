package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class htn extends htm {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(htp.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(htp.class, "remainingField");

    @Override // defpackage.htm
    public final int a(htp htpVar) {
        return b.decrementAndGet(htpVar);
    }

    @Override // defpackage.htm
    public final void b(htp htpVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(htpVar, null, set) && atomicReferenceFieldUpdater.get(htpVar) == null) {
        }
    }
}
