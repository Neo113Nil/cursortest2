package com.onesignal.otel.attributes;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OtelFieldsTopLevel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.otel.attributes.OtelFieldsTopLevel", f = "OtelFieldsTopLevel.kt", i = {0}, l = {17}, m = "getAttributes", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OtelFieldsTopLevel$getAttributes$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OtelFieldsTopLevel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtelFieldsTopLevel$getAttributes$1(OtelFieldsTopLevel otelFieldsTopLevel, Continuation<? super OtelFieldsTopLevel$getAttributes$1> continuation) {
        super(continuation);
        this.this$0 = otelFieldsTopLevel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAttributes(this);
    }
}
