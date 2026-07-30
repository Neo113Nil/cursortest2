package okio.internal;

import java.io.IOException;
import kotlin.jvm.internal.s;
import okio.m;
import okio.x0;

/* loaded from: classes5.dex */
public final class b extends m {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x0 delegate, long j8, boolean z7) {
        super(delegate);
        s.checkNotNullParameter(delegate, "delegate");
        this.size = j8;
        this.truncate = z7;
    }

    private final void truncateToSize(okio.c cVar, long j8) {
        okio.c cVar2 = new okio.c();
        cVar2.writeAll(cVar);
        cVar.write(cVar2, j8);
        cVar2.clear();
    }

    @Override // okio.m, okio.x0
    public long read(okio.c sink, long j8) {
        s.checkNotNullParameter(sink, "sink");
        long j9 = this.bytesReceived;
        long j10 = this.size;
        if (j9 > j10) {
            j8 = 0;
        } else if (this.truncate) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j11);
        }
        long read = super.read(sink, j8);
        if (read != -1) {
            this.bytesReceived += read;
        }
        long j12 = this.bytesReceived;
        long j13 = this.size;
        if ((j12 >= j13 || read != -1) && j12 <= j13) {
            return read;
        }
        if (read > 0 && j12 > j13) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
