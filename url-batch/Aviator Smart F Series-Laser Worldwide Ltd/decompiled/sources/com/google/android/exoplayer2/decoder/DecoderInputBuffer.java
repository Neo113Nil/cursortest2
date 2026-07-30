package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@Deprecated
/* loaded from: classes3.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final CryptoInfo cryptoInfo;

    @Nullable
    public ByteBuffer data;

    @Nullable
    public Format format;
    private final int paddingSize;

    @Nullable
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i8, int i9) {
            super("Buffer too small (" + i8 + " < " + i9 + ")");
            this.currentCapacity = i8;
            this.requiredCapacity = i9;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i8) {
        this(i8, 0);
    }

    private ByteBuffer createReplacementByteBuffer(int i8) {
        int i9 = this.bufferReplacementMode;
        if (i9 == 1) {
            return ByteBuffer.allocate(i8);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i8);
        }
        ByteBuffer byteBuffer = this.data;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i8);
    }

    public static DecoderInputBuffer newNoDataInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    @EnsuresNonNull({"data"})
    public void ensureSpaceForWrite(int i8) {
        int i9 = i8 + this.paddingSize;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i9);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i9 + position;
        if (capacity >= i10) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer createReplacementByteBuffer = createReplacementByteBuffer(i10);
        createReplacementByteBuffer.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            createReplacementByteBuffer.put(byteBuffer);
        }
        this.data = createReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void resetSupplementalData(int i8) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            this.supplementalData = ByteBuffer.allocate(i8);
        } else {
            this.supplementalData.clear();
        }
    }

    public DecoderInputBuffer(int i8, int i9) {
        this.cryptoInfo = new CryptoInfo();
        this.bufferReplacementMode = i8;
        this.paddingSize = i9;
    }
}
