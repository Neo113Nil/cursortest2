package com.onesignal.notifications.internal.data.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2", f = "NotificationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NotificationRepository$getAndroidIdFromCollapseKey$2 extends h implements InterfaceC1445p {
    final /* synthetic */ s $androidId;
    final /* synthetic */ String $collapseKey;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ s $androidId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s sVar) {
            super(1);
            this.$androidId = sVar;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            if (it.moveToFirst()) {
                this.$androidId.f10741a = Integer.valueOf(it.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepository$getAndroidIdFromCollapseKey$2(NotificationRepository notificationRepository, String str, s sVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = notificationRepository;
        this.$collapseKey = str;
        this.$androidId = sVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new NotificationRepository$getAndroidIdFromCollapseKey$2(this.this$0, this.$collapseKey, this.$androidId, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((NotificationRepository$getAndroidIdFromCollapseKey$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iDatabaseProvider = this.this$0._databaseProvider;
        IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new AnonymousClass1(this.$androidId), 240, null);
        return v.f5689a;
    }
}
