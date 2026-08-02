package io.opentelemetry.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.android.trace.opentelemetry.OtelTracerProvider;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import com.stripe.android.core.model.StripeJsonUtils;
import io.opentelemetry.api.trace.DefaultTracerProvider;
import io.opentelemetry.api.trace.TracerProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;
import net.idrnd.face.iad.capture.internal.e3;

/* loaded from: classes9.dex */
public abstract class GlobalOpenTelemetry {
    public static volatile ObfuscatedOpenTelemetry globalOpenTelemetry;
    public static final Logger logger = Logger.getLogger(GlobalOpenTelemetry.class.getName());
    public static final Object mutex = new Object();
    public static Throwable setGlobalCaller;

    public static OpenTelemetry get() {
        ObfuscatedOpenTelemetry obfuscatedOpenTelemetry = globalOpenTelemetry;
        if (obfuscatedOpenTelemetry != null) {
            return obfuscatedOpenTelemetry;
        }
        synchronized (mutex) {
            try {
                ObfuscatedOpenTelemetry obfuscatedOpenTelemetry2 = globalOpenTelemetry;
                if (obfuscatedOpenTelemetry2 != null) {
                    return obfuscatedOpenTelemetry2;
                }
                ObfuscatedOpenTelemetry maybeAutoConfigureAndSetGlobal = maybeAutoConfigureAndSetGlobal();
                if (maybeAutoConfigureAndSetGlobal != null) {
                    return maybeAutoConfigureAndSetGlobal;
                }
                DefaultOpenTelemetry defaultOpenTelemetry = DefaultOpenTelemetry.NO_OP;
                set(defaultOpenTelemetry);
                return defaultOpenTelemetry;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ObfuscatedOpenTelemetry maybeAutoConfigureAndSetGlobal() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            final String replace = "otel.java.global-autoconfigure.enabled".toLowerCase(Locale.ROOT).replace("-", ".");
            final int i = 0;
            String str = (String) System.getProperties().entrySet().stream().filter(new Predicate() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    switch (i) {
                        case 0:
                            return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                        default:
                            return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                    }
                }
            }).map(new d4$$ExternalSyntheticLambda0(7)).findFirst().orElse(null);
            if (str == null) {
                final int i2 = 1;
                str = (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        switch (i2) {
                            case 0:
                                return replace.equals(entry.getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
                            default:
                                return replace.equals(((String) entry.getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
                        }
                    }
                }).map(new d4$$ExternalSyntheticLambda0(8)).findFirst().orElse("false");
            }
            boolean parseBoolean = Boolean.parseBoolean(str);
            Logger logger2 = logger;
            if (!parseBoolean) {
                logger2.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                return new ObfuscatedOpenTelemetry((OpenTelemetry) cls.getMethod("getOpenTelemetrySdk", null).invoke(cls.getMethod("initialize", null).invoke(null, null), null));
            } catch (IllegalAccessException | NoSuchMethodException e) {
                a$$ExternalSyntheticBUOutline0.m("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
                return null;
            } catch (InvocationTargetException e2) {
                logger2.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e2.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void set(OpenTelemetry openTelemetry) {
        synchronized (mutex) {
            try {
                if (globalOpenTelemetry != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", setGlobalCaller);
                }
                globalOpenTelemetry = new ObfuscatedOpenTelemetry(openTelemetry);
                setGlobalCaller = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final class ObfuscatedOpenTelemetry implements OpenTelemetry {
        public final /* synthetic */ int $r8$classId = 1;
        public final Object delegate;

        public ObfuscatedOpenTelemetry(double d, RealDatadogClient realDatadogClient) {
            OtelTracerProvider.Builder builder = new OtelTracerProvider.Builder();
            realDatadogClient.populateGlobalAttributes(new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(2, builder, OtelTracerProvider.Builder.class, "addTag", "addTag(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/opentelemetry/OtelTracerProvider$Builder;", 8, 4));
            builder.serviceName = "com.squareup.cash.android";
            DatadogTracerBuilder datadogTracerBuilder = builder.builderDelegate;
            datadogTracerBuilder.withSampleRate(d);
            datadogTracerBuilder.setBundleWithRumEnabled();
            Object executeIfJavaFunctionPackageExists$default = StripeJsonUtils.executeIfJavaFunctionPackageExists$default(builder.sdkCore.getInternalLogger(), DefaultTracerProvider.INSTANCE, new e3(builder, 1));
            executeIfJavaFunctionPackageExists$default.getClass();
            this.delegate = (TracerProvider) executeIfJavaFunctionPackageExists$default;
        }

        @Override // io.opentelemetry.api.OpenTelemetry
        public final TracerProvider getTracerProvider() {
            switch (this.$r8$classId) {
                case 0:
                    return ((OpenTelemetry) this.delegate).getTracerProvider();
                default:
                    return (TracerProvider) this.delegate;
            }
        }

        public ObfuscatedOpenTelemetry(OpenTelemetry openTelemetry) {
            this.delegate = openTelemetry;
        }
    }
}
