package r1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3968a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        X0.f.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f3966a;
        String loggerName = logRecord.getLoggerName();
        X0.f.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        X0.f.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f3967b.get(loggerName);
        if (str == null) {
            str = e1.d.O0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int E02 = e1.d.E0(message, '\n', i2, false, 4);
                if (E02 == -1) {
                    E02 = length;
                }
                while (true) {
                    min = Math.min(E02, i2 + 4000);
                    String substring = message.substring(i2, min);
                    X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= E02) {
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
