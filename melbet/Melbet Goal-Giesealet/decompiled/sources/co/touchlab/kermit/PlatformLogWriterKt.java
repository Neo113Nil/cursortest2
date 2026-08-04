package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: platformLogWriter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"platformLogWriter", "Lco/touchlab/kermit/LogWriter;", "messageStringFormatter", "Lco/touchlab/kermit/MessageStringFormatter;", "kermit-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformLogWriterKt {
    public static final LogWriter platformLogWriter(MessageStringFormatter messageStringFormatter) {
        Intrinsics.checkNotNullParameter(messageStringFormatter, "messageStringFormatter");
        return new LogcatWriter(null, 1, null);
    }

    public static /* synthetic */ LogWriter platformLogWriter$default(MessageStringFormatter messageStringFormatter, int i, Object obj) {
        if ((i & 1) != 0) {
            messageStringFormatter = DefaultFormatter.INSTANCE;
        }
        return platformLogWriter(messageStringFormatter);
    }
}
