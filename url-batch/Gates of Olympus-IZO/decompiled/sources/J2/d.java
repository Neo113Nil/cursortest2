package J2;

import android.util.Log;
import h2.AbstractC0447i;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2620a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        Z1.i.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f2618a;
        String loggerName = logRecord.getLoggerName();
        Z1.i.e(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i3 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Z1.i.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f2619b.get(loggerName);
        if (str == null) {
            str = AbstractC0447i.G0(loggerName, 23);
        }
        if (Log.isLoggable(str, i3)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int q0 = AbstractC0447i.q0(message, '\n', i4, false, 4);
                if (q0 == -1) {
                    q0 = length;
                }
                while (true) {
                    min = Math.min(q0, i4 + 4000);
                    String substring = message.substring(i4, min);
                    Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i3, str, substring);
                    if (min >= q0) {
                        break;
                    } else {
                        i4 = min;
                    }
                }
                i4 = min + 1;
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
