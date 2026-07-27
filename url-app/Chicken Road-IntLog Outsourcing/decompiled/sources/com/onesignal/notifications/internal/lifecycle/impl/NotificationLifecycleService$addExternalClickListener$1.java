package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.internal.NotificationClickEvent;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationLifecycleService$addExternalClickListener$1 extends j implements InterfaceC1441l {
    final /* synthetic */ NotificationClickEvent $openedResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$addExternalClickListener$1(NotificationClickEvent notificationClickEvent) {
        super(1);
        this.$openedResult = notificationClickEvent;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((INotificationClickListener) obj);
        return v.f5689a;
    }

    public final void invoke(INotificationClickListener it) {
        i.e(it, "it");
        it.onClick(this.$openedResult);
    }
}
