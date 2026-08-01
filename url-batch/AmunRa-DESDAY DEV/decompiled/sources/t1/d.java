package t1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3877a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        Z0.d.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f3875a;
        String loggerName = logRecord.getLoggerName();
        Z0.d.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Z0.d.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f3876b.get(loggerName);
        if (str == null) {
            str = g1.d.H0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int x02 = g1.d.x0(message, '\n', i2, false, 4);
                if (x02 == -1) {
                    x02 = length;
                }
                while (true) {
                    min = Math.min(x02, i2 + 4000);
                    String substring = message.substring(i2, min);
                    Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= x02) {
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
