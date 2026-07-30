package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface oq extends ol2, WritableByteChannel {
    oq G(String str);

    @Override // defpackage.ol2, java.io.Flushable
    void flush();

    oq i(dr drVar);

    oq write(byte[] bArr);

    oq writeByte(int i);

    oq writeInt(int i);

    oq writeShort(int i);
}
