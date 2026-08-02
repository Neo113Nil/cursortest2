package com.squareup.cash.threedsdataonly.backend.real;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealThreeDsWarningsRepository$awaitWarnings$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealThreeDsWarningsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealThreeDsWarningsRepository$awaitWarnings$1(RealThreeDsWarningsRepository realThreeDsWarningsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realThreeDsWarningsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3770awaitWarningsgIAlus = this.this$0.m3770awaitWarningsgIAlus(0L, this);
        return m3770awaitWarningsgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m3770awaitWarningsgIAlus : new Result(m3770awaitWarningsgIAlus);
    }
}
