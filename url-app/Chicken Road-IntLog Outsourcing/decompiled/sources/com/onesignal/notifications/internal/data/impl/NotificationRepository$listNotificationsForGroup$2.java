package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.data.INotificationRepository;
import e5.g;
import f4.v;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONException;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$listNotificationsForGroup$2 extends h implements InterfaceC1445p {
    final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
    final /* synthetic */ String $summaryGroup;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<INotificationRepository.NotificationData> list, String str) {
            super(1);
            this.$listOfNotifications = list;
            this.$summaryGroup = str;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            if (it.moveToFirst()) {
                do {
                    try {
                        String optString = it.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                        String optString2 = it.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                        this.$listOfNotifications.add(new INotificationRepository.NotificationData(it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID), it.getString("notification_id"), it.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA), it.getLong(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME), optString, optString2));
                    } catch (JSONException unused) {
                        Logging.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                    }
                } while (it.moveToNext());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$listNotificationsForGroup$2(String str, NotificationRepository notificationRepository, List<INotificationRepository.NotificationData> list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$summaryGroup = str;
        this.this$0 = notificationRepository;
        this.$listOfNotifications = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$listNotificationsForGroup$2(this.$summaryGroup, this.this$0, this.$listOfNotifications, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$listNotificationsForGroup$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        String[] strArr = {this.$summaryGroup};
        iDatabaseProvider = this.this$0._databaseProvider;
        IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, NotificationRepository.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, null, null, "_id DESC", null, new AnonymousClass1(this.$listOfNotifications, this.$summaryGroup), 176, null);
        return v.f5689a;
    }
}
