package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$clearOldestOverLimitFallback$2 extends h implements InterfaceC1445p {
    final /* synthetic */ int $maxNumberOfNotificationsInt;
    final /* synthetic */ int $notificationsToMakeRoomFor;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, int i3, NotificationRepository notificationRepository) {
            super(1);
            this.$maxNumberOfNotificationsInt = i2;
            this.$notificationsToMakeRoomFor = i3;
            this.this$0 = notificationRepository;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            int count = (it.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
            if (count < 1) {
                return;
            }
            while (it.moveToNext()) {
                this.this$0.internalMarkAsDismissed(it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                count--;
                if (count <= 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$clearOldestOverLimitFallback$2(int i2, NotificationRepository notificationRepository, int i3, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$maxNumberOfNotificationsInt = i2;
        this.this$0 = notificationRepository;
        this.$notificationsToMakeRoomFor = i3;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$clearOldestOverLimitFallback$2(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$clearOldestOverLimitFallback$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        INotificationQueryHelper iNotificationQueryHelper;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
        try {
            iDatabaseProvider = this.this$0._databaseProvider;
            IDatabase os = iDatabaseProvider.getOs();
            String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
            iNotificationQueryHelper = this.this$0._queryHelper;
            IDatabase.DefaultImpls.query$default(os, OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, iNotificationQueryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new AnonymousClass1(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
        } catch (Throwable th) {
            Logging.warn("Error clearing oldest notifications over limit! ", th);
        }
        return v.f5689a;
    }
}
