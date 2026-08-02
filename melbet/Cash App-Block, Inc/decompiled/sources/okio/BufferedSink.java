package okio;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @Override // okio.Sink, java.io.Flushable
    void flush();

    Buffer getBuffer();

    BufferedSink write(int i, int i2, byte[] bArr);

    BufferedSink write(ByteString byteString);

    BufferedSink write(byte[] bArr);

    long writeAll(Source source);

    BufferedSink writeByte(int i);

    BufferedSink writeInt(int i);

    BufferedSink writeIntLe(int i);

    BufferedSink writeLongLe(long j);

    BufferedSink writeShort(int i);

    BufferedSink writeUtf8(int i, int i2, String str);

    BufferedSink writeUtf8(String str);
}
