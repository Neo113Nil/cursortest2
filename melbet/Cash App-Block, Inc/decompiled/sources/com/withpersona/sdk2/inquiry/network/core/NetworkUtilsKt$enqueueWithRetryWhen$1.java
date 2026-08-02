package com.withpersona.sdk2.inquiry.network.core;

import com.plaid.internal.EnumC0170g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt", f = "NetworkUtils.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE}, m = "enqueueWithRetryWhen")
/* loaded from: classes9.dex */
public final class NetworkUtilsKt$enqueueWithRetryWhen$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public NetworkUtilsKt$enqueueWithRetryWhen$1(Continuation<? super NetworkUtilsKt$enqueueWithRetryWhen$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
    }
}
