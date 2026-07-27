package com.onesignal.notifications.internal.backend.impl;

import B0.o;
import b2.AbstractC0279e;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import e5.g;
import f4.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationBackendService implements INotificationBackendService {
    private final IHttpClient _httpClient;

    public NotificationBackendService(IHttpClient _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d) {
        NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof NotificationBackendService$updateNotificationAsOpened$1) {
            notificationBackendService$updateNotificationAsOpened$1 = (NotificationBackendService$updateNotificationAsOpened$1) interfaceC1218d;
            int i3 = notificationBackendService$updateNotificationAsOpened$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationBackendService$updateNotificationAsOpened$1.label = i3 - Integer.MIN_VALUE;
                NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$12 = notificationBackendService$updateNotificationAsOpened$1;
                Object obj = notificationBackendService$updateNotificationAsOpened$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationBackendService$updateNotificationAsOpened$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(CommonUrlParts.APP_ID, str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, true);
                    jSONObject.put(CommonUrlParts.DEVICE_TYPE, deviceType.getValue());
                    IHttpClient iHttpClient = this._httpClient;
                    String i6 = o.i("notifications/", str2);
                    notificationBackendService$updateNotificationAsOpened$12.label = 1;
                    obj = IHttpClient.DefaultImpls.put$default(iHttpClient, i6, jSONObject, null, notificationBackendService$updateNotificationAsOpened$12, 4, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return v.f5689a;
            }
        }
        notificationBackendService$updateNotificationAsOpened$1 = new NotificationBackendService$updateNotificationAsOpened$1(this, interfaceC1218d);
        NotificationBackendService$updateNotificationAsOpened$1 notificationBackendService$updateNotificationAsOpened$122 = notificationBackendService$updateNotificationAsOpened$1;
        Object obj2 = notificationBackendService$updateNotificationAsOpened$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationBackendService$updateNotificationAsOpened$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.notifications.internal.backend.INotificationBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d) {
        NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$1;
        int i2;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof NotificationBackendService$updateNotificationAsReceived$1) {
            notificationBackendService$updateNotificationAsReceived$1 = (NotificationBackendService$updateNotificationAsReceived$1) interfaceC1218d;
            int i3 = notificationBackendService$updateNotificationAsReceived$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationBackendService$updateNotificationAsReceived$1.label = i3 - Integer.MIN_VALUE;
                NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$12 = notificationBackendService$updateNotificationAsReceived$1;
                Object obj = notificationBackendService$updateNotificationAsReceived$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationBackendService$updateNotificationAsReceived$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject put = new JSONObject().put(CommonUrlParts.APP_ID, str).put("player_id", str3).put(CommonUrlParts.DEVICE_TYPE, deviceType.getValue());
                    i.d(put, "put(...)");
                    IHttpClient iHttpClient = this._httpClient;
                    String f3 = AbstractC0279e.f("notifications/", str2, "/report_received");
                    notificationBackendService$updateNotificationAsReceived$12.label = 1;
                    obj = IHttpClient.DefaultImpls.put$default(iHttpClient, f3, put, null, notificationBackendService$updateNotificationAsReceived$12, 4, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                return v.f5689a;
            }
        }
        notificationBackendService$updateNotificationAsReceived$1 = new NotificationBackendService$updateNotificationAsReceived$1(this, interfaceC1218d);
        NotificationBackendService$updateNotificationAsReceived$1 notificationBackendService$updateNotificationAsReceived$122 = notificationBackendService$updateNotificationAsReceived$1;
        Object obj2 = notificationBackendService$updateNotificationAsReceived$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationBackendService$updateNotificationAsReceived$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
