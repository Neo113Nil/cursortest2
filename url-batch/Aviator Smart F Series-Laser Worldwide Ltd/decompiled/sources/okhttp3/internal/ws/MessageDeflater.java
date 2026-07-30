package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.io.b;
import kotlin.jvm.internal.s;
import okio.ByteString;
import okio.c;
import okio.h;
import okio.v0;

/* loaded from: classes5.dex */
public final class MessageDeflater implements Closeable {
    private final c deflatedBytes;
    private final Deflater deflater;
    private final h deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z7) {
        this.noContextTakeover = z7;
        c cVar = new c();
        this.deflatedBytes = cVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new h((v0) cVar, deflater);
    }

    private final boolean endsWith(c cVar, ByteString byteString) {
        return cVar.rangeEquals(cVar.size() - byteString.size(), byteString);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(c buffer) {
        ByteString byteString;
        s.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        c cVar = this.deflatedBytes;
        byteString = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
        if (endsWith(cVar, byteString)) {
            long size = this.deflatedBytes.size() - 4;
            c.a readAndWriteUnsafe$default = c.readAndWriteUnsafe$default(this.deflatedBytes, null, 1, null);
            try {
                readAndWriteUnsafe$default.resizeBuffer(size);
                b.closeFinally(readAndWriteUnsafe$default, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        c cVar2 = this.deflatedBytes;
        buffer.write(cVar2, cVar2.size());
    }
}
