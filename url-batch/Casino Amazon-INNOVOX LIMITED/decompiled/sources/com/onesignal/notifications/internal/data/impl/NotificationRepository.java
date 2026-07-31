package com.onesignal.notifications.internal.data.impl;

import android.content.ContentValues;
import android.content.Context;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: NotificationRepository.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0012Jf\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0002\u0010'J \u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010+J\u0018\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010'J\u0018\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u001c\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010'J$\u00104\u001a\b\u0012\u0004\u0012\u000202012\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000101H\u0096@¢\u0006\u0002\u00106J0\u00107\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u00109\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010:J\u0016\u0010;\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010.J\u0016\u0010<\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010'J\u000e\u0010=\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/onesignal/notifications/internal/data/impl/NotificationRepository;", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_queryHelper", "Lcom/onesignal/notifications/internal/data/INotificationQueryHelper;", "_databaseProvider", "Lcom/onesignal/core/internal/database/IDatabaseProvider;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_badgeCountUpdater", "Lcom/onesignal/notifications/internal/badges/IBadgeCountUpdater;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/data/INotificationQueryHelper;Lcom/onesignal/core/internal/database/IDatabaseProvider;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/notifications/internal/badges/IBadgeCountUpdater;)V", "clearOldestOverLimitFallback", "", "notificationsToMakeRoomFor", "", "maxNumberOfNotificationsInt", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNotification", "id", "", "groupId", "collapseKey", "shouldDismissIdenticals", "", "isOpened", "androidId", "title", "body", "expireTime", "", "jsonPayload", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSummaryNotification", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExpiredNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesNotificationExist", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAndroidIdForGroup", "group", "getSummaryNotification", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAndroidIdFromCollapseKey", "getGroupId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalMarkAsDismissed", "listNotificationsForGroup", "", "Lcom/onesignal/notifications/internal/data/INotificationRepository$NotificationData;", "summaryGroup", "listNotificationsForOutstanding", "excludeAndroidIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsConsumed", "dismissed", "clearGroupOnSummaryClick", "(IZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsDismissed", "markAsDismissedForGroup", "markAsDismissedForOutstanding", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationRepository implements INotificationRepository {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final IDatabaseProvider _databaseProvider;
    private final INotificationQueryHelper _queryHelper;
    private final ITime _time;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", "notification_id", OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME};

    public NotificationRepository(IApplicationService _applicationService, INotificationQueryHelper _queryHelper, IDatabaseProvider _databaseProvider, ITime _time, IBadgeCountUpdater _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object deleteExpiredNotifications(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$deleteExpiredNotifications$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForOutstanding(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$markAsDismissedForOutstanding$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForGroup(String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$markAsDismissedForGroup$2(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i, Continuation<? super Boolean> continuation) {
        NotificationRepository$markAsDismissed$1 notificationRepository$markAsDismissed$1;
        int i2;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof NotificationRepository$markAsDismissed$1) {
            notificationRepository$markAsDismissed$1 = (NotificationRepository$markAsDismissed$1) continuation;
            if ((notificationRepository$markAsDismissed$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$markAsDismissed$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$markAsDismissed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = notificationRepository$markAsDismissed$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    NotificationRepository$markAsDismissed$2 notificationRepository$markAsDismissed$2 = new NotificationRepository$markAsDismissed$2(booleanRef2, this, i, null);
                    notificationRepository$markAsDismissed$1.L$0 = booleanRef2;
                    notificationRepository$markAsDismissed$1.label = 1;
                    if (BuildersKt.withContext(io2, notificationRepository$markAsDismissed$2, notificationRepository$markAsDismissed$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) notificationRepository$markAsDismissed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        notificationRepository$markAsDismissed$1 = new NotificationRepository$markAsDismissed$1(this, continuation);
        Object obj2 = notificationRepository$markAsDismissed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = notificationRepository$markAsDismissed$1.label;
        if (i2 != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int androidId) {
        Context appContext = this._applicationService.getAppContext();
        String str = "android_notification_id = " + androidId + " AND opened = 0 AND dismissed = 0";
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z = this._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, null) > 0;
        this._badgeCountUpdater.update();
        NotificationHelper.INSTANCE.getNotificationManager(appContext).cancel(androidId);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, Continuation<? super Boolean> continuation) {
        NotificationRepository$doesNotificationExist$1 notificationRepository$doesNotificationExist$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof NotificationRepository$doesNotificationExist$1) {
            notificationRepository$doesNotificationExist$1 = (NotificationRepository$doesNotificationExist$1) continuation;
            if ((notificationRepository$doesNotificationExist$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$doesNotificationExist$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$doesNotificationExist$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRepository$doesNotificationExist$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str == null || Intrinsics.areEqual("", str)) {
                        return Boxing.boxBoolean(false);
                    }
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    NotificationRepository$doesNotificationExist$2 notificationRepository$doesNotificationExist$2 = new NotificationRepository$doesNotificationExist$2(str, this, booleanRef2, null);
                    notificationRepository$doesNotificationExist$1.L$0 = booleanRef2;
                    notificationRepository$doesNotificationExist$1.label = 1;
                    if (BuildersKt.withContext(io2, notificationRepository$doesNotificationExist$2, notificationRepository$doesNotificationExist$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) notificationRepository$doesNotificationExist$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        notificationRepository$doesNotificationExist$1 = new NotificationRepository$doesNotificationExist$1(this, continuation);
        Object obj2 = notificationRepository$doesNotificationExist$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepository$doesNotificationExist$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createSummaryNotification(int i, String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$createSummaryNotification$2(i, str, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createNotification(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, String str5, long j, String str6, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$createNotification$2(str, z, i, this, str2, str3, z2, str4, str5, j, str6, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsConsumed(int i, boolean z, String str, boolean z2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$markAsConsumed$2(str, z, z2, this, i, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i, Continuation<? super String> continuation) {
        NotificationRepository$getGroupId$1 notificationRepository$getGroupId$1;
        int i2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof NotificationRepository$getGroupId$1) {
            notificationRepository$getGroupId$1 = (NotificationRepository$getGroupId$1) continuation;
            if ((notificationRepository$getGroupId$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$getGroupId$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$getGroupId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = notificationRepository$getGroupId$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    NotificationRepository$getGroupId$2 notificationRepository$getGroupId$2 = new NotificationRepository$getGroupId$2(this, i, objectRef2, null);
                    notificationRepository$getGroupId$1.L$0 = objectRef2;
                    notificationRepository$getGroupId$1.label = 1;
                    if (BuildersKt.withContext(io2, notificationRepository$getGroupId$2, notificationRepository$getGroupId$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) notificationRepository$getGroupId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        notificationRepository$getGroupId$1 = new NotificationRepository$getGroupId$1(this, continuation);
        Object obj2 = notificationRepository$getGroupId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = notificationRepository$getGroupId$1.label;
        if (i2 != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, Continuation<? super Integer> continuation) {
        NotificationRepository$getAndroidIdFromCollapseKey$1 notificationRepository$getAndroidIdFromCollapseKey$1;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof NotificationRepository$getAndroidIdFromCollapseKey$1) {
            notificationRepository$getAndroidIdFromCollapseKey$1 = (NotificationRepository$getAndroidIdFromCollapseKey$1) continuation;
            if ((notificationRepository$getAndroidIdFromCollapseKey$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$getAndroidIdFromCollapseKey$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$getAndroidIdFromCollapseKey$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRepository$getAndroidIdFromCollapseKey$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    NotificationRepository$getAndroidIdFromCollapseKey$2 notificationRepository$getAndroidIdFromCollapseKey$2 = new NotificationRepository$getAndroidIdFromCollapseKey$2(this, str, objectRef2, null);
                    notificationRepository$getAndroidIdFromCollapseKey$1.L$0 = objectRef2;
                    notificationRepository$getAndroidIdFromCollapseKey$1.label = 1;
                    if (BuildersKt.withContext(io2, notificationRepository$getAndroidIdFromCollapseKey$2, notificationRepository$getAndroidIdFromCollapseKey$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) notificationRepository$getAndroidIdFromCollapseKey$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        notificationRepository$getAndroidIdFromCollapseKey$1 = new NotificationRepository$getAndroidIdFromCollapseKey$1(this, continuation);
        Object obj2 = notificationRepository$getAndroidIdFromCollapseKey$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepository$getAndroidIdFromCollapseKey$1.label;
        if (i != 0) {
        }
        return objectRef.element;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object clearOldestOverLimitFallback(int i, int i2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new NotificationRepository$clearOldestOverLimitFallback$2(i2, this, i, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, Continuation<? super List<INotificationRepository.NotificationData>> continuation) {
        NotificationRepository$listNotificationsForGroup$1 notificationRepository$listNotificationsForGroup$1;
        int i;
        if (continuation instanceof NotificationRepository$listNotificationsForGroup$1) {
            notificationRepository$listNotificationsForGroup$1 = (NotificationRepository$listNotificationsForGroup$1) continuation;
            if ((notificationRepository$listNotificationsForGroup$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$listNotificationsForGroup$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$listNotificationsForGroup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRepository$listNotificationsForGroup$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) notificationRepository$listNotificationsForGroup$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return list;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                NotificationRepository$listNotificationsForGroup$2 notificationRepository$listNotificationsForGroup$2 = new NotificationRepository$listNotificationsForGroup$2(str, this, arrayList, null);
                notificationRepository$listNotificationsForGroup$1.L$0 = arrayList;
                notificationRepository$listNotificationsForGroup$1.label = 1;
                return BuildersKt.withContext(io2, notificationRepository$listNotificationsForGroup$2, notificationRepository$listNotificationsForGroup$1) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        notificationRepository$listNotificationsForGroup$1 = new NotificationRepository$listNotificationsForGroup$1(this, continuation);
        Object obj2 = notificationRepository$listNotificationsForGroup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepository$listNotificationsForGroup$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z, Continuation<? super Integer> continuation) {
        NotificationRepository$getAndroidIdForGroup$1 notificationRepository$getAndroidIdForGroup$1;
        int i;
        String str2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof NotificationRepository$getAndroidIdForGroup$1) {
            notificationRepository$getAndroidIdForGroup$1 = (NotificationRepository$getAndroidIdForGroup$1) continuation;
            if ((notificationRepository$getAndroidIdForGroup$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$getAndroidIdForGroup$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$getAndroidIdForGroup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRepository$getAndroidIdForGroup$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    boolean areEqual = Intrinsics.areEqual(str, NotificationHelper.GROUPLESS_SUMMARY_KEY);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = areEqual ? "group_id IS NULL" : "group_id = ?";
                    objectRef3.element = ((String) objectRef3.element) + " AND dismissed = 0 AND opened = 0 AND ";
                    StringBuilder append = new StringBuilder().append((String) objectRef3.element);
                    if (z) {
                        str2 = "is_summary = 1";
                    } else {
                        str2 = "is_summary = 0";
                    }
                    objectRef3.element = append.append(str2).toString();
                    String[] strArr = areEqual ? null : new String[]{str};
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    NotificationRepository$getAndroidIdForGroup$2 notificationRepository$getAndroidIdForGroup$2 = new NotificationRepository$getAndroidIdForGroup$2(this, objectRef3, strArr, objectRef2, null);
                    notificationRepository$getAndroidIdForGroup$1.L$0 = objectRef2;
                    notificationRepository$getAndroidIdForGroup$1.label = 1;
                    if (BuildersKt.withContext(io2, notificationRepository$getAndroidIdForGroup$2, notificationRepository$getAndroidIdForGroup$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) notificationRepository$getAndroidIdForGroup$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        notificationRepository$getAndroidIdForGroup$1 = new NotificationRepository$getAndroidIdForGroup$1(this, continuation);
        Object obj2 = notificationRepository$getAndroidIdForGroup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepository$getAndroidIdForGroup$1.label;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, Continuation<? super List<INotificationRepository.NotificationData>> continuation) {
        NotificationRepository$listNotificationsForOutstanding$1 notificationRepository$listNotificationsForOutstanding$1;
        int i;
        if (continuation instanceof NotificationRepository$listNotificationsForOutstanding$1) {
            notificationRepository$listNotificationsForOutstanding$1 = (NotificationRepository$listNotificationsForOutstanding$1) continuation;
            if ((notificationRepository$listNotificationsForOutstanding$1.label & Integer.MIN_VALUE) != 0) {
                notificationRepository$listNotificationsForOutstanding$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRepository$listNotificationsForOutstanding$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRepository$listNotificationsForOutstanding$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) notificationRepository$listNotificationsForOutstanding$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return list2;
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                NotificationRepository$listNotificationsForOutstanding$2 notificationRepository$listNotificationsForOutstanding$2 = new NotificationRepository$listNotificationsForOutstanding$2(this, list, arrayList, null);
                notificationRepository$listNotificationsForOutstanding$1.L$0 = arrayList;
                notificationRepository$listNotificationsForOutstanding$1.label = 1;
                return BuildersKt.withContext(io2, notificationRepository$listNotificationsForOutstanding$2, notificationRepository$listNotificationsForOutstanding$1) == coroutine_suspended ? coroutine_suspended : arrayList;
            }
        }
        notificationRepository$listNotificationsForOutstanding$1 = new NotificationRepository$listNotificationsForOutstanding$1(this, continuation);
        Object obj2 = notificationRepository$listNotificationsForOutstanding$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRepository$listNotificationsForOutstanding$1.label;
        if (i == 0) {
        }
    }

    /* compiled from: NotificationRepository.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/data/impl/NotificationRepository$Companion;", "", "()V", "COLUMNS_FOR_LIST_NOTIFICATIONS", "", "", "getCOLUMNS_FOR_LIST_NOTIFICATIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "NOTIFICATION_CACHE_DATA_LIFETIME", "", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return NotificationRepository.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }
    }
}
