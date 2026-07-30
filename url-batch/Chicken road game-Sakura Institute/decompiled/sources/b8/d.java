package b8;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1405a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        r6.k.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f1403a;
        String loggerName = logRecord.getLoggerName();
        r6.k.e(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i7 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        r6.k.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f1404b.get(loggerName);
        if (str == null) {
            str = z6.h.V(loggerName, 23);
        }
        if (Log.isLoggable(str, i7)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int D = z6.h.D(message, '\n', i8, 4);
                if (D == -1) {
                    D = length;
                }
                while (true) {
                    min = Math.min(D, i8 + 4000);
                    String substring = message.substring(i8, min);
                    r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i7, str, substring);
                    if (min >= D) {
                        break;
                    } else {
                        i8 = min;
                    }
                }
                i8 = min + 1;
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
