package com.onesignal.location.internal.controller.impl;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GmsLocationController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.controller.impl.GmsLocationController", f = "GmsLocationController.kt", i = {0}, l = {48}, m = ViewProps.START, n = {"wasSuccessful"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GmsLocationController$start$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GmsLocationController$start$1(GmsLocationController gmsLocationController, Continuation<? super GmsLocationController$start$1> continuation) {
        super(continuation);
        this.this$0 = gmsLocationController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.start(this);
    }
}
