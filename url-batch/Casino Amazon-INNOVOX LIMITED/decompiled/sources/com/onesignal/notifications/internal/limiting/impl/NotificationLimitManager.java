package com.onesignal.notifications.internal.limiting.impl;

import android.service.notification.StatusBarNotification;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationLimitManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0083@¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/notifications/internal/limiting/impl/NotificationLimitManager;", "Lcom/onesignal/notifications/internal/limiting/INotificationLimitManager;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_notificationSummaryManager", "Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;", "(Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;)V", "clearOldestOverLimit", "", "notificationsToMakeRoomFor", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldestOverLimitStandard", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationLimitManager implements INotificationLimitManager {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationSummaryManager _notificationSummaryManager;

    public NotificationLimitManager(INotificationRepository _dataController, IApplicationService _applicationService, INotificationSummaryManager _notificationSummaryManager) {
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        this._dataController = _dataController;
        this._applicationService = _applicationService;
        this._notificationSummaryManager = _notificationSummaryManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r7.clearOldestOverLimitFallback(r6, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (clearOldestOverLimitStandard(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.limiting.INotificationLimitManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearOldestOverLimit(int i, Continuation<? super Unit> continuation) {
        NotificationLimitManager$clearOldestOverLimit$1 notificationLimitManager$clearOldestOverLimit$1;
        int i2;
        NotificationLimitManager notificationLimitManager;
        if (continuation instanceof NotificationLimitManager$clearOldestOverLimit$1) {
            notificationLimitManager$clearOldestOverLimit$1 = (NotificationLimitManager$clearOldestOverLimit$1) continuation;
            if ((notificationLimitManager$clearOldestOverLimit$1.label & Integer.MIN_VALUE) != 0) {
                notificationLimitManager$clearOldestOverLimit$1.label -= Integer.MIN_VALUE;
                Object obj = notificationLimitManager$clearOldestOverLimit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = notificationLimitManager$clearOldestOverLimit$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = this;
                        notificationLimitManager$clearOldestOverLimit$1.I$0 = i;
                        notificationLimitManager$clearOldestOverLimit$1.label = 1;
                    } catch (Throwable unused) {
                        notificationLimitManager = this;
                        INotificationRepository iNotificationRepository = notificationLimitManager._dataController;
                        int maxNumberOfNotifications = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = null;
                        notificationLimitManager$clearOldestOverLimit$1.label = 3;
                    }
                } else if (i2 == 1 || i2 == 2) {
                    i = notificationLimitManager$clearOldestOverLimit$1.I$0;
                    notificationLimitManager = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable unused2) {
                        INotificationRepository iNotificationRepository2 = notificationLimitManager._dataController;
                        int maxNumberOfNotifications2 = INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications();
                        notificationLimitManager$clearOldestOverLimit$1.L$0 = null;
                        notificationLimitManager$clearOldestOverLimit$1.label = 3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        notificationLimitManager$clearOldestOverLimit$1 = new NotificationLimitManager$clearOldestOverLimit$1(this, continuation);
        Object obj2 = notificationLimitManager$clearOldestOverLimit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = notificationLimitManager$clearOldestOverLimit$1.label;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0101 -> B:11:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0105 -> B:12:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearOldestOverLimitStandard(int i, Continuation<? super Unit> continuation) throws Throwable {
        NotificationLimitManager$clearOldestOverLimitStandard$1 notificationLimitManager$clearOldestOverLimitStandard$1;
        int i2;
        int length;
        Iterator it;
        NotificationLimitManager notificationLimitManager;
        int i3;
        NotificationLimitManager notificationLimitManager2;
        Iterator it2;
        Integer num;
        if (continuation instanceof NotificationLimitManager$clearOldestOverLimitStandard$1) {
            notificationLimitManager$clearOldestOverLimitStandard$1 = (NotificationLimitManager$clearOldestOverLimitStandard$1) continuation;
            if ((notificationLimitManager$clearOldestOverLimitStandard$1.label & Integer.MIN_VALUE) != 0) {
                notificationLimitManager$clearOldestOverLimitStandard$1.label -= Integer.MIN_VALUE;
                Object obj = notificationLimitManager$clearOldestOverLimitStandard$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = notificationLimitManager$clearOldestOverLimitStandard$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    StatusBarNotification[] activeNotifications = NotificationHelper.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
                    length = (activeNotifications.length - INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()) + i;
                    if (length < 1) {
                        return Unit.INSTANCE;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (!NotificationHelper.INSTANCE.isGroupSummary(statusBarNotification)) {
                            treeMap.put(Boxing.boxLong(statusBarNotification.getNotification().when), Boxing.boxInt(statusBarNotification.getId()));
                        }
                    }
                    it = treeMap.entrySet().iterator();
                    notificationLimitManager = this;
                    if (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = notificationLimitManager$clearOldestOverLimitStandard$1.I$0;
                    Iterator it3 = (Iterator) notificationLimitManager$clearOldestOverLimitStandard$1.L$1;
                    NotificationLimitManager notificationLimitManager3 = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimitStandard$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    notificationLimitManager = notificationLimitManager3;
                    int i4 = i3 - 1;
                    if (i4 > 0) {
                        Iterator it4 = it3;
                        length = i4;
                        it = it4;
                        if (it.hasNext()) {
                            Integer num2 = (Integer) ((Map.Entry) it.next()).getValue();
                            INotificationRepository iNotificationRepository = notificationLimitManager._dataController;
                            Intrinsics.checkNotNull(num2);
                            int intValue = num2.intValue();
                            notificationLimitManager$clearOldestOverLimitStandard$1.L$0 = notificationLimitManager;
                            notificationLimitManager$clearOldestOverLimitStandard$1.L$1 = it;
                            notificationLimitManager$clearOldestOverLimitStandard$1.L$2 = num2;
                            notificationLimitManager$clearOldestOverLimitStandard$1.I$0 = length;
                            notificationLimitManager$clearOldestOverLimitStandard$1.label = 1;
                            Object markAsDismissed = iNotificationRepository.markAsDismissed(intValue, notificationLimitManager$clearOldestOverLimitStandard$1);
                            if (markAsDismissed != coroutine_suspended) {
                                it2 = it;
                                i3 = length;
                                num = num2;
                                notificationLimitManager2 = notificationLimitManager;
                                obj = markAsDismissed;
                                if (((Boolean) obj).booleanValue()) {
                                    it3 = it2;
                                    notificationLimitManager = notificationLimitManager2;
                                    int i42 = i3 - 1;
                                    if (i42 > 0) {
                                    }
                                } else {
                                    INotificationSummaryManager iNotificationSummaryManager = notificationLimitManager2._notificationSummaryManager;
                                    Intrinsics.checkNotNull(num);
                                    int intValue2 = num.intValue();
                                    notificationLimitManager$clearOldestOverLimitStandard$1.L$0 = notificationLimitManager2;
                                    notificationLimitManager$clearOldestOverLimitStandard$1.L$1 = it2;
                                    notificationLimitManager$clearOldestOverLimitStandard$1.L$2 = null;
                                    notificationLimitManager$clearOldestOverLimitStandard$1.I$0 = i3;
                                    notificationLimitManager$clearOldestOverLimitStandard$1.label = 2;
                                    if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(intValue2, notificationLimitManager$clearOldestOverLimitStandard$1) != coroutine_suspended) {
                                        it3 = it2;
                                        notificationLimitManager3 = notificationLimitManager2;
                                        notificationLimitManager = notificationLimitManager3;
                                        int i422 = i3 - 1;
                                        if (i422 > 0) {
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                i3 = notificationLimitManager$clearOldestOverLimitStandard$1.I$0;
                num = (Integer) notificationLimitManager$clearOldestOverLimitStandard$1.L$2;
                it2 = (Iterator) notificationLimitManager$clearOldestOverLimitStandard$1.L$1;
                notificationLimitManager2 = (NotificationLimitManager) notificationLimitManager$clearOldestOverLimitStandard$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        notificationLimitManager$clearOldestOverLimitStandard$1 = new NotificationLimitManager$clearOldestOverLimitStandard$1(this, continuation);
        Object obj2 = notificationLimitManager$clearOldestOverLimitStandard$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = notificationLimitManager$clearOldestOverLimitStandard$1.label;
        if (i2 != 0) {
        }
    }
}
