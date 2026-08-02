package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class DropSequence$iterator$1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId = 0;
    public final Iterator iterator;
    public int left;

    public DropSequence$iterator$1(DropSequence dropSequence, byte b) {
        this.left = dropSequence.count;
        this.iterator = dropSequence.sequence.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        Iterator it = this.iterator;
        switch (i) {
            case 0:
                break;
            default:
                return this.left > 0 && it.hasNext();
        }
        while (this.left > 0 && it.hasNext()) {
            it.next();
            this.left--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Iterator it = this.iterator;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.left;
                if (i2 != 0) {
                    this.left = i2 - 1;
                    return it.next();
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
        }
        while (this.left > 0 && it.hasNext()) {
            it.next();
            this.left--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DropSequence$iterator$1(DropSequence dropSequence) {
        this.iterator = dropSequence.sequence.iterator();
        this.left = dropSequence.count;
    }
}
