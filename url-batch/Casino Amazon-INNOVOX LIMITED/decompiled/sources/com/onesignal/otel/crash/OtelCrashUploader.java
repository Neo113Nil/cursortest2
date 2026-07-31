package com.onesignal.otel.crash;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import com.onesignal.otel.IOtelPlatformProvider;
import com.onesignal.otel.config.OtelConfigCrashFile;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* compiled from: OtelCrashUploader.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a,\u0012(\u0012&\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000e0\u000b0\nH\u0002J\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onesignal/otel/crash/OtelCrashUploader;", "", "openTelemetryRemote", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "logger", "Lcom/onesignal/otel/IOtelLogger;", "(Lcom/onesignal/otel/IOtelOpenTelemetryRemote;Lcom/onesignal/otel/IOtelPlatformProvider;Lcom/onesignal/otel/IOtelLogger;)V", "getReports", "", "", "Lio/opentelemetry/sdk/logs/data/LogRecordData;", "kotlin.jvm.PlatformType", "", "internalStart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCrashReports", "reports", "", ViewProps.START, "Companion", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelCrashUploader {
    public static final long SEND_TIMEOUT_SECONDS = 30;
    private final IOtelLogger logger;
    private final IOtelOpenTelemetryRemote openTelemetryRemote;
    private final IOtelPlatformProvider platformProvider;

    public OtelCrashUploader(IOtelOpenTelemetryRemote openTelemetryRemote, IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        Intrinsics.checkNotNullParameter(openTelemetryRemote, "openTelemetryRemote");
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.openTelemetryRemote = openTelemetryRemote;
        this.platformProvider = platformProvider;
        this.logger = logger;
    }

    private final Iterator<Collection<LogRecordData>> getReports() {
        Iterator<Collection<LogRecordData>> it = OtelConfigCrashFile.SdkLoggerProviderConfig.INSTANCE.getFileLogRecordStorage(this.platformProvider.getCrashStoragePath(), this.platformProvider.getMinFileAgeForReadMillis()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return it;
    }

    public final Object start(Continuation<? super Unit> continuation) {
        String remoteLogLevel = this.platformProvider.getRemoteLogLevel();
        if (remoteLogLevel == null || Intrinsics.areEqual(remoteLogLevel, "NONE")) {
            this.logger.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
            return Unit.INSTANCE;
        }
        this.logger.info("OtelCrashUploader: starting");
        Object internalStart = internalStart(continuation);
        return internalStart == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? internalStart : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalStart(Continuation<? super Unit> continuation) {
        OtelCrashUploader$internalStart$1 otelCrashUploader$internalStart$1;
        int i;
        OtelCrashUploader otelCrashUploader;
        if (continuation instanceof OtelCrashUploader$internalStart$1) {
            otelCrashUploader$internalStart$1 = (OtelCrashUploader$internalStart$1) continuation;
            if ((otelCrashUploader$internalStart$1.label & Integer.MIN_VALUE) != 0) {
                otelCrashUploader$internalStart$1.label -= Integer.MIN_VALUE;
                Object obj = otelCrashUploader$internalStart$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = otelCrashUploader$internalStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sendCrashReports(getReports());
                    long minFileAgeForReadMillis = this.platformProvider.getMinFileAgeForReadMillis();
                    otelCrashUploader$internalStart$1.L$0 = this;
                    otelCrashUploader$internalStart$1.label = 1;
                    if (DelayKt.delay(minFileAgeForReadMillis, otelCrashUploader$internalStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    otelCrashUploader = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    otelCrashUploader = (OtelCrashUploader) otelCrashUploader$internalStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                otelCrashUploader.sendCrashReports(otelCrashUploader.getReports());
                return Unit.INSTANCE;
            }
        }
        otelCrashUploader$internalStart$1 = new OtelCrashUploader$internalStart$1(this, continuation);
        Object obj2 = otelCrashUploader$internalStart$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = otelCrashUploader$internalStart$1.label;
        if (i != 0) {
        }
        otelCrashUploader.sendCrashReports(otelCrashUploader.getReports());
        return Unit.INSTANCE;
    }

    private final void sendCrashReports(Iterator<? extends Collection<? extends LogRecordData>> reports) {
        LogRecordExporter logExporter = this.openTelemetryRemote.getLogExporter();
        boolean z = false;
        while (reports.hasNext() && !z) {
            CompletableResultCode export = logExporter.export((Collection) reports.next());
            this.logger.debug("Sending OneSignal crash report");
            z = !export.join(30L, TimeUnit.SECONDS).isSuccess();
            this.logger.debug("Done OneSignal crash report, failed: " + z);
        }
    }
}
