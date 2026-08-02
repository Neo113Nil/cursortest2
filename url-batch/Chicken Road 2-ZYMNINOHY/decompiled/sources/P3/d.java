package P3;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2097a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int min;
        kotlin.jvm.internal.i.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f2095a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.i.d(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i4 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        kotlin.jvm.internal.i.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String str = (String) c.f2096b.get(loggerName);
        if (str == null) {
            str = AbstractC1510g.q0(23, loggerName);
        }
        if (Log.isLoggable(str, i4)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int g02 = AbstractC1510g.g0(message, '\n', i5, 4);
                if (g02 == -1) {
                    g02 = length;
                }
                while (true) {
                    min = Math.min(g02, i5 + 4000);
                    String substring = message.substring(i5, min);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i4, str, substring);
                    if (min >= g02) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
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
