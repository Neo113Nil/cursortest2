package g4;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public interface g extends t, WritableByteChannel {
    g d(i iVar);

    @Override // g4.t, java.io.Flushable
    void flush();

    g j(String str);

    g write(byte[] bArr);

    g writeByte(int i);

    g writeInt(int i);

    g writeShort(int i);
}
