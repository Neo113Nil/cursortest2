package n6;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends u, WritableByteChannel {
    g D(String str);

    @Override // n6.u, java.io.Flushable
    void flush();

    g k(long j4);

    g s(int i7);

    g u(i iVar);

    g write(byte[] bArr);

    g writeByte(int i7);

    g writeInt(int i7);

    g writeShort(int i7);
}
