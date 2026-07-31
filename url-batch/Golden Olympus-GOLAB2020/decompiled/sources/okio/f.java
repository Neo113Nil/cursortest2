package okio;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface f extends z, WritableByteChannel {
    f C(String str);

    long F(B b4);

    f G(long j4);

    f L(byte[] bArr);

    f M(h hVar);

    f P(long j4);

    @Override // okio.z, java.io.Flushable
    void flush();

    C3372e q();

    f r();

    f s(int i4);

    f t(int i4);

    f w(int i4);

    f write(byte[] bArr, int i4, int i5);

    f y();
}
