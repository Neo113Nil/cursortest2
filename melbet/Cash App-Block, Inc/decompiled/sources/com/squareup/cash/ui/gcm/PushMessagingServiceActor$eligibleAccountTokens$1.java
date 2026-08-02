package com.squareup.cash.ui.gcm;

import com.google.android.gms.maps.zzai;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PushMessagingServiceActor$eligibleAccountTokens$1 extends ContinuationImpl {
    public Set L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessagingServiceActor$eligibleAccountTokens$1(zzai zzaiVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzaiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.eligibleAccountTokens(this);
    }
}
