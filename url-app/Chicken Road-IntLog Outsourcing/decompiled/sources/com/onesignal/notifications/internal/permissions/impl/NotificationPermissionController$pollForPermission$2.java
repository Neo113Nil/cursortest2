package com.onesignal.notifications.internal.permissions.impl;

import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationPermissionController$pollForPermission$2 extends j implements InterfaceC1441l {
    final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPermissionController$pollForPermission$2(boolean z) {
        super(1);
        this.$enabled = z;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((INotificationPermissionChangedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(INotificationPermissionChangedHandler it) {
        i.e(it, "it");
        it.onNotificationPermissionChanged(this.$enabled);
    }
}
