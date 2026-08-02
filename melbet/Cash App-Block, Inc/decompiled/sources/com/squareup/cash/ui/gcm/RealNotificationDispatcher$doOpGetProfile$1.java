package com.squareup.cash.ui.gcm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealNotificationDispatcher$doOpGetProfile$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealNotificationDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNotificationDispatcher$doOpGetProfile$1(RealNotificationDispatcher realNotificationDispatcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realNotificationDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealNotificationDispatcher.access$doOpGetProfile(this.this$0, this);
    }
}
