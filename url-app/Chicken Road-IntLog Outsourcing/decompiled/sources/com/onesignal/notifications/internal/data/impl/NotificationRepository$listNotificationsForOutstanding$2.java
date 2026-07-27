package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import android.text.TextUtils;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import e5.g;
import f4.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$listNotificationsForOutstanding$2 extends h implements InterfaceC1445p {
    final /* synthetic */ List<Integer> $excludeAndroidIds;
    final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<INotificationRepository.NotificationData> list) {
            super(1);
            this.$listOfNotifications = list;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            while (it.moveToNext()) {
                String optString = it.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                String optString2 = it.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                String string = it.getString("notification_id");
                this.$listOfNotifications.add(new INotificationRepository.NotificationData(it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID), string, it.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA), it.getLong(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME), optString, optString2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$listNotificationsForOutstanding$2(NotificationRepository notificationRepository, List<Integer> list, List<INotificationRepository.NotificationData> list2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = notificationRepository;
        this.$excludeAndroidIds = list;
        this.$listOfNotifications = list2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$listNotificationsForOutstanding$2(this.this$0, this.$excludeAndroidIds, this.$listOfNotifications, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$listNotificationsForOutstanding$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        INotificationQueryHelper iNotificationQueryHelper;
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iNotificationQueryHelper = this.this$0._queryHelper;
        StringBuilder recentUninteractedWithNotificationsWhere = iNotificationQueryHelper.recentUninteractedWithNotificationsWhere();
        if (this.$excludeAndroidIds != null) {
            recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
            recentUninteractedWithNotificationsWhere.append(TextUtils.join(StringUtils.COMMA, this.$excludeAndroidIds));
            recentUninteractedWithNotificationsWhere.append(")");
        }
        iDatabaseProvider = this.this$0._databaseProvider;
        IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, NotificationRepository.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()), new AnonymousClass1(this.$listOfNotifications), 56, null);
        return v.f5689a;
    }
}
