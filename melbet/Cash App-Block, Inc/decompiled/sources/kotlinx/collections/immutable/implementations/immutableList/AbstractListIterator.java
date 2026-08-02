package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public abstract class AbstractListIterator implements ListIterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public int index;
    public int size;

    public /* synthetic */ AbstractListIterator(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.index = i;
        this.size = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.index < this.size) {
                }
                break;
            default:
                if (this.index < this.size) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.$r8$classId) {
            case 0:
                if (this.index > 0) {
                }
                break;
            default:
                if (this.index > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.$r8$classId) {
        }
        return this.index;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                i = this.index;
                break;
            default:
                i = this.index;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
