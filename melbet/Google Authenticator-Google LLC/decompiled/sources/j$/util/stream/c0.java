package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class c0 extends d0 {
    @Override // j$.util.stream.a
    public final boolean d() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.d0, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        a aVar = this.a;
        if (aVar.i) {
            super.forEach(consumer);
            return;
        }
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        spliterator.forEachRemaining(consumer);
    }
}
