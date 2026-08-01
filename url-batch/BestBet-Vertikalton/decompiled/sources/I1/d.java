package I1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f549a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        k1.e.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f547a;
        String loggerName = logRecord.getLoggerName();
        k1.e.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        k1.e.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f548b.get(loggerName);
        if (str == null) {
            str = r1.d.S(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int I2 = r1.d.I(message, '\n', i2, false, 4);
                if (I2 == -1) {
                    I2 = length;
                }
                while (true) {
                    min = Math.min(I2, i2 + 4000);
                    String substring = message.substring(i2, min);
                    k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= I2) {
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
