package com.onesignal.notifications.internal.bundle.impl;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationPriorityMapper;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationBundleProcessor implements INotificationBundleProcessor {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_ACTION = "__DEFAULT__";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";
    private final ITime _time;
    private final INotificationGenerationWorkManager _workManager;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationBundleProcessor(INotificationGenerationWorkManager _workManager, ITime _time) {
        i.e(_workManager, "_workManager");
        i.e(_time, "_time");
        this._workManager = _workManager;
        this._time = _time;
    }

    private final void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                    i.b(jSONObject);
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String string = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put(OutcomeConstants.OUTCOME_ID, str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                        jSONObject3.put("icon", jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                        jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID, DEFAULT_ACTION);
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, jSONObject2.toString());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.notifications.internal.bundle.INotificationBundleProcessor
    public INotificationBundleProcessor.ProcessedBundleResult processBundleFromReceiver(Context context, Bundle bundle) {
        i.e(context, "context");
        i.e(bundle, "bundle");
        INotificationBundleProcessor.ProcessedBundleResult processedBundleResult = new INotificationBundleProcessor.ProcessedBundleResult();
        NotificationFormatHelper notificationFormatHelper = NotificationFormatHelper.INSTANCE;
        if (!notificationFormatHelper.isOneSignalBundle(bundle)) {
            return processedBundleResult;
        }
        processedBundleResult.setOneSignalPayload(true);
        maximizeButtonsFromBundle(bundle);
        JSONObject bundleAsJSONObject = JSONUtils.INSTANCE.bundleAsJSONObject(bundle);
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        boolean z = bundle.getBoolean("is_restoring", false);
        NotificationPriorityMapper notificationPriorityMapper = NotificationPriorityMapper.INSTANCE;
        String string = bundle.getString("pri", CommonUrlParts.Values.FALSE_INTEGER);
        i.d(string, "getString(...)");
        boolean isHighPriority = notificationPriorityMapper.isHighPriority(Integer.parseInt(string));
        String oSNotificationIdFromJson = notificationFormatHelper.getOSNotificationIdFromJson(bundleAsJSONObject);
        int i2 = bundle.containsKey(ANDROID_NOTIFICATION_ID) ? bundle.getInt(ANDROID_NOTIFICATION_ID) : 0;
        INotificationGenerationWorkManager iNotificationGenerationWorkManager = this._workManager;
        i.b(oSNotificationIdFromJson);
        processedBundleResult.setWorkManagerProcessing(iNotificationGenerationWorkManager.beginEnqueueingWork(context, oSNotificationIdFromJson, i2, bundleAsJSONObject, currentTimeMillis, z, isHighPriority));
        return processedBundleResult;
    }
}
