package io.opentelemetry.sdk.trace.internal;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue;
import io.opentelemetry.internal.shaded.jctools.queues.atomic.MpscAtomicArrayQueue;
import java.util.Objects;
import java.util.Queue;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class JcTools {
    public static <T> Queue<T> newFixedSizeQueue(int i) {
        return new MpscAtomicArrayQueue(i);
    }

    public static long capacity(Queue<?> queue) {
        return ((MessagePassingQueue) queue).capacity();
    }

    public static <T> int drain(Queue<T> queue, int i, final Consumer<T> consumer) {
        Objects.requireNonNull(consumer);
        return ((MessagePassingQueue) queue).drain(new MessagePassingQueue.Consumer() { // from class: io.opentelemetry.sdk.trace.internal.JcTools$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.Consumer
            public final void accept(Object obj) {
                consumer.accept(obj);
            }
        }, i);
    }

    private JcTools() {
    }
}
