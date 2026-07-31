package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface g extends B, ReadableByteChannel {
    String A(long j4);

    boolean D(long j4, h hVar);

    String E(Charset charset);

    void H(long j4);

    String I();

    byte[] K(long j4);

    void O(long j4);

    long R();

    InputStream S();

    int T(s sVar);

    h d(long j4);

    C3372e q();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    byte[] u();

    boolean v();

    void x(C3372e c3372e, long j4);

    long z();
}
