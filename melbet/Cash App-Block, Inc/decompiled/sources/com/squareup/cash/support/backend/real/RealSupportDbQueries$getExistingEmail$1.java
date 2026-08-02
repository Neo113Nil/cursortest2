package com.squareup.cash.support.backend.real;

import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealSupportDbQueries$getExistingEmail$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ToolbarTuckTargets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportDbQueries$getExistingEmail$1(ToolbarTuckTargets toolbarTuckTargets, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = toolbarTuckTargets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getExistingEmail(this);
    }
}
