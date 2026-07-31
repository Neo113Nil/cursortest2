package com.onesignal.otel;

import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OtelLoggingHelper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.OtelLoggingHelper", f = "OtelLoggingHelper.kt", i = {0, 0, 0}, l = {Elf64.Ehdr.E_SHENTSIZE}, m = "logToOtel", n = {"message", "severity", "attributes"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class OtelLoggingHelper$logToOtel$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelLoggingHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtelLoggingHelper$logToOtel$1(OtelLoggingHelper otelLoggingHelper, Continuation<? super OtelLoggingHelper$logToOtel$1> continuation) {
        super(continuation);
        this.this$0 = otelLoggingHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logToOtel(null, null, null, null, null, null, this);
    }
}
