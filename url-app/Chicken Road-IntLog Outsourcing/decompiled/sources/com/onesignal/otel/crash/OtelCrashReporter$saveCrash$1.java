package com.onesignal.otel.crash;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.otel.crash.OtelCrashReporter", f = "OtelCrashReporter.kt", l = {37, 44}, m = "saveCrash")
/* loaded from: classes.dex */
public final class OtelCrashReporter$saveCrash$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelCrashReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelCrashReporter$saveCrash$1(OtelCrashReporter otelCrashReporter, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = otelCrashReporter;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveCrash(null, null, this);
    }
}
