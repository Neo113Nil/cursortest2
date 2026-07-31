package com.onesignal.notifications.internal.restoration.impl;

import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import org.json.JSONObject;

/* compiled from: NotificationRestoreProcessor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreProcessor;", "Lcom/onesignal/notifications/internal/restoration/INotificationRestoreProcessor;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_workManager", "Lcom/onesignal/notifications/internal/generation/INotificationGenerationWorkManager;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_badgeCountUpdater", "Lcom/onesignal/notifications/internal/badges/IBadgeCountUpdater;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/generation/INotificationGenerationWorkManager;Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/notifications/internal/badges/IBadgeCountUpdater;)V", "getVisibleNotifications", "", "", "process", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNotification", OneSignalDbContract.NotificationTable.TABLE_NAME, "Lcom/onesignal/notifications/internal/data/INotificationRepository$NotificationData;", "delay", "(Lcom/onesignal/notifications/internal/data/INotificationRepository$NotificationData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationRestoreProcessor implements INotificationRestoreProcessor {
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final INotificationRepository _dataController;
    private final INotificationGenerationWorkManager _workManager;

    public NotificationRestoreProcessor(IApplicationService _applicationService, INotificationGenerationWorkManager _workManager, INotificationRepository _dataController, IBadgeCountUpdater _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(2:35|19)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:12:0x0031, B:14:0x0068, B:16:0x006e, B:23:0x0083, B:30:0x0041, B:31:0x0060, B:33:0x004e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(Continuation<? super Unit> continuation) {
        NotificationRestoreProcessor$process$1 notificationRestoreProcessor$process$1;
        int i;
        NotificationRestoreProcessor notificationRestoreProcessor;
        NotificationRestoreProcessor notificationRestoreProcessor2;
        Iterator it;
        if (continuation instanceof NotificationRestoreProcessor$process$1) {
            notificationRestoreProcessor$process$1 = (NotificationRestoreProcessor$process$1) continuation;
            if ((notificationRestoreProcessor$process$1.label & Integer.MIN_VALUE) != 0) {
                notificationRestoreProcessor$process$1.label -= Integer.MIN_VALUE;
                Object obj = notificationRestoreProcessor$process$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationRestoreProcessor$process$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationRestoreProcessor$process$1.L$0 = this;
                    notificationRestoreProcessor$process$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForOutstanding(visibleNotifications, notificationRestoreProcessor$process$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    notificationRestoreProcessor = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) notificationRestoreProcessor$process$1.L$1;
                        notificationRestoreProcessor2 = (NotificationRestoreProcessor) notificationRestoreProcessor$process$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                            notificationRestoreProcessor$process$1.L$0 = notificationRestoreProcessor2;
                            notificationRestoreProcessor$process$1.L$1 = it;
                            notificationRestoreProcessor$process$1.label = 2;
                            if (notificationRestoreProcessor2.processNotification(notificationData, 200, notificationRestoreProcessor$process$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        notificationRestoreProcessor2._badgeCountUpdater.update();
                        return Unit.INSTANCE;
                    }
                    notificationRestoreProcessor = (NotificationRestoreProcessor) notificationRestoreProcessor$process$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                notificationRestoreProcessor2 = notificationRestoreProcessor;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                notificationRestoreProcessor2._badgeCountUpdater.update();
                return Unit.INSTANCE;
            }
        }
        notificationRestoreProcessor$process$1 = new NotificationRestoreProcessor$process$1(this, continuation);
        Object obj2 = notificationRestoreProcessor$process$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationRestoreProcessor$process$1.label;
        if (i != 0) {
        }
        notificationRestoreProcessor2 = notificationRestoreProcessor;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        notificationRestoreProcessor2._badgeCountUpdater.update();
        return Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor
    public Object processNotification(INotificationRepository.NotificationData notificationData, int i, Continuation<? super Unit> continuation) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), notificationData.getId(), notificationData.getAndroidId(), new JSONObject(notificationData.getFullData()), notificationData.getCreatedAt(), true, false);
        if (i > 0) {
            Object delay = DelayKt.delay(i, continuation);
            return delay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }
}
