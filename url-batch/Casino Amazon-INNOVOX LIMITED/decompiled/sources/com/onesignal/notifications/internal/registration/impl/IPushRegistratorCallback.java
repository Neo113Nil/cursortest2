package com.onesignal.notifications.internal.registration.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IPushRegistratorCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/notifications/internal/registration/impl/IPushRegistratorCallback;", "", "fireCallback", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IPushRegistratorCallback {
    Object fireCallback(String str, Continuation<? super Unit> continuation);
}
