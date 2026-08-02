package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class g implements Iterator, r {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public g(h hVar) {
        this.b = hVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.nio.file.attribute.a.z(this.b, consumer);
                break;
            default:
                j$.nio.file.attribute.a.z(this.b, new k(consumer, 0));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new l((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public g(m mVar) {
        this.b = mVar.a.iterator();
    }
}
