package com.stripe.android.financialconnections.lite.repository;

import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ToolbarTuckTargets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1(ToolbarTuckTargets toolbarTuckTargets, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = toolbarTuckTargets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3757getFinancialConnectionsSessiongIAlus = this.this$0.m3757getFinancialConnectionsSessiongIAlus(null, this);
        return m3757getFinancialConnectionsSessiongIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m3757getFinancialConnectionsSessiongIAlus : new Result(m3757getFinancialConnectionsSessiongIAlus);
    }
}
