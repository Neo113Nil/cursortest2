package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public interface w9 extends ke0, ReadableByteChannel {
    int B(f50 f50Var);

    void H(long j);

    long L();

    String M(Charset charset);

    y9 j(long j);

    String m();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String y(long j);
}
