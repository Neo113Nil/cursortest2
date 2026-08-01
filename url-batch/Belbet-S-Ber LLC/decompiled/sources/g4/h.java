package g4;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public interface h extends v, ReadableByteChannel {
    i b(long j2);

    String e();

    String g(long j2);

    int h(n nVar);

    void i(long j2);

    long k();

    String l(Charset charset);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j2);
}
