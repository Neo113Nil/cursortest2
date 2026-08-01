package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public interface r8 extends q30, ReadableByteChannel {
    t8 c(long j);

    String d();

    String f(long j);

    int g(xw xwVar);

    void h(long j);

    long k();

    String l(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
