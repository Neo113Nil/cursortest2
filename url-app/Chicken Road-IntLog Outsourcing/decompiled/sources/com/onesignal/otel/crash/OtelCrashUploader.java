package com.onesignal.otel.crash;

import D4.AbstractC0024y;
import J3.c;
import N3.a;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import com.onesignal.otel.IOtelPlatformProvider;
import com.onesignal.otel.config.OtelConfigCrashFile;
import e5.g;
import f4.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OtelCrashUploader {
    public static final Companion Companion = new Companion(null);
    public static final long SEND_TIMEOUT_SECONDS = 30;
    private final IOtelLogger logger;
    private final IOtelOpenTelemetryRemote openTelemetryRemote;
    private final IOtelPlatformProvider platformProvider;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OtelCrashUploader(IOtelOpenTelemetryRemote openTelemetryRemote, IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        i.e(openTelemetryRemote, "openTelemetryRemote");
        i.e(platformProvider, "platformProvider");
        i.e(logger, "logger");
        this.openTelemetryRemote = openTelemetryRemote;
        this.platformProvider = platformProvider;
        this.logger = logger;
    }

    private final Iterator<Collection<a>> getReports() {
        Iterator<Collection<a>> it = OtelConfigCrashFile.SdkLoggerProviderConfig.INSTANCE.getFileLogRecordStorage(this.platformProvider.getCrashStoragePath(), this.platformProvider.getMinFileAgeForReadMillis()).f11642a.iterator();
        i.d(it, "iterator(...)");
        return it;
    }

    private final void sendCrashReports(Iterator<? extends Collection<? extends a>> it) {
        P3.e logExporter = this.openTelemetryRemote.getLogExporter();
        boolean z = false;
        while (it.hasNext() && !z) {
            c export = logExporter.export(it.next());
            this.logger.debug("Sending OneSignal crash report");
            export.c(30L, TimeUnit.SECONDS);
            z = !export.b();
            this.logger.debug("Done OneSignal crash report, failed: " + z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalStart(InterfaceC1218d interfaceC1218d) {
        OtelCrashUploader$internalStart$1 otelCrashUploader$internalStart$1;
        int i2;
        OtelCrashUploader otelCrashUploader;
        if (interfaceC1218d instanceof OtelCrashUploader$internalStart$1) {
            otelCrashUploader$internalStart$1 = (OtelCrashUploader$internalStart$1) interfaceC1218d;
            int i3 = otelCrashUploader$internalStart$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                otelCrashUploader$internalStart$1.label = i3 - Integer.MIN_VALUE;
                Object obj = otelCrashUploader$internalStart$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = otelCrashUploader$internalStart$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    sendCrashReports(getReports());
                    long minFileAgeForReadMillis = this.platformProvider.getMinFileAgeForReadMillis();
                    otelCrashUploader$internalStart$1.L$0 = this;
                    otelCrashUploader$internalStart$1.label = 1;
                    if (AbstractC0024y.d(minFileAgeForReadMillis, otelCrashUploader$internalStart$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    otelCrashUploader = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    otelCrashUploader = (OtelCrashUploader) otelCrashUploader$internalStart$1.L$0;
                    g.y(obj);
                }
                otelCrashUploader.sendCrashReports(otelCrashUploader.getReports());
                return v.f5689a;
            }
        }
        otelCrashUploader$internalStart$1 = new OtelCrashUploader$internalStart$1(this, interfaceC1218d);
        Object obj2 = otelCrashUploader$internalStart$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = otelCrashUploader$internalStart$1.label;
        if (i2 != 0) {
        }
        otelCrashUploader.sendCrashReports(otelCrashUploader.getReports());
        return v.f5689a;
    }

    public final Object start(InterfaceC1218d interfaceC1218d) {
        String remoteLogLevel = this.platformProvider.getRemoteLogLevel();
        v vVar = v.f5689a;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            this.logger.info("OtelCrashUploader: starting");
            Object internalStart = internalStart(interfaceC1218d);
            return internalStart == EnumC1260a.f11058a ? internalStart : vVar;
        }
        this.logger.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return vVar;
    }
}
