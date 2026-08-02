package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public abstract class CharIterator implements Iterator, KMappedMarker {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(nextChar());
    }

    public abstract char nextChar();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
