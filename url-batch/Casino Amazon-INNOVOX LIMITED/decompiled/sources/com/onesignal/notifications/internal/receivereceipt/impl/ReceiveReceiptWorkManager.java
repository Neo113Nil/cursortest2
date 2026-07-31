package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptProcessor;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReceiveReceiptWorkManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager;", "Lcom/onesignal/notifications/internal/receivereceipt/IReceiveReceiptWorkManager;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_subscriptionManager", "Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;)V", "maxDelay", "", "minDelay", "buildConstraints", "Landroidx/work/Constraints;", "enqueueReceiveReceipt", "", "notificationId", "", "Companion", "ReceiveReceiptWorker", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiveReceiptWorkManager implements IReceiveReceiptWorkManager {
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final ISubscriptionManager _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public ReceiveReceiptWorkManager(IApplicationService _applicationService, ConfigModelStore _configModelStore, ISubscriptionManager _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    @Override // com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager
    public void enqueueReceiveReceipt(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        if (!this._configModelStore.getModel().getReceiveReceiptEnabled()) {
            Logging.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            Logging.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        Data build = new Data.Builder().putString(OS_NOTIFICATION_ID, notificationId).putString(OS_APP_ID, appId).putString(OS_SUBSCRIPTION_ID, id).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        OneTimeWorkRequest build2 = new OneTimeWorkRequest.Builder(ReceiveReceiptWorker.class).setConstraints(buildConstraints()).setInitialDelay(randomDelay, TimeUnit.SECONDS).setInputData(build).build();
        Logging.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        OSWorkManagerHelper.INSTANCE.getInstance(this._applicationService.getAppContext()).enqueueUniqueWork(notificationId + "_receive_receipt", ExistingWorkPolicy.KEEP, build2);
    }

    private final Constraints buildConstraints() {
        return new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
    }

    /* compiled from: ReceiveReceiptWorkManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager$ReceiveReceiptWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReceiveReceiptWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            if (r6.sendReceiveReceipt(r7, r2, r10, r0) == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
            ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1;
            Object obj;
            int i;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (continuation instanceof ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) {
                receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = (ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1) continuation;
                if ((receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label -= Integer.MIN_VALUE;
                    obj = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Context applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0 = this;
                        receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = 1;
                        obj = OneSignal.initWithContext(applicationContext, receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1);
                        if (obj != coroutine_suspended) {
                            receiveReceiptWorker = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        ListenableWorker.Result success = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                        return success;
                    }
                    receiveReceiptWorker = (ReceiveReceiptWorker) receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Logging.warn$default("ReceiveReceiptWorker skipped due to failed OneSignal initialization", null, 2, null);
                        ListenableWorker.Result success2 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
                        return success2;
                    }
                    String string = receiveReceiptWorker.getInputData().getString(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                    if (string == null) {
                        ListenableWorker.Result failure = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                        return failure;
                    }
                    String string2 = receiveReceiptWorker.getInputData().getString(ReceiveReceiptWorkManager.OS_APP_ID);
                    if (string2 == null) {
                        ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure2, "failure(...)");
                        return failure2;
                    }
                    String string3 = receiveReceiptWorker.getInputData().getString(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                    if (string3 == null) {
                        ListenableWorker.Result failure3 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure3, "failure(...)");
                        return failure3;
                    }
                    IReceiveReceiptProcessor iReceiveReceiptProcessor = (IReceiveReceiptProcessor) OneSignal.INSTANCE.getServices().getService(IReceiveReceiptProcessor.class);
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.L$0 = null;
                    receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label = 2;
                }
            }
            receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 = new ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1(this, continuation);
            obj = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = receiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1.label;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
