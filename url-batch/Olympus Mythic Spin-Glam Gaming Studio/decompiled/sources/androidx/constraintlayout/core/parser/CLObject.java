package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes13.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {
    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    private class CLObjectIterator implements Iterator {
        int index = 0;
        CLObject myObject;

        public CLObjectIterator(CLObject cLObject) {
            this.myObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.myObject.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            CLKey cLKey = (CLKey) this.myObject.mElements.get(this.index);
            this.index++;
            return cLKey;
        }
    }
}
