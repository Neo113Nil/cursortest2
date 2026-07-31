package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.startup.IBootstrapService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.internal.display.IInAppDisplayer;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.notifications.internal.INotificationActivityOpener;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppMessagePreviewHandler.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/onesignal/inAppMessages/internal/preview/InAppMessagePreviewHandler;", "Lcom/onesignal/core/internal/startup/IBootstrapService;", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleCallback;", "_iamDisplayer", "Lcom/onesignal/inAppMessages/internal/display/IInAppDisplayer;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_notificationDisplayer", "Lcom/onesignal/notifications/internal/display/INotificationDisplayer;", "_notificationActivityOpener", "Lcom/onesignal/notifications/internal/INotificationActivityOpener;", "_notificationLifeCycle", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "_state", "Lcom/onesignal/inAppMessages/internal/state/InAppStateService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/inAppMessages/internal/display/IInAppDisplayer;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/notifications/internal/display/INotificationDisplayer;Lcom/onesignal/notifications/internal/INotificationActivityOpener;Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;Lcom/onesignal/inAppMessages/internal/state/InAppStateService;Lcom/onesignal/core/internal/time/ITime;)V", "bootstrap", "", "canOpenNotification", "", "activity", "Landroid/app/Activity;", "jsonData", "Lorg/json/JSONObject;", "(Landroid/app/Activity;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canReceiveNotification", "jsonPayload", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inAppPreviewPushUUID", "", "payload", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppMessagePreviewHandler implements IBootstrapService, INotificationLifecycleCallback {
    private final IApplicationService _applicationService;
    private final IInAppDisplayer _iamDisplayer;
    private final INotificationActivityOpener _notificationActivityOpener;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationLifecycleService _notificationLifeCycle;
    private final InAppStateService _state;
    private final ITime _time;

    public InAppMessagePreviewHandler(IInAppDisplayer _iamDisplayer, IApplicationService _applicationService, INotificationDisplayer _notificationDisplayer, INotificationActivityOpener _notificationActivityOpener, INotificationLifecycleService _notificationLifeCycle, InAppStateService _state, ITime _time) {
        Intrinsics.checkNotNullParameter(_iamDisplayer, "_iamDisplayer");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationDisplayer, "_notificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationActivityOpener, "_notificationActivityOpener");
        Intrinsics.checkNotNullParameter(_notificationLifeCycle, "_notificationLifeCycle");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, Continuation<? super Boolean> continuation) {
        InAppMessagePreviewHandler$canReceiveNotification$1 inAppMessagePreviewHandler$canReceiveNotification$1;
        int i;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (continuation instanceof InAppMessagePreviewHandler$canReceiveNotification$1) {
            inAppMessagePreviewHandler$canReceiveNotification$1 = (InAppMessagePreviewHandler$canReceiveNotification$1) continuation;
            if ((inAppMessagePreviewHandler$canReceiveNotification$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagePreviewHandler$canReceiveNotification$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagePreviewHandler$canReceiveNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagePreviewHandler$canReceiveNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boxing.boxBoolean(true);
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        IInAppDisplayer iInAppDisplayer = this._iamDisplayer;
                        inAppMessagePreviewHandler$canReceiveNotification$1.L$0 = this;
                        inAppMessagePreviewHandler$canReceiveNotification$1.label = 1;
                        obj = iInAppDisplayer.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canReceiveNotification$1);
                        if (obj != coroutine_suspended) {
                            inAppMessagePreviewHandler = this;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(jSONObject, this._time);
                        INotificationDisplayer iNotificationDisplayer = this._notificationDisplayer;
                        inAppMessagePreviewHandler$canReceiveNotification$1.label = 2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    inAppMessagePreviewHandler = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canReceiveNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(false);
            }
        }
        inAppMessagePreviewHandler$canReceiveNotification$1 = new InAppMessagePreviewHandler$canReceiveNotification$1(this, continuation);
        Object obj2 = inAppMessagePreviewHandler$canReceiveNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagePreviewHandler$canReceiveNotification$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, Continuation<? super Boolean> continuation) {
        InAppMessagePreviewHandler$canOpenNotification$1 inAppMessagePreviewHandler$canOpenNotification$1;
        int i;
        String inAppPreviewPushUUID;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (continuation instanceof InAppMessagePreviewHandler$canOpenNotification$1) {
            inAppMessagePreviewHandler$canOpenNotification$1 = (InAppMessagePreviewHandler$canOpenNotification$1) continuation;
            if ((inAppMessagePreviewHandler$canOpenNotification$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessagePreviewHandler$canOpenNotification$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessagePreviewHandler$canOpenNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessagePreviewHandler$canOpenNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boxing.boxBoolean(true);
                    }
                    INotificationActivityOpener iNotificationActivityOpener = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    inAppMessagePreviewHandler$canOpenNotification$1.L$0 = this;
                    inAppMessagePreviewHandler$canOpenNotification$1.L$1 = inAppPreviewPushUUID;
                    inAppMessagePreviewHandler$canOpenNotification$1.label = 1;
                    if (iNotificationActivityOpener.openDestinationActivity(activity, put, inAppMessagePreviewHandler$canOpenNotification$1) != coroutine_suspended) {
                        inAppMessagePreviewHandler = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessagePreviewHandler = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canOpenNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
                    }
                    return Boxing.boxBoolean(false);
                }
                String str = (String) inAppMessagePreviewHandler$canOpenNotification$1.L$1;
                InAppMessagePreviewHandler inAppMessagePreviewHandler2 = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canOpenNotification$1.L$0;
                ResultKt.throwOnFailure(obj);
                inAppPreviewPushUUID = str;
                inAppMessagePreviewHandler = inAppMessagePreviewHandler2;
                inAppMessagePreviewHandler._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                IInAppDisplayer iInAppDisplayer = inAppMessagePreviewHandler._iamDisplayer;
                inAppMessagePreviewHandler$canOpenNotification$1.L$0 = inAppMessagePreviewHandler;
                inAppMessagePreviewHandler$canOpenNotification$1.L$1 = null;
                inAppMessagePreviewHandler$canOpenNotification$1.label = 2;
                obj = iInAppDisplayer.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canOpenNotification$1);
            }
        }
        inAppMessagePreviewHandler$canOpenNotification$1 = new InAppMessagePreviewHandler$canOpenNotification$1(this, continuation);
        Object obj2 = inAppMessagePreviewHandler$canOpenNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessagePreviewHandler$canOpenNotification$1.label;
        if (i != 0) {
        }
        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        IInAppDisplayer iInAppDisplayer2 = inAppMessagePreviewHandler._iamDisplayer;
        inAppMessagePreviewHandler$canOpenNotification$1.L$0 = inAppMessagePreviewHandler;
        inAppMessagePreviewHandler$canOpenNotification$1.L$1 = null;
        inAppMessagePreviewHandler$canOpenNotification$1.label = 2;
        obj2 = iInAppDisplayer2.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canOpenNotification$1);
    }

    private final String inAppPreviewPushUUID(JSONObject payload) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = NotificationHelper.INSTANCE.getCustomJSONObject(payload);
            if (customJSONObject.has("a") && (optJSONObject = customJSONObject.optJSONObject("a")) != null && optJSONObject.has(NotificationConstants.IAM_PREVIEW_KEY)) {
                return optJSONObject.optString(NotificationConstants.IAM_PREVIEW_KEY);
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
