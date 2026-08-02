package com.squareup.cash.ui.gcm;

import com.google.android.gms.maps.zzai;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.cash.notifications.CashNotification;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PushMessagingServiceActor$onMessageReceived$1 extends ContinuationImpl {
    public String L$0;
    public CashPushNotification L$1;
    public CashNotification L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessagingServiceActor$onMessageReceived$1(zzai zzaiVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzaiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onMessageReceived(null, this);
    }
}
