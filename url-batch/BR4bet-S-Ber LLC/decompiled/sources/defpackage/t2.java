package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t2 extends Handler {
    public static final t2 a = new t2();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = s2.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) s2.b.get(loggerName);
        if (str == null) {
            str = f70.f0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int Z = f70.Z(message, '\n', i2, 4);
                if (Z == -1) {
                    Z = length;
                }
                while (true) {
                    min = Math.min(Z, i2 + 4000);
                    Log.println(i, str, message.substring(i2, min));
                    if (min >= Z) {
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
