package com.onesignal.otel.crash;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OtelCrashUploader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.crash.OtelCrashUploader", f = "OtelCrashUploader.kt", i = {0}, l = {74}, m = "internalStart", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OtelCrashUploader$internalStart$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelCrashUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtelCrashUploader$internalStart$1(OtelCrashUploader otelCrashUploader, Continuation<? super OtelCrashUploader$internalStart$1> continuation) {
        super(continuation);
        this.this$0 = otelCrashUploader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.internalStart(this);
    }
}
