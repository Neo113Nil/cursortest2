package com.onesignal.notifications.internal.backend.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: NotificationBackendService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ.\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/notifications/internal/backend/impl/NotificationBackendService;", "Lcom/onesignal/notifications/internal/backend/INotificationBackendService;", "_httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "updateNotificationAsOpened", "", "appId", "", "notificationId", "subscriptionId", "deviceType", "Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNotificationAsReceived", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationBackendService implements INotificationBackendService {
    private final IHttpClient _httpClient;

    public NotificationBackendService(IHttpClient _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, Continuation<? super Unit> continuation) {
        NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof NotificationBackendService$updateNotificationAsReceived$1) {
            notificationBackendService$updateNotificationAsReceived$1 = (NotificationBackendService$updateNotificationAsReceived$1) continuation;
            if ((notificationBackendService$updateNotificationAsReceived$1.label & Integer.MIN_VALUE) != 0) {
                notificationBackendService$updateNotificationAsReceived$1.label -= Integer.MIN_VALUE;
                NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$12 = notificationBackendService$updateNotificationAsReceived$1;
                Object obj = notificationBackendService$updateNotificationAsReceived$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationBackendService$updateNotificationAsReceived$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject put = new JSONObject().put(CommonUrlParts.APP_ID, str).put("player_id", str3).put(CommonUrlParts.DEVICE_TYPE, deviceType.getValue());
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    notificationBackendService$updateNotificationAsReceived$12.label = 1;
                    obj = IHttpClient.DefaultImpls.put$default(this._httpClient, "notifications/" + str2 + "/report_received", put, null, notificationBackendService$updateNotificationAsReceived$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return Unit.INSTANCE;
            }
        }
        notificationBackendService$updateNotificationAsReceived$1 = new NotificationBackendService$updateNotificationAsReceived$1(this, continuation);
        NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$122 = notificationBackendService$updateNotificationAsReceived$1;
        Object obj2 = notificationBackendService$updateNotificationAsReceived$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationBackendService$updateNotificationAsReceived$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, Continuation<? super Unit> continuation) {
        NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$1;
        int i;
        HttpResponse httpResponse;
        if (continuation instanceof NotificationBackendService$updateNotificationAsOpened$1) {
            notificationBackendService$updateNotificationAsOpened$1 = (NotificationBackendService$updateNotificationAsOpened$1) continuation;
            if ((notificationBackendService$updateNotificationAsOpened$1.label & Integer.MIN_VALUE) != 0) {
                notificationBackendService$updateNotificationAsOpened$1.label -= Integer.MIN_VALUE;
                NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$12 = notificationBackendService$updateNotificationAsOpened$1;
                Object obj = notificationBackendService$updateNotificationAsOpened$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationBackendService$updateNotificationAsOpened$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(CommonUrlParts.APP_ID, str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, true);
                    jSONObject.put(CommonUrlParts.DEVICE_TYPE, deviceType.getValue());
                    notificationBackendService$updateNotificationAsOpened$12.label = 1;
                    obj = IHttpClient.DefaultImpls.put$default(this._httpClient, "notifications/" + str2, jSONObject, null, notificationBackendService$updateNotificationAsOpened$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return Unit.INSTANCE;
            }
        }
        notificationBackendService$updateNotificationAsOpened$1 = new NotificationBackendService$updateNotificationAsOpened$1(this, continuation);
        NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$122 = notificationBackendService$updateNotificationAsOpened$1;
        Object obj2 = notificationBackendService$updateNotificationAsOpened$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationBackendService$updateNotificationAsOpened$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
