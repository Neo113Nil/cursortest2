package Q4;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final TimeUnit f2042g = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f2043a;

    /* renamed from: c, reason: collision with root package name */
    public final h f2045c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2046d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2044b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f2047e = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f2048f = f2042g;

    public n(Logger logger) {
        this.f2043a = logger;
        this.f2045c = new h(5.0d / r10.toSeconds(1L), 5.0d);
        this.f2046d = new h(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f2043a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f2044b;
            boolean z5 = atomicBoolean.get();
            h hVar = this.f2046d;
            if (z5) {
                if (hVar.a(1.0d)) {
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
            if (this.f2045c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d7 = this.f2047e;
                hVar.a(d7);
                String obj = this.f2048f.toString();
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
