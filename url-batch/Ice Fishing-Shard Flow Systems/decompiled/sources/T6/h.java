package T6;

import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public interface h extends w, ReadableByteChannel {
    i e(long j);

    byte[] n();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String u(long j);

    void y(long j);
}
