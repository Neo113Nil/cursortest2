package com.onesignal.notifications.internal.data.impl;

import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsConsumed$2", f = "NotificationRepository.kt", i = {0, 0}, l = {322}, m = "invokeSuspend", n = {"whereStr", "isGroupless"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class NotificationRepository$markAsConsumed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $androidId;
    final /* synthetic */ boolean $clearGroupOnSummaryClick;
    final /* synthetic */ boolean $dismissed;
    final /* synthetic */ String $summaryGroup;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ NotificationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationRepository$markAsConsumed$2(String str, boolean z, boolean z2, NotificationRepository notificationRepository, int i, Continuation<? super NotificationRepository$markAsConsumed$2> continuation) {
        super(2, continuation);
        this.$summaryGroup = str;
        this.$dismissed = z;
        this.$clearGroupOnSummaryClick = z2;
        this.this$0 = notificationRepository;
        this.$androidId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationRepository$markAsConsumed$2(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationRepository$markAsConsumed$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
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
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str3 = this.$summaryGroup;
            String[] strArr2 = null;
            if (str3 != null) {
                boolean areEqual = Intrinsics.areEqual(str3, NotificationHelper.GROUPLESS_SUMMARY_KEY);
                if (areEqual) {
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
                    this.L$0 = str;
                    this.Z$0 = areEqual;
                    this.label = 1;
                    Object androidIdForGroup = this.this$0.getAndroidIdForGroup(this.$summaryGroup, false, this);
                    if (androidIdForGroup == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = areEqual;
                    obj = androidIdForGroup;
                }
            } else {
                strArr = null;
                str = "android_notification_id = " + this.$androidId;
            }
            ContentValues contentValues = new ContentValues();
            if (!this.$dismissed) {
                contentValues.put("dismissed", Boxing.boxInt(1));
            } else {
                contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, Boxing.boxInt(1));
            }
            iDatabaseProvider = this.this$0._databaseProvider;
            iDatabaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, strArr);
            iBadgeCountUpdater = this.this$0._badgeCountUpdater;
            iBadgeCountUpdater.update();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = this.Z$0;
        str = (String) this.L$0;
        ResultKt.throwOnFailure(obj);
        String valueOf = String.valueOf(obj);
        str = str + " AND android_notification_id = ?";
        if (z) {
            strArr = new String[]{valueOf};
        } else {
            strArr = new String[]{this.$summaryGroup, valueOf};
        }
        ContentValues contentValues2 = new ContentValues();
        if (!this.$dismissed) {
        }
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues2, str, strArr);
        iBadgeCountUpdater = this.this$0._badgeCountUpdater;
        iBadgeCountUpdater.update();
        return Unit.INSTANCE;
    }
}
