package com.onesignal.notifications.internal.display.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: SummaryNotificationDisplayer.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J2\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J.\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0097@¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J(\u0010%\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006*"}, d2 = {"Lcom/onesignal/notifications/internal/display/impl/SummaryNotificationDisplayer;", "Lcom/onesignal/notifications/internal/display/ISummaryNotificationDisplayer;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_notificationDisplayBuilder", "Lcom/onesignal/notifications/internal/display/INotificationDisplayBuilder;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/notifications/internal/display/INotificationDisplayBuilder;)V", "currentContext", "Landroid/content/Context;", "getCurrentContext", "()Landroid/content/Context;", "createBaseSummaryIntent", "Landroid/content/Intent;", "summaryNotificationId", "", "intentGenerator", "Lcom/onesignal/notifications/internal/display/impl/IntentGeneratorForAttachingToNotifications;", "fcmJson", "Lorg/json/JSONObject;", "group", "", "createGenericPendingIntentsForGroup", "", "notifBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "gcmBundle", "notificationId", "createGrouplessSummaryNotification", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "grouplessNotifCount", "groupAlertBehavior", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lcom/onesignal/notifications/internal/display/impl/IntentGeneratorForAttachingToNotifications;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSingleNotificationBeforeSummaryBuilder", "Landroid/app/Notification;", "createSummaryNotification", "Lcom/onesignal/notifications/internal/display/impl/NotificationDisplayBuilder$OneSignalNotificationBuilder;", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lcom/onesignal/notifications/internal/display/impl/NotificationDisplayBuilder$OneSignalNotificationBuilder;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSummaryNotification", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SummaryNotificationDisplayer implements ISummaryNotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;

    public SummaryNotificationDisplayer(IApplicationService _applicationService, INotificationRepository _dataController, INotificationDisplayBuilder _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public void createGenericPendingIntentsForGroup(NotificationCompat.Builder notifBuilder, IntentGeneratorForAttachingToNotifications intentGenerator, JSONObject gcmBundle, String group, int notificationId) {
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        Intrinsics.checkNotNullParameter(gcmBundle, "gcmBundle");
        Intrinsics.checkNotNullParameter(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(notificationId).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString()).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        Intrinsics.checkNotNull(notifBuilder);
        notifBuilder.setContentIntent(newActionPendingIntent);
        INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(notificationId).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
        notifBuilder.setDeleteIntent(iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt2, putExtra2));
        notifBuilder.setGroup(group);
        try {
            notifBuilder.setGroupAlertBehavior(this._notificationDisplayBuilder.getGroupAlertBehavior());
        } catch (Throwable unused) {
        }
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationJob, NotificationCompat.Builder notifBuilder) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        Intrinsics.checkNotNull(notifBuilder);
        Notification build = notifBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Object updateSummaryNotification(NotificationGenerationJob notificationGenerationJob, Continuation<? super Unit> continuation) {
        Object createSummaryNotification = createSummaryNotification(notificationGenerationJob, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), continuation);
        return createSummaryNotification == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? createSummaryNotification : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0240 A[EDGE_INSN: B:34:0x0240->B:35:0x0240 BREAK  A[LOOP:0: B:13:0x01bc->B:21:0x0238], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(NotificationGenerationJob notificationGenerationJob, NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, int i, Continuation<? super Unit> continuation) {
        SummaryNotificationDisplayer$createSummaryNotification$1 summaryNotificationDisplayer$createSummaryNotification$1;
        int i2;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        SecureRandom secureRandom;
        NotificationGenerationJob notificationGenerationJob2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2;
        int i3;
        JSONObject jSONObject;
        boolean z;
        PendingIntent pendingIntent;
        String str;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        Integer num;
        PendingIntent pendingIntent2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder3;
        JSONObject jSONObject2;
        String str2;
        NotificationGenerationJob notificationGenerationJob3;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2;
        SecureRandom secureRandom2;
        Integer num2;
        SecureRandom secureRandom3;
        NotificationGenerationJob notificationGenerationJob4;
        int i4;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications3;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder4;
        String str3;
        Integer num3;
        boolean z2;
        SummaryNotificationDisplayer summaryNotificationDisplayer2;
        int i5;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder5;
        ArrayList arrayList;
        Iterator it;
        String str4;
        PendingIntent newActionPendingIntent;
        Notification build;
        String str5;
        String obj;
        Iterator it2;
        Integer num4;
        if (continuation instanceof SummaryNotificationDisplayer$createSummaryNotification$1) {
            summaryNotificationDisplayer$createSummaryNotification$1 = (SummaryNotificationDisplayer$createSummaryNotification$1) continuation;
            if ((summaryNotificationDisplayer$createSummaryNotification$1.label & Integer.MIN_VALUE) != 0) {
                summaryNotificationDisplayer$createSummaryNotification$1.label -= Integer.MIN_VALUE;
                Object obj2 = summaryNotificationDisplayer$createSummaryNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = summaryNotificationDisplayer$createSummaryNotification$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    boolean isRestoring = notificationGenerationJob.getIsRestoring();
                    JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                    Intrinsics.checkNotNull(jsonPayload);
                    Context currentContext = getCurrentContext();
                    Intrinsics.checkNotNull(currentContext);
                    intentGeneratorForAttachingToNotifications = new IntentGeneratorForAttachingToNotifications(currentContext);
                    String optString = jsonPayload.optString("grp", null);
                    secureRandom = new SecureRandom();
                    INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
                    int nextInt = secureRandom.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    PendingIntent newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt, putExtra);
                    INotificationRepository iNotificationRepository = this._dataController;
                    Intrinsics.checkNotNull(optString);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = this;
                    notificationGenerationJob2 = notificationGenerationJob;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob2;
                    oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jsonPayload;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = optString;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = newDismissActionPendingIntent;
                    i3 = i;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i3;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = isRestoring;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 1;
                    Object androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(optString, true, summaryNotificationDisplayer$createSummaryNotification$1);
                    if (androidIdForGroup != coroutine_suspended) {
                        jSONObject = jsonPayload;
                        z = isRestoring;
                        obj2 = androidIdForGroup;
                        pendingIntent = newDismissActionPendingIntent;
                        str = optString;
                        summaryNotificationDisplayer = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                        i4 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                        num3 = (Integer) summaryNotificationDisplayer$createSummaryNotification$1.L$8;
                        pendingIntent = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                        secureRandom3 = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                        str3 = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                        intentGeneratorForAttachingToNotifications3 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                        jSONObject = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                        oneSignalNotificationBuilder4 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                        notificationGenerationJob4 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                        summaryNotificationDisplayer = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
                        i3 = i4;
                        pendingIntent2 = pendingIntent;
                        str2 = str3;
                        jSONObject2 = jSONObject;
                        notificationGenerationJob3 = notificationGenerationJob4;
                        INotificationRepository iNotificationRepository2 = summaryNotificationDisplayer._dataController;
                        Intrinsics.checkNotNull(str2);
                        summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                        summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i3;
                        summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                        summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                        obj2 = iNotificationRepository2.listNotificationsForGroup(str2, summaryNotificationDisplayer$createSummaryNotification$1);
                        if (obj2 != coroutine_suspended) {
                            z2 = z;
                            summaryNotificationDisplayer2 = summaryNotificationDisplayer;
                            i5 = i3;
                            oneSignalNotificationBuilder5 = oneSignalNotificationBuilder3;
                            arrayList = new ArrayList();
                            it = ((List) obj2).iterator();
                            String str6 = null;
                            while (true) {
                                str4 = "";
                                if (it.hasNext()) {
                                }
                                arrayList = r25;
                                it = it2;
                                num2 = num4;
                            }
                            ArrayList arrayList2 = arrayList;
                            Integer num5 = num2;
                            int nextInt2 = secureRandom2.nextInt();
                            Intrinsics.checkNotNull(num5);
                            int intValue = num5.intValue();
                            Intrinsics.checkNotNull(str2);
                            newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(nextInt2, summaryNotificationDisplayer2.createBaseSummaryIntent(intValue, intentGeneratorForAttachingToNotifications2, jSONObject2, str2));
                            if (z2 == 0) {
                            }
                            Intrinsics.checkNotNull(oneSignalNotificationBuilder5);
                            NotificationCompat.Builder compatBuilder = oneSignalNotificationBuilder5.getCompatBuilder();
                            Intrinsics.checkNotNull(compatBuilder);
                            compatBuilder.mActions.clear();
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder, num5.intValue(), str2);
                            compatBuilder.setContentIntent(newActionPendingIntent).setDeleteIntent(pendingIntent2).setOnlyAlertOnce(z2).setAutoCancel(false).setGroup(str2).setGroupSummary(true);
                            compatBuilder.setGroupAlertBehavior(i5);
                            build = compatBuilder.build();
                            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder5, build);
                            Context currentContext2 = summaryNotificationDisplayer2.getCurrentContext();
                            Intrinsics.checkNotNull(currentContext2);
                            NotificationManagerCompat.from(currentContext2).notify(num5.intValue(), build);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                    i5 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                    num2 = (Integer) summaryNotificationDisplayer$createSummaryNotification$1.L$8;
                    pendingIntent2 = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                    secureRandom2 = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                    str2 = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                    intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                    jSONObject2 = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                    oneSignalNotificationBuilder5 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                    notificationGenerationJob3 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                    summaryNotificationDisplayer2 = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    z2 = z3;
                    arrayList = new ArrayList();
                    it = ((List) obj2).iterator();
                    String str62 = null;
                    while (true) {
                        str4 = "";
                        if (it.hasNext()) {
                            break;
                        }
                        INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                        ArrayList arrayList3 = arrayList;
                        if (z2 == 0) {
                            it2 = it;
                            if (notificationData.getAndroidId() == notificationGenerationJob3.getAndroidId()) {
                                num4 = num2;
                                arrayList = arrayList3;
                                it = it2;
                                num2 = num4;
                            }
                        } else {
                            it2 = it;
                        }
                        String title = notificationData.getTitle();
                        str4 = title != null ? title + ' ' : "";
                        num4 = num2;
                        SpannableString spannableString = new SpannableString(str4 + notificationData.getMessage());
                        if (str4.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                        }
                        arrayList3.add(spannableString);
                        if (str62 == null) {
                            str62 = notificationData.getFullData();
                        }
                        arrayList = arrayList3;
                        it = it2;
                        num2 = num4;
                    }
                    ArrayList arrayList22 = arrayList;
                    Integer num52 = num2;
                    int nextInt22 = secureRandom2.nextInt();
                    Intrinsics.checkNotNull(num52);
                    int intValue2 = num52.intValue();
                    Intrinsics.checkNotNull(str2);
                    newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(nextInt22, summaryNotificationDisplayer2.createBaseSummaryIntent(intValue2, intentGeneratorForAttachingToNotifications2, jSONObject2, str2));
                    if ((z2 == 0 && arrayList22.size() > 1) || (z2 == 0 && arrayList22.size() > 0)) {
                        ArrayList arrayList4 = arrayList22;
                        int size = arrayList4.size() + (!z2);
                        String safeString = JSONObjectExtensionsKt.safeString(jSONObject2, "grp_msg");
                        if (safeString == null || (str5 = StringsKt.replace$default(safeString, "$[notif_count]", "" + size, false, 4, (Object) null)) == null) {
                            str5 = size + " new messages";
                        }
                        NotificationCompat.Builder compatBuilder2 = summaryNotificationDisplayer2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob3).getCompatBuilder();
                        if (z2 != 0) {
                            summaryNotificationDisplayer2._notificationDisplayBuilder.removeNotifyOptions(compatBuilder2);
                        } else {
                            if (notificationGenerationJob3.getOverriddenSound() != null) {
                                Intrinsics.checkNotNull(compatBuilder2);
                                compatBuilder2.setSound(notificationGenerationJob3.getOverriddenSound());
                            }
                            if (notificationGenerationJob3.getOverriddenFlags() != null) {
                                Intrinsics.checkNotNull(compatBuilder2);
                                Integer overriddenFlags = notificationGenerationJob3.getOverriddenFlags();
                                Intrinsics.checkNotNull(overriddenFlags);
                                compatBuilder2.setDefaults(overriddenFlags.intValue());
                            }
                        }
                        Intrinsics.checkNotNull(compatBuilder2);
                        NotificationCompat.Builder deleteIntent = compatBuilder2.setContentIntent(newActionPendingIntent).setDeleteIntent(pendingIntent2);
                        Context currentContext3 = summaryNotificationDisplayer2.getCurrentContext();
                        Intrinsics.checkNotNull(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = summaryNotificationDisplayer2.getCurrentContext();
                        Intrinsics.checkNotNull(currentContext4);
                        String str7 = str5;
                        deleteIntent.setContentTitle(packageManager.getApplicationLabel(currentContext4.getApplicationInfo())).setContentText(str7).setNumber(size).setSmallIcon(summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultSmallIconId()).setLargeIcon(summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultLargeIcon()).setOnlyAlertOnce(z2).setAutoCancel(false).setGroup(str2).setGroupSummary(true);
                        try {
                            compatBuilder2.setGroupAlertBehavior(i5);
                        } catch (Throwable unused) {
                        }
                        if (z2 == 0) {
                            compatBuilder2.setTicker(str7);
                        }
                        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                        if (z2 == 0) {
                            String valueOf = notificationGenerationJob3.getTitle() != null ? String.valueOf(notificationGenerationJob3.getTitle()) : null;
                            String str8 = valueOf == null ? "" : valueOf + ' ';
                            CharSequence body = notificationGenerationJob3.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str4 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(str8 + str4);
                            if (str8.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, str8.length(), 0);
                            }
                            inboxStyle.addLine(spannableString2);
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            inboxStyle.addLine((SpannableString) it3.next());
                        }
                        inboxStyle.setBigContentTitle(str7);
                        compatBuilder2.setStyle(inboxStyle);
                        build = compatBuilder2.build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    } else {
                        Intrinsics.checkNotNull(oneSignalNotificationBuilder5);
                        NotificationCompat.Builder compatBuilder3 = oneSignalNotificationBuilder5.getCompatBuilder();
                        Intrinsics.checkNotNull(compatBuilder3);
                        compatBuilder3.mActions.clear();
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder3, num52.intValue(), str2);
                        compatBuilder3.setContentIntent(newActionPendingIntent).setDeleteIntent(pendingIntent2).setOnlyAlertOnce(z2).setAutoCancel(false).setGroup(str2).setGroupSummary(true);
                        try {
                            compatBuilder3.setGroupAlertBehavior(i5);
                        } catch (Throwable unused2) {
                        }
                        build = compatBuilder3.build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder5, build);
                    }
                    Context currentContext22 = summaryNotificationDisplayer2.getCurrentContext();
                    Intrinsics.checkNotNull(currentContext22);
                    NotificationManagerCompat.from(currentContext22).notify(num52.intValue(), build);
                    return Unit.INSTANCE;
                }
                z = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                int i6 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                PendingIntent pendingIntent3 = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                secureRandom = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                str = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications4 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                JSONObject jSONObject3 = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                oneSignalNotificationBuilder2 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                NotificationGenerationJob notificationGenerationJob5 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                SummaryNotificationDisplayer summaryNotificationDisplayer3 = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                ResultKt.throwOnFailure(obj2);
                i3 = i6;
                intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications4;
                pendingIntent = pendingIntent3;
                summaryNotificationDisplayer = summaryNotificationDisplayer3;
                jSONObject = jSONObject3;
                notificationGenerationJob2 = notificationGenerationJob5;
                num = (Integer) obj2;
                if (num != null) {
                    Integer boxInt = Boxing.boxInt(secureRandom.nextInt());
                    INotificationRepository iNotificationRepository3 = summaryNotificationDisplayer._dataController;
                    int intValue3 = boxInt.intValue();
                    Intrinsics.checkNotNull(str);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$8 = boxInt;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i3;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 2;
                    if (iNotificationRepository3.createSummaryNotification(intValue3, str, summaryNotificationDisplayer$createSummaryNotification$1) != coroutine_suspended) {
                        NotificationGenerationJob notificationGenerationJob6 = notificationGenerationJob2;
                        secureRandom3 = secureRandom;
                        notificationGenerationJob4 = notificationGenerationJob6;
                        i4 = i3;
                        intentGeneratorForAttachingToNotifications3 = intentGeneratorForAttachingToNotifications;
                        oneSignalNotificationBuilder4 = oneSignalNotificationBuilder2;
                        str3 = str;
                        num3 = boxInt;
                        oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
                        i3 = i4;
                        pendingIntent2 = pendingIntent;
                        str2 = str3;
                        jSONObject2 = jSONObject;
                        notificationGenerationJob3 = notificationGenerationJob4;
                        INotificationRepository iNotificationRepository22 = summaryNotificationDisplayer._dataController;
                        Intrinsics.checkNotNull(str2);
                        summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                        summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                        summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i3;
                        summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                        summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                        obj2 = iNotificationRepository22.listNotificationsForGroup(str2, summaryNotificationDisplayer$createSummaryNotification$1);
                        if (obj2 != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                pendingIntent2 = pendingIntent;
                oneSignalNotificationBuilder3 = oneSignalNotificationBuilder2;
                jSONObject2 = jSONObject;
                str2 = str;
                notificationGenerationJob3 = notificationGenerationJob2;
                intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications;
                secureRandom2 = secureRandom;
                num2 = num;
                INotificationRepository iNotificationRepository222 = summaryNotificationDisplayer._dataController;
                Intrinsics.checkNotNull(str2);
                summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str2;
                summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i3;
                summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                obj2 = iNotificationRepository222.listNotificationsForGroup(str2, summaryNotificationDisplayer$createSummaryNotification$1);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        summaryNotificationDisplayer$createSummaryNotification$1 = new SummaryNotificationDisplayer$createSummaryNotification$1(this, continuation);
        Object obj22 = summaryNotificationDisplayer$createSummaryNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = summaryNotificationDisplayer$createSummaryNotification$1.label;
        if (i2 != 0) {
        }
        num = (Integer) obj22;
        if (num != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i, int i2, Continuation<? super Unit> continuation) {
        SummaryNotificationDisplayer$createGrouplessSummaryNotification$1 summaryNotificationDisplayer$createGrouplessSummaryNotification$1;
        int i3;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        String str2;
        NotificationGenerationJob notificationGenerationJob2;
        int i4;
        if (continuation instanceof SummaryNotificationDisplayer$createGrouplessSummaryNotification$1) {
            summaryNotificationDisplayer$createGrouplessSummaryNotification$1 = (SummaryNotificationDisplayer$createGrouplessSummaryNotification$1) continuation;
            if ((summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label & Integer.MIN_VALUE) != 0) {
                summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label -= Integer.MIN_VALUE;
                Object obj = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    jsonPayload = notificationGenerationJob.getJsonPayload();
                    Intrinsics.checkNotNull(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i + " new messages";
                    INotificationRepository iNotificationRepository = this._dataController;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$0 = this;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$1 = notificationGenerationJob;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$2 = intentGeneratorForAttachingToNotifications;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$3 = jsonPayload;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$4 = secureRandom;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$5 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$6 = str;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$0 = i;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$1 = i2;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$2 = NotificationHelper.GROUPLESS_SUMMARY_ID;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label = 1;
                    if (iNotificationRepository.createSummaryNotification(NotificationHelper.GROUPLESS_SUMMARY_ID, NotificationHelper.GROUPLESS_SUMMARY_KEY, summaryNotificationDisplayer$createGrouplessSummaryNotification$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    summaryNotificationDisplayer = this;
                    str2 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    notificationGenerationJob2 = notificationGenerationJob;
                    i4 = -718463522;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$2;
                    i2 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$1;
                    i = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$0;
                    String str3 = (String) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$6;
                    str2 = (String) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$5;
                    secureRandom = (SecureRandom) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$4;
                    jsonPayload = (JSONObject) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$3;
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$2;
                    notificationGenerationJob2 = (NotificationGenerationJob) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$1;
                    summaryNotificationDisplayer = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = str3;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
                }
                PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), summaryNotificationDisplayer.createBaseSummaryIntent(i4, intentGeneratorForAttachingToNotifications, jsonPayload, str2));
                INotificationDisplayBuilder iNotificationDisplayBuilder = summaryNotificationDisplayer._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = summaryNotificationDisplayer._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                PendingIntent newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt, putExtra);
                NotificationCompat.Builder compatBuilder = summaryNotificationDisplayer._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob2).getCompatBuilder();
                if (notificationGenerationJob2.getOverriddenSound() != null) {
                    Intrinsics.checkNotNull(compatBuilder);
                    compatBuilder.setSound(notificationGenerationJob2.getOverriddenSound());
                }
                if (notificationGenerationJob2.getOverriddenFlags() != null) {
                    Intrinsics.checkNotNull(compatBuilder);
                    Integer overriddenFlags = notificationGenerationJob2.getOverriddenFlags();
                    Intrinsics.checkNotNull(overriddenFlags);
                    compatBuilder.setDefaults(overriddenFlags.intValue());
                }
                Intrinsics.checkNotNull(compatBuilder);
                NotificationCompat.Builder deleteIntent = compatBuilder.setContentIntent(newActionPendingIntent).setDeleteIntent(newDismissActionPendingIntent);
                Context currentContext = summaryNotificationDisplayer.getCurrentContext();
                Intrinsics.checkNotNull(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = summaryNotificationDisplayer.getCurrentContext();
                Intrinsics.checkNotNull(currentContext2);
                String str4 = str;
                deleteIntent.setContentTitle(packageManager.getApplicationLabel(currentContext2.getApplicationInfo())).setContentText(str4).setNumber(i).setSmallIcon(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultSmallIconId()).setLargeIcon(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(str2).setGroupSummary(true);
                compatBuilder.setGroupAlertBehavior(i2);
                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                inboxStyle.setBigContentTitle(str4);
                compatBuilder.setStyle(inboxStyle);
                Notification build = compatBuilder.build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                Context currentContext3 = summaryNotificationDisplayer.getCurrentContext();
                Intrinsics.checkNotNull(currentContext3);
                NotificationManagerCompat.from(currentContext3).notify(i4, build);
                return Unit.INSTANCE;
            }
        }
        summaryNotificationDisplayer$createGrouplessSummaryNotification$1 = new SummaryNotificationDisplayer$createGrouplessSummaryNotification$1(this, continuation);
        Object obj2 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label;
        if (i3 != 0) {
        }
        PendingIntent newActionPendingIntent2 = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), summaryNotificationDisplayer.createBaseSummaryIntent(i4, intentGeneratorForAttachingToNotifications, jsonPayload, str2));
        INotificationDisplayBuilder iNotificationDisplayBuilder2 = summaryNotificationDisplayer._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = summaryNotificationDisplayer._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent2 = iNotificationDisplayBuilder2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        NotificationCompat.Builder compatBuilder2 = summaryNotificationDisplayer._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob2).getCompatBuilder();
        if (notificationGenerationJob2.getOverriddenSound() != null) {
        }
        if (notificationGenerationJob2.getOverriddenFlags() != null) {
        }
        Intrinsics.checkNotNull(compatBuilder2);
        NotificationCompat.Builder deleteIntent2 = compatBuilder2.setContentIntent(newActionPendingIntent2).setDeleteIntent(newDismissActionPendingIntent2);
        Context currentContext4 = summaryNotificationDisplayer.getCurrentContext();
        Intrinsics.checkNotNull(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = summaryNotificationDisplayer.getCurrentContext();
        Intrinsics.checkNotNull(currentContext22);
        String str42 = str;
        deleteIntent2.setContentTitle(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo())).setContentText(str42).setNumber(i).setSmallIcon(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultSmallIconId()).setLargeIcon(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(str2).setGroupSummary(true);
        compatBuilder2.setGroupAlertBehavior(i2);
        NotificationCompat.InboxStyle inboxStyle2 = new NotificationCompat.InboxStyle();
        inboxStyle2.setBigContentTitle(str42);
        compatBuilder2.setStyle(inboxStyle2);
        Notification build2 = compatBuilder2.build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        Context currentContext32 = summaryNotificationDisplayer.getCurrentContext();
        Intrinsics.checkNotNull(currentContext32);
        NotificationManagerCompat.from(currentContext32).notify(i4, build2);
        return Unit.INSTANCE;
    }

    private final Intent createBaseSummaryIntent(int summaryNotificationId, IntentGeneratorForAttachingToNotifications intentGenerator, JSONObject fcmJson, String group) {
        Intent putExtra = intentGenerator.getNewBaseIntent(summaryNotificationId).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, fcmJson.toString()).putExtra("summary", group);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }
}
