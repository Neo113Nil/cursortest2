package v3;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.A;
import kotlin.text.y;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f10997a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f10995a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) c.f10996b.get(loggerName);
        if (str == null) {
            str = A.P(23, loggerName);
        }
        if (Log.isLoggable(str, i2)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int u4 = y.u(message, '\n', i4, false, 4);
                if (u4 == -1) {
                    u4 = length;
                }
                while (true) {
                    min = Math.min(u4, i4 + 4000);
                    String substring = message.substring(i4, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= u4) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
            }
        }
    }
}
