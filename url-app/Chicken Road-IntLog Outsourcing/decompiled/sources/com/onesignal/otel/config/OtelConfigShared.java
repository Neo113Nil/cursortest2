package com.onesignal.otel.config;

import L3.j;
import M3.g;
import M3.h;
import P3.c;
import P3.d;
import P3.e;
import a4.AbstractC0197c;
import a4.C0195a;
import a4.C0198d;
import d4.AbstractC0399a;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelConfigShared {

    public static final class LogLimitsConfig {
        public static final LogLimitsConfig INSTANCE = new LogLimitsConfig();
        private static final int MAX_ATTRIBUTE_VALUE_LENGTH = 32000;
        private static final int MAX_NUMBER_OF_ATTRIBUTES = 128;

        private LogLimitsConfig() {
        }

        public final g logLimits() {
            return new M3.b(MAX_ATTRIBUTE_VALUE_LENGTH);
        }
    }

    public static final class LogRecordProcessorConfig {
        private static final long EXPORTER_TIMEOUT_SECONDS = 30;
        public static final LogRecordProcessorConfig INSTANCE = new LogRecordProcessorConfig();
        private static final int MAX_EXPORT_BATCH_SIZE = 100;
        private static final int MAX_QUEUE_SIZE = 100;
        private static final long SCHEDULE_DELAY_SECONDS = 1;

        private LogRecordProcessorConfig() {
        }

        public final h batchLogRecordProcessor(e logRecordExporter) {
            Duration ofSeconds;
            long nanos;
            Duration ofSeconds2;
            long nanos2;
            i.e(logRecordExporter, "logRecordExporter");
            String str = c.f2306c;
            d dVar = new d(logRecordExporter);
            dVar.f2315c = 100;
            dVar.f2316d = 100;
            ofSeconds = Duration.ofSeconds(30L);
            Objects.requireNonNull(ofSeconds, "timeout");
            nanos = ofSeconds.toNanos();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            Objects.requireNonNull(timeUnit, "unit");
            V2.d.a("timeout must be non-negative", nanos >= 0);
            dVar.f2317e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
            ofSeconds2 = Duration.ofSeconds(1L);
            Objects.requireNonNull(ofSeconds2, "delay");
            nanos2 = ofSeconds2.toNanos();
            V2.d.a("delay must be non-negative", nanos2 >= 0);
            dVar.f2314b = timeUnit.toNanos(nanos2);
            return dVar.a();
        }
    }

    public static final class ResourceConfig {
        public static final ResourceConfig INSTANCE = new ResourceConfig();

        private ResourceConfig() {
        }

        public final AbstractC0197c create(Map<String, String> attributes) {
            i.e(attributes, "attributes");
            C0195a c0195a = AbstractC0197c.f3886a;
            c0195a.getClass();
            C0198d c0198d = new C0198d();
            j jVar = c0198d.f3887a;
            jVar.g(c0195a.f3885c);
            String str = c0195a.f3884b;
            if (str != null) {
                c0198d.f3888b = str;
            }
            V2.e eVar = AbstractC0399a.f5483a;
            if (eVar != null && !eVar.f3237b.isEmpty()) {
                jVar.e(eVar, "OneSignalDeviceSDK");
            }
            C0198d putAll = OtelConfigSharedKt.putAll(c0198d, attributes);
            return AbstractC0197c.a(putAll.f3887a.b(), putAll.f3888b);
        }
    }
}
