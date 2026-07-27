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
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppMessagePreviewHandler implements IBootstrapService, INotificationLifecycleCallback {
    private final IApplicationService _applicationService;
    private final IInAppDisplayer _iamDisplayer;
    private final INotificationActivityOpener _notificationActivityOpener;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationLifecycleService _notificationLifeCycle;
    private final InAppStateService _state;
    private final ITime _time;

    public InAppMessagePreviewHandler(IInAppDisplayer _iamDisplayer, IApplicationService _applicationService, INotificationDisplayer _notificationDisplayer, INotificationActivityOpener _notificationActivityOpener, INotificationLifecycleService _notificationLifeCycle, InAppStateService _state, ITime _time) {
        i.e(_iamDisplayer, "_iamDisplayer");
        i.e(_applicationService, "_applicationService");
        i.e(_notificationDisplayer, "_notificationDisplayer");
        i.e(_notificationActivityOpener, "_notificationActivityOpener");
        i.e(_notificationLifeCycle, "_notificationLifeCycle");
        i.e(_state, "_state");
        i.e(_time, "_time");
        this._iamDisplayer = _iamDisplayer;
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._notificationActivityOpener = _notificationActivityOpener;
        this._notificationLifeCycle = _notificationLifeCycle;
        this._state = _state;
        this._time = _time;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = NotificationHelper.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has("a") && (optJSONObject = customJSONObject.optJSONObject("a")) != null && optJSONObject.has(NotificationConstants.IAM_PREVIEW_KEY)) {
                return optJSONObject.optString(NotificationConstants.IAM_PREVIEW_KEY);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        InAppMessagePreviewHandler$canOpenNotification$1 inAppMessagePreviewHandler$canOpenNotification$1;
        Object obj;
        EnumC1260a enumC1260a;
        int i2;
        String inAppPreviewPushUUID;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (interfaceC1218d instanceof InAppMessagePreviewHandler$canOpenNotification$1) {
            inAppMessagePreviewHandler$canOpenNotification$1 = (InAppMessagePreviewHandler$canOpenNotification$1) interfaceC1218d;
            int i3 = inAppMessagePreviewHandler$canOpenNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagePreviewHandler$canOpenNotification$1.label = i3 - Integer.MIN_VALUE;
                obj = inAppMessagePreviewHandler$canOpenNotification$1.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagePreviewHandler$canOpenNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    INotificationActivityOpener iNotificationActivityOpener = this._notificationActivityOpener;
                    JSONArray put = new JSONArray().put(jSONObject);
                    i.d(put, "put(...)");
                    inAppMessagePreviewHandler$canOpenNotification$1.L$0 = this;
                    inAppMessagePreviewHandler$canOpenNotification$1.L$1 = inAppPreviewPushUUID;
                    inAppMessagePreviewHandler$canOpenNotification$1.label = 1;
                    if (iNotificationActivityOpener.openDestinationActivity(activity, put, inAppMessagePreviewHandler$canOpenNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppMessagePreviewHandler = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        inAppMessagePreviewHandler = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canOpenNotification$1.L$0;
                        g.y(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
                        }
                        return Boolean.FALSE;
                    }
                    String str = (String) inAppMessagePreviewHandler$canOpenNotification$1.L$1;
                    InAppMessagePreviewHandler inAppMessagePreviewHandler2 = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canOpenNotification$1.L$0;
                    g.y(obj);
                    inAppPreviewPushUUID = str;
                    inAppMessagePreviewHandler = inAppMessagePreviewHandler2;
                }
                inAppMessagePreviewHandler._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                IInAppDisplayer iInAppDisplayer = inAppMessagePreviewHandler._iamDisplayer;
                inAppMessagePreviewHandler$canOpenNotification$1.L$0 = inAppMessagePreviewHandler;
                inAppMessagePreviewHandler$canOpenNotification$1.L$1 = null;
                inAppMessagePreviewHandler$canOpenNotification$1.label = 2;
                obj = iInAppDisplayer.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canOpenNotification$1);
                if (obj == enumC1260a) {
                    return enumC1260a;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return Boolean.FALSE;
            }
        }
        inAppMessagePreviewHandler$canOpenNotification$1 = new InAppMessagePreviewHandler$canOpenNotification$1(this, interfaceC1218d);
        obj = inAppMessagePreviewHandler$canOpenNotification$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = inAppMessagePreviewHandler$canOpenNotification$1.label;
        if (i2 != 0) {
        }
        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
        IInAppDisplayer iInAppDisplayer2 = inAppMessagePreviewHandler._iamDisplayer;
        inAppMessagePreviewHandler$canOpenNotification$1.L$0 = inAppMessagePreviewHandler;
        inAppMessagePreviewHandler$canOpenNotification$1.L$1 = null;
        inAppMessagePreviewHandler$canOpenNotification$1.label = 2;
        obj = iInAppDisplayer2.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canOpenNotification$1);
        if (obj == enumC1260a) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        InAppMessagePreviewHandler$canReceiveNotification$1 inAppMessagePreviewHandler$canReceiveNotification$1;
        int i2;
        InAppMessagePreviewHandler inAppMessagePreviewHandler;
        if (interfaceC1218d instanceof InAppMessagePreviewHandler$canReceiveNotification$1) {
            inAppMessagePreviewHandler$canReceiveNotification$1 = (InAppMessagePreviewHandler$canReceiveNotification$1) interfaceC1218d;
            int i3 = inAppMessagePreviewHandler$canReceiveNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessagePreviewHandler$canReceiveNotification$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessagePreviewHandler$canReceiveNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessagePreviewHandler$canReceiveNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    String inAppPreviewPushUUID = inAppPreviewPushUUID(jSONObject);
                    if (inAppPreviewPushUUID == null) {
                        return Boolean.TRUE;
                    }
                    if (this._applicationService.isInForeground()) {
                        this._state.setInAppMessageIdShowing(inAppPreviewPushUUID);
                        IInAppDisplayer iInAppDisplayer = this._iamDisplayer;
                        inAppMessagePreviewHandler$canReceiveNotification$1.L$0 = this;
                        inAppMessagePreviewHandler$canReceiveNotification$1.label = 1;
                        obj = iInAppDisplayer.displayPreviewMessage(inAppPreviewPushUUID, inAppMessagePreviewHandler$canReceiveNotification$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessagePreviewHandler = this;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(jSONObject, this._time);
                        INotificationDisplayer iNotificationDisplayer = this._notificationDisplayer;
                        inAppMessagePreviewHandler$canReceiveNotification$1.label = 2;
                        if (iNotificationDisplayer.displayNotification(notificationGenerationJob, inAppMessagePreviewHandler$canReceiveNotification$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    }
                } else if (i2 == 1) {
                    inAppMessagePreviewHandler = (InAppMessagePreviewHandler) inAppMessagePreviewHandler$canReceiveNotification$1.L$0;
                    g.y(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        inAppMessagePreviewHandler._state.setInAppMessageIdShowing(null);
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return Boolean.FALSE;
            }
        }
        inAppMessagePreviewHandler$canReceiveNotification$1 = new InAppMessagePreviewHandler$canReceiveNotification$1(this, interfaceC1218d);
        Object obj2 = inAppMessagePreviewHandler$canReceiveNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessagePreviewHandler$canReceiveNotification$1.label;
        if (i2 != 0) {
        }
        return Boolean.FALSE;
    }
}
