package T3;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface h extends t, WritableByteChannel {
    @Override // T3.t, java.io.Flushable
    void flush();

    h h(String str);

    h i(long j4);

    h l(j jVar);

    h write(byte[] bArr);

    h writeByte(int i4);

    h writeInt(int i4);

    h writeShort(int i4);
}
