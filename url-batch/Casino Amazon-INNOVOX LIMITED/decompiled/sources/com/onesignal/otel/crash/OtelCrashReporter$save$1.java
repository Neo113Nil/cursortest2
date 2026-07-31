package com.onesignal.otel.crash;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OtelCrashReporter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.crash.OtelCrashReporter", f = "OtelCrashReporter.kt", i = {0, 0, 0, 0, 1, 1}, l = {56, 63}, m = "save", n = {"this", "severity", Constants.ScionAnalytics.PARAM_LABEL, "attributes", "this", Constants.ScionAnalytics.PARAM_LABEL}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class OtelCrashReporter$save$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelCrashReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtelCrashReporter$save$1(OtelCrashReporter otelCrashReporter, Continuation<? super OtelCrashReporter$save$1> continuation) {
        super(continuation);
        this.this$0 = otelCrashReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object save;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        save = this.this$0.save(null, null, null, false, this);
        return save;
    }
}
