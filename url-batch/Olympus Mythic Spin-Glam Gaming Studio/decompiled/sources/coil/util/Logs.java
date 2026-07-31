package coil.util;

/* compiled from: Logs.kt */
/* renamed from: coil.util.-Logs, reason: invalid class name */
/* loaded from: classes15.dex */
public abstract class Logs {
    public static final void log(Logger logger, String str, Throwable th) {
        if (logger.getLevel() <= 6) {
            logger.log(str, 6, null, th);
        }
    }
}
