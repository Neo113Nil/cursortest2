package f8;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface h extends g0, ReadableByteChannel {
    void J(long j8);

    int M(v vVar);

    long R();

    String S(Charset charset);

    i h(long j8);

    String q();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j8);

    String y(long j8);
}
