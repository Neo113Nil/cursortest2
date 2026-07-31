package androidx.emoji2.text.flatbuffer;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class FlatBufferBuilder {

    public static abstract class ByteBufferFactory {
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();
    }

    static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        @Override // java.io.InputStream
        public int read() {
            try {
                return this.buf.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }
}
