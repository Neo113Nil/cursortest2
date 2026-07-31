package com.onesignal.notifications.internal.receivereceipt;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IReceiveReceiptProcessor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/IReceiveReceiptProcessor;", "", "sendReceiveReceipt", "", "appId", "", "subscriptionId", "notificationId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IReceiveReceiptProcessor {
    Object sendReceiveReceipt(String str, String str2, String str3, Continuation<? super Unit> continuation);
}
