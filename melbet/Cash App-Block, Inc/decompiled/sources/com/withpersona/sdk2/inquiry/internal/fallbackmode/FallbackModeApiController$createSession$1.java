package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FallbackModeApiController$createSession$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FallbackModeApiController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackModeApiController$createSession$1(FallbackModeApiController fallbackModeApiController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fallbackModeApiController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object mo1999createSessiongIAlus = this.this$0.mo1999createSessiongIAlus(null, this);
        return mo1999createSessiongIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? mo1999createSessiongIAlus : new Result(mo1999createSessiongIAlus);
    }
}
