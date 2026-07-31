package com.onesignal.otel.crash;

import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryCrash;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Severity;
import java.io.IOException;
import java.time.Instant;
import java.util.Locale;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelCrashReporter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onesignal/otel/crash/OtelCrashReporter;", "Lcom/onesignal/otel/IOtelCrashReporter;", "openTelemetry", "Lcom/onesignal/otel/IOtelOpenTelemetryCrash;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "(Lcom/onesignal/otel/IOtelOpenTelemetryCrash;Lcom/onesignal/otel/IOtelLogger;)V", "save", "", "thread", "Ljava/lang/Thread;", "throwable", "", "severity", "Lio/opentelemetry/api/logs/Severity;", "fatal", "", "(Ljava/lang/Thread;Ljava/lang/Throwable;Lio/opentelemetry/api/logs/Severity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCrash", "(Ljava/lang/Thread;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNonFatal", "Companion", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelCrashReporter implements IOtelCrashReporter {
    private static final String OTEL_EXCEPTION_MESSAGE = "exception.message";
    private static final String OTEL_EXCEPTION_STACKTRACE = "exception.stacktrace";
    private static final String OTEL_EXCEPTION_THREAD_NAME = "ossdk.exception.thread.name";
    private static final String OTEL_EXCEPTION_TYPE = "exception.type";
    private static final String OTEL_FATAL = "ossdk.crash.fatal";
    private final IOtelLogger logger;
    private final IOtelOpenTelemetryCrash openTelemetry;

    public OtelCrashReporter(IOtelOpenTelemetryCrash openTelemetry, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(openTelemetry, "openTelemetry");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.openTelemetry = openTelemetry;
        this.logger = logger;
    }

    @Override // com.onesignal.otel.IOtelCrashReporter
    public Object saveCrash(Thread thread, Throwable th, Continuation<? super Unit> continuation) {
        Object save = save(thread, th, Severity.FATAL, true, continuation);
        return save == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? save : Unit.INSTANCE;
    }

    @Override // com.onesignal.otel.IOtelCrashReporter
    public Object saveNonFatal(Thread thread, Throwable th, Continuation<? super Unit> continuation) {
        Object save = save(thread, th, Severity.WARN, false, continuation);
        return save == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? save : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(Thread thread, Throwable th, Severity severity, boolean z, Continuation<? super Unit> continuation) {
        OtelCrashReporter$save$1 otelCrashReporter$save$1;
        Object coroutine_suspended;
        int i;
        OtelCrashReporter otelCrashReporter;
        Attributes build;
        String str;
        OtelCrashReporter otelCrashReporter2;
        IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash;
        String str2;
        if (continuation instanceof OtelCrashReporter$save$1) {
            otelCrashReporter$save$1 = (OtelCrashReporter$save$1) continuation;
            if ((otelCrashReporter$save$1.label & Integer.MIN_VALUE) != 0) {
                otelCrashReporter$save$1.label -= Integer.MIN_VALUE;
                Object obj = otelCrashReporter$save$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = otelCrashReporter$save$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str3 = z ? "Crash report" : "Non-fatal report";
                    try {
                        IOtelLogger iOtelLogger = this.logger;
                        StringBuilder sb = new StringBuilder("OtelCrashReporter: Starting to save ");
                        String lowerCase = str3.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        iOtelLogger.info(sb.append(lowerCase).append(" for ").append(th.getClass().getSimpleName()).toString());
                        AttributesBuilder builder = Attributes.builder();
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        build = builder.put(OTEL_EXCEPTION_MESSAGE, message).put(OTEL_EXCEPTION_STACKTRACE, ExceptionsKt.stackTraceToString(th)).put(OTEL_EXCEPTION_TYPE, th.getClass().getName()).put(OTEL_EXCEPTION_THREAD_NAME, thread.getName()).put(OTEL_FATAL, z).build();
                        this.logger.debug("OtelCrashReporter: Creating log record with attributes...");
                        IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash2 = this.openTelemetry;
                        otelCrashReporter$save$1.L$0 = this;
                        otelCrashReporter$save$1.L$1 = severity;
                        otelCrashReporter$save$1.L$2 = str3;
                        otelCrashReporter$save$1.L$3 = build;
                        otelCrashReporter$save$1.label = 1;
                        Object logger = iOtelOpenTelemetryCrash2.getLogger(otelCrashReporter$save$1);
                        if (logger != coroutine_suspended) {
                            String str4 = str3;
                            obj = logger;
                            str = str4;
                            otelCrashReporter2 = this;
                        }
                        return coroutine_suspended;
                    } catch (IOException e) {
                        e = e;
                        otelCrashReporter = this;
                        otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        otelCrashReporter = this;
                        otelCrashReporter.logger.error("OtelCrashReporter: Illegal state error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        otelCrashReporter = this;
                        otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) otelCrashReporter$save$1.L$1;
                    otelCrashReporter = (OtelCrashReporter) otelCrashReporter$save$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        otelCrashReporter.logger.info("OtelCrashReporter: ✅ " + str2 + " saved and flushed successfully to disk");
                        return Unit.INSTANCE;
                    } catch (IOException e4) {
                        e = e4;
                        otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (IllegalStateException e5) {
                        e = e5;
                        otelCrashReporter.logger.error("OtelCrashReporter: Illegal state error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e6) {
                        e = e6;
                        otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                build = (Attributes) otelCrashReporter$save$1.L$3;
                str = (String) otelCrashReporter$save$1.L$2;
                severity = (Severity) otelCrashReporter$save$1.L$1;
                otelCrashReporter2 = (OtelCrashReporter) otelCrashReporter$save$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (IOException e7) {
                    e = e7;
                    otelCrashReporter = otelCrashReporter2;
                    otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                    throw e;
                } catch (IllegalStateException e8) {
                    e = e8;
                    otelCrashReporter = otelCrashReporter2;
                    otelCrashReporter.logger.error("OtelCrashReporter: Illegal state error saving crash report: " + e.getMessage());
                    throw e;
                } catch (RuntimeException e9) {
                    e = e9;
                    otelCrashReporter = otelCrashReporter2;
                    otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                    throw e;
                }
                ((LogRecordBuilder) obj).setAllAttributes(build).setSeverity(severity).setTimestamp(Instant.now()).emit();
                IOtelLogger iOtelLogger2 = otelCrashReporter2.logger;
                StringBuilder sb2 = new StringBuilder("OtelCrashReporter: Flushing ");
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                iOtelLogger2.debug(sb2.append(lowerCase2).append(" to disk...").toString());
                iOtelOpenTelemetryCrash = otelCrashReporter2.openTelemetry;
                otelCrashReporter$save$1.L$0 = otelCrashReporter2;
                otelCrashReporter$save$1.L$1 = str;
                otelCrashReporter$save$1.L$2 = null;
                otelCrashReporter$save$1.L$3 = null;
                otelCrashReporter$save$1.label = 2;
                if (iOtelOpenTelemetryCrash.forceFlush(otelCrashReporter$save$1) != coroutine_suspended) {
                    str2 = str;
                    otelCrashReporter = otelCrashReporter2;
                    otelCrashReporter.logger.info("OtelCrashReporter: ✅ " + str2 + " saved and flushed successfully to disk");
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        otelCrashReporter$save$1 = new OtelCrashReporter$save$1(this, continuation);
        Object obj2 = otelCrashReporter$save$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = otelCrashReporter$save$1.label;
        if (i != 0) {
        }
        ((LogRecordBuilder) obj2).setAllAttributes(build).setSeverity(severity).setTimestamp(Instant.now()).emit();
        IOtelLogger iOtelLogger22 = otelCrashReporter2.logger;
        StringBuilder sb22 = new StringBuilder("OtelCrashReporter: Flushing ");
        String lowerCase22 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase22, "toLowerCase(...)");
        iOtelLogger22.debug(sb22.append(lowerCase22).append(" to disk...").toString());
        iOtelOpenTelemetryCrash = otelCrashReporter2.openTelemetry;
        otelCrashReporter$save$1.L$0 = otelCrashReporter2;
        otelCrashReporter$save$1.L$1 = str;
        otelCrashReporter$save$1.L$2 = null;
        otelCrashReporter$save$1.L$3 = null;
        otelCrashReporter$save$1.label = 2;
        if (iOtelOpenTelemetryCrash.forceFlush(otelCrashReporter$save$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
