package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    Buffer buffer();

    boolean exhausted();

    Buffer getBuffer();

    long indexOf(long j, ByteString byteString);

    long indexOf(ByteString byteString);

    long indexOfElement(ByteString byteString);

    InputStream inputStream();

    RealBufferedSource peek();

    boolean rangeEquals(long j, ByteString byteString);

    long readAll(BufferedSink bufferedSink);

    byte readByte();

    byte[] readByteArray();

    ByteString readByteString();

    ByteString readByteString(long j);

    void readFully(Buffer buffer, long j);

    void readFully(byte[] bArr);

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    String readString(Charset charset);

    String readUtf8(long j);

    String readUtf8LineStrict(long j);

    boolean request(long j);

    void require(long j);

    int select(Options options);

    void skip(long j);
}
