package com.onesignal.notifications.internal.lifecycle;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: INotificationLifecycleService.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0012\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#H&¨\u0006$"}, d2 = {"Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "", "addExternalClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/notifications/INotificationClickListener;", "addExternalForegroundLifecycleListener", "Lcom/onesignal/notifications/INotificationLifecycleListener;", "canOpenNotification", "", "activity", "Landroid/app/Activity;", "data", "Lorg/json/JSONObject;", "(Landroid/app/Activity;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canReceiveNotification", "jsonPayload", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "externalNotificationWillShowInForeground", "willDisplayEvent", "Lcom/onesignal/notifications/INotificationWillDisplayEvent;", "externalRemoteNotificationReceived", "notificationReceivedEvent", "Lcom/onesignal/notifications/INotificationReceivedEvent;", "notificationOpened", "Lorg/json/JSONArray;", "(Landroid/app/Activity;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notificationReceived", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeExternalClickListener", "removeExternalForegroundLifecycleListener", "setInternalNotificationLifecycleCallback", "callback", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleCallback;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INotificationLifecycleService {
    void addExternalClickListener(INotificationClickListener listener);

    void addExternalForegroundLifecycleListener(INotificationLifecycleListener listener);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, Continuation<? super Boolean> continuation);

    Object canReceiveNotification(JSONObject jSONObject, Continuation<? super Boolean> continuation);

    void externalNotificationWillShowInForeground(INotificationWillDisplayEvent willDisplayEvent);

    void externalRemoteNotificationReceived(INotificationReceivedEvent notificationReceivedEvent);

    Object notificationOpened(Activity activity, JSONArray jSONArray, Continuation<? super Unit> continuation);

    Object notificationReceived(NotificationGenerationJob notificationGenerationJob, Continuation<? super Unit> continuation);

    void removeExternalClickListener(INotificationClickListener listener);

    void removeExternalForegroundLifecycleListener(INotificationLifecycleListener listener);

    void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback callback);
}
