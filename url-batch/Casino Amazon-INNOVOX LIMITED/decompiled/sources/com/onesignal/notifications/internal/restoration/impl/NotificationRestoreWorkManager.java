package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationRestoreWorkManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager;", "Lcom/onesignal/notifications/internal/restoration/INotificationRestoreWorkManager;", "()V", "lock", "", "restored", "", "beginEnqueueingWork", "", "context", "Landroid/content/Context;", "shouldDelay", "Companion", "NotificationRestoreWorker", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationRestoreWorkManager implements INotificationRestoreWorkManager {
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    @Override // com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager
    public void beginEnqueueingWork(Context context, boolean shouldDelay) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            Unit unit = Unit.INSTANCE;
            OSWorkManagerHelper.INSTANCE.getInstance(context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay(shouldDelay ? 15 : 0, TimeUnit.SECONDS).build());
        }
    }

    /* compiled from: NotificationRestoreWorkManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager$NotificationRestoreWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationRestoreWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        
            if (r7.process(r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
        
            if (r7 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
            NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1;
            Object obj;
            int i;
            Context applicationContext;
            if (continuation instanceof NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1) {
                notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 = (NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1) continuation;
                if ((notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label -= Integer.MIN_VALUE;
                    obj = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0 = applicationContext;
                        notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label = 1;
                        obj = OneSignal.initWithContext(applicationContext, notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            ListenableWorker.Result success = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                            return success;
                        }
                        applicationContext = (Context) notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Logging.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        ListenableWorker.Result success2 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
                        return success2;
                    }
                    if (!NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, applicationContext, null, 2, null)) {
                        Logging.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        ListenableWorker.Result failure = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                        return failure;
                    }
                    INotificationRestoreProcessor iNotificationRestoreProcessor = (INotificationRestoreProcessor) OneSignal.INSTANCE.getServices().getService(INotificationRestoreProcessor.class);
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.L$0 = null;
                    notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label = 2;
                }
            }
            notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 = new NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1(this, continuation);
            obj = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = notificationRestoreWorkManager$NotificationRestoreWorker$doWork$1.label;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
