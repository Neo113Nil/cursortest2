package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.JSONUtils;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationOpenedProcessorHMS.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/notifications/internal/open/impl/NotificationOpenedProcessorHMS;", "Lcom/onesignal/notifications/internal/open/INotificationOpenedProcessorHMS;", "_lifecycleService", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "(Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;)V", "covertHMSOpenIntentToJson", "Lorg/json/JSONObject;", "intent", "Landroid/content/Intent;", "handleHMSNotificationOpenIntent", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleProcessJsonOpenData", "jsonData", "(Landroid/app/Activity;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reformatButtonClickAction", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOpenedProcessorHMS implements INotificationOpenedProcessorHMS {
    private final INotificationLifecycleService _lifecycleService;

    public NotificationOpenedProcessorHMS(INotificationLifecycleService _lifecycleService) {
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessorHMS
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, Continuation<? super Unit> continuation) {
        if (intent == null) {
            return Unit.INSTANCE;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return Unit.INSTANCE;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, continuation);
        return handleProcessJsonOpenData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? handleProcessJsonOpenData : Unit.INSTANCE;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!NotificationFormatHelper.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        Intrinsics.checkNotNull(intent);
        Bundle extras = intent.getExtras();
        JSONUtils jSONUtils = JSONUtils.INSTANCE;
        Intrinsics.checkNotNull(extras);
        JSONObject bundleAsJSONObject = jSONUtils.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    private final void reformatButtonClickAction(JSONObject jsonData) {
        try {
            String str = (String) NotificationHelper.INSTANCE.getCustomJSONObject(jsonData).remove(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
            if (str == null) {
                return;
            }
            jsonData.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r8.notificationOpened(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, Continuation<? super Unit> continuation) {
        NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1 notificationOpenedProcessorHMS$handleProcessJsonOpenData$1;
        Object obj;
        int i;
        NotificationOpenedProcessorHMS notificationOpenedProcessorHMS;
        if (continuation instanceof NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1) {
            notificationOpenedProcessorHMS$handleProcessJsonOpenData$1 = (NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1) continuation;
            if ((notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label -= Integer.MIN_VALUE;
                obj = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0 = this;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1 = activity;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2 = jSONObject;
                    notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label = 1;
                    obj = iNotificationLifecycleService.canOpenNotification(activity, jSONObject, notificationOpenedProcessorHMS$handleProcessJsonOpenData$1);
                    if (obj != coroutine_suspended) {
                        notificationOpenedProcessorHMS = this;
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
                jSONObject = (JSONObject) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2;
                activity = (Activity) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1;
                notificationOpenedProcessorHMS = (NotificationOpenedProcessorHMS) notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                INotificationLifecycleService iNotificationLifecycleService2 = notificationOpenedProcessorHMS._lifecycleService;
                JSONArray wrapInJsonArray = JSONUtils.INSTANCE.wrapInJsonArray(jSONObject);
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$0 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$1 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.L$2 = null;
                notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label = 2;
            }
        }
        notificationOpenedProcessorHMS$handleProcessJsonOpenData$1 = new NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1(this, continuation);
        obj = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationOpenedProcessorHMS$handleProcessJsonOpenData$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
