package com.stripe.android.financialconnections.features.manualentry;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ManualEntryViewModel$clearCachedAccounts$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ManualEntryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$clearCachedAccounts$1(ManualEntryViewModel manualEntryViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = manualEntryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ManualEntryViewModel.access$clearCachedAccounts(this.this$0, this);
    }
}
