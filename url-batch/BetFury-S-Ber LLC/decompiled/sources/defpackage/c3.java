package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c3 extends Handler {
    public static final c3 a = new c3();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = b3.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) b3.b.get(loggerName);
        if (str == null) {
            str = mf0.D(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int w = mf0.w(message, '\n', i2, 4);
                if (w == -1) {
                    w = length;
                }
                while (true) {
                    min = Math.min(w, i2 + 4000);
                    Log.println(i, str, message.substring(i2, min));
                    if (min >= w) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
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
