package com.onesignal.debug.internal.logging;

import D4.InterfaceC0022w;
import K1.b;
import android.util.Log;
import com.onesignal.debug.LogLevel;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import com.onesignal.otel.OtelLoggingHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.debug.internal.logging.Logging$logToOtel$1", f = "Logging.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Logging$logToOtel$1 extends h implements InterfaceC1445p {
    final /* synthetic */ LogLevel $level;
    final /* synthetic */ String $message;
    final /* synthetic */ IOtelOpenTelemetryRemote $telemetry;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logging$logToOtel$1(IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, LogLevel logLevel, String str, Throwable th, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$telemetry = iOtelOpenTelemetryRemote;
        this.$level = logLevel;
        this.$message = str;
        this.$throwable = th;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new Logging$logToOtel$1(this.$telemetry, this.$level, this.$message, this.$throwable, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((Logging$logToOtel$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                OtelLoggingHelper otelLoggingHelper = OtelLoggingHelper.INSTANCE;
                IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = this.$telemetry;
                String name = this.$level.name();
                String str = this.$message;
                Throwable th = this.$throwable;
                String name2 = th != null ? th.getClass().getName() : null;
                Throwable th2 = this.$throwable;
                String message = th2 != null ? th2.getMessage() : null;
                Throwable th3 = this.$throwable;
                String o02 = th3 != null ? b.o0(th3) : null;
                this.label = 1;
                if (otelLoggingHelper.logToOtel(iOtelOpenTelemetryRemote, name, str, name2, message, o02, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
        } catch (Throwable th4) {
            Log.e("OneSignal", "Failed to log to Otel: " + th4.getMessage(), th4);
        }
        return v.f5689a;
    }
}
