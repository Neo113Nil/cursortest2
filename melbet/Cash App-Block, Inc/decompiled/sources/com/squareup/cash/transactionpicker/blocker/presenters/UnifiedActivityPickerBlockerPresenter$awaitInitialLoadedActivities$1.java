package com.squareup.cash.transactionpicker.blocker.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UnifiedActivityPickerBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedActivityPickerBlockerPresenter$awaitInitialLoadedActivities$1(UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = unifiedActivityPickerBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return UnifiedActivityPickerBlockerPresenter.access$awaitInitialLoadedActivities(this.this$0, null, this);
    }
}
