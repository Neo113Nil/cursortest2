package com.squareup.cash.ui.gcm;

import android.graphics.Bitmap;
import android.os.BadParcelableException;
import androidx.work.ListenableWorker;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.CashNotificationFactory;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/ui/gcm/NotificationWorker;", "Lcom/squareup/util/workmanager/SandboxedWork;", "cash-os"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationWorker implements SandboxedWork {
    public final CashNotificationFactory cashNotificationFactory;
    public final Moshi moshi;
    public final RealNotificationDispatcher notificationDispatcher;
    public final SessionManager sessionManager;
    public final HttpUrl.Builder versionUpdater;

    public NotificationWorker(HttpUrl.Builder builder, SessionManager sessionManager, RealNotificationDispatcher realNotificationDispatcher, Moshi moshi, CashNotificationFactory cashNotificationFactory) {
        sessionManager.getClass();
        moshi.getClass();
        this.versionUpdater = builder;
        this.sessionManager = sessionManager;
        this.notificationDispatcher = realNotificationDispatcher;
        this.moshi = moshi;
        this.cashNotificationFactory = cashNotificationFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(CashPushNotification cashPushNotification, ContinuationImpl continuationImpl) {
        NotificationWorker$showNotification$1 notificationWorker$showNotification$1;
        int i;
        CashNotification asCashNotification;
        CashNotification cashNotification;
        if (continuationImpl instanceof NotificationWorker$showNotification$1) {
            notificationWorker$showNotification$1 = (NotificationWorker$showNotification$1) continuationImpl;
            int i2 = notificationWorker$showNotification$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                notificationWorker$showNotification$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = notificationWorker$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationWorker$showNotification$1.label;
                Continuation continuation = null;
                RealNotificationDispatcher realNotificationDispatcher = this.notificationDispatcher;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    asCashNotification = this.cashNotificationFactory.asCashNotification(cashPushNotification);
                    if (!asCashNotification.getHasBackgroundTasks()) {
                        a$$ExternalSyntheticBUOutline0.m$3("Notification job enqueued without background tasks");
                        return null;
                    }
                    notificationWorker$showNotification$1.L$1 = asCashNotification;
                    notificationWorker$showNotification$1.label = 1;
                    obj = JobKt.withContext(realNotificationDispatcher.ioDispatcher, new RealNotificationDispatcher$performBackgroundTasks$2(asCashNotification, realNotificationDispatcher, null), notificationWorker$showNotification$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    asCashNotification = notificationWorker$showNotification$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                cashNotification = asCashNotification;
                Bitmap bitmap = (Bitmap) obj;
                cashNotification.getClass();
                if (cashNotification.getShowNotification()) {
                    JobKt.launch$default(realNotificationDispatcher.scope, null, null, new DbSessionManager$updateDb$2(realNotificationDispatcher, cashNotification, bitmap, continuation, 28), 3);
                }
                return Unit.INSTANCE;
            }
        }
        notificationWorker$showNotification$1 = new NotificationWorker$showNotification$1(this, continuationImpl);
        Object obj2 = notificationWorker$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationWorker$showNotification$1.label;
        Continuation continuation2 = null;
        RealNotificationDispatcher realNotificationDispatcher2 = this.notificationDispatcher;
        if (i != 0) {
        }
        cashNotification = asCashNotification;
        Bitmap bitmap2 = (Bitmap) obj2;
        cashNotification.getClass();
        if (cashNotification.getShowNotification()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.util.workmanager.SandboxedWork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(SandboxedCoroutineWorker sandboxedCoroutineWorker, ContinuationImpl continuationImpl) {
        NotificationWorker$work$1 notificationWorker$work$1;
        int i;
        if (continuationImpl instanceof NotificationWorker$work$1) {
            notificationWorker$work$1 = (NotificationWorker$work$1) continuationImpl;
            int i2 = notificationWorker$work$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                notificationWorker$work$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = notificationWorker$work$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationWorker$work$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.versionUpdater.checkUpdate();
                    if (!PlatformKt.isAuthenticated(this.sessionManager)) {
                        return new ListenableWorker.Result.Failure();
                    }
                    String string2 = sandboxedCoroutineWorker.getInputData().getString("key_notification_json");
                    if (string2 == null || string2.length() == 0) {
                        return new ListenableWorker.Result.Failure();
                    }
                    try {
                        Moshi moshi = this.moshi;
                        moshi.getClass();
                        Object fromJson = moshi.adapter(CashPushNotification.class, Util.NO_ANNOTATIONS, null).fromJson(string2);
                        fromJson.getClass();
                        CashPushNotification cashPushNotification = (CashPushNotification) fromJson;
                        notificationWorker$work$1.label = 1;
                        if (showNotification(cashPushNotification, notificationWorker$work$1) == obj2) {
                            return obj2;
                        }
                    } catch (Exception e) {
                        if ((e instanceof ClassNotFoundException) || (e instanceof BadParcelableException) || (e instanceof ClassCastException)) {
                            Timber.Forest.e(e);
                            return new ListenableWorker.Result.Failure();
                        }
                        if (!(e instanceof IOException)) {
                            throw e;
                        }
                        Timber.Forest.e("Could not parse GCM JSON data payload, after enqueuing!", new Object[0], e);
                        return new ListenableWorker.Result.Failure();
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ListenableWorker.Result.success();
            }
        }
        notificationWorker$work$1 = new NotificationWorker$work$1(this, continuationImpl);
        Object obj3 = notificationWorker$work$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationWorker$work$1.label;
        if (i != 0) {
        }
        return ListenableWorker.Result.success();
    }
}
