package okhttp3.internal.ws;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.Closeable;
import java.util.Random;
import java.util.zip.Deflater;
import okhttp3.internal._UtilCommonKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;

/* loaded from: classes9.dex */
public final class WebSocketWriter implements Closeable {
    public final Buffer.UnsafeCursor maskCursor;
    public final byte[] maskKey;
    public final Buffer messageBuffer;
    public MessageDeflater messageDeflater;
    public final long minimumDeflateSize;
    public final boolean noContextTakeover;
    public final boolean perMessageDeflate;
    public final Random random;
    public final BufferedSink sink;
    public final Buffer sinkBuffer;
    public boolean writerClosed;

    public WebSocketWriter(BufferedSink bufferedSink, Random random, boolean z, boolean z2, long j) {
        bufferedSink.getClass();
        this.sink = bufferedSink;
        this.random = random;
        this.perMessageDeflate = z;
        this.noContextTakeover = z2;
        this.minimumDeflateSize = j;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = bufferedSink.getBuffer();
        this.maskKey = new byte[4];
        this.maskCursor = new Buffer.UnsafeCursor();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            _UtilCommonKt.closeQuietly(messageDeflater);
        }
        _UtilCommonKt.closeQuietly(this.sink);
    }

    public final void writeControlFrame(int i, ByteString byteString) {
        if (this.writerClosed) {
            a$$ExternalSyntheticBUOutline0.m$4("closed");
            return;
        }
        int size$okio = byteString.getSize$okio();
        if (size$okio > 125) {
            a$$ExternalSyntheticBUOutline0.m$3("Payload size must be less than or equal to 125");
            return;
        }
        Buffer buffer = this.sinkBuffer;
        buffer.m4335writeByte(i | 128);
        buffer.m4335writeByte(size$okio | 128);
        byte[] bArr = this.maskKey;
        bArr.getClass();
        this.random.nextBytes(bArr);
        buffer.write(bArr, 0, bArr.length);
        if (size$okio > 0) {
            long j = buffer.size;
            buffer.m4333write(byteString);
            Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
            unsafeCursor.getClass();
            buffer.readAndWriteUnsafe(unsafeCursor);
            unsafeCursor.seek(j);
            WebSocketProtocol.toggleMask(unsafeCursor, bArr);
            unsafeCursor.close();
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(ByteString byteString) {
        int i;
        if (this.writerClosed) {
            a$$ExternalSyntheticBUOutline0.m$4("closed");
            return;
        }
        Buffer buffer = this.messageBuffer;
        buffer.m4333write(byteString);
        if (!this.perMessageDeflate || byteString.data.length < this.minimumDeflateSize) {
            i = EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
        } else {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover, 0);
                this.messageDeflater = messageDeflater;
            }
            DeflaterSink deflaterSink = (DeflaterSink) messageDeflater.deflaterSink;
            Buffer buffer2 = messageDeflater.deflatedBytes;
            if (buffer2.size != 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            if (messageDeflater.noContextTakeover) {
                ((Deflater) messageDeflater.deflater).reset();
            }
            deflaterSink.write(buffer, buffer.size);
            deflaterSink.flush();
            ByteString byteString2 = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (buffer2.rangeEquals(byteString2.getSize$okio(), buffer2.size - byteString2.data.length, byteString2)) {
                long j = buffer2.size - 4;
                Buffer.UnsafeCursor unsafeCursor = new Buffer.UnsafeCursor();
                buffer2.readAndWriteUnsafe(unsafeCursor);
                try {
                    unsafeCursor.resizeBuffer(j);
                    unsafeCursor.close();
                } finally {
                }
            } else {
                buffer2.m4335writeByte(0);
            }
            buffer.write(buffer2, buffer2.size);
            i = EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE;
        }
        long j2 = buffer.size;
        Buffer buffer3 = this.sinkBuffer;
        buffer3.m4335writeByte(i);
        if (j2 <= 125) {
            buffer3.m4335writeByte(((int) j2) | 128);
        } else if (j2 <= 65535) {
            buffer3.m4335writeByte(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            buffer3.m4337writeShort((int) j2);
        } else {
            buffer3.m4335writeByte(255);
            buffer3.writeLong(j2);
        }
        byte[] bArr = this.maskKey;
        bArr.getClass();
        this.random.nextBytes(bArr);
        buffer3.write(bArr, 0, bArr.length);
        if (j2 > 0) {
            Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
            unsafeCursor2.getClass();
            buffer.readAndWriteUnsafe(unsafeCursor2);
            unsafeCursor2.seek(0L);
            WebSocketProtocol.toggleMask(unsafeCursor2, bArr);
            unsafeCursor2.close();
        }
        buffer3.write(buffer, j2);
        this.sink.flush();
    }
}
