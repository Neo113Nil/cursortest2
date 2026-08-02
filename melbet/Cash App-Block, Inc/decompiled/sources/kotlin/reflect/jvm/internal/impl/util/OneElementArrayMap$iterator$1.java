package kotlin.reflect.jvm.internal.impl.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes9.dex */
public final class OneElementArrayMap$iterator$1<T> implements Iterator<T>, KMappedMarker {
    public boolean notVisited = true;
    public final /* synthetic */ OneElementArrayMap this$0;

    public OneElementArrayMap$iterator$1(OneElementArrayMap oneElementArrayMap) {
        this.this$0 = oneElementArrayMap;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.notVisited;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.notVisited) {
            this.notVisited = false;
            return (T) this.this$0.getValue();
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
