package p8;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f39839a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        kotlin.jvm.internal.h.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f39837a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.h.d(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        kotlin.jvm.internal.h.d(message, "getMessage(...)");
        c.a(loggerName, i, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
