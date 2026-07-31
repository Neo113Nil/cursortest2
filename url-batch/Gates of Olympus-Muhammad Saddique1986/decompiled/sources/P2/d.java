package P2;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3928a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        f2.j.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f3926a;
        String loggerName = logRecord.getLoggerName();
        f2.j.e(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i3 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        f2.j.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f3927b.get(loggerName);
        if (str == null) {
            str = AbstractC0730j.X(loggerName, 23);
        }
        if (Log.isLoggable(str, i3)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int H3 = AbstractC0730j.H(message, '\n', i4, false, 4);
                if (H3 == -1) {
                    H3 = length;
                }
                while (true) {
                    min = Math.min(H3, i4 + 4000);
                    String substring = message.substring(i4, min);
                    f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i3, str, substring);
                    if (min >= H3) {
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
