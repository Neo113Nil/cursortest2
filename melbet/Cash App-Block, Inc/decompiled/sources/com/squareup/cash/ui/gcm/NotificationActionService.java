package com.squareup.cash.ui.gcm;

import android.app.Application;
import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.core.app.NotificationCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.R;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.cdf.pushnotification.PushNotificationConfirmStart;
import com.squareup.cash.cdf.pushnotification.PushNotificationDeclineStart;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes6.dex */
public final class NotificationActionService extends IntentService {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Analytics analytics;
    public AppService appService;
    public ProductionAttributionEventEmitter attributionEventEmitter;
    public AndroidNotificationManager notificationManager;
    public ContextScope scope;

    public NotificationActionService() {
        super("NotificationActionService");
    }

    public final Analytics getAnalytics() {
        Analytics analytics = this.analytics;
        if (analytics != null) {
            return analytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException(BreadcrumbHelper.Category.ANALYTICS);
        throw null;
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        this.scope = JobKt.plus(new CoroutineName("NotificationActionService"), JobKt.MainScope());
        Application application = getApplication();
        application.getClass();
        ContextScope contextScope = this.scope;
        if (contextScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scope");
            throw null;
        }
        Countries.onEachSandboxComponentExt(application, contextScope, new DateInputKt$DateInputTextField$3(new FieldBinding$$ExternalSyntheticLambda4(this, 10), 13));
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ContextScope contextScope = this.scope;
        if (contextScope != null) {
            JobKt.cancel(contextScope, (CancellationException) null);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("scope");
            throw null;
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        intent.getClass();
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("channel-id");
        String stringExtra2 = intent.getStringExtra("payment-token");
        String stringExtra3 = intent.getStringExtra("instrument-token");
        Intent intent2 = (Intent) intent.getParcelableExtra("details-intent");
        if (action == null || stringExtra == null || stringExtra2 == null || intent2 == null) {
            return;
        }
        if (stringExtra3 == null && "send".equals(action)) {
            return;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, stringExtra);
        builder.setFlag(2, true);
        builder.setFlag(8, true);
        builder.mProgressMax = 1;
        builder.mProgressIndeterminate = true;
        builder.mContentTitle = NotificationCompat.Builder.limitCharSequenceLength(getString(R.string.notif_processing));
        builder.mNotification.icon = R.drawable.notification_icon;
        builder.mColor = getColor(R.color.standard_green_normal);
        AndroidNotificationManager androidNotificationManager = this.notificationManager;
        if (androidNotificationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            throw null;
        }
        Notification build = builder.build();
        build.getClass();
        androidNotificationManager.notify(stringExtra2, 1, build);
        if (!action.equals("send")) {
            if (!action.equals("decline")) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid action: ".concat(action));
                return;
            } else {
                getAnalytics().track(new PushNotificationDeclineStart(stringExtra2), null);
                JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new WorkflowLayout$start$1(stringExtra2, this, stringExtra, intent2, intent, null, 11));
                return;
            }
        }
        getAnalytics().track(new PushNotificationConfirmStart(stringExtra2), null);
        ConfirmPaymentRequest confirmPaymentRequest = new ConfirmPaymentRequest(null, CollectionsKt__CollectionsJVMKt.listOf(stringExtra2), new InstrumentSelection(stringExtra3, Moneys.zero(CurrencyCode.USD), (CashInstrumentType) null, 12), 19);
        ProductionAttributionEventEmitter productionAttributionEventEmitter = this.attributionEventEmitter;
        if (productionAttributionEventEmitter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("attributionEventEmitter");
            throw null;
        }
        productionAttributionEventEmitter.paymentConfirmationInitiated();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new NotificationActionService$onHandleIntent$1(this, confirmPaymentRequest, stringExtra, stringExtra2, intent2, intent, null, 0));
    }

    public final void showError(String str, int i, int i2, Intent intent, Intent intent2, String str2) {
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, str);
        builder.mContentTitle = NotificationCompat.Builder.limitCharSequenceLength(getString(i));
        builder.mContentText = NotificationCompat.Builder.limitCharSequenceLength(getString(i2));
        builder.setTicker(getString(i));
        builder.mNotification.icon = R.drawable.notification_icon;
        builder.mColor = getColor(R.color.standard_green_normal);
        builder.mContentIntent = activity;
        builder.setFlag(16, true);
        builder.setFlag(8, true);
        if (intent2 != null) {
            String string2 = getString(R.string.notif_action_retry);
            string2.getClass();
            PendingIntent service = PendingIntent.getService(this, 0, intent2, 201326592);
            builder.addAction(2131231627, service, string2);
            NotificationCompat.WearableExtender wearableExtender = new NotificationCompat.WearableExtender();
            wearableExtender.mActions.add(new NotificationCompat.Action(2131233666, string2, service));
            builder.extend(wearableExtender);
        }
        AndroidNotificationManager androidNotificationManager = this.notificationManager;
        if (androidNotificationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
            throw null;
        }
        Notification build = builder.build();
        build.getClass();
        androidNotificationManager.notify(str2, 1, build);
    }
}
