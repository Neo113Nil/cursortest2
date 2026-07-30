package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ga extends Handler {
    public static final ga a = new ga();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = fa.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) fa.b.get(loggerName);
        if (str == null) {
            str = wp2.M(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int v = up2.v(message, '\n', i2, 4);
                if (v == -1) {
                    v = length;
                }
                while (true) {
                    min = Math.min(v, i2 + 4000);
                    Log.println(i, str, message.substring(i2, min));
                    if (min >= v) {
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
