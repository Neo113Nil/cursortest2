package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;

@Metadata
/* loaded from: classes3.dex */
public final class FileOperator {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f42686a;

    public FileOperator(FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.f42686a = fileChannel;
    }

    public final void a(long j4, C3372e sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j5 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j6 = j4;
        long j7 = j5;
        while (j7 > 0) {
            long transferTo = this.f42686a.transferTo(j6, j7, sink);
            j6 += transferTo;
            j7 -= transferTo;
        }
    }

    public final void b(long j4, C3372e source, long j5) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j5 < 0 || j5 > source.l0()) {
            throw new IndexOutOfBoundsException();
        }
        long j6 = j4;
        long j7 = j5;
        while (j7 > 0) {
            long transferFrom = this.f42686a.transferFrom(source, j6, j7);
            j6 += transferFrom;
            j7 -= transferFrom;
        }
    }
}
