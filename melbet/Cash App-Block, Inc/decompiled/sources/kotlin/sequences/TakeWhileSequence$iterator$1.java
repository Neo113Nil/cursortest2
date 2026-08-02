package kotlin.sequences;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class TakeWhileSequence$iterator$1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final Iterator iterator;
    public Object nextItem;
    public int nextState;
    public final /* synthetic */ Sequence this$0;

    public TakeWhileSequence$iterator$1(TakeWhileSequence takeWhileSequence) {
        this.$r8$classId = 0;
        this.this$0 = takeWhileSequence;
        this.iterator = takeWhileSequence.sequence.iterator();
        this.nextState = -1;
    }

    public void calcNext$2() {
        Iterator it = this.iterator;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) ((TakeWhileSequence) this.this$0).predicate).invoke(next)).booleanValue()) {
                this.nextState = 1;
                this.nextItem = next;
                return;
            }
        }
        this.nextState = 0;
    }

    public boolean ensureItemIterator() {
        Iterator it;
        Iterator it2 = (Iterator) this.nextItem;
        if (it2 != null && it2.hasNext()) {
            this.nextState = 1;
            return true;
        }
        do {
            Iterator it3 = this.iterator;
            if (!it3.hasNext()) {
                this.nextState = 2;
                this.nextItem = null;
                return false;
            }
            Object next = it3.next();
            FlatteningSequence flatteningSequence = (FlatteningSequence) this.this$0;
            it = (Iterator) flatteningSequence.iterator.invoke(flatteningSequence.transformer.invoke(next));
        } while (!it.hasNext());
        this.nextItem = it;
        this.nextState = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.nextState == -1) {
                    calcNext$2();
                }
                return this.nextState == 1;
            default:
                int i = this.nextState;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return ensureItemIterator();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                if (this.nextState == -1) {
                    calcNext$2();
                }
                if (this.nextState == 0) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    Object obj = this.nextItem;
                    this.nextItem = null;
                    this.nextState = -1;
                    break;
                }
            default:
                int i = this.nextState;
                if (i == 2) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else if (i == 0 && !ensureItemIterator()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this.nextState = 0;
                    Iterator it = (Iterator) this.nextItem;
                    it.getClass();
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
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TakeWhileSequence$iterator$1(FlatteningSequence flatteningSequence) {
        this.$r8$classId = 1;
        this.this$0 = flatteningSequence;
        this.iterator = flatteningSequence.sequence.iterator();
    }
}
