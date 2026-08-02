package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kex {
    static final Logger a = Logger.getLogger(jwy.class.getName());
    public final Object b = new Object();
    public final jyp c;

    public kex(jyp jypVar, long j, String str) {
        jypVar.getClass();
        this.c = jypVar;
        jyh jyhVar = new jyh();
        jyhVar.a = str.concat(" created");
        jyhVar.b = jyi.b;
        jyhVar.b(j);
        b(jyhVar.a());
    }

    static void a(jyp jypVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + jypVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(jyj jyjVar) {
        int ordinal = jyjVar.b.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, jyjVar.a);
    }
}
