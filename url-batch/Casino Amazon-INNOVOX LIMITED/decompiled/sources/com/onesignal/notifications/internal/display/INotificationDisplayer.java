package com.onesignal.notifications.internal.display;

import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: INotificationDisplayer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/notifications/internal/display/INotificationDisplayer;", "", "displayNotification", "", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INotificationDisplayer {
    Object displayNotification(NotificationGenerationJob notificationGenerationJob, Continuation<? super Boolean> continuation);
}
