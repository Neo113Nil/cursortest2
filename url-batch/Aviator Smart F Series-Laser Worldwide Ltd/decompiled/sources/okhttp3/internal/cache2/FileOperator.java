package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import kotlin.jvm.internal.s;
import okio.c;

/* loaded from: classes5.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        s.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j8, c sink, long j9) {
        s.checkNotNullParameter(sink, "sink");
        if (j9 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j9 > 0) {
            long transferTo = this.fileChannel.transferTo(j8, j9, sink);
            j8 += transferTo;
            j9 -= transferTo;
        }
    }

    public final void write(long j8, c source, long j9) {
        s.checkNotNullParameter(source, "source");
        if (j9 < 0 || j9 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j10 = j8;
        long j11 = j9;
        while (j11 > 0) {
            long transferFrom = this.fileChannel.transferFrom(source, j10, j11);
            j10 += transferFrom;
            j11 -= transferFrom;
        }
    }
}
