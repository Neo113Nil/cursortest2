package com.onesignal.common.threading;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ThreadUtils.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ThreadUtilsKt$suspendifyWithCompletion$launch$2 extends FunctionReferenceImpl implements Function1<Function1<? super Continuation<? super Unit>, ? extends Object>, Job> {
    ThreadUtilsKt$suspendifyWithCompletion$launch$2(Object obj) {
        super(1, obj, OneSignalDispatchers.class, "launchOnDefault", "launchOnDefault(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(Function1<? super Continuation<? super Unit>, ? extends Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OneSignalDispatchers) this.receiver).launchOnDefault(p0);
    }
}
