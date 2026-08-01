package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public interface w8 extends f30, ReadableByteChannel {
    y8 c(long j);

    String d();

    String f(long j);

    int g(lw lwVar);

    void h(long j);

    long k();

    String l(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
