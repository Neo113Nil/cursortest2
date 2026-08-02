package T3;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public interface i extends v, ReadableByteChannel {
    j c(long j4);

    String g(long j4);

    String m();

    void p(long j4);

    long q();

    InputStream r();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j4);
}
