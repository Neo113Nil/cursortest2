package com.squareup.cash.storage;

import com.squareup.cash.cdf.storage.StorageLinkType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SandboxingAnalyticsLogger$log$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public StorageLinkState L$0;
    public String L$1;
    public StorageLinkType L$4;
    public Long L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SandboxingAnalyticsLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxingAnalyticsLogger$log$1(SandboxingAnalyticsLogger sandboxingAnalyticsLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sandboxingAnalyticsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.log(null, this);
    }
}
