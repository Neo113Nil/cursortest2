package com.onesignal.otel.crash;

import K1.b;
import L3.j;
import Q2.c;
import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.IOtelOpenTelemetryCrash;
import e5.g;
import f4.v;
import java.io.IOException;
import java.time.Instant;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OtelCrashReporter implements IOtelCrashReporter {
    public static final Companion Companion = new Companion(null);
    private static final String OTEL_EXCEPTION_MESSAGE = "exception.message";
    private static final String OTEL_EXCEPTION_STACKTRACE = "exception.stacktrace";
    private static final String OTEL_EXCEPTION_THREAD_NAME = "ossdk.exception.thread.name";
    private static final String OTEL_EXCEPTION_TYPE = "exception.type";
    private final IOtelLogger logger;
    private final IOtelOpenTelemetryCrash openTelemetry;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OtelCrashReporter(IOtelOpenTelemetryCrash openTelemetry, IOtelLogger logger) {
        i.e(openTelemetry, "openTelemetry");
        i.e(logger, "logger");
        this.openTelemetry = openTelemetry;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.otel.IOtelCrashReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveCrash(Thread thread, Throwable th, InterfaceC1218d interfaceC1218d) {
        OtelCrashReporter$saveCrash$1 otelCrashReporter$saveCrash$1;
        EnumC1260a enumC1260a;
        int i2;
        OtelCrashReporter otelCrashReporter;
        c b6;
        OtelCrashReporter otelCrashReporter2;
        Instant now;
        IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash;
        if (interfaceC1218d instanceof OtelCrashReporter$saveCrash$1) {
            otelCrashReporter$saveCrash$1 = (OtelCrashReporter$saveCrash$1) interfaceC1218d;
            int i3 = otelCrashReporter$saveCrash$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                otelCrashReporter$saveCrash$1.label = i3 - Integer.MIN_VALUE;
                Object obj = otelCrashReporter$saveCrash$1.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = otelCrashReporter$saveCrash$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    try {
                        this.logger.info("OtelCrashReporter: Starting to save crash report for ".concat(th.getClass().getSimpleName()));
                        try {
                            j jVar = new j(1);
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            jVar.f(OTEL_EXCEPTION_MESSAGE, message);
                            jVar.f(OTEL_EXCEPTION_STACKTRACE, b.o0(th));
                            jVar.f(OTEL_EXCEPTION_TYPE, th.getClass().getName());
                            jVar.f(OTEL_EXCEPTION_THREAD_NAME, thread.getName());
                            b6 = jVar.b();
                            this.logger.debug("OtelCrashReporter: Creating log record with attributes...");
                            IOtelOpenTelemetryCrash iOtelOpenTelemetryCrash2 = this.openTelemetry;
                            otelCrashReporter$saveCrash$1.L$0 = this;
                            otelCrashReporter$saveCrash$1.L$1 = b6;
                            otelCrashReporter$saveCrash$1.label = 1;
                            obj = iOtelOpenTelemetryCrash2.getLogger(otelCrashReporter$saveCrash$1);
                            if (obj == enumC1260a) {
                                return enumC1260a;
                            }
                            otelCrashReporter2 = this;
                        } catch (IOException e3) {
                            e = e3;
                            otelCrashReporter = this;
                            otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                            throw e;
                        } catch (RuntimeException e6) {
                            e = e6;
                            otelCrashReporter = this;
                            otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                            throw e;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    } catch (RuntimeException e8) {
                        e = e8;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        otelCrashReporter = (OtelCrashReporter) otelCrashReporter$saveCrash$1.L$0;
                        try {
                            g.y(obj);
                            otelCrashReporter.logger.info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                            return v.f5689a;
                        } catch (IOException e9) {
                            e = e9;
                            otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                            throw e;
                        } catch (RuntimeException e10) {
                            e = e10;
                            otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                            throw e;
                        }
                    }
                    b6 = (c) otelCrashReporter$saveCrash$1.L$1;
                    otelCrashReporter2 = (OtelCrashReporter) otelCrashReporter$saveCrash$1.L$0;
                    try {
                        g.y(obj);
                    } catch (IOException e11) {
                        OtelCrashReporter otelCrashReporter3 = otelCrashReporter2;
                        e = e11;
                        otelCrashReporter = otelCrashReporter3;
                        otelCrashReporter.logger.error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e12) {
                        OtelCrashReporter otelCrashReporter4 = otelCrashReporter2;
                        e = e12;
                        otelCrashReporter = otelCrashReporter4;
                        otelCrashReporter.logger.error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                W2.e e13 = ((W2.e) obj).a(b6).e(W2.i.FATAL);
                now = Instant.now();
                e13.d(now).c();
                otelCrashReporter2.logger.debug("OtelCrashReporter: Flushing crash report to disk...");
                iOtelOpenTelemetryCrash = otelCrashReporter2.openTelemetry;
                otelCrashReporter$saveCrash$1.L$0 = otelCrashReporter2;
                otelCrashReporter$saveCrash$1.L$1 = null;
                otelCrashReporter$saveCrash$1.label = 2;
                if (iOtelOpenTelemetryCrash.forceFlush(otelCrashReporter$saveCrash$1) != enumC1260a) {
                    return enumC1260a;
                }
                otelCrashReporter = otelCrashReporter2;
                otelCrashReporter.logger.info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                return v.f5689a;
            }
        }
        otelCrashReporter$saveCrash$1 = new OtelCrashReporter$saveCrash$1(this, interfaceC1218d);
        Object obj2 = otelCrashReporter$saveCrash$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = otelCrashReporter$saveCrash$1.label;
        if (i2 != 0) {
        }
        W2.e e132 = ((W2.e) obj2).a(b6).e(W2.i.FATAL);
        now = Instant.now();
        e132.d(now).c();
        otelCrashReporter2.logger.debug("OtelCrashReporter: Flushing crash report to disk...");
        iOtelOpenTelemetryCrash = otelCrashReporter2.openTelemetry;
        otelCrashReporter$saveCrash$1.L$0 = otelCrashReporter2;
        otelCrashReporter$saveCrash$1.L$1 = null;
        otelCrashReporter$saveCrash$1.label = 2;
        if (iOtelOpenTelemetryCrash.forceFlush(otelCrashReporter$saveCrash$1) != enumC1260a) {
        }
    }
}
