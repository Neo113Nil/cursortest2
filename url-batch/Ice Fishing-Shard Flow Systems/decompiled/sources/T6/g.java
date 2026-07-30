package T6;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends u, WritableByteChannel {
    g A(String str);

    @Override // T6.u, java.io.Flushable
    void flush();

    g k(long j);

    g q(int i2);

    g write(byte[] bArr);

    g writeByte(int i2);

    g writeInt(int i2);

    g writeShort(int i2);

    g z(i iVar);
}
