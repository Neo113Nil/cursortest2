package com.onesignal.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OneSignalImp.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp", f = "OneSignalImp.kt", i = {0}, l = {TypedValues.Motion.TYPE_QUANTIZE_INTERPOLATOR}, m = "suspendAndReturn", n = {"getter"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OneSignalImp$suspendAndReturn$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$suspendAndReturn$1(OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$suspendAndReturn$1> continuation) {
        super(continuation);
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object suspendAndReturn;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        suspendAndReturn = this.this$0.suspendAndReturn(null, this);
        return suspendAndReturn;
    }
}
