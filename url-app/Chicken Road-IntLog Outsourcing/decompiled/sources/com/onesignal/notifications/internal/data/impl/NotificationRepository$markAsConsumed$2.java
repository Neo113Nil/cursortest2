package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import android.content.ContentValues;
import b2.AbstractC0279e;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsConsumed$2", f = "NotificationRepository.kt", l = {322}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$markAsConsumed$2 extends h implements InterfaceC1445p {
    final /* synthetic */ int $androidId;
    final /* synthetic */ boolean $clearGroupOnSummaryClick;
    final /* synthetic */ boolean $dismissed;
    final /* synthetic */ String $summaryGroup;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$markAsConsumed$2(String str, boolean z, boolean z5, NotificationRepository notificationRepository, int i2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$summaryGroup = str;
        this.$dismissed = z;
        this.$clearGroupOnSummaryClick = z5;
        this.this$0 = notificationRepository;
        this.$androidId = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$markAsConsumed$2(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$markAsConsumed$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        String str;
        String str2;
        boolean z;
        IDatabaseProvider iDatabaseProvider;
        IBadgeCountUpdater iBadgeCountUpdater;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            String str3 = this.$summaryGroup;
            String[] strArr2 = null;
            if (str3 != null) {
                boolean a6 = i.a(str3, NotificationHelper.GROUPLESS_SUMMARY_KEY);
                if (a6) {
                    str2 = "group_id IS NULL";
                } else {
                    strArr2 = new String[]{this.$summaryGroup};
                    str2 = "group_id = ?";
                }
                String str4 = str2;
                String[] strArr3 = strArr2;
                str = str4;
                if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                    strArr = strArr3;
                } else {
                    NotificationRepository notificationRepository = this.this$0;
                    String str5 = this.$summaryGroup;
                    this.L$0 = str;
                    this.Z$0 = a6;
                    this.label = 1;
                    Object androidIdForGroup = notificationRepository.getAndroidIdForGroup(str5, false, this);
                    if (androidIdForGroup == enumC1260a) {
                        return enumC1260a;
                    }
                    z = a6;
                    obj = androidIdForGroup;
                }
            } else {
                strArr = null;
                str = "android_notification_id = " + this.$androidId;
            }
            ContentValues contentValues = new ContentValues();
            if (this.$dismissed) {
                contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, new Integer(1));
            } else {
                contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, new Integer(1));
            }
            iDatabaseProvider = this.this$0._databaseProvider;
            iDatabaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, strArr);
            iBadgeCountUpdater = this.this$0._badgeCountUpdater;
            iBadgeCountUpdater.update();
            return v.f5689a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = this.Z$0;
        str = (String) this.L$0;
        g.y(obj);
        String valueOf = String.valueOf(obj);
        str = AbstractC0279e.e(str, " AND android_notification_id = ?");
        strArr = z ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
        ContentValues contentValues2 = new ContentValues();
        if (this.$dismissed) {
        }
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues2, str, strArr);
        iBadgeCountUpdater = this.this$0._badgeCountUpdater;
        iBadgeCountUpdater.update();
        return v.f5689a;
    }
}
