package com.onesignal.otel.crash;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.otel.crash.OtelCrashUploader", f = "OtelCrashUploader.kt", l = {74}, m = "internalStart")
/* loaded from: classes.dex */
public final class OtelCrashUploader$internalStart$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelCrashUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelCrashUploader$internalStart$1(OtelCrashUploader otelCrashUploader, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = otelCrashUploader;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.internalStart(this);
    }
}
