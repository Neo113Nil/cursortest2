package com.squareup.cash.ui.gcm;

import com.squareup.cash.notifications.CashNotification;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class NotificationWorker$showNotification$1 extends ContinuationImpl {
    public CashNotification L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NotificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationWorker$showNotification$1(NotificationWorker notificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = notificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showNotification(null, this);
    }
}
