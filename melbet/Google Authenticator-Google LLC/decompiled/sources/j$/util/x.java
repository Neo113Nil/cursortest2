package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class x extends j$.nio.file.attribute.a implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ((LongConsumer) consumer).getClass();
        } else {
            if (z.a) {
                z.a(x.class, "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ((LongConsumer) consumer).getClass();
            return false;
        }
        if (z.a) {
            z.a(x.class, "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return false;
    }
}
