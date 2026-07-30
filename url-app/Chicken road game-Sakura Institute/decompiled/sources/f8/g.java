package f8;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface g extends e0, WritableByteChannel {
    g K(String str);

    g P(i iVar);

    @Override // f8.e0, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g writeByte(int i7);

    g writeInt(int i7);

    g writeShort(int i7);
}
