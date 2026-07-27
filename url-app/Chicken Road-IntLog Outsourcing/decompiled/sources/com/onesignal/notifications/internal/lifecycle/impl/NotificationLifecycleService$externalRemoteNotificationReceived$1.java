package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationLifecycleService$externalRemoteNotificationReceived$1 extends j implements InterfaceC1441l {
    final /* synthetic */ INotificationReceivedEvent $notificationReceivedEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$externalRemoteNotificationReceived$1(INotificationReceivedEvent iNotificationReceivedEvent) {
        super(1);
        this.$notificationReceivedEvent = iNotificationReceivedEvent;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((INotificationServiceExtension) obj);
        return v.f5689a;
    }

    public final void invoke(INotificationServiceExtension it) {
        i.e(it, "it");
        it.onNotificationReceived(this.$notificationReceivedEvent);
    }
}
