package com.onesignal.notifications.internal.backend;

import com.onesignal.core.internal.device.IDeviceService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: INotificationBackendService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/onesignal/notifications/internal/backend/INotificationBackendService;", "", "updateNotificationAsOpened", "", "appId", "", "notificationId", "subscriptionId", "deviceType", "Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNotificationAsReceived", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface INotificationBackendService {
    Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, Continuation<? super Unit> continuation);

    Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, Continuation<? super Unit> continuation);
}
