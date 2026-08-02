package kotlin.collections;

import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorNode;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class AbstractMap$keys$1$iterator$1 implements Iterator, KMappedMarker {
    public final Iterator $entryIterator;
    public final /* synthetic */ int $r8$classId;

    public AbstractMap$keys$1$iterator$1(VectorGroup vectorGroup) {
        this.$r8$classId = 1;
        this.$entryIterator = vectorGroup.children.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
        }
        return this.$entryIterator.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                return ((Map.Entry) this.$entryIterator.next()).getKey();
            case 1:
                return (VectorNode) this.$entryIterator.next();
            default:
                return ((Map.Entry) this.$entryIterator.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ AbstractMap$keys$1$iterator$1(Iterator it, int i) {
        this.$r8$classId = i;
        this.$entryIterator = it;
    }
}
