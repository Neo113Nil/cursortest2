package com.onesignal.notifications.internal.pushtoken;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IPushTokenManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onesignal/notifications/internal/pushtoken/IPushTokenManager;", "", "retrievePushToken", "Lcom/onesignal/notifications/internal/pushtoken/PushTokenResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IPushTokenManager {
    Object retrievePushToken(Continuation<? super PushTokenResponse> continuation);
}
