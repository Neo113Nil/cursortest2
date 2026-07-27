package com.onesignal.otel.config;

import B4.k;
import B4.r;
import J3.c;
import L3.f;
import L3.m;
import M3.o;
import V2.d;
import a4.AbstractC0197c;
import a4.C0195a;
import android.util.Log;
import b2.AbstractC0279e;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import com.onesignal.otel.config.OtelConfigShared;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import x3.C1548a;
import x3.g;
import x3.h;

/* loaded from: classes.dex */
public final class OtelConfigRemoteOneSignal {
    public static final Companion Companion = new Companion(null);
    public static final String OTEL_PATH = "sdk";

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String buildEndpoint(String apiBaseUrl, String appId) {
            i.e(apiBaseUrl, "apiBaseUrl");
            i.e(appId, "appId");
            StringBuilder sb = new StringBuilder();
            sb.append(apiBaseUrl);
            return AbstractC0279e.h(sb, "sdk/log?app_id=", appId);
        }

        private Companion() {
        }
    }

    public static final class ExporterLoggingConfig {
        public static final ExporterLoggingConfig INSTANCE = new ExporterLoggingConfig();
        private static final String TAG = "OneSignalOtel";

        public static final class LoggingLogRecordExporter implements P3.e {
            private final P3.e delegate;

            public LoggingLogRecordExporter(P3.e delegate) {
                i.e(delegate, "delegate");
                this.delegate = delegate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void export$lambda$0(c cVar, LoggingLogRecordExporter this$0) {
                Throwable th;
                i.e(this$0, "this$0");
                if (cVar.b()) {
                    Log.d(ExporterLoggingConfig.TAG, "OTEL export response received: success");
                    return;
                }
                synchronized (cVar.f1366d) {
                    th = cVar.f1364b;
                }
                Log.e(ExporterLoggingConfig.TAG, "OTEL export response received: failed - " + this$0.resolveHttpFailureMessage(th), th);
            }

            private final String resolveHttpFailureMessage(Throwable th) {
                String str;
                String str2 = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                if (th == null) {
                    return CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                }
                try {
                    if (!r.H(th.getClass().getName(), "FailedExportException$HttpExportException")) {
                        String message = th.getMessage();
                        return message == null ? CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : message;
                    }
                    Object invoke = th.getClass().getMethod("getResponse", null).invoke(th, null);
                    if (invoke == null) {
                        String message2 = th.getMessage();
                        return message2 == null ? CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : message2;
                    }
                    Object invoke2 = invoke.getClass().getMethod("statusCode", null).invoke(invoke, null);
                    Object invoke3 = invoke.getClass().getMethod("statusMessage", null).invoke(invoke, null);
                    Object invoke4 = invoke.getClass().getMethod("responseBody", null).invoke(invoke, null);
                    byte[] bArr = invoke4 instanceof byte[] ? (byte[]) invoke4 : null;
                    String str3 = bArr != null ? new String(bArr, B4.a.f287a) : null;
                    StringBuilder sb = new StringBuilder("status=");
                    sb.append(invoke2);
                    sb.append(" message=");
                    sb.append(invoke3);
                    if (str3 != null && !k.Z(str3)) {
                        str = " body=".concat(str3);
                        sb.append(str);
                        return sb.toString();
                    }
                    str = "";
                    sb.append(str);
                    return sb.toString();
                } catch (Throwable unused) {
                    String message3 = th.getMessage();
                    if (message3 != null) {
                        str2 = message3;
                    }
                    return str2;
                }
            }

            @Override // P3.e, java.io.Closeable, java.lang.AutoCloseable
            public /* bridge */ /* synthetic */ void close() {
                super.close();
            }

            @Override // P3.e
            public c export(Collection<? extends N3.a> logs) {
                i.e(logs, "logs");
                Log.d(ExporterLoggingConfig.TAG, "OTEL export request sent to backend. count=" + logs.size());
                final c export = this.delegate.export(logs);
                export.f(new Runnable() { // from class: com.onesignal.otel.config.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        OtelConfigRemoteOneSignal.ExporterLoggingConfig.LoggingLogRecordExporter.export$lambda$0(c.this, this);
                    }
                });
                return export;
            }

            @Override // P3.e
            public c flush() {
                c flush = this.delegate.flush();
                i.d(flush, "flush(...)");
                return flush;
            }

            @Override // P3.e
            public c shutdown() {
                c shutdown = this.delegate.shutdown();
                i.d(shutdown, "shutdown(...)");
                return shutdown;
            }
        }

        private ExporterLoggingConfig() {
        }

        public final P3.e loggingExporter(P3.e delegate) {
            i.e(delegate, "delegate");
            return new LoggingLogRecordExporter(delegate);
        }
    }

    public static final class HttpRecordBatchExporter {
        public static final HttpRecordBatchExporter INSTANCE = new HttpRecordBatchExporter();

        private HttpRecordBatchExporter() {
        }

        public final P3.e create(Map<String, String> extraHttpHeaders, String appId, String apiBaseUrl, boolean z) {
            i.e(extraHttpHeaders, "extraHttpHeaders");
            i.e(appId, "appId");
            i.e(apiBaseUrl, "apiBaseUrl");
            P3.e otlpHttpLogRecordExporter = LogRecordExporterConfig.INSTANCE.otlpHttpLogRecordExporter(extraHttpHeaders, OtelConfigRemoteOneSignal.Companion.buildEndpoint(apiBaseUrl, appId));
            return z ? ExporterLoggingConfig.INSTANCE.loggingExporter(otlpHttpLogRecordExporter) : otlpHttpLogRecordExporter;
        }
    }

    public static final class LogRecordExporterConfig {
        private static final long EXPORTER_TIMEOUT_SECONDS = 10;
        public static final LogRecordExporterConfig INSTANCE = new LogRecordExporterConfig();

        private LogRecordExporterConfig() {
        }

        public final P3.e otlpHttpLogRecordExporter(Map<String, String> headers, String endpoint) {
            Duration ofSeconds;
            long nanos;
            D3.e eVar;
            SSLContext sSLContext;
            i.e(headers, "headers");
            i.e(endpoint, "endpoint");
            g gVar = new g();
            HashMap hashMap = gVar.f12325e;
            hashMap.put("User-Agent", "OTel-OTLP-Exporter-Java/1.55.0");
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            try {
                URI uri = new URI(endpoint);
                if (uri.getScheme() == null || !(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                    throw new IllegalArgumentException("Invalid endpoint, must start with http:// or https://: " + uri);
                }
                gVar.f12322b = uri.toString();
                ofSeconds = Duration.ofSeconds(10L);
                Objects.requireNonNull(ofSeconds, "timeout");
                nanos = ofSeconds.toNanos();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                Objects.requireNonNull(timeUnit, "unit");
                d.a("timeout must be non-negative", nanos >= 0);
                gVar.f12323c = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
                a aVar = new a(1, gVar);
                boolean startsWith = gVar.f12322b.startsWith("http://");
                HashMap hashMap2 = new HashMap();
                Iterator it = ServiceLoader.load(D3.e.class, (ClassLoader) gVar.f12331k.f3212b).iterator();
                while (it.hasNext()) {
                    D3.e eVar2 = (D3.e) it.next();
                    hashMap2.put(eVar2.getClass().getName(), eVar2);
                }
                if (hashMap2.isEmpty()) {
                    throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
                }
                int size = hashMap2.size();
                Logger logger = g.f12320l;
                if (size == 1) {
                    eVar = (D3.e) hashMap2.values().stream().findFirst().get();
                } else {
                    String b6 = d.b("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
                    if (b6.isEmpty()) {
                        logger.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
                        eVar = (D3.e) hashMap2.values().stream().findFirst().get();
                    } else {
                        if (!hashMap2.containsKey(b6)) {
                            throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: ".concat(b6));
                        }
                        eVar = (D3.e) hashMap2.get(b6);
                    }
                }
                String str = gVar.f12322b;
                long j2 = gVar.f12323c;
                s0.k kVar = gVar.f12327g;
                if (startsWith) {
                    sSLContext = null;
                } else {
                    kVar.getClass();
                    try {
                        SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                        sSLContext2.init(null, null, null);
                        sSLContext = sSLContext2;
                    } catch (KeyManagementException | NoSuchAlgorithmException e3) {
                        throw new IllegalArgumentException(e3);
                    }
                }
                if (!startsWith) {
                    kVar.getClass();
                }
                h a6 = eVar.a(new C1548a(str, j2, gVar.f12324d, aVar, gVar.f12328h, sSLContext));
                logger.log(Level.FINE, "Using HttpSender: ".concat(a6.getClass().getName()));
                return new C3.b(gVar, new x3.c(new m(gVar.f12321a), a6, gVar.f12329i, gVar.f12330j, gVar.f12322b));
            } catch (URISyntaxException e6) {
                throw new IllegalArgumentException("Invalid endpoint, must be a URL: ".concat(endpoint), e6);
            }
        }
    }

    public static final class SdkLoggerProviderConfig {
        public static final SdkLoggerProviderConfig INSTANCE = new SdkLoggerProviderConfig();

        private SdkLoggerProviderConfig() {
        }

        public final o create(AbstractC0197c resource, Map<String, String> extraHttpHeaders, String appId, String apiBaseUrl, boolean z) {
            i.e(resource, "resource");
            i.e(extraHttpHeaders, "extraHttpHeaders");
            i.e(appId, "appId");
            i.e(apiBaseUrl, "apiBaseUrl");
            Logger logger = o.f1981e;
            ArrayList arrayList = new ArrayList();
            C0195a c0195a = AbstractC0197c.f3886a;
            ArrayList arrayList2 = new ArrayList();
            f.h();
            M3.h batchLogRecordProcessor = OtelConfigShared.LogRecordProcessorConfig.INSTANCE.batchLogRecordProcessor(HttpRecordBatchExporter.INSTANCE.create(extraHttpHeaders, appId, apiBaseUrl, z));
            Objects.requireNonNull(batchLogRecordProcessor, "processor");
            arrayList.add(batchLogRecordProcessor);
            return new o(resource, new a(0, OtelConfigShared.LogLimitsConfig.INSTANCE), arrayList, new L3.i(arrayList2));
        }
    }
}
