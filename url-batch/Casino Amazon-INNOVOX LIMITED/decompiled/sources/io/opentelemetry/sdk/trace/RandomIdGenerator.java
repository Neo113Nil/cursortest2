package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.sdk.internal.RandomSupplier;
import java.util.Random;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
enum RandomIdGenerator implements IdGenerator {
    INSTANCE;

    private static final long INVALID_ID = 0;
    private static final Supplier<Random> randomSupplier = RandomSupplier.platformDefault();

    @Override // io.opentelemetry.sdk.trace.IdGenerator
    public String generateSpanId() {
        long nextLong;
        Random random = randomSupplier.get();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return SpanId.fromLong(nextLong);
    }

    @Override // io.opentelemetry.sdk.trace.IdGenerator
    public String generateTraceId() {
        long nextLong;
        Random random = randomSupplier.get();
        long nextLong2 = random.nextLong();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return TraceId.fromLongs(nextLong2, nextLong);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "RandomIdGenerator{}";
    }
}
