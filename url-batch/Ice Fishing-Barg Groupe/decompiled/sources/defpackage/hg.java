package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface hg extends y52, WritableByteChannel {
    yf PxuCJdSBwIXG();

    @Override // defpackage.y52, java.io.Flushable
    void flush();

    hg write(byte[] bArr);

    hg writeByte(int i);

    hg writeInt(int i);

    hg writeShort(int i);

    hg xfACYKDMU6Dj(ah ahVar);
}
