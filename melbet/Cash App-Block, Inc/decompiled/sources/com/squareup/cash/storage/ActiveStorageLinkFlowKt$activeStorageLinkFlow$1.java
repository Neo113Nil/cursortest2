package com.squareup.cash.storage;

import androidx.core.os.BundleKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ActiveStorageLinkFlowKt$activeStorageLinkFlow$1 extends ContinuationImpl {
    public CoroutineScope L$0;
    public SandboxingAnalyticsLogger L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BundleKt.activeStorageLinkFlow(null, null, null, null, null, this);
    }
}
