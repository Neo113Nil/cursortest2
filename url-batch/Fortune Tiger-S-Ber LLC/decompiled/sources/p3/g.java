package p3;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public interface g extends t, WritableByteChannel {
    g f(i iVar);

    @Override // p3.t, java.io.Flushable
    void flush();

    g j(String str);

    g write(byte[] bArr);

    g writeByte(int i4);

    g writeInt(int i4);

    g writeShort(int i4);
}
