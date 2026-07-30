package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public interface e extends x0, ReadableByteChannel {
    c buffer();

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    boolean exhausted();

    c getBuffer();

    long indexOf(byte b8);

    long indexOf(byte b8, long j8);

    long indexOf(byte b8, long j8, long j9);

    long indexOf(ByteString byteString);

    long indexOf(ByteString byteString, long j8);

    long indexOfElement(ByteString byteString);

    long indexOfElement(ByteString byteString, long j8);

    InputStream inputStream();

    e peek();

    boolean rangeEquals(long j8, ByteString byteString);

    boolean rangeEquals(long j8, ByteString byteString, int i8, int i9);

    int read(byte[] bArr);

    int read(byte[] bArr, int i8, int i9);

    @Override // okio.x0
    /* synthetic */ long read(c cVar, long j8);

    long readAll(v0 v0Var);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j8);

    ByteString readByteString();

    ByteString readByteString(long j8);

    long readDecimalLong();

    void readFully(c cVar, long j8);

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(long j8, Charset charset);

    String readString(Charset charset);

    String readUtf8();

    String readUtf8(long j8);

    int readUtf8CodePoint();

    String readUtf8Line();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j8);

    boolean request(long j8);

    void require(long j8);

    int select(m0 m0Var);

    void skip(long j8);

    @Override // okio.x0
    /* synthetic */ y0 timeout();
}
