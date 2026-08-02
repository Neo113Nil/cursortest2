package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class SequencesKt__SequencesKt$sequenceOf$1$1 implements Iterator, KMappedMarker {
    public final Object $element;
    public final /* synthetic */ int $r8$classId;
    public boolean _hasNext = true;

    public /* synthetic */ SequencesKt__SequencesKt$sequenceOf$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$element = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
        }
        return this._hasNext;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                if (!this._hasNext) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this._hasNext = false;
                    break;
                }
            default:
                if (!this._hasNext) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this._hasNext = false;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
