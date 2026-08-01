package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public interface q8 extends i30, WritableByteChannel {
    @Override // defpackage.i30, java.io.Flushable
    void flush();

    q8 i(String str);

    q8 j(t8 t8Var);

    q8 write(byte[] bArr);

    q8 writeByte(int i);

    q8 writeInt(int i);

    q8 writeShort(int i);
}
