package com.squareup.cash.support.chat.presenters;

import com.squareup.cash.sharesheet.ShareSheetPresenter;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ChatLoadingPresenter$loadSupportChat$1 extends ContinuationImpl {
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShareSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatLoadingPresenter$loadSupportChat$1(ShareSheetPresenter shareSheetPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shareSheetPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ShareSheetPresenter.access$loadSupportChat(this.this$0, this);
    }
}
