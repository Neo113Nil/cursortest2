package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public interface v9 extends ae0, WritableByteChannel {
    v9 I(String str);

    v9 K(y9 y9Var);

    @Override // defpackage.ae0, java.io.Flushable
    void flush();

    v9 write(byte[] bArr);

    v9 writeByte(int i);

    v9 writeInt(int i);

    v9 writeShort(int i);
}
