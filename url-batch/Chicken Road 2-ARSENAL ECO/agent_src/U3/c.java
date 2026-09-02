package U3;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f2597a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2598b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f2599c;

    /* renamed from: d, reason: collision with root package name */
    public static Throwable f2600d;

    public static b a() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            boolean parseBoolean = Boolean.parseBoolean(a4.d.b("otel.java.global-autoconfigure.enabled", "false"));
            Logger logger = f2597a;
            if (!parseBoolean) {
                logger.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                return new b((d) cls.getMethod("getOpenTelemetrySdk", null).invoke(cls.getMethod("initialize", null).invoke(null, null), null));
            } catch (IllegalAccessException | NoSuchMethodException e4) {
                throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e4);
            } catch (InvocationTargetException e7) {
                logger.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e7.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void b(d dVar) {
        synchronized (f2598b) {
            try {
                if (f2599c != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", f2600d);
                }
                f2599c = new b(dVar);
                f2600d = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
