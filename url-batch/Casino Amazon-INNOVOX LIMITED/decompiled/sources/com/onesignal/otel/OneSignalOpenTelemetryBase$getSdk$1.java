package com.onesignal.otel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OneSignalOpenTelemetry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.OneSignalOpenTelemetryBase", f = "OneSignalOpenTelemetry.kt", i = {0}, l = {28}, m = "getSdk", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OneSignalOpenTelemetryBase$getSdk$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalOpenTelemetryBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalOpenTelemetryBase$getSdk$1(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, Continuation<? super OneSignalOpenTelemetryBase$getSdk$1> continuation) {
        super(continuation);
        this.this$0 = oneSignalOpenTelemetryBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSdk(this);
    }
}
