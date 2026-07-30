package x5;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f8406g = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f8407a;

    /* renamed from: c, reason: collision with root package name */
    public final C1019i f8409c;

    /* renamed from: d, reason: collision with root package name */
    public final C1019i f8410d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f8408b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f8411e = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f8412f = f8406g;

    public n(Logger logger) {
        this.f8407a = logger;
        this.f8409c = new C1019i(5.0d / r10.toSeconds(1L), 5.0d);
        this.f8410d = new C1019i(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f8407a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f8408b;
            boolean z7 = atomicBoolean.get();
            C1019i c1019i = this.f8410d;
            if (z7) {
                if (c1019i.a(1.0d)) {
                    if (th != null) {
                        logger.log(level, str, th);
                        return;
                    } else {
                        logger.log(level, str);
                        return;
                    }
                }
                return;
            }
            if (this.f8409c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d7 = this.f8411e;
                c1019i.a(d7);
                String obj = this.f8412f.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj.toLowerCase(locale);
                logger.log(level, String.format(locale, "Too many log messages detected. Will only log %.0f time(s) per %s from now on.", Double.valueOf(d7), lowerCase.substring(0, lowerCase.length() - 1)));
                if (th != null) {
                    logger.log(level, str, th);
                } else {
                    logger.log(level, str);
                }
            }
        }
    }
}
