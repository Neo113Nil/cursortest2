package okio;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface Source extends Closeable {
    long read(Buffer buffer, long j);

    Timeout timeout();
}
