package n6;

import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public interface h extends w, ReadableByteChannel {
    void C(long j4);

    i f(long j4);

    byte[] q();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j4);

    String w(long j4);
}
