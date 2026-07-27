package com.onesignal.notifications.internal.backend;

import com.onesignal.core.internal.device.IDeviceService;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationBackendService {
    Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d);

    Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d);
}
