package com.onesignal.notifications.internal;

import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class NotificationsManager$onFocus$1 extends j implements InterfaceC1430a {
    final /* synthetic */ NotificationsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsManager$onFocus$1(NotificationsManager notificationsManager) {
        super(0);
        this.this$0 = notificationsManager;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m30invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m30invoke() {
        this.this$0.refreshNotificationState();
    }
}
