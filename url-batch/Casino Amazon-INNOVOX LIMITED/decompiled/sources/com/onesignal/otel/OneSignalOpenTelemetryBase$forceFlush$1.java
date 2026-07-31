package com.onesignal.otel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OneSignalOpenTelemetry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.OneSignalOpenTelemetryBase", f = "OneSignalOpenTelemetry.kt", i = {1}, l = {44, 45}, m = "forceFlush$suspendImpl", n = {"sdkLoggerProvider"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OneSignalOpenTelemetryBase$forceFlush$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalOpenTelemetryBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalOpenTelemetryBase$forceFlush$1(OneSignalOpenTelemetryBase oneSignalOpenTelemetryBase, Continuation<? super OneSignalOpenTelemetryBase$forceFlush$1> continuation) {
        super(continuation);
        this.this$0 = oneSignalOpenTelemetryBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OneSignalOpenTelemetryBase.forceFlush$suspendImpl(this.this$0, this);
    }
}
