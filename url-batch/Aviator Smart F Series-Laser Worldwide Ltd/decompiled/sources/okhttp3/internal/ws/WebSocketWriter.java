package okhttp3.internal.ws;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.s;
import okio.ByteString;
import okio.c;
import okio.d;

/* loaded from: classes5.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final c.a maskCursor;
    private final byte[] maskKey;
    private final c messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final d sink;
    private final c sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z7, d sink, Random random, boolean z8, boolean z9, long j8) {
        s.checkNotNullParameter(sink, "sink");
        s.checkNotNullParameter(random, "random");
        this.isClient = z7;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z8;
        this.noContextTakeover = z9;
        this.minimumDeflateSize = j8;
        this.messageBuffer = new c();
        this.sinkBuffer = sink.getBuffer();
        this.maskKey = z7 ? new byte[4] : null;
        this.maskCursor = z7 ? new c.a() : null;
    }

    private final void writeControlFrame(int i8, ByteString byteString) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.writeByte(i8 | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(size | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            s.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(byteString);
                c cVar = this.sinkBuffer;
                c.a aVar = this.maskCursor;
                s.checkNotNull(aVar);
                cVar.readAndWriteUnsafe(aVar);
                this.maskCursor.seek(size2);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(size);
            this.sinkBuffer.write(byteString);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final Random getRandom() {
        return this.random;
    }

    public final d getSink() {
        return this.sink;
    }

    public final void writeClose(int i8, ByteString byteString) {
        ByteString byteString2 = ByteString.EMPTY;
        if (i8 != 0 || byteString != null) {
            if (i8 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i8);
            }
            c cVar = new c();
            cVar.writeShort(i8);
            if (byteString != null) {
                cVar.write(byteString);
            }
            byteString2 = cVar.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i8, ByteString data) {
        s.checkNotNullParameter(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.write(data);
        int i9 = i8 | 128;
        if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i9 = i8 | PsExtractor.AUDIO_STREAM;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i9);
        int i10 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i10 | ((int) size));
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i10 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i10 | 127);
            this.sinkBuffer.writeLong(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            s.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                c cVar = this.messageBuffer;
                c.a aVar = this.maskCursor;
                s.checkNotNull(aVar);
                cVar.readAndWriteUnsafe(aVar);
                this.maskCursor.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.emit();
    }

    public final void writePing(ByteString payload) {
        s.checkNotNullParameter(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(ByteString payload) {
        s.checkNotNullParameter(payload, "payload");
        writeControlFrame(10, payload);
    }
}
