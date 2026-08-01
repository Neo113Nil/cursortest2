package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public interface i9 extends x50, WritableByteChannel {
    @Override // defpackage.x50, java.io.Flushable
    void flush();

    i9 m(String str);

    i9 n(l9 l9Var);

    i9 write(byte[] bArr);

    i9 writeByte(int i);

    i9 writeInt(int i);

    i9 writeShort(int i);
}
