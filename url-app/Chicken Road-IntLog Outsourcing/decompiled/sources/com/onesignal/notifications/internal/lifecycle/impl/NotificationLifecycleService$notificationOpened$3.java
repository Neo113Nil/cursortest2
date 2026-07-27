package com.onesignal.notifications.internal.lifecycle.impl;

import com.onesignal.common.exceptions.BackendException;
import com.onesignal.debug.internal.logging.Logging;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationLifecycleService$notificationOpened$3 extends j implements InterfaceC1441l {
    public static final NotificationLifecycleService$notificationOpened$3 INSTANCE = new NotificationLifecycleService$notificationOpened$3();

    public NotificationLifecycleService$notificationOpened$3() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return v.f5689a;
    }

    public final void invoke(Exception ex) {
        i.e(ex, "ex");
        if (!(ex instanceof BackendException)) {
            Logging.info("Unexpected error in notification opened confirmation", ex);
            return;
        }
        StringBuilder sb = new StringBuilder("Notification opened confirmation failed with statusCode: ");
        BackendException backendException = (BackendException) ex;
        sb.append(backendException.getStatusCode());
        sb.append(" response: ");
        sb.append(backendException.getResponse());
        Logging.info$default(sb.toString(), null, 2, null);
    }
}
