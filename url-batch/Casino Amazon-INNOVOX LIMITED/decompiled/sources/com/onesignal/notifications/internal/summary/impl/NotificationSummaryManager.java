package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: NotificationSummaryManager.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/onesignal/notifications/internal/summary/impl/NotificationSummaryManager;", "Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_summaryNotificationDisplayer", "Lcom/onesignal/notifications/internal/display/ISummaryNotificationDisplayer;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_notificationRestoreProcessor", "Lcom/onesignal/notifications/internal/restoration/INotificationRestoreProcessor;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/notifications/internal/display/ISummaryNotificationDisplayer;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/notifications/internal/restoration/INotificationRestoreProcessor;Lcom/onesignal/core/internal/time/ITime;)V", "clearNotificationOnSummaryClick", "", "group", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalUpdateSummaryNotificationAfterChildRemoved", "dismissed", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restoreSummary", "updatePossibleDependentSummaryOnDismiss", NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSummaryNotificationAfterChildRemoved", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationSummaryManager implements INotificationSummaryManager {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationRestoreProcessor _notificationRestoreProcessor;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;
    private final ITime _time;

    public NotificationSummaryManager(IApplicationService _applicationService, INotificationRepository _dataController, ISummaryNotificationDisplayer _summaryNotificationDisplayer, ConfigModelStore _configModelStore, INotificationRestoreProcessor _notificationRestoreProcessor, ITime _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i, Continuation<? super Unit> continuation) {
        NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1;
        int i2;
        NotificationSummaryManager notificationSummaryManager;
        String str;
        if (continuation instanceof NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1) {
            notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 = (NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1) continuation;
            if ((notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label -= Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0 = this;
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label = 1;
                    obj = iNotificationRepository.getGroupId(i, notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1);
                    if (obj != coroutine_suspended) {
                        notificationSummaryManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0;
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                if (str != null) {
                    return Unit.INSTANCE;
                }
                notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0 = null;
                notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label = 2;
            }
        }
        notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 = new NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1(this, continuation);
        Object obj2 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label;
        if (i2 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, Continuation<? super Unit> continuation) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z, continuation);
        return internalUpdateSummaryNotificationAfterChildRemoved == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? internalUpdateSummaryNotificationAfterChildRemoved : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(4:14|15|16|17)(2:20|21))(3:22|23|24))(3:25|26|27))(3:28|29|(3:31|(1:33)(1:(1:37)(1:39))|35)(2:41|42)))(1:43))(3:47|(1:49)|35)|44|(3:46|29|(0)(0))|35))|53|6|7|(0)(0)|44|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (com.onesignal.notifications.internal.data.INotificationRepository.DefaultImpls.markAsConsumed$default(r1, r14, r13, null, false, r6, 12, null) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (r8.restoreSummary(r5, r6) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        if (r12.updateSummaryNotification(r14, r6) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z, Continuation<? super Unit> continuation) {
        NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
        Object coroutine_suspended;
        int i;
        NotificationSummaryManager notificationSummaryManager;
        List list;
        Object androidIdForGroup;
        String str2;
        int i2;
        Integer num;
        if (continuation instanceof NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1) {
            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 = (NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1) continuation;
            if ((notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1.label & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1.label -= Integer.MIN_VALUE;
                NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
                Object obj = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = this;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = str;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0 = z;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12);
                    if (obj != coroutine_suspended) {
                        notificationSummaryManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    i2 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.I$0;
                    z = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0;
                    list = (List) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2;
                    str2 = (String) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1;
                    notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    num = (Integer) obj;
                    if (num != null) {
                        return Unit.INSTANCE;
                    }
                    int intValue = num.intValue();
                    if (i2 == 0) {
                        NotificationHelper.INSTANCE.getNotificationManager(notificationSummaryManager._applicationService.getAppContext()).cancel(intValue);
                        INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 3;
                    } else if (i2 == 1) {
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 4;
                    } else {
                        INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) CollectionsKt.first(list);
                        NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(new JSONObject(notificationData.getFullData()), notificationSummaryManager._time);
                        notificationGenerationJob.setRestoring(true);
                        notificationGenerationJob.setShownTimeStamp(Boxing.boxLong(notificationData.getCreatedAt()));
                        ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationSummaryManager._summaryNotificationDisplayer;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 5;
                    }
                    return coroutine_suspended;
                }
                z = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0;
                str = (String) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1;
                NotificationSummaryManager notificationSummaryManager2 = (NotificationSummaryManager) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0;
                ResultKt.throwOnFailure(obj);
                notificationSummaryManager = notificationSummaryManager2;
                list = (List) obj;
                int size = list.size();
                INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = notificationSummaryManager;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = str;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = list;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0 = z;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.I$0 = size;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 2;
                androidIdForGroup = iNotificationRepository3.getAndroidIdForGroup(str, true, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12);
                if (androidIdForGroup != coroutine_suspended) {
                    str2 = str;
                    i2 = size;
                    obj = androidIdForGroup;
                    num = (Integer) obj;
                    if (num != null) {
                    }
                }
                return coroutine_suspended;
            }
        }
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 = new NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1(this, continuation);
        NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
        Object obj2 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.label;
        if (i != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        INotificationRepository iNotificationRepository32 = notificationSummaryManager._dataController;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$0 = notificationSummaryManager;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$1 = str;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$2 = list;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.Z$0 = z;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.I$0 = size2;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.label = 2;
        androidIdForGroup = iNotificationRepository32.getAndroidIdForGroup(str, true, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122);
        if (androidIdForGroup != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, Continuation<? super Unit> continuation) {
        NotificationSummaryManager$restoreSummary$1 notificationSummaryManager$restoreSummary$1;
        int i;
        NotificationSummaryManager notificationSummaryManager;
        NotificationSummaryManager notificationSummaryManager2;
        Iterator it;
        if (continuation instanceof NotificationSummaryManager$restoreSummary$1) {
            notificationSummaryManager$restoreSummary$1 = (NotificationSummaryManager$restoreSummary$1) continuation;
            if ((notificationSummaryManager$restoreSummary$1.label & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$restoreSummary$1.label -= Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$restoreSummary$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationSummaryManager$restoreSummary$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$restoreSummary$1.L$0 = this;
                    notificationSummaryManager$restoreSummary$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationSummaryManager$restoreSummary$1);
                    if (obj != coroutine_suspended) {
                        notificationSummaryManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) notificationSummaryManager$restoreSummary$1.L$1;
                    notificationSummaryManager2 = (NotificationSummaryManager) notificationSummaryManager$restoreSummary$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    NotificationSummaryManager$restoreSummary$1 notificationSummaryManager$restoreSummary$12 = notificationSummaryManager$restoreSummary$1;
                    while (it.hasNext()) {
                        INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                        INotificationRestoreProcessor iNotificationRestoreProcessor = notificationSummaryManager2._notificationRestoreProcessor;
                        notificationSummaryManager$restoreSummary$12.L$0 = notificationSummaryManager2;
                        notificationSummaryManager$restoreSummary$12.L$1 = it;
                        notificationSummaryManager$restoreSummary$12.label = 2;
                        if (INotificationRestoreProcessor.DefaultImpls.processNotification$default(iNotificationRestoreProcessor, notificationData, 0, notificationSummaryManager$restoreSummary$12, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$restoreSummary$1.L$0;
                ResultKt.throwOnFailure(obj);
                notificationSummaryManager2 = notificationSummaryManager;
                it = ((List) obj).iterator();
                NotificationSummaryManager$restoreSummary$1 notificationSummaryManager$restoreSummary$122 = notificationSummaryManager$restoreSummary$1;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        notificationSummaryManager$restoreSummary$1 = new NotificationSummaryManager$restoreSummary$1(this, continuation);
        Object obj2 = notificationSummaryManager$restoreSummary$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationSummaryManager$restoreSummary$1.label;
        if (i != 0) {
        }
        notificationSummaryManager2 = notificationSummaryManager;
        it = ((List) obj2).iterator();
        NotificationSummaryManager$restoreSummary$1 notificationSummaryManager$restoreSummary$1222 = notificationSummaryManager$restoreSummary$1;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (r11.markAsDismissed(r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, Continuation<? super Unit> continuation) {
        NotificationSummaryManager$clearNotificationOnSummaryClick$1 notificationSummaryManager$clearNotificationOnSummaryClick$1;
        int i;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        NotificationSummaryManager notificationSummaryManager;
        Integer num;
        NotificationManager notificationManager2;
        Integer boxInt;
        if (continuation instanceof NotificationSummaryManager$clearNotificationOnSummaryClick$1) {
            notificationSummaryManager$clearNotificationOnSummaryClick$1 = (NotificationSummaryManager$clearNotificationOnSummaryClick$1) continuation;
            if ((notificationSummaryManager$clearNotificationOnSummaryClick$1.label & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$clearNotificationOnSummaryClick$1.label -= Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$clearNotificationOnSummaryClick$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationSummaryManager$clearNotificationOnSummaryClick$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    notificationManager = NotificationHelper.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = this;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = str;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = notificationManager;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 1;
                    androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(str, false, notificationSummaryManager$clearNotificationOnSummaryClick$1);
                    if (androidIdForGroup != coroutine_suspended) {
                        notificationSummaryManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    notificationManager2 = (NotificationManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Integer num2 = (Integer) obj;
                    notificationManager = notificationManager2;
                    boxInt = num2;
                    if (boxInt != null) {
                        notificationManager.cancel(boxInt.intValue());
                    }
                    return Unit.INSTANCE;
                }
                NotificationManager notificationManager3 = (NotificationManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2;
                String str2 = (String) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1;
                notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0;
                ResultKt.throwOnFailure(obj);
                notificationManager = notificationManager3;
                str = str2;
                androidIdForGroup = obj;
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (notificationSummaryManager._configModelStore.getModel().getClearGroupOnSummaryClick()) {
                        if (Intrinsics.areEqual(str, NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
                            boxInt = Boxing.boxInt(NotificationHelper.GROUPLESS_SUMMARY_ID);
                            if (boxInt != null) {
                            }
                        } else {
                            INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                            notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = notificationManager;
                            notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = null;
                            notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = null;
                            notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 2;
                            Object androidIdForGroup2 = iNotificationRepository2.getAndroidIdForGroup(str, true, notificationSummaryManager$clearNotificationOnSummaryClick$1);
                            if (androidIdForGroup2 != coroutine_suspended) {
                                NotificationManager notificationManager4 = notificationManager;
                                obj = androidIdForGroup2;
                                notificationManager2 = notificationManager4;
                                Integer num22 = (Integer) obj;
                                notificationManager = notificationManager2;
                                boxInt = num22;
                                if (boxInt != null) {
                                }
                            }
                        }
                    } else {
                        INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
                        int intValue = num.intValue();
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 3;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        notificationSummaryManager$clearNotificationOnSummaryClick$1 = new NotificationSummaryManager$clearNotificationOnSummaryClick$1(this, continuation);
        Object obj2 = notificationSummaryManager$clearNotificationOnSummaryClick$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationSummaryManager$clearNotificationOnSummaryClick$1.label;
        if (i != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return Unit.INSTANCE;
    }
}
