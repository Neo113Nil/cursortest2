package c4;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f887a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        i3.d.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f885a;
        String loggerName = logRecord.getLoggerName();
        i3.d.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        i3.d.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f886b.get(loggerName);
        if (str == null) {
            str = p3.d.D0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i4 = 0;
            while (i4 < length) {
                int w02 = p3.d.w0(message, '\n', i4, 4);
                if (w02 == -1) {
                    w02 = length;
                }
                while (true) {
                    min = Math.min(w02, i4 + 4000);
                    String substring = message.substring(i4, min);
                    i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= w02) {
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
