package com.stripe.android.financialconnections.features.linkaccountpicker;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class LinkAccountPickerViewModel$selectAccounts$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LinkAccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountPickerViewModel$selectAccounts$1(LinkAccountPickerViewModel linkAccountPickerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = linkAccountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LinkAccountPickerViewModel.access$selectAccounts(this.this$0, false, null, null, this);
    }
}
