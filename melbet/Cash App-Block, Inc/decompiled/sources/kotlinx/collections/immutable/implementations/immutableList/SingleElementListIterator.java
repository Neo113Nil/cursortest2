package kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class SingleElementListIterator extends AbstractListIterator {
    public final Object element;

    public SingleElementListIterator(Object obj, int i) {
        super(i, 1, 0);
        this.element = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.index++;
            return this.element;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.index--;
            return this.element;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
