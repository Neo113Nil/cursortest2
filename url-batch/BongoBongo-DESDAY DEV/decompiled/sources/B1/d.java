package B1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f48a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        h1.d.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f46a;
        String loggerName = logRecord.getLoggerName();
        h1.d.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        h1.d.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f47b.get(loggerName);
        if (str == null) {
            str = o1.d.R(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int D2 = o1.d.D(message, '\n', i2, false, 4);
                if (D2 == -1) {
                    D2 = length;
                }
                while (true) {
                    min = Math.min(D2, i2 + 4000);
                    String substring = message.substring(i2, min);
                    h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= D2) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }
}
