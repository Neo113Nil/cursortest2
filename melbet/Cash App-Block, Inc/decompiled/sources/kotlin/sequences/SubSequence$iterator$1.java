package kotlin.sequences;

import androidx.collection.MutableOrderedSetWrapper;
import androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1;
import androidx.collection.MutableSetWrapper;
import androidx.collection.MutableSetWrapper$iterator$1$iterator$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$2;

/* loaded from: classes9.dex */
public final class SubSequence$iterator$1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final Iterator iterator;
    public int position;
    public final /* synthetic */ Object this$0;

    public SubSequence$iterator$1(MutableSetWrapper mutableSetWrapper) {
        this.$r8$classId = 2;
        this.this$0 = mutableSetWrapper;
        this.position = -1;
        this.iterator = SequencesKt__SequenceBuilderKt.iterator(new MutableSetWrapper$iterator$1$iterator$1(mutableSetWrapper, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        Iterator it = this.iterator;
        switch (i) {
            case 0:
                SubSequence subSequence = (SubSequence) this.this$0;
                while (this.position < subSequence.startIndex && it.hasNext()) {
                    it.next();
                    this.position++;
                }
                return this.position < subSequence.endIndex && it.hasNext();
            case 1:
                return ((SequenceBuilderIterator) it).hasNext();
            case 2:
                return ((SequenceBuilderIterator) it).hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Iterator it = this.iterator;
        switch (i) {
            case 0:
                SubSequence subSequence = (SubSequence) obj;
                while (this.position < subSequence.startIndex && it.hasNext()) {
                    it.next();
                    this.position++;
                }
                int i2 = this.position;
                if (i2 < subSequence.endIndex) {
                    this.position = i2 + 1;
                    return it.next();
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 1:
                return ((SequenceBuilderIterator) it).next();
            case 2:
                return ((SequenceBuilderIterator) it).next();
            default:
                ConvertFromMetadataKt$$Lambda$2 convertFromMetadataKt$$Lambda$2 = (ConvertFromMetadataKt$$Lambda$2) ((TakeWhileSequence) obj).predicate;
                int i3 = this.position;
                this.position = i3 + 1;
                if (i3 >= 0) {
                    return convertFromMetadataKt$$Lambda$2.invoke(Integer.valueOf(i3), it.next());
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.position;
                if (i2 != -1) {
                    ((MutableOrderedSetWrapper) obj).parent.removeElementAt(i2);
                    this.position = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.position;
                if (i3 != -1) {
                    ((MutableSetWrapper) obj).parent.removeElementAt(i3);
                    this.position = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SubSequence$iterator$1(SubSequence subSequence) {
        this.$r8$classId = 0;
        this.this$0 = subSequence;
        this.iterator = subSequence.sequence.iterator();
    }

    public SubSequence$iterator$1(TakeWhileSequence takeWhileSequence) {
        this.$r8$classId = 3;
        this.this$0 = takeWhileSequence;
        this.iterator = new TakeWhileSequence$iterator$1((FlatteningSequence) takeWhileSequence.sequence);
    }

    public SubSequence$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper) {
        this.$r8$classId = 1;
        this.this$0 = mutableOrderedSetWrapper;
        this.position = -1;
        this.iterator = SequencesKt__SequenceBuilderKt.iterator(new MutableOrderedSetWrapper$iterator$1$iterator$1(mutableOrderedSetWrapper, this, null));
    }
}
