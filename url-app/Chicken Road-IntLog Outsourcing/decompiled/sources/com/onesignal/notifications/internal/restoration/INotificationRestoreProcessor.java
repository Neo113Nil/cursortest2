package com.onesignal.notifications.internal.restoration;

import com.onesignal.notifications.internal.data.INotificationRepository;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationRestoreProcessor {

    public static final class DefaultImpls {
        public static /* synthetic */ Object processNotification$default(INotificationRestoreProcessor iNotificationRestoreProcessor, INotificationRepository.NotificationData notificationData, int i2, InterfaceC1218d interfaceC1218d, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return iNotificationRestoreProcessor.processNotification(notificationData, i2, interfaceC1218d);
        }
    }

    Object process(InterfaceC1218d interfaceC1218d);

    Object processNotification(INotificationRepository.NotificationData notificationData, int i2, InterfaceC1218d interfaceC1218d);
}
