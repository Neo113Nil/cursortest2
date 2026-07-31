package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.WorkRequest;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.notifications.internal.NotificationReceivedEvent;
import com.onesignal.notifications.internal.NotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationGenerationProcessor.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"J&\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"J(\u0010)\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020!2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010'J6\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u00103J\u001e\u00104\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!2\u0006\u00105\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0002R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationProcessor;", "Lcom/onesignal/notifications/internal/generation/INotificationGenerationProcessor;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_notificationDisplayer", "Lcom/onesignal/notifications/internal/display/INotificationDisplayer;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_notificationSummaryManager", "Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;", "_lifecycleService", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/display/INotificationDisplayer;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;Lcom/onesignal/core/internal/time/ITime;)V", "EXTERNAL_CALLBACKS_TIMEOUT", "", "getEXTERNAL_CALLBACKS_TIMEOUT", "()J", "getCustomJSONObject", "Lorg/json/JSONObject;", "jsonObject", "isDuplicateNotification", "", OneSignalDbContract.NotificationTable.TABLE_NAME, "Lcom/onesignal/notifications/internal/Notification;", "(Lcom/onesignal/notifications/internal/Notification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNotificationWithinTTL", "markNotificationAsDismissed", "", "notifiJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postProcessNotification", "notificationJob", "wasOpened", "wasDisplayed", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processCollapseKey", "processHandlerResponse", "wantsToDisplay", "isRestoring", "processNotificationData", "context", "Landroid/content/Context;", NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, "", "jsonPayload", "timestamp", "(Landroid/content/Context;ILorg/json/JSONObject;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNotification", OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldDisplayNotification", "shouldFireForegroundHandlers", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationGenerationProcessor implements INotificationGenerationProcessor {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationSummaryManager _notificationSummaryManager;
    private final ITime _time;

    private final long getEXTERNAL_CALLBACKS_TIMEOUT() {
        return WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    }

    public NotificationGenerationProcessor(IApplicationService _applicationService, INotificationDisplayer _notificationDisplayer, ConfigModelStore _configModelStore, INotificationRepository _dataController, INotificationSummaryManager _notificationSummaryManager, INotificationLifecycleService _lifecycleService, ITime _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationSummaryManager, "_notificationSummaryManager");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0334, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(100, r3) == r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x031d, code lost:
    
        if (r12.postProcessNotification(r9, false, r2, r3) == r4) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02bf, code lost:
    
        if (r8 == r4) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    @Override // com.onesignal.notifications.internal.generation.INotificationGenerationProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i, JSONObject jSONObject, boolean z, long j, Continuation<? super Unit> continuation) {
        NotificationGenerationProcessor$processNotificationData$1 notificationGenerationProcessor$processNotificationData$1;
        int i2;
        boolean z2;
        NotificationGenerationProcessor notificationGenerationProcessor;
        long j2;
        JSONObject jSONObject2;
        Context context2;
        boolean z3;
        Object obj;
        boolean z4;
        long j3;
        Notification notification;
        NotificationGenerationJob notificationGenerationJob;
        Ref.BooleanRef booleanRef;
        Notification notification2;
        Ref.BooleanRef booleanRef2;
        Notification notification3;
        NotificationGenerationJob notificationGenerationJob2;
        Ref.BooleanRef booleanRef3;
        int i3;
        long external_callbacks_timeout;
        NotificationGenerationProcessor$processNotificationData$2 notificationGenerationProcessor$processNotificationData$2;
        Notification notification4;
        NotificationGenerationProcessor notificationGenerationProcessor2;
        int i4;
        Ref.BooleanRef booleanRef4;
        boolean z5;
        NotificationGenerationJob notificationGenerationJob3;
        NotificationGenerationProcessor notificationGenerationProcessor3;
        Notification notification5;
        int i5;
        Boolean bool;
        boolean booleanValue;
        boolean z6;
        int i6;
        NotificationGenerationJob notificationGenerationJob4;
        boolean z7;
        NotificationGenerationProcessor notificationGenerationProcessor4;
        Ref.BooleanRef booleanRef5;
        NotificationGenerationJob notificationGenerationJob5;
        long external_callbacks_timeout2;
        NotificationGenerationProcessor$processNotificationData$3 notificationGenerationProcessor$processNotificationData$3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        NotificationGenerationJob notificationGenerationJob6;
        NotificationGenerationProcessor notificationGenerationProcessor5;
        Object processHandlerResponse;
        int i11;
        boolean z9;
        NotificationGenerationJob notificationGenerationJob7;
        Object obj2;
        int i12;
        if (continuation instanceof NotificationGenerationProcessor$processNotificationData$1) {
            notificationGenerationProcessor$processNotificationData$1 = (NotificationGenerationProcessor$processNotificationData$1) continuation;
            if ((notificationGenerationProcessor$processNotificationData$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processNotificationData$1.label -= Integer.MIN_VALUE;
                Object obj3 = notificationGenerationProcessor$processNotificationData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (notificationGenerationProcessor$processNotificationData$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj3);
                        INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = this;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = context;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = jSONObject;
                        i2 = i;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i2;
                        z2 = z;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z2;
                        notificationGenerationProcessor$processNotificationData$1.J$0 = j;
                        notificationGenerationProcessor$processNotificationData$1.label = 1;
                        obj3 = iNotificationLifecycleService.canReceiveNotification(jSONObject, notificationGenerationProcessor$processNotificationData$1);
                        if (obj3 != coroutine_suspended) {
                            notificationGenerationProcessor = this;
                            j2 = j;
                            jSONObject2 = jSONObject;
                            context2 = context;
                            if (((Boolean) obj3).booleanValue()) {
                                return Unit.INSTANCE;
                            }
                            Notification notification6 = new Notification(null, jSONObject2, i2, notificationGenerationProcessor._time);
                            if (!z2) {
                                notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                notificationGenerationProcessor$processNotificationData$1.L$1 = context2;
                                notificationGenerationProcessor$processNotificationData$1.L$2 = jSONObject2;
                                notificationGenerationProcessor$processNotificationData$1.L$3 = notification6;
                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z2;
                                notificationGenerationProcessor$processNotificationData$1.J$0 = j2;
                                notificationGenerationProcessor$processNotificationData$1.label = 2;
                                Object isDuplicateNotification = notificationGenerationProcessor.isDuplicateNotification(notification6, notificationGenerationProcessor$processNotificationData$1);
                                if (isDuplicateNotification != coroutine_suspended) {
                                    obj = isDuplicateNotification;
                                    z4 = z2;
                                    j3 = j2;
                                    notification = notification6;
                                    if (!((Boolean) obj).booleanValue()) {
                                        return Unit.INSTANCE;
                                    }
                                    notification6 = notification;
                                    j2 = j3;
                                    z3 = z4;
                                    notificationGenerationJob = new NotificationGenerationJob(notification6, jSONObject2);
                                    notificationGenerationJob.setShownTimeStamp(Boxing.boxLong(j2));
                                    notificationGenerationJob.setRestoring(z3);
                                    booleanRef = new Ref.BooleanRef();
                                    booleanRef.element = true;
                                    Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                                    try {
                                        NotificationReceivedEvent notificationReceivedEvent = new NotificationReceivedEvent(context2, notification6);
                                        external_callbacks_timeout = notificationGenerationProcessor.getEXTERNAL_CALLBACKS_TIMEOUT();
                                        notification4 = notification6;
                                        notificationGenerationProcessor2 = notificationGenerationProcessor;
                                        try {
                                            notificationGenerationProcessor$processNotificationData$2 = new NotificationGenerationProcessor$processNotificationData$2(notificationGenerationProcessor2, notificationReceivedEvent, booleanRef, notification4, null);
                                            booleanRef2 = booleanRef;
                                            notification2 = notification4;
                                        } catch (TimeoutCancellationException e) {
                                            e = e;
                                            notificationGenerationProcessor = notificationGenerationProcessor2;
                                            booleanRef2 = booleanRef;
                                            notification2 = notification4;
                                        } catch (Throwable th) {
                                            th = th;
                                            notificationGenerationProcessor = notificationGenerationProcessor2;
                                            booleanRef2 = booleanRef;
                                            notification2 = notification4;
                                        }
                                        try {
                                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob;
                                            notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef2;
                                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z3;
                                            notificationGenerationProcessor$processNotificationData$1.I$0 = 0;
                                            notificationGenerationProcessor$processNotificationData$1.label = 3;
                                        } catch (TimeoutCancellationException e2) {
                                            e = e2;
                                            notification3 = notification2;
                                            notificationGenerationJob2 = notificationGenerationJob;
                                            booleanRef3 = booleanRef2;
                                            i3 = 0;
                                            Logging.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + booleanRef3.element + '.', e);
                                            i4 = i3;
                                            boolean z10 = z3;
                                            booleanRef4 = booleanRef3;
                                            boolean z11 = booleanRef4.element;
                                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                                            notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z10;
                                            notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                                            obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z11, z10, notificationGenerationProcessor$processNotificationData$1);
                                            if (obj3 != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            notification3 = notification2;
                                            notificationGenerationJob2 = notificationGenerationJob;
                                            booleanRef3 = booleanRef2;
                                            i3 = 0;
                                            Logging.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                            i4 = i3;
                                            boolean z102 = z3;
                                            booleanRef4 = booleanRef3;
                                            boolean z112 = booleanRef4.element;
                                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                                            notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z102;
                                            notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                                            obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z112, z102, notificationGenerationProcessor$processNotificationData$1);
                                            if (obj3 != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        }
                                    } catch (TimeoutCancellationException e3) {
                                        e = e3;
                                        notification2 = notification6;
                                        booleanRef2 = booleanRef;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        notification2 = notification6;
                                        booleanRef2 = booleanRef;
                                    }
                                    if (TimeoutKt.withTimeout(external_callbacks_timeout, notificationGenerationProcessor$processNotificationData$2, notificationGenerationProcessor$processNotificationData$1) != coroutine_suspended) {
                                        notification3 = notification2;
                                        notificationGenerationJob2 = notificationGenerationJob;
                                        booleanRef3 = booleanRef2;
                                        i4 = 0;
                                        boolean z1022 = z3;
                                        booleanRef4 = booleanRef3;
                                        boolean z1122 = booleanRef4.element;
                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                                        notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                                        notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z1022;
                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                                        notificationGenerationProcessor$processNotificationData$1.label = 4;
                                        obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z1122, z1022, notificationGenerationProcessor$processNotificationData$1);
                                        if (obj3 != coroutine_suspended) {
                                            z5 = z1022;
                                            notificationGenerationJob3 = notificationGenerationJob2;
                                            notificationGenerationProcessor3 = notificationGenerationProcessor;
                                            notification5 = notification3;
                                            i5 = i4;
                                            Ref.BooleanRef booleanRef6 = booleanRef4;
                                            bool = (Boolean) obj3;
                                            if (bool != null) {
                                                return Unit.INSTANCE;
                                            }
                                            booleanValue = bool.booleanValue();
                                            if (booleanValue) {
                                                if (notificationGenerationProcessor3.shouldFireForegroundHandlers(notificationGenerationJob3)) {
                                                    Logging.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                                    z6 = true;
                                                    booleanRef6.element = true;
                                                    try {
                                                        NotificationWillDisplayEvent notificationWillDisplayEvent = new NotificationWillDisplayEvent(notificationGenerationJob3.getNotification());
                                                        external_callbacks_timeout2 = notificationGenerationProcessor3.getEXTERNAL_CALLBACKS_TIMEOUT();
                                                        notificationGenerationProcessor$processNotificationData$3 = new NotificationGenerationProcessor$processNotificationData$3(notificationGenerationProcessor3, notificationWillDisplayEvent, booleanRef6, notification5, null);
                                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor3;
                                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                                                        notificationGenerationProcessor$processNotificationData$1.L$2 = booleanRef6;
                                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i5;
                                                        notificationGenerationProcessor$processNotificationData$1.label = 5;
                                                    } catch (TimeoutCancellationException e4) {
                                                        e = e4;
                                                        z7 = z5;
                                                        notificationGenerationProcessor4 = notificationGenerationProcessor3;
                                                        booleanRef5 = booleanRef6;
                                                        notificationGenerationJob5 = notificationGenerationJob3;
                                                        i8 = i5;
                                                        Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + booleanRef5.element + '.', e);
                                                        i9 = i8;
                                                        i10 = i9;
                                                        z8 = z7;
                                                        notificationGenerationJob6 = notificationGenerationJob5;
                                                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                                        boolean z12 = booleanRef5.element;
                                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                                                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                                                        processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z12, z8, notificationGenerationProcessor$processNotificationData$1);
                                                        break;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        z7 = z5;
                                                        notificationGenerationProcessor4 = notificationGenerationProcessor3;
                                                        booleanRef5 = booleanRef6;
                                                        notificationGenerationJob5 = notificationGenerationJob3;
                                                        i7 = i5;
                                                        Logging.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                                        i9 = i7;
                                                        i10 = i9;
                                                        z8 = z7;
                                                        notificationGenerationJob6 = notificationGenerationJob5;
                                                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                                        boolean z122 = booleanRef5.element;
                                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                                                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                                                        processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z122, z8, notificationGenerationProcessor$processNotificationData$1);
                                                    }
                                                    if (TimeoutKt.withTimeout(external_callbacks_timeout2, notificationGenerationProcessor$processNotificationData$3, notificationGenerationProcessor$processNotificationData$1) != coroutine_suspended) {
                                                        z7 = z5;
                                                        notificationGenerationProcessor4 = notificationGenerationProcessor3;
                                                        booleanRef5 = booleanRef6;
                                                        notificationGenerationJob5 = notificationGenerationJob3;
                                                        i9 = i5;
                                                        i10 = i9;
                                                        z8 = z7;
                                                        notificationGenerationJob6 = notificationGenerationJob5;
                                                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                                        boolean z1222 = booleanRef5.element;
                                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                                                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                                                        processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z1222, z8, notificationGenerationProcessor$processNotificationData$1);
                                                    }
                                                } else {
                                                    z6 = true;
                                                    i6 = i5;
                                                    notificationGenerationJob4 = notificationGenerationJob3;
                                                    if (!booleanValue) {
                                                        INotificationDisplayer iNotificationDisplayer = notificationGenerationProcessor3._notificationDisplayer;
                                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor3;
                                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob4;
                                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                                                        notificationGenerationProcessor$processNotificationData$1.label = 7;
                                                        Object displayNotification = iNotificationDisplayer.displayNotification(notificationGenerationJob4, notificationGenerationProcessor$processNotificationData$1);
                                                        if (displayNotification != coroutine_suspended) {
                                                            notificationGenerationJob7 = notificationGenerationJob4;
                                                            obj2 = displayNotification;
                                                            z9 = z5;
                                                            notificationGenerationJob3 = notificationGenerationJob7;
                                                            i12 = ((Boolean) obj2).booleanValue();
                                                            if (!notificationGenerationJob3.getIsRestoring()) {
                                                                if (i12 == 0) {
                                                                    z6 = false;
                                                                }
                                                                notificationGenerationProcessor$processNotificationData$1.L$0 = null;
                                                                notificationGenerationProcessor$processNotificationData$1.L$1 = null;
                                                                notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                                notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                                                                notificationGenerationProcessor$processNotificationData$1.label = 8;
                                                                break;
                                                            }
                                                            if (!z9) {
                                                                return Unit.INSTANCE;
                                                            }
                                                            notificationGenerationProcessor$processNotificationData$1.L$0 = null;
                                                            notificationGenerationProcessor$processNotificationData$1.L$1 = null;
                                                            notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                                            notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                                            notificationGenerationProcessor$processNotificationData$1.label = 9;
                                                            break;
                                                        }
                                                    } else {
                                                        notificationGenerationJob3 = notificationGenerationJob4;
                                                        i11 = i6;
                                                        z9 = z5;
                                                        i12 = i11;
                                                        if (!notificationGenerationJob3.getIsRestoring()) {
                                                        }
                                                        if (!z9) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                z6 = true;
                                                i11 = i5;
                                                z9 = z5;
                                                i12 = i11;
                                                if (!notificationGenerationJob3.getIsRestoring()) {
                                                }
                                                if (!z9) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                z3 = z2;
                                notificationGenerationJob = new NotificationGenerationJob(notification6, jSONObject2);
                                notificationGenerationJob.setShownTimeStamp(Boxing.boxLong(j2));
                                notificationGenerationJob.setRestoring(z3);
                                booleanRef = new Ref.BooleanRef();
                                booleanRef.element = true;
                                Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                                NotificationReceivedEvent notificationReceivedEvent2 = new NotificationReceivedEvent(context2, notification6);
                                external_callbacks_timeout = notificationGenerationProcessor.getEXTERNAL_CALLBACKS_TIMEOUT();
                                notification4 = notification6;
                                notificationGenerationProcessor2 = notificationGenerationProcessor;
                                notificationGenerationProcessor$processNotificationData$2 = new NotificationGenerationProcessor$processNotificationData$2(notificationGenerationProcessor2, notificationReceivedEvent2, booleanRef, notification4, null);
                                booleanRef2 = booleanRef;
                                notification2 = notification4;
                                notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                                notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                                notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob;
                                notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef2;
                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z3;
                                notificationGenerationProcessor$processNotificationData$1.I$0 = 0;
                                notificationGenerationProcessor$processNotificationData$1.label = 3;
                                if (TimeoutKt.withTimeout(external_callbacks_timeout, notificationGenerationProcessor$processNotificationData$2, notificationGenerationProcessor$processNotificationData$1) != coroutine_suspended) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        long j4 = notificationGenerationProcessor$processNotificationData$1.J$0;
                        boolean z13 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        int i13 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        jSONObject2 = (JSONObject) notificationGenerationProcessor$processNotificationData$1.L$2;
                        context2 = (Context) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        j2 = j4;
                        z2 = z13;
                        i2 = i13;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        break;
                    case 2:
                        j3 = notificationGenerationProcessor$processNotificationData$1.J$0;
                        z4 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        Notification notification7 = (Notification) notificationGenerationProcessor$processNotificationData$1.L$3;
                        jSONObject2 = (JSONObject) notificationGenerationProcessor$processNotificationData$1.L$2;
                        context2 = (Context) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        notification = notification7;
                        obj = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        i3 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z3 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        booleanRef3 = (Ref.BooleanRef) notificationGenerationProcessor$processNotificationData$1.L$3;
                        notificationGenerationJob2 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$2;
                        notification3 = (Notification) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            i4 = i3;
                        } catch (TimeoutCancellationException e5) {
                            e = e5;
                            Logging.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + booleanRef3.element + '.', e);
                            i4 = i3;
                            boolean z10222 = z3;
                            booleanRef4 = booleanRef3;
                            boolean z11222 = booleanRef4.element;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z10222;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                            obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z11222, z10222, notificationGenerationProcessor$processNotificationData$1);
                            if (obj3 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            th = th5;
                            Logging.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i4 = i3;
                            boolean z102222 = z3;
                            booleanRef4 = booleanRef3;
                            boolean z112222 = booleanRef4.element;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z102222;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                            obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z112222, z102222, notificationGenerationProcessor$processNotificationData$1);
                            if (obj3 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        boolean z1022222 = z3;
                        booleanRef4 = booleanRef3;
                        boolean z1122222 = booleanRef4.element;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = notification3;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                        notificationGenerationProcessor$processNotificationData$1.L$3 = booleanRef4;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z1022222;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i4 == true ? 1 : 0;
                        notificationGenerationProcessor$processNotificationData$1.label = 4;
                        obj3 = notificationGenerationProcessor.processHandlerResponse(notificationGenerationJob2, z1122222, z1022222, notificationGenerationProcessor$processNotificationData$1);
                        if (obj3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        int i14 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        boolean z14 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        booleanRef4 = (Ref.BooleanRef) notificationGenerationProcessor$processNotificationData$1.L$3;
                        NotificationGenerationJob notificationGenerationJob8 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$2;
                        Notification notification8 = (Notification) notificationGenerationProcessor$processNotificationData$1.L$1;
                        NotificationGenerationProcessor notificationGenerationProcessor6 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        z5 = z14;
                        notificationGenerationJob3 = notificationGenerationJob8;
                        notification5 = notification8;
                        notificationGenerationProcessor3 = notificationGenerationProcessor6;
                        i5 = i14;
                        Ref.BooleanRef booleanRef62 = booleanRef4;
                        bool = (Boolean) obj3;
                        if (bool != null) {
                        }
                        break;
                    case 5:
                        int i15 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z7 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        booleanRef5 = (Ref.BooleanRef) notificationGenerationProcessor$processNotificationData$1.L$2;
                        notificationGenerationJob5 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor4 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            z6 = true;
                            i9 = i15;
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            z6 = true;
                            i8 = i15;
                            Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + booleanRef5.element + '.', e);
                            i9 = i8;
                            i10 = i9;
                            z8 = z7;
                            notificationGenerationJob6 = notificationGenerationJob5;
                            notificationGenerationProcessor5 = notificationGenerationProcessor4;
                            boolean z12222 = booleanRef5.element;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                            notificationGenerationProcessor$processNotificationData$1.label = 6;
                            processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z12222, z8, notificationGenerationProcessor$processNotificationData$1);
                            break;
                        } catch (Throwable th6) {
                            th = th6;
                            z6 = true;
                            i7 = i15;
                            Logging.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i9 = i7;
                            i10 = i9;
                            z8 = z7;
                            notificationGenerationJob6 = notificationGenerationJob5;
                            notificationGenerationProcessor5 = notificationGenerationProcessor4;
                            boolean z122222 = booleanRef5.element;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                            notificationGenerationProcessor$processNotificationData$1.label = 6;
                            processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z122222, z8, notificationGenerationProcessor$processNotificationData$1);
                        }
                        i10 = i9;
                        z8 = z7;
                        notificationGenerationJob6 = notificationGenerationJob5;
                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                        boolean z1222222 = booleanRef5.element;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor5;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob6;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z8;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i10;
                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                        processHandlerResponse = notificationGenerationProcessor5.processHandlerResponse(notificationGenerationJob6, z1222222, z8, notificationGenerationProcessor$processNotificationData$1);
                    case 6:
                        i10 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z8 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        notificationGenerationJob6 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor5 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        processHandlerResponse = obj3;
                        z6 = true;
                        Boolean bool2 = (Boolean) processHandlerResponse;
                        if (bool2 == null) {
                            return Unit.INSTANCE;
                        }
                        NotificationGenerationJob notificationGenerationJob9 = notificationGenerationJob6;
                        i6 = i10;
                        booleanValue = bool2.booleanValue();
                        z5 = z8;
                        notificationGenerationJob4 = notificationGenerationJob9;
                        notificationGenerationProcessor3 = notificationGenerationProcessor5;
                        if (!booleanValue) {
                        }
                        break;
                    case 7:
                        z9 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        NotificationGenerationJob notificationGenerationJob10 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        NotificationGenerationProcessor notificationGenerationProcessor7 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        notificationGenerationProcessor3 = notificationGenerationProcessor7;
                        notificationGenerationJob7 = notificationGenerationJob10;
                        obj2 = obj3;
                        z6 = true;
                        notificationGenerationJob3 = notificationGenerationJob7;
                        i12 = ((Boolean) obj2).booleanValue();
                        if (!notificationGenerationJob3.getIsRestoring()) {
                        }
                        if (!z9) {
                        }
                        break;
                    case 8:
                        z9 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        ResultKt.throwOnFailure(obj3);
                        if (!z9) {
                        }
                        break;
                    case 9:
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        notificationGenerationProcessor$processNotificationData$1 = new NotificationGenerationProcessor$processNotificationData$1(this, continuation);
        Object obj32 = notificationGenerationProcessor$processNotificationData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (notificationGenerationProcessor$processNotificationData$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z2, Continuation<? super Boolean> continuation) {
        NotificationGenerationProcessor$processHandlerResponse$1 notificationGenerationProcessor$processHandlerResponse$1;
        int i;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (continuation instanceof NotificationGenerationProcessor$processHandlerResponse$1) {
            notificationGenerationProcessor$processHandlerResponse$1 = (NotificationGenerationProcessor$processHandlerResponse$1) continuation;
            if ((notificationGenerationProcessor$processHandlerResponse$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processHandlerResponse$1.label -= Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$processHandlerResponse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationGenerationProcessor$processHandlerResponse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(notificationGenerationJob.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(notificationGenerationJob.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            notificationGenerationProcessor$processHandlerResponse$1.L$0 = this;
                            notificationGenerationProcessor$processHandlerResponse$1.L$1 = notificationGenerationJob;
                            notificationGenerationProcessor$processHandlerResponse$1.label = 1;
                            if (processCollapseKey(notificationGenerationJob, notificationGenerationProcessor$processHandlerResponse$1) != coroutine_suspended) {
                                notificationGenerationProcessor = this;
                            }
                            return coroutine_suspended;
                        }
                    }
                    if (z2) {
                        notificationGenerationProcessor$processHandlerResponse$1.label = 2;
                        if (markNotificationAsDismissed(notificationGenerationJob, notificationGenerationProcessor$processHandlerResponse$1) != coroutine_suspended) {
                            return null;
                        }
                    } else {
                        notificationGenerationJob.setNotificationToDisplay(false);
                        notificationGenerationProcessor$processHandlerResponse$1.label = 3;
                        if (postProcessNotification(notificationGenerationJob, true, false, notificationGenerationProcessor$processHandlerResponse$1) != coroutine_suspended) {
                            return null;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
                notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$processHandlerResponse$1.L$1;
                notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processHandlerResponse$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (!notificationGenerationProcessor.shouldDisplayNotification(notificationGenerationJob)) {
                    notificationGenerationJob.setNotificationToDisplay(true);
                    return Boxing.boxBoolean(true);
                }
                return Boxing.boxBoolean(false);
            }
        }
        notificationGenerationProcessor$processHandlerResponse$1 = new NotificationGenerationProcessor$processHandlerResponse$1(this, continuation);
        Object obj2 = notificationGenerationProcessor$processHandlerResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationGenerationProcessor$processHandlerResponse$1.label;
        if (i != 0) {
        }
        if (!notificationGenerationProcessor.shouldDisplayNotification(notificationGenerationJob)) {
        }
    }

    private final boolean isNotificationWithinTTL(Notification notification) {
        if (this._configModelStore.getModel().getRestoreTTLFilter()) {
            return notification.getSentTime() + ((long) notification.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(Notification notification, Continuation<? super Boolean> continuation) {
        return this._dataController.doesNotificationExist(notification.getNotificationId(), continuation);
    }

    private final boolean shouldDisplayNotification(NotificationGenerationJob notificationJob) {
        return notificationJob.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(notificationJob.getJsonPayload().optString("alert"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r8.notificationReceived(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r8.markNotificationAsDismissed(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z2, Continuation<? super Unit> continuation) {
        NotificationGenerationProcessor$postProcessNotification$1 notificationGenerationProcessor$postProcessNotification$1;
        int i;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (continuation instanceof NotificationGenerationProcessor$postProcessNotification$1) {
            notificationGenerationProcessor$postProcessNotification$1 = (NotificationGenerationProcessor$postProcessNotification$1) continuation;
            if ((notificationGenerationProcessor$postProcessNotification$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$postProcessNotification$1.label -= Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$postProcessNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationGenerationProcessor$postProcessNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    notificationGenerationProcessor$postProcessNotification$1.L$0 = this;
                    notificationGenerationProcessor$postProcessNotification$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$postProcessNotification$1.Z$0 = z2;
                    notificationGenerationProcessor$postProcessNotification$1.label = 1;
                    if (saveNotification(notificationGenerationJob, z, notificationGenerationProcessor$postProcessNotification$1) != coroutine_suspended) {
                        notificationGenerationProcessor = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    z2 = notificationGenerationProcessor$postProcessNotification$1.Z$0;
                    notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$postProcessNotification$1.L$1;
                    notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$postProcessNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$postProcessNotification$1.L$1;
                    notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$postProcessNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    INotificationLifecycleService iNotificationLifecycleService = notificationGenerationProcessor._lifecycleService;
                    notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
                    notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
                    notificationGenerationProcessor$postProcessNotification$1.label = 3;
                }
                if (!z2) {
                    notificationGenerationProcessor$postProcessNotification$1.L$0 = notificationGenerationProcessor;
                    notificationGenerationProcessor$postProcessNotification$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$postProcessNotification$1.label = 2;
                }
                INotificationLifecycleService iNotificationLifecycleService2 = notificationGenerationProcessor._lifecycleService;
                notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
                notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
                notificationGenerationProcessor$postProcessNotification$1.label = 3;
            }
        }
        notificationGenerationProcessor$postProcessNotification$1 = new NotificationGenerationProcessor$postProcessNotification$1(this, continuation);
        Object obj2 = notificationGenerationProcessor$postProcessNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationGenerationProcessor$postProcessNotification$1.label;
        if (i != 0) {
        }
        if (!z2) {
        }
        INotificationLifecycleService iNotificationLifecycleService22 = notificationGenerationProcessor._lifecycleService;
        notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
        notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
        notificationGenerationProcessor$postProcessNotification$1.label = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(9:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|(1:30))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(NotificationGenerationJob notificationGenerationJob, boolean z, Continuation<? super Unit> continuation) {
        NotificationGenerationProcessor$saveNotification$1 notificationGenerationProcessor$saveNotification$1;
        int i;
        if (continuation instanceof NotificationGenerationProcessor$saveNotification$1) {
            notificationGenerationProcessor$saveNotification$1 = (NotificationGenerationProcessor$saveNotification$1) continuation;
            if ((notificationGenerationProcessor$saveNotification$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$saveNotification$1.label -= Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$saveNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationGenerationProcessor$saveNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.debug$default("Saving Notification job: " + notificationGenerationJob, null, 2, null);
                    JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has(Constants.MessagePayloadKeys.COLLAPSE_KEY) || Intrinsics.areEqual("do_not_collapse", jsonPayload.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) ? null : jsonPayload.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
                    long optLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt("google.ttl", 259200);
                    INotificationRepository iNotificationRepository = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    String safeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = notificationGenerationJob.getIsNotificationToDisplay();
                    int androidId = notificationGenerationJob.getAndroidId();
                    String valueOf = notificationGenerationJob.getTitle() != null ? String.valueOf(notificationGenerationJob.getTitle()) : null;
                    String valueOf2 = notificationGenerationJob.getBody() != null ? String.valueOf(notificationGenerationJob.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    notificationGenerationProcessor$saveNotification$1.label = 1;
                    if (iNotificationRepository.createNotification(optString2, safeString, optString, isNotificationToDisplay, z, androidId, valueOf, valueOf2, optLong, jSONObject, notificationGenerationProcessor$saveNotification$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        notificationGenerationProcessor$saveNotification$1 = new NotificationGenerationProcessor$saveNotification$1(this, continuation);
        Object obj2 = notificationGenerationProcessor$saveNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationGenerationProcessor$saveNotification$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r8.updatePossibleDependentSummaryOnDismiss(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(NotificationGenerationJob notificationGenerationJob, Continuation<? super Unit> continuation) {
        NotificationGenerationProcessor$markNotificationAsDismissed$1 notificationGenerationProcessor$markNotificationAsDismissed$1;
        Object obj;
        int i;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (continuation instanceof NotificationGenerationProcessor$markNotificationAsDismissed$1) {
            notificationGenerationProcessor$markNotificationAsDismissed$1 = (NotificationGenerationProcessor$markNotificationAsDismissed$1) continuation;
            if ((notificationGenerationProcessor$markNotificationAsDismissed$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$markNotificationAsDismissed$1.label -= Integer.MIN_VALUE;
                obj = notificationGenerationProcessor$markNotificationAsDismissed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationGenerationProcessor$markNotificationAsDismissed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!notificationGenerationJob.getIsNotificationToDisplay()) {
                        return Unit.INSTANCE;
                    }
                    Logging.debug$default("Marking restored or disabled notifications as dismissed: " + notificationGenerationJob, null, 2, null);
                    INotificationRepository iNotificationRepository = this._dataController;
                    int androidId = notificationGenerationJob.getAndroidId();
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$0 = this;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.label = 1;
                    obj = iNotificationRepository.markAsDismissed(androidId, notificationGenerationProcessor$markNotificationAsDismissed$1);
                    if (obj != coroutine_suspended) {
                        notificationGenerationProcessor = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$markNotificationAsDismissed$1.L$1;
                notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$markNotificationAsDismissed$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                INotificationSummaryManager iNotificationSummaryManager = notificationGenerationProcessor._notificationSummaryManager;
                int androidId2 = notificationGenerationJob.getAndroidId();
                notificationGenerationProcessor$markNotificationAsDismissed$1.L$0 = null;
                notificationGenerationProcessor$markNotificationAsDismissed$1.L$1 = null;
                notificationGenerationProcessor$markNotificationAsDismissed$1.label = 2;
            }
        }
        notificationGenerationProcessor$markNotificationAsDismissed$1 = new NotificationGenerationProcessor$markNotificationAsDismissed$1(this, continuation);
        obj = notificationGenerationProcessor$markNotificationAsDismissed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationGenerationProcessor$markNotificationAsDismissed$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(NotificationGenerationJob notificationGenerationJob, Continuation<? super Unit> continuation) {
        NotificationGenerationProcessor$processCollapseKey$1 notificationGenerationProcessor$processCollapseKey$1;
        int i;
        Integer num;
        if (continuation instanceof NotificationGenerationProcessor$processCollapseKey$1) {
            notificationGenerationProcessor$processCollapseKey$1 = (NotificationGenerationProcessor$processCollapseKey$1) continuation;
            if ((notificationGenerationProcessor$processCollapseKey$1.label & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processCollapseKey$1.label -= Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$processCollapseKey$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationGenerationProcessor$processCollapseKey$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (notificationGenerationJob.getIsRestoring()) {
                        return Unit.INSTANCE;
                    }
                    if (!notificationGenerationJob.getJsonPayload().has(Constants.MessagePayloadKeys.COLLAPSE_KEY) || Intrinsics.areEqual("do_not_collapse", notificationGenerationJob.getJsonPayload().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY))) {
                        return Unit.INSTANCE;
                    }
                    String optString = notificationGenerationJob.getJsonPayload().optString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
                    INotificationRepository iNotificationRepository = this._dataController;
                    Intrinsics.checkNotNull(optString);
                    notificationGenerationProcessor$processCollapseKey$1.L$0 = notificationGenerationJob;
                    notificationGenerationProcessor$processCollapseKey$1.label = 1;
                    obj = iNotificationRepository.getAndroidIdFromCollapseKey(optString, notificationGenerationProcessor$processCollapseKey$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$processCollapseKey$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    notificationGenerationJob.getNotification().setAndroidNotificationId(num.intValue());
                }
                return Unit.INSTANCE;
            }
        }
        notificationGenerationProcessor$processCollapseKey$1 = new NotificationGenerationProcessor$processCollapseKey$1(this, continuation);
        Object obj2 = notificationGenerationProcessor$processCollapseKey$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationGenerationProcessor$processCollapseKey$1.label;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return Unit.INSTANCE;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
    }

    private final boolean shouldFireForegroundHandlers(NotificationGenerationJob notificationJob) {
        if (!this._applicationService.isInForeground()) {
            Logging.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!notificationJob.getIsRestoring()) {
            return true;
        }
        Logging.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }
}
