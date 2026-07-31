package ru.rustore.sdk.reactive.backpressure;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface BackpressureStrategy {

    @Metadata
    public static final class BufferDropLast implements BackpressureStrategy {
        private final int bufferSize;

        public BufferDropLast(int i4) {
            this.bufferSize = i4;
        }

        public final int getBufferSize() {
            return this.bufferSize;
        }
    }

    @Metadata
    public static final class BufferDropOldest implements BackpressureStrategy {
        private final int bufferSize;

        public BufferDropOldest(int i4) {
            this.bufferSize = i4;
        }

        public final int getBufferSize() {
            return this.bufferSize;
        }
    }
}
