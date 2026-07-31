package com.onesignal.notifications.internal.open;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: INotificationOpenedProcessor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/internal/open/INotificationOpenedProcessor;", "", "processFromContext", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INotificationOpenedProcessor {
    Object processFromContext(Context context, Intent intent, Continuation<? super Unit> continuation);
}
