package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationOpenedProcessor.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010 \u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010!J,\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/onesignal/notifications/internal/open/impl/NotificationOpenedProcessor;", "Lcom/onesignal/notifications/internal/open/INotificationOpenedProcessor;", "_summaryManager", "Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;", "_dataController", "Lcom/onesignal/notifications/internal/data/INotificationRepository;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_lifecycleService", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "(Lcom/onesignal/notifications/internal/summary/INotificationSummaryManager;Lcom/onesignal/notifications/internal/data/INotificationRepository;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;)V", "addChildNotifications", "", "dataArray", "Lorg/json/JSONArray;", "summaryGroup", "", "(Lorg/json/JSONArray;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearStatusBarNotifications", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDismissFromActionButtonPress", "intent", "Landroid/content/Intent;", "isOneSignalIntent", "", "markNotificationsConsumed", "dismissed", "(Landroid/content/Context;Landroid/content/Intent;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newContentValuesWithConsumed", "Landroid/content/ContentValues;", "processFromContext", "(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processIntent", "processToOpenIntent", "Lcom/onesignal/notifications/internal/open/impl/NotificationIntentExtras;", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOpenedProcessor implements INotificationOpenedProcessor {
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationSummaryManager _summaryManager;

    public NotificationOpenedProcessor(INotificationSummaryManager _summaryManager, INotificationRepository _dataController, ConfigModelStore _configModelStore, INotificationLifecycleService _lifecycleService) {
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessor
    public Object processFromContext(Context context, Intent intent, Continuation<? super Unit> continuation) {
        if (!isOneSignalIntent(intent)) {
            return Unit.INSTANCE;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, continuation);
        return processIntent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? processIntent : Unit.INSTANCE;
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA) || intent.hasExtra("summary") || intent.hasExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            Intrinsics.checkNotNull(context);
            NotificationManagerCompat.from(context).cancel(intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016c, code lost:
    
        if (r9._lifecycleService.notificationOpened((android.app.Activity) r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, Continuation<? super Unit> continuation) {
        NotificationOpenedProcessor$processIntent$1 notificationOpenedProcessor$processIntent$1;
        Object coroutine_suspended;
        int i;
        String stringExtra;
        boolean booleanExtra;
        NotificationOpenedProcessor notificationOpenedProcessor;
        NotificationIntentExtras notificationIntentExtras;
        Object processToOpenIntent;
        Intent intent2;
        NotificationIntentExtras notificationIntentExtras2;
        NotificationOpenedProcessor notificationOpenedProcessor2;
        Context context2;
        boolean z;
        String str;
        String stringExtra2;
        INotificationSummaryManager iNotificationSummaryManager;
        Intent intent3;
        Context context3;
        NotificationOpenedProcessor notificationOpenedProcessor3;
        if (continuation instanceof NotificationOpenedProcessor$processIntent$1) {
            notificationOpenedProcessor$processIntent$1 = (NotificationOpenedProcessor$processIntent$1) continuation;
            if ((notificationOpenedProcessor$processIntent$1.label & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$processIntent$1.label -= Integer.MIN_VALUE;
                Object obj = notificationOpenedProcessor$processIntent$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationOpenedProcessor$processIntent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    stringExtra = intent.getStringExtra("summary");
                    booleanExtra = intent.getBooleanExtra("dismissed", false);
                    if (!booleanExtra) {
                        notificationOpenedProcessor$processIntent$1.L$0 = this;
                        notificationOpenedProcessor$processIntent$1.L$1 = context;
                        notificationOpenedProcessor$processIntent$1.L$2 = intent;
                        notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                        notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                        notificationOpenedProcessor$processIntent$1.label = 1;
                        processToOpenIntent = processToOpenIntent(context, intent, stringExtra, notificationOpenedProcessor$processIntent$1);
                        if (processToOpenIntent != coroutine_suspended) {
                            notificationOpenedProcessor = this;
                        }
                        return coroutine_suspended;
                    }
                    notificationOpenedProcessor = this;
                    notificationIntentExtras = null;
                    notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
                    notificationOpenedProcessor$processIntent$1.L$1 = context;
                    notificationOpenedProcessor$processIntent$1.L$2 = intent;
                    notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                    notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
                    notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                    notificationOpenedProcessor$processIntent$1.label = 2;
                    if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) != coroutine_suspended) {
                        NotificationIntentExtras notificationIntentExtras3 = notificationIntentExtras;
                        intent2 = intent;
                        notificationIntentExtras2 = notificationIntentExtras3;
                        notificationOpenedProcessor2 = notificationOpenedProcessor;
                        context2 = context;
                        z = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                            notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor2;
                            notificationOpenedProcessor$processIntent$1.L$1 = context2;
                            notificationOpenedProcessor$processIntent$1.L$2 = intent2;
                            notificationOpenedProcessor$processIntent$1.L$3 = notificationIntentExtras2;
                            notificationOpenedProcessor$processIntent$1.L$4 = null;
                            notificationOpenedProcessor$processIntent$1.Z$0 = z;
                            notificationOpenedProcessor$processIntent$1.label = 3;
                            if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, notificationOpenedProcessor$processIntent$1) != coroutine_suspended) {
                            }
                        }
                        Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        z = notificationOpenedProcessor$processIntent$1.Z$0;
                        notificationIntentExtras2 = (NotificationIntentExtras) notificationOpenedProcessor$processIntent$1.L$3;
                        intent3 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                        context3 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                        notificationOpenedProcessor3 = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        context2 = context3;
                        notificationOpenedProcessor2 = notificationOpenedProcessor3;
                        intent2 = intent3;
                        Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                            Logging.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                        }
                        if (!z) {
                            if (!(context2 instanceof Activity)) {
                                Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                            } else {
                                Intrinsics.checkNotNull(notificationIntentExtras2);
                                JSONArray dataArray = notificationIntentExtras2.getDataArray();
                                notificationOpenedProcessor$processIntent$1.L$0 = null;
                                notificationOpenedProcessor$processIntent$1.L$1 = null;
                                notificationOpenedProcessor$processIntent$1.L$2 = null;
                                notificationOpenedProcessor$processIntent$1.L$3 = null;
                                notificationOpenedProcessor$processIntent$1.L$4 = null;
                                notificationOpenedProcessor$processIntent$1.label = 4;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    z = notificationOpenedProcessor$processIntent$1.Z$0;
                    notificationIntentExtras2 = (NotificationIntentExtras) notificationOpenedProcessor$processIntent$1.L$4;
                    str = (String) notificationOpenedProcessor$processIntent$1.L$3;
                    intent2 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                    context2 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                    notificationOpenedProcessor2 = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                        iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                        notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor2;
                        notificationOpenedProcessor$processIntent$1.L$1 = context2;
                        notificationOpenedProcessor$processIntent$1.L$2 = intent2;
                        notificationOpenedProcessor$processIntent$1.L$3 = notificationIntentExtras2;
                        notificationOpenedProcessor$processIntent$1.L$4 = null;
                        notificationOpenedProcessor$processIntent$1.Z$0 = z;
                        notificationOpenedProcessor$processIntent$1.label = 3;
                        if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, notificationOpenedProcessor$processIntent$1) != coroutine_suspended) {
                            intent3 = intent2;
                            context3 = context2;
                            notificationOpenedProcessor3 = notificationOpenedProcessor2;
                            context2 = context3;
                            notificationOpenedProcessor2 = notificationOpenedProcessor3;
                            intent2 = intent3;
                        }
                        return coroutine_suspended;
                    }
                    Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                    }
                    if (!z) {
                    }
                    return Unit.INSTANCE;
                }
                boolean z2 = notificationOpenedProcessor$processIntent$1.Z$0;
                String str2 = (String) notificationOpenedProcessor$processIntent$1.L$3;
                Intent intent4 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                Context context4 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                ResultKt.throwOnFailure(obj);
                booleanExtra = z2;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                notificationIntentExtras = (NotificationIntentExtras) processToOpenIntent;
                if (notificationIntentExtras == null) {
                    return Unit.INSTANCE;
                }
                notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
                notificationOpenedProcessor$processIntent$1.L$1 = context;
                notificationOpenedProcessor$processIntent$1.L$2 = intent;
                notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
                notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                notificationOpenedProcessor$processIntent$1.label = 2;
                if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        notificationOpenedProcessor$processIntent$1 = new NotificationOpenedProcessor$processIntent$1(this, continuation);
        Object obj2 = notificationOpenedProcessor$processIntent$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationOpenedProcessor$processIntent$1.label;
        if (i != 0) {
        }
        notificationIntentExtras = (NotificationIntentExtras) processToOpenIntent;
        if (notificationIntentExtras == null) {
        }
        notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
        notificationOpenedProcessor$processIntent$1.L$1 = context;
        notificationOpenedProcessor$processIntent$1.L$2 = intent;
        notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
        notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
        notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
        notificationOpenedProcessor$processIntent$1.label = 2;
        if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, Continuation<? super NotificationIntentExtras> continuation) {
        NotificationOpenedProcessor$processToOpenIntent$1 notificationOpenedProcessor$processToOpenIntent$1;
        Object obj;
        int i;
        NotificationOpenedProcessor notificationOpenedProcessor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (continuation instanceof NotificationOpenedProcessor$processToOpenIntent$1) {
            notificationOpenedProcessor$processToOpenIntent$1 = (NotificationOpenedProcessor$processToOpenIntent$1) continuation;
            if ((notificationOpenedProcessor$processToOpenIntent$1.label & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$processToOpenIntent$1.label -= Integer.MIN_VALUE;
                obj = notificationOpenedProcessor$processToOpenIntent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationOpenedProcessor$processToOpenIntent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA));
                        try {
                        } catch (JSONException e) {
                            e = e;
                            notificationOpenedProcessor = this;
                            jSONObject = jSONObject2;
                            e.printStackTrace();
                            jSONArray = null;
                            if (str != null) {
                            }
                            Intrinsics.checkNotNull(jSONArray);
                            Intrinsics.checkNotNull(jSONObject);
                            return new NotificationIntentExtras(jSONArray, jSONObject);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        notificationOpenedProcessor = this;
                        jSONObject = null;
                    }
                    if (!(context instanceof Activity)) {
                        Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                        notificationOpenedProcessor = this;
                        jSONObject = jSONObject2;
                        jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
                        intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                        jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
                        if (str != null) {
                            Intrinsics.checkNotNull(jSONArray);
                            notificationOpenedProcessor$processToOpenIntent$1.L$0 = jSONArray;
                            notificationOpenedProcessor$processToOpenIntent$1.L$1 = jSONObject;
                            notificationOpenedProcessor$processToOpenIntent$1.L$2 = null;
                            notificationOpenedProcessor$processToOpenIntent$1.L$3 = null;
                            notificationOpenedProcessor$processToOpenIntent$1.label = 2;
                        }
                        Intrinsics.checkNotNull(jSONArray);
                        Intrinsics.checkNotNull(jSONObject);
                        return new NotificationIntentExtras(jSONArray, jSONObject);
                    }
                    notificationOpenedProcessor$processToOpenIntent$1.L$0 = this;
                    notificationOpenedProcessor$processToOpenIntent$1.L$1 = intent;
                    notificationOpenedProcessor$processToOpenIntent$1.L$2 = str;
                    notificationOpenedProcessor$processToOpenIntent$1.L$3 = jSONObject2;
                    notificationOpenedProcessor$processToOpenIntent$1.label = 1;
                    Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, notificationOpenedProcessor$processToOpenIntent$1);
                    if (canOpenNotification != coroutine_suspended) {
                        obj = canOpenNotification;
                        jSONObject = jSONObject2;
                        notificationOpenedProcessor = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) notificationOpenedProcessor$processToOpenIntent$1.L$1;
                    jSONArray = (JSONArray) notificationOpenedProcessor$processToOpenIntent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNull(jSONArray);
                    Intrinsics.checkNotNull(jSONObject);
                    return new NotificationIntentExtras(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) notificationOpenedProcessor$processToOpenIntent$1.L$3;
                str = (String) notificationOpenedProcessor$processToOpenIntent$1.L$2;
                intent = (Intent) notificationOpenedProcessor$processToOpenIntent$1.L$1;
                notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$processToOpenIntent$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (JSONException e3) {
                    e = e3;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    Intrinsics.checkNotNull(jSONArray);
                    Intrinsics.checkNotNull(jSONObject);
                    return new NotificationIntentExtras(jSONArray, jSONObject);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
                intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
                if (str != null) {
                }
                Intrinsics.checkNotNull(jSONArray);
                Intrinsics.checkNotNull(jSONObject);
                return new NotificationIntentExtras(jSONArray, jSONObject);
            }
        }
        notificationOpenedProcessor$processToOpenIntent$1 = new NotificationOpenedProcessor$processToOpenIntent$1(this, continuation);
        obj = notificationOpenedProcessor$processToOpenIntent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationOpenedProcessor$processToOpenIntent$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
        intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
        jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
        if (str != null) {
        }
        Intrinsics.checkNotNull(jSONArray);
        Intrinsics.checkNotNull(jSONObject);
        return new NotificationIntentExtras(jSONArray, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[LOOP:0: B:11:0x004c->B:13:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, Continuation<? super Unit> continuation) {
        NotificationOpenedProcessor$addChildNotifications$1 notificationOpenedProcessor$addChildNotifications$1;
        int i;
        Iterator it;
        if (continuation instanceof NotificationOpenedProcessor$addChildNotifications$1) {
            notificationOpenedProcessor$addChildNotifications$1 = (NotificationOpenedProcessor$addChildNotifications$1) continuation;
            if ((notificationOpenedProcessor$addChildNotifications$1.label & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$addChildNotifications$1.label -= Integer.MIN_VALUE;
                Object obj = notificationOpenedProcessor$addChildNotifications$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationOpenedProcessor$addChildNotifications$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationOpenedProcessor$addChildNotifications$1.L$0 = jSONArray;
                    notificationOpenedProcessor$addChildNotifications$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationOpenedProcessor$addChildNotifications$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) notificationOpenedProcessor$addChildNotifications$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((INotificationRepository.NotificationData) it.next()).getFullData()));
                }
                return Unit.INSTANCE;
            }
        }
        notificationOpenedProcessor$addChildNotifications$1 = new NotificationOpenedProcessor$addChildNotifications$1(this, continuation);
        Object obj2 = notificationOpenedProcessor$addChildNotifications$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationOpenedProcessor$addChildNotifications$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) != r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z, Continuation<? super Unit> continuation) {
        NotificationOpenedProcessor$markNotificationsConsumed$1 notificationOpenedProcessor$markNotificationsConsumed$1;
        int i;
        NotificationOpenedProcessor notificationOpenedProcessor;
        String str;
        if (continuation instanceof NotificationOpenedProcessor$markNotificationsConsumed$1) {
            notificationOpenedProcessor$markNotificationsConsumed$1 = (NotificationOpenedProcessor$markNotificationsConsumed$1) continuation;
            if ((notificationOpenedProcessor$markNotificationsConsumed$1.label & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$markNotificationsConsumed$1.label -= Integer.MIN_VALUE;
                NotificationOpenedProcessor$markNotificationsConsumed$1 notificationOpenedProcessor$markNotificationsConsumed$12 = notificationOpenedProcessor$markNotificationsConsumed$1;
                Object obj = notificationOpenedProcessor$markNotificationsConsumed$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationOpenedProcessor$markNotificationsConsumed$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$0 = this;
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$1 = intent;
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$2 = stringExtra;
                    notificationOpenedProcessor$markNotificationsConsumed$12.Z$0 = z;
                    notificationOpenedProcessor$markNotificationsConsumed$12.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, notificationOpenedProcessor$markNotificationsConsumed$12) != coroutine_suspended) {
                        notificationOpenedProcessor = this;
                        str = stringExtra;
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
                z = notificationOpenedProcessor$markNotificationsConsumed$12.Z$0;
                String str2 = (String) notificationOpenedProcessor$markNotificationsConsumed$12.L$2;
                intent = (Intent) notificationOpenedProcessor$markNotificationsConsumed$12.L$1;
                notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$markNotificationsConsumed$12.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                boolean z2 = z;
                INotificationRepository iNotificationRepository = notificationOpenedProcessor._dataController;
                int intExtra = intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0);
                boolean clearGroupOnSummaryClick = notificationOpenedProcessor._configModelStore.getModel().getClearGroupOnSummaryClick();
                notificationOpenedProcessor$markNotificationsConsumed$12.L$0 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.L$1 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.L$2 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.label = 2;
            }
        }
        notificationOpenedProcessor$markNotificationsConsumed$1 = new NotificationOpenedProcessor$markNotificationsConsumed$1(this, continuation);
        NotificationOpenedProcessor$markNotificationsConsumed$1 notificationOpenedProcessor$markNotificationsConsumed$122 = notificationOpenedProcessor$markNotificationsConsumed$1;
        Object obj2 = notificationOpenedProcessor$markNotificationsConsumed$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationOpenedProcessor$markNotificationsConsumed$122.label;
        if (i != 0) {
        }
        boolean z22 = z;
        INotificationRepository iNotificationRepository2 = notificationOpenedProcessor._dataController;
        int intExtra2 = intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0);
        boolean clearGroupOnSummaryClick2 = notificationOpenedProcessor._configModelStore.getModel().getClearGroupOnSummaryClick();
        notificationOpenedProcessor$markNotificationsConsumed$122.L$0 = null;
        notificationOpenedProcessor$markNotificationsConsumed$122.L$1 = null;
        notificationOpenedProcessor$markNotificationsConsumed$122.L$2 = null;
        notificationOpenedProcessor$markNotificationsConsumed$122.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, Continuation<? super Unit> continuation) {
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, continuation);
            return clearNotificationOnSummaryClick == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearNotificationOnSummaryClick : Unit.INSTANCE;
        }
        if (NotificationHelper.INSTANCE.getGrouplessNotifsCount(context) < 1) {
            NotificationHelper.INSTANCE.getNotificationManager(context).cancel(NotificationHelper.GROUPLESS_SUMMARY_ID);
        }
        return Unit.INSTANCE;
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
            return contentValues;
        }
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, (Integer) 1);
        return contentValues;
    }
}
