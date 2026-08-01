package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public interface j9 extends h60, ReadableByteChannel {
    l9 c(long j);

    String d();

    String i(long j);

    int j(oz ozVar);

    void l(long j);

    long o();

    String p(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);
}
