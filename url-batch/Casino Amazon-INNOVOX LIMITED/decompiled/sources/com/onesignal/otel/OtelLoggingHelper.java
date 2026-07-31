package com.onesignal.otel;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.semconv.OtelAttributes;
import java.time.Instant;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelLoggingHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/onesignal/otel/OtelLoggingHelper;", "", "()V", "logToOtel", "", "telemetry", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "level", "", "message", "exceptionType", "exceptionMessage", "exceptionStacktrace", "(Lcom/onesignal/otel/IOtelOpenTelemetryRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelLoggingHelper {
    public static final OtelLoggingHelper INSTANCE = new OtelLoggingHelper();

    private OtelLoggingHelper() {
    }

    public static /* synthetic */ Object logToOtel$default(OtelLoggingHelper otelLoggingHelper, IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        return otelLoggingHelper.logToOtel(iOtelOpenTelemetryRemote, str, str2, str3, str4, str5, continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logToOtel(IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, String str, String str2, String str3, String str4, String str5, Continuation<? super Unit> continuation) {
        OtelLoggingHelper$logToOtel$1 otelLoggingHelper$logToOtel$1;
        int i;
        Severity severity;
        Attributes attributes;
        Severity severity2;
        if (continuation instanceof OtelLoggingHelper$logToOtel$1) {
            otelLoggingHelper$logToOtel$1 = (OtelLoggingHelper$logToOtel$1) continuation;
            if ((otelLoggingHelper$logToOtel$1.label & Integer.MIN_VALUE) != 0) {
                otelLoggingHelper$logToOtel$1.label -= Integer.MIN_VALUE;
                Object obj = otelLoggingHelper$logToOtel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = otelLoggingHelper$logToOtel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    switch (upperCase.hashCode()) {
                        case 2251950:
                            if (upperCase.equals("INFO")) {
                                severity = Severity.INFO;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        case 2656902:
                            if (upperCase.equals("WARN")) {
                                severity = Severity.WARN;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        case 64921139:
                            if (upperCase.equals("DEBUG")) {
                                severity = Severity.DEBUG;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        case 66247144:
                            if (upperCase.equals(OtelAttributes.OtelStatusCodeValues.ERROR)) {
                                severity = Severity.ERROR;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        case 66665700:
                            if (upperCase.equals("FATAL")) {
                                severity = Severity.FATAL;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        case 1069090146:
                            if (upperCase.equals("VERBOSE")) {
                                severity = Severity.TRACE;
                                break;
                            }
                            severity = Severity.INFO;
                            break;
                        default:
                            severity = Severity.INFO;
                            break;
                    }
                    AttributesBuilder put = Attributes.builder().put("log.message", str2).put("log.level", str);
                    if (str3 != null) {
                        put.put("exception.type", str3);
                    }
                    if (str4 != null) {
                        put.put("exception.message", str4);
                    }
                    if (str5 != null) {
                        put.put("exception.stacktrace", str5);
                    }
                    Attributes build = put.build();
                    otelLoggingHelper$logToOtel$1.L$0 = str2;
                    otelLoggingHelper$logToOtel$1.L$1 = severity;
                    otelLoggingHelper$logToOtel$1.L$2 = build;
                    otelLoggingHelper$logToOtel$1.label = 1;
                    Object logger = iOtelOpenTelemetryRemote.getLogger(otelLoggingHelper$logToOtel$1);
                    if (logger == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Severity severity3 = severity;
                    obj = logger;
                    attributes = build;
                    severity2 = severity3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    attributes = (Attributes) otelLoggingHelper$logToOtel$1.L$2;
                    severity2 = (Severity) otelLoggingHelper$logToOtel$1.L$1;
                    str2 = (String) otelLoggingHelper$logToOtel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                LogRecordBuilder logRecordBuilder = (LogRecordBuilder) obj;
                logRecordBuilder.setAllAttributes(attributes);
                logRecordBuilder.setSeverity(severity2);
                logRecordBuilder.setBody(str2);
                logRecordBuilder.setTimestamp(Instant.now());
                logRecordBuilder.emit();
                return Unit.INSTANCE;
            }
        }
        otelLoggingHelper$logToOtel$1 = new OtelLoggingHelper$logToOtel$1(this, continuation);
        Object obj2 = otelLoggingHelper$logToOtel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = otelLoggingHelper$logToOtel$1.label;
        if (i != 0) {
        }
        LogRecordBuilder logRecordBuilder2 = (LogRecordBuilder) obj2;
        logRecordBuilder2.setAllAttributes(attributes);
        logRecordBuilder2.setSeverity(severity2);
        logRecordBuilder2.setBody(str2);
        logRecordBuilder2.setTimestamp(Instant.now());
        logRecordBuilder2.emit();
        return Unit.INSTANCE;
    }
}
