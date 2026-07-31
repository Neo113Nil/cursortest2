package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChunkedLogWriter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"chunked", "Lco/touchlab/kermit/LogWriter;", "maxMessageLength", "", "minMessageLength", "kermit-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChunkedLogWriterKt {
    public static /* synthetic */ LogWriter chunked$default(LogWriter logWriter, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 4000;
        }
        if ((i3 & 2) != 0) {
            i2 = 3000;
        }
        return chunked(logWriter, i, i2);
    }

    public static final LogWriter chunked(LogWriter logWriter, int i, int i2) {
        Intrinsics.checkNotNullParameter(logWriter, "<this>");
        return new ChunkedLogWriter(logWriter, i, i2);
    }
}
