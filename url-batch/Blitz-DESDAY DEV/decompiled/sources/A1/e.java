package A1;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final e f71a = new e();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        g1.d.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = d.f69a;
        String loggerName = logRecord.getLoggerName();
        g1.d.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        g1.d.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) d.f70b.get(loggerName);
        if (str == null) {
            str = n1.d.Q(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int G2 = n1.d.G(message, '\n', i2, false, 4);
                if (G2 == -1) {
                    G2 = length;
                }
                while (true) {
                    min = Math.min(G2, i2 + 4000);
                    String substring = message.substring(i2, min);
                    g1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= G2) {
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
