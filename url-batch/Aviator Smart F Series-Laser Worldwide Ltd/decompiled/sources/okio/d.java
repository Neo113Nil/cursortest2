package okio;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public interface d extends v0, WritableByteChannel {
    c buffer();

    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    d emit();

    d emitCompleteSegments();

    @Override // okio.v0, java.io.Flushable
    void flush();

    c getBuffer();

    OutputStream outputStream();

    @Override // okio.v0
    /* synthetic */ y0 timeout();

    d write(ByteString byteString);

    d write(ByteString byteString, int i8, int i9);

    d write(x0 x0Var, long j8);

    d write(byte[] bArr);

    d write(byte[] bArr, int i8, int i9);

    @Override // okio.v0
    /* synthetic */ void write(c cVar, long j8);

    long writeAll(x0 x0Var);

    d writeByte(int i8);

    d writeDecimalLong(long j8);

    d writeHexadecimalUnsignedLong(long j8);

    d writeInt(int i8);

    d writeIntLe(int i8);

    d writeLong(long j8);

    d writeLongLe(long j8);

    d writeShort(int i8);

    d writeShortLe(int i8);

    d writeString(String str, int i8, int i9, Charset charset);

    d writeString(String str, Charset charset);

    d writeUtf8(String str);

    d writeUtf8(String str, int i8, int i9);

    d writeUtf8CodePoint(int i8);
}
