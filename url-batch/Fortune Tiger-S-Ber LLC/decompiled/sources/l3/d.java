package l3;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2887a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        u2.c.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f2885a;
        String loggerName = logRecord.getLoggerName();
        u2.c.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i4 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        u2.c.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f2886b.get(loggerName);
        if (str == null) {
            str = b3.e.p0(loggerName, 23);
        }
        if (Log.isLoggable(str, i4)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int g02 = b3.e.g0(message, '\n', i5, 4);
                if (g02 == -1) {
                    g02 = length;
                }
                while (true) {
                    min = Math.min(g02, i5 + 4000);
                    String substring = message.substring(i5, min);
                    u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i4, str, substring);
                    if (min >= g02) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
