package com.onesignal.notifications.internal.display.impl;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.MainThreadException;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.notifications.R;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: NotificationDisplayer.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002J*\u0010#\u001a\u00020$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u00020\u0017H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010.2\u0006\u00103\u001a\u00020\u0017H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010\u0017H\u0002J!\u00107\u001a\u0004\u0018\u00010)2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0002\u00109J2\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020<2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0017H\u0002J\u0016\u0010@\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0082@¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006A"}, d2 = {"Lcom/onesignal/notifications/internal/display/impl/NotificationDisplayer;", "Lcom/onesignal/notifications/internal/display/INotificationDisplayer;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_notificationLimitManager", "Lcom/onesignal/notifications/internal/limiting/INotificationLimitManager;", "_summaryNotificationDisplayer", "Lcom/onesignal/notifications/internal/display/ISummaryNotificationDisplayer;", "_notificationDisplayBuilder", "Lcom/onesignal/notifications/internal/display/INotificationDisplayBuilder;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/limiting/INotificationLimitManager;Lcom/onesignal/notifications/internal/display/ISummaryNotificationDisplayer;Lcom/onesignal/notifications/internal/display/INotificationDisplayBuilder;)V", "contextResources", "Landroid/content/res/Resources;", "getContextResources", "()Landroid/content/res/Resources;", "currentContext", "Landroid/content/Context;", "getCurrentContext", "()Landroid/content/Context;", "isRunningOnMainThreadCheck", "", "()Lkotlin/Unit;", "packageName", "", "getPackageName", "()Ljava/lang/String;", "addBackgroundImage", "fcmJson", "Lorg/json/JSONObject;", "notifBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "applyNotificationExtender", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "notificationBuilder", "createGenericPendingIntentsForNotif", "Landroid/app/Notification;", "intentGenerator", "Lcom/onesignal/notifications/internal/display/impl/IntentGeneratorForAttachingToNotifications;", "gcmBundle", "notificationId", "", "displayNotification", "", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBitmap", "Landroid/graphics/Bitmap;", "name", "getBitmapFromAssetsOrResourceName", "bitmapStr", "getBitmapFromURL", InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "getDrawableId", "getResourceIcon", "iconName", "safeGetColorFromHex", "colorKey", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "setTextColor", "customView", "Landroid/widget/RemoteViews;", "viewId", "colorPayloadKey", "colorDefaultResource", "showNotification", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationDisplayer implements INotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;
    private final INotificationLimitManager _notificationLimitManager;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;

    public NotificationDisplayer(IApplicationService _applicationService, INotificationLimitManager _notificationLimitManager, ISummaryNotificationDisplayer _summaryNotificationDisplayer, INotificationDisplayBuilder _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationLimitManager, "_notificationLimitManager");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    @Override // com.onesignal.notifications.internal.display.INotificationDisplayer
    public Object displayNotification(NotificationGenerationJob notificationGenerationJob, Continuation<? super Boolean> continuation) {
        isRunningOnMainThreadCheck();
        return showNotification(notificationGenerationJob, continuation);
    }

    public final Unit isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new MainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016c, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r7, r8, r9) == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016f, code lost:
    
        r4 = r0;
        r5 = r2;
        r2 = r12;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0197, code lost:
    
        if (r4.createSummaryNotification(r15, r0, r7, r9) == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(NotificationGenerationJob notificationGenerationJob, Continuation<? super Boolean> continuation) {
        NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$1;
        int i;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        NotificationDisplayBuilder.OneSignalNotificationBuilder baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        NotificationGenerationJob notificationGenerationJob2;
        int i2;
        NotificationCompat.Builder builder;
        NotificationDisplayer notificationDisplayer;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder;
        String str2;
        int i3;
        Notification createGenericPendingIntentsForNotif;
        if (continuation instanceof NotificationDisplayer$showNotification$1) {
            notificationDisplayer$showNotification$1 = (NotificationDisplayer$showNotification$1) continuation;
            if ((notificationDisplayer$showNotification$1.label & Integer.MIN_VALUE) != 0) {
                notificationDisplayer$showNotification$1.label -= Integer.MIN_VALUE;
                NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$12 = notificationDisplayer$showNotification$1;
                Object obj = notificationDisplayer$showNotification$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationDisplayer$showNotification$12.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int androidId = notificationGenerationJob.getAndroidId();
                    JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                    Intrinsics.checkNotNull(jsonPayload);
                    String safeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = new IntentGeneratorForAttachingToNotifications(getCurrentContext());
                    new ArrayList();
                    activeGrouplessNotifications = NotificationHelper.INSTANCE.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        NotificationHelper.INSTANCE.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    }
                    baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob);
                    NotificationCompat.Builder compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
                    this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, intentGeneratorForAttachingToNotifications2, compatBuilder, androidId, null);
                    jSONObject = jsonPayload;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
                    try {
                        addBackgroundImage(jSONObject, compatBuilder);
                    } catch (Throwable th) {
                        Logging.error("Could not set background notification image!", th);
                    }
                    applyNotificationExtender(notificationGenerationJob, compatBuilder);
                    if (notificationGenerationJob.getIsRestoring()) {
                        this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
                    }
                    int i4 = str == null ? 1 : 2;
                    INotificationLimitManager iNotificationLimitManager = this._notificationLimitManager;
                    notificationDisplayer$showNotification$12.L$0 = this;
                    notificationDisplayer$showNotification$12.L$1 = notificationGenerationJob;
                    notificationDisplayer$showNotification$12.L$2 = jSONObject;
                    notificationDisplayer$showNotification$12.L$3 = str;
                    notificationDisplayer$showNotification$12.L$4 = intentGeneratorForAttachingToNotifications;
                    notificationDisplayer$showNotification$12.L$5 = activeGrouplessNotifications;
                    notificationDisplayer$showNotification$12.L$6 = baseOneSignalNotificationBuilder;
                    notificationDisplayer$showNotification$12.L$7 = compatBuilder;
                    notificationDisplayer$showNotification$12.I$0 = androidId;
                    notificationDisplayer$showNotification$12.label = 1;
                    if (iNotificationLimitManager.clearOldestOverLimit(i4, notificationDisplayer$showNotification$12) != coroutine_suspended) {
                        notificationGenerationJob2 = notificationGenerationJob;
                        i2 = androidId;
                        builder = compatBuilder;
                        notificationDisplayer = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = notificationDisplayer$showNotification$12.I$0;
                    createGenericPendingIntentsForNotif = (Notification) notificationDisplayer$showNotification$12.L$2;
                    NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) notificationDisplayer$showNotification$12.L$1;
                    NotificationDisplayer notificationDisplayer2 = (NotificationDisplayer) notificationDisplayer$showNotification$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i5;
                    oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
                    notificationDisplayer = notificationDisplayer2;
                    notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                    Context currentContext = notificationDisplayer.getCurrentContext();
                    Intrinsics.checkNotNull(currentContext);
                    NotificationManagerCompat.from(currentContext).notify(i3, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
                        Context currentContext2 = notificationDisplayer.getCurrentContext();
                        Intrinsics.checkNotNull(currentContext2);
                        z = notificationHelper.areNotificationsEnabled(currentContext2, createGenericPendingIntentsForNotif.getChannelId());
                    }
                    return Boxing.boxBoolean(z);
                }
                int i6 = notificationDisplayer$showNotification$12.I$0;
                NotificationCompat.Builder builder2 = (NotificationCompat.Builder) notificationDisplayer$showNotification$12.L$7;
                baseOneSignalNotificationBuilder = (NotificationDisplayBuilder.OneSignalNotificationBuilder) notificationDisplayer$showNotification$12.L$6;
                activeGrouplessNotifications = (ArrayList) notificationDisplayer$showNotification$12.L$5;
                intentGeneratorForAttachingToNotifications = (IntentGeneratorForAttachingToNotifications) notificationDisplayer$showNotification$12.L$4;
                str = (String) notificationDisplayer$showNotification$12.L$3;
                jSONObject = (JSONObject) notificationDisplayer$showNotification$12.L$2;
                notificationGenerationJob2 = (NotificationGenerationJob) notificationDisplayer$showNotification$12.L$1;
                NotificationDisplayer notificationDisplayer3 = (NotificationDisplayer) notificationDisplayer$showNotification$12.L$0;
                ResultKt.throwOnFailure(obj);
                i2 = i6;
                builder = builder2;
                notificationDisplayer = notificationDisplayer3;
                oneSignalNotificationBuilder = baseOneSignalNotificationBuilder;
                IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications3 = intentGeneratorForAttachingToNotifications;
                str2 = str;
                JSONObject jSONObject2 = jSONObject;
                if (str2 == null) {
                    notificationDisplayer._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(builder, intentGeneratorForAttachingToNotifications3, jSONObject2, str2, i2);
                    int i7 = i2;
                    Notification createSingleNotificationBeforeSummaryBuilder = notificationDisplayer._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(notificationGenerationJob2, builder);
                    if (Intrinsics.areEqual(str2, NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
                        ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationDisplayer._summaryNotificationDisplayer;
                        int size = activeGrouplessNotifications.size() + 1;
                        int groupAlertBehavior = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
                        notificationDisplayer$showNotification$12.L$0 = notificationDisplayer;
                        notificationDisplayer$showNotification$12.L$1 = oneSignalNotificationBuilder;
                        notificationDisplayer$showNotification$12.L$2 = createSingleNotificationBeforeSummaryBuilder;
                        notificationDisplayer$showNotification$12.L$3 = null;
                        notificationDisplayer$showNotification$12.L$4 = null;
                        notificationDisplayer$showNotification$12.L$5 = null;
                        notificationDisplayer$showNotification$12.L$6 = null;
                        notificationDisplayer$showNotification$12.L$7 = null;
                        notificationDisplayer$showNotification$12.I$0 = i7;
                        notificationDisplayer$showNotification$12.label = 2;
                    } else {
                        ISummaryNotificationDisplayer iSummaryNotificationDisplayer2 = notificationDisplayer._summaryNotificationDisplayer;
                        int groupAlertBehavior2 = notificationDisplayer._notificationDisplayBuilder.getGroupAlertBehavior();
                        notificationDisplayer$showNotification$12.L$0 = notificationDisplayer;
                        notificationDisplayer$showNotification$12.L$1 = oneSignalNotificationBuilder;
                        notificationDisplayer$showNotification$12.L$2 = createSingleNotificationBeforeSummaryBuilder;
                        notificationDisplayer$showNotification$12.L$3 = null;
                        notificationDisplayer$showNotification$12.L$4 = null;
                        notificationDisplayer$showNotification$12.L$5 = null;
                        notificationDisplayer$showNotification$12.L$6 = null;
                        notificationDisplayer$showNotification$12.L$7 = null;
                        notificationDisplayer$showNotification$12.I$0 = i7;
                        notificationDisplayer$showNotification$12.label = 3;
                    }
                    i3 = i5;
                    oneSignalNotificationBuilder = oneSignalNotificationBuilder2;
                    notificationDisplayer = notificationDisplayer2;
                    notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                    Context currentContext3 = notificationDisplayer.getCurrentContext();
                    Intrinsics.checkNotNull(currentContext3);
                    NotificationManagerCompat.from(currentContext3).notify(i3, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    return Boxing.boxBoolean(z);
                }
                i3 = i2;
                createGenericPendingIntentsForNotif = notificationDisplayer.createGenericPendingIntentsForNotif(builder, intentGeneratorForAttachingToNotifications3, jSONObject2, i3);
                notificationDisplayer._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder, createGenericPendingIntentsForNotif);
                Context currentContext32 = notificationDisplayer.getCurrentContext();
                Intrinsics.checkNotNull(currentContext32);
                NotificationManagerCompat.from(currentContext32).notify(i3, createGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                return Boxing.boxBoolean(z);
            }
        }
        notificationDisplayer$showNotification$1 = new NotificationDisplayer$showNotification$1(this, continuation);
        NotificationDisplayer$showNotification$1 notificationDisplayer$showNotification$122 = notificationDisplayer$showNotification$1;
        Object obj2 = notificationDisplayer$showNotification$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationDisplayer$showNotification$122.label;
        boolean z2 = true;
        if (i != 0) {
        }
        oneSignalNotificationBuilder = baseOneSignalNotificationBuilder;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications32 = intentGeneratorForAttachingToNotifications;
        str2 = str;
        JSONObject jSONObject22 = jSONObject;
        if (str2 == null) {
        }
    }

    private final Notification createGenericPendingIntentsForNotif(NotificationCompat.Builder notifBuilder, IntentGeneratorForAttachingToNotifications intentGenerator, JSONObject gcmBundle, int notificationId) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(notificationId).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString());
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        Intrinsics.checkNotNull(notifBuilder);
        notifBuilder.setContentIntent(newActionPendingIntent);
        notifBuilder.setDeleteIntent(this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(notificationId)));
        Notification build = notifBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void applyNotificationExtender(NotificationGenerationJob notificationJob, NotificationCompat.Builder notificationBuilder) {
        if (notificationJob.hasExtender()) {
            try {
                Field declaredField = NotificationCompat.Builder.class.getDeclaredField("mNotification");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(notificationBuilder);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                notificationJob.setOrgFlags(Integer.valueOf(notification.flags));
                notificationJob.setOrgSound(notification.sound);
                Intrinsics.checkNotNull(notificationBuilder);
                com.onesignal.notifications.internal.Notification notification2 = notificationJob.getNotification();
                Intrinsics.checkNotNull(notification2);
                NotificationCompat.Extender notificationExtender = notification2.getNotificationExtender();
                Intrinsics.checkNotNull(notificationExtender);
                notificationBuilder.extend(notificationExtender);
                Object obj2 = declaredField.get(notificationBuilder);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.app.Notification");
                Notification notification3 = (Notification) obj2;
                Field declaredField2 = NotificationCompat.Builder.class.getDeclaredField("mContentText");
                declaredField2.setAccessible(true);
                CharSequence charSequence = (CharSequence) declaredField2.get(notificationBuilder);
                Field declaredField3 = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
                declaredField3.setAccessible(true);
                CharSequence charSequence2 = (CharSequence) declaredField3.get(notificationBuilder);
                notificationJob.setOverriddenBodyFromExtender(charSequence);
                notificationJob.setOverriddenTitleFromExtender(charSequence2);
                if (notificationJob.getIsRestoring()) {
                    return;
                }
                notificationJob.setOverriddenFlags(Integer.valueOf(notification3.flags));
                notificationJob.setOverriddenSound(notification3.sound);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final void addBackgroundImage(JSONObject fcmJson, NotificationCompat.Builder notifBuilder) throws Throwable {
        Bitmap bitmap;
        JSONObject jSONObject;
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            Logging.verbose$default("Cannot use background images in notifications for device on version: " + Build.VERSION.SDK_INT, null, 2, null);
            return;
        }
        String optString = fcmJson.optString("bg_img", null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject2.optString("img", null));
            jSONObject = jSONObject2;
        } else {
            bitmap = null;
            jSONObject = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            Context currentContext = getCurrentContext();
            Intrinsics.checkNotNull(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(fcmJson));
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, fcmJson.optString("alert"));
            setTextColor(remoteViews, jSONObject, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject != null && jSONObject.has("img_align")) {
                str = jSONObject.getString("img_align");
            } else {
                Resources contextResources = getContextResources();
                Intrinsics.checkNotNull(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", TypedValues.Custom.S_STRING, getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    Intrinsics.checkNotNull(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            }
            if (Intrinsics.areEqual(ViewProps.RIGHT, str)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            Intrinsics.checkNotNull(notifBuilder);
            notifBuilder.setContent(remoteViews);
            notifBuilder.setStyle(null);
        }
    }

    private final void setTextColor(RemoteViews customView, JSONObject fcmJson, int viewId, String colorPayloadKey, String colorDefaultResource) {
        Integer safeGetColorFromHex = safeGetColorFromHex(fcmJson, colorPayloadKey);
        if (safeGetColorFromHex != null) {
            customView.setTextColor(viewId, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        Intrinsics.checkNotNull(contextResources);
        int identifier = contextResources.getIdentifier(colorDefaultResource, "color", getPackageName());
        if (identifier != 0) {
            customView.setTextColor(viewId, ContextCompat.getColor(getCurrentContext(), identifier));
        }
    }

    private final Integer safeGetColorFromHex(JSONObject fcmJson, String colorKey) {
        if (fcmJson == null) {
            return null;
        }
        try {
            if (fcmJson.has(colorKey)) {
                return Integer.valueOf(new BigInteger(fcmJson.optString(colorKey), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String bitmapStr) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            Intrinsics.checkNotNull(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(bitmapStr));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    Intrinsics.checkNotNull(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(bitmapStr + str));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(bitmapStr);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String location) {
        try {
            return BitmapFactory.decodeStream(new URL(location).openConnection().getInputStream());
        } catch (Throwable th) {
            Logging.warn("Could not download image!", th);
            return null;
        }
    }

    private final int getDrawableId(String name) {
        Resources contextResources = getContextResources();
        Intrinsics.checkNotNull(contextResources);
        return contextResources.getIdentifier(name, "drawable", getPackageName());
    }

    private final Bitmap getBitmap(String name) {
        if (name == null) {
            return null;
        }
        String str = name;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        if (StringsKt.startsWith$default(obj, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(obj, "https://", false, 2, (Object) null)) {
            return getBitmapFromURL(obj);
        }
        return getBitmapFromAssetsOrResourceName(name);
    }

    private final int getResourceIcon(String iconName) {
        if (iconName == null) {
            return 0;
        }
        String str = iconName;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(iconName).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
