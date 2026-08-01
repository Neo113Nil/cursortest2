package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public interface v8 extends v20, WritableByteChannel {
    @Override // defpackage.v20, java.io.Flushable
    void flush();

    v8 i(String str);

    v8 j(y8 y8Var);

    v8 write(byte[] bArr);

    v8 writeByte(int i);

    v8 writeInt(int i);

    v8 writeShort(int i);
}
