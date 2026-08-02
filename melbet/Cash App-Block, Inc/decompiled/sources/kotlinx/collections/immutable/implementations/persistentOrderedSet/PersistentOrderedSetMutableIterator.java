package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.GeneratorSequence$iterator$1;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class PersistentOrderedSetMutableIterator extends GeneratorSequence$iterator$1 {
    public final PersistentOrderedSetBuilder builder;
    public int expectedModCount;
    public Object lastIteratedElement;
    public boolean nextWasInvoked;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder persistentOrderedSetBuilder) {
        super(r1, r0);
        Object obj = persistentOrderedSetBuilder.firstElement;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentOrderedSetBuilder.hashMapBuilder;
        this.builder = persistentOrderedSetBuilder;
        this.expectedModCount = persistentHashMapBuilder.modCount;
    }

    @Override // kotlin.sequences.GeneratorSequence$iterator$1, java.util.Iterator
    public final Object next() {
        if (this.builder.hashMapBuilder.modCount != this.expectedModCount) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        Object next = super.next();
        this.lastIteratedElement = next;
        this.nextWasInvoked = true;
        return next;
    }

    @Override // kotlin.sequences.GeneratorSequence$iterator$1, java.util.Iterator
    public final void remove() {
        if (!this.nextWasInvoked) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        Object obj = this.lastIteratedElement;
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = this.builder;
        TypeIntrinsics.asMutableCollection(persistentOrderedSetBuilder).remove(obj);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = persistentOrderedSetBuilder.hashMapBuilder.modCount;
        this.nextState--;
    }
}
