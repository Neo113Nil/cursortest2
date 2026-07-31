package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChunkedLogWriter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0082\u0010J*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lco/touchlab/kermit/ChunkedLogWriter;", "Lco/touchlab/kermit/LogWriter;", "wrapped", "maxMessageLength", "", "minMessageLength", "(Lco/touchlab/kermit/LogWriter;II)V", "getWrapped$kermit_core_release", "()Lco/touchlab/kermit/LogWriter;", "chunkedLog", "", "severity", "Lco/touchlab/kermit/Severity;", "message", "", "tag", "throwable", "", "log", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChunkedLogWriter extends LogWriter {
    private final int maxMessageLength;
    private final int minMessageLength;
    private final LogWriter wrapped;

    /* renamed from: getWrapped$kermit_core_release, reason: from getter */
    public final LogWriter getWrapped() {
        return this.wrapped;
    }

    public ChunkedLogWriter(LogWriter wrapped, int i, int i2) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.wrapped = wrapped;
        this.maxMessageLength = i;
        this.minMessageLength = i2;
    }

    @Override // co.touchlab.kermit.LogWriter
    public void log(Severity severity, String message, String tag, Throwable throwable) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        chunkedLog(severity, message, tag, throwable);
    }

    private final void chunkedLog(Severity severity, String message, String tag, Throwable throwable) {
        while (true) {
            int length = message.length();
            int i = this.maxMessageLength;
            if (length > i) {
                String substring = message.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int i2 = this.maxMessageLength;
                int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) substring, '\n', 0, false, 6, (Object) null);
                if (lastIndexOf$default >= this.minMessageLength) {
                    substring = substring.substring(0, lastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    i2 = lastIndexOf$default + 1;
                }
                this.wrapped.log(severity, substring, tag, throwable);
                message = message.substring(i2);
                Intrinsics.checkNotNullExpressionValue(message, "substring(...)");
            } else {
                this.wrapped.log(severity, message, tag, throwable);
                return;
            }
        }
    }
}
