package com.squareup.cash.transfers.presenters;

import com.squareup.cash.sharesheet.ShareSheetPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PendingTransfersConfirmationDialogPresenter$continueTransfer$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShareSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingTransfersConfirmationDialogPresenter$continueTransfer$1(ShareSheetPresenter shareSheetPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shareSheetPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ShareSheetPresenter.access$continueTransfer(this.this$0, this);
    }
}
