package com.onesignal.notifications.internal;

import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.internal.NotificationsManager$removeNotification$1", f = "NotificationsManager.kt", l = {112, 113}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationsManager$removeNotification$1 extends h implements InterfaceC1441l {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ NotificationsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsManager$removeNotification$1(NotificationsManager notificationsManager, int i2, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = notificationsManager;
        this.$id = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new NotificationsManager$removeNotification$1(this.this$0, this.$id, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        INotificationSummaryManager iNotificationSummaryManager;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            INotificationRepository iNotificationRepository = this.this$0._notificationDataController;
            int i3 = this.$id;
            this.label = 1;
            obj = iNotificationRepository.markAsDismissed(i3, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                return v.f5689a;
            }
            g.y(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            iNotificationSummaryManager = this.this$0._summaryManager;
            int i6 = this.$id;
            this.label = 2;
            if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(i6, this) == enumC1260a) {
                return enumC1260a;
            }
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((NotificationsManager$removeNotification$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
