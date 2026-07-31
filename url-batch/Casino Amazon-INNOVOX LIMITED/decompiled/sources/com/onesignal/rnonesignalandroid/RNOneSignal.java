package com.onesignal.rnonesignalandroid;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.onesignal.Continue;
import com.onesignal.ContinueResult;
import com.onesignal.OneSignal;
import com.onesignal.common.OneSignalWrapper;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessageClickEvent;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageDidDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageDidDisplayEvent;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessageWillDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDisplayEvent;
import com.onesignal.notifications.IDisplayableNotification;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.IPermissionObserver;
import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.state.UserChangedState;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class RNOneSignal extends NativeOneSignalSpec implements IPushSubscriptionObserver, IPermissionObserver, IUserStateObserver, LifecycleEventListener, INotificationLifecycleListener {
    private static final String LOCATION_MODULE_NOT_AVAILABLE = "OneSignal location module is not available. Add the location dependency to use OneSignal.Location.";
    public static final String NAME = "OneSignal";
    private static RNOneSignal currentInstance;
    private boolean hasAddedInAppMessageClickListener;
    private boolean hasAddedInAppMessageLifecycleListener;
    private boolean hasAddedNotificationClickListener;
    private boolean hasAddedNotificationForegroundListener;
    private boolean hasSetPermissionObserver;
    private boolean hasSetPushSubscriptionObserver;
    private boolean hasSetUserStateObserver;
    private final HashMap<String, INotificationWillDisplayEvent> notificationWillDisplayCache;
    private boolean oneSignalInitDone;
    private final HashMap<String, INotificationWillDisplayEvent> preventDefaultCache;
    private final IInAppMessageClickListener rnInAppClickListener;
    private final IInAppMessageLifecycleListener rnInAppLifecycleListener;
    private final INotificationClickListener rnNotificationClickListener;

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void enterLiveActivity(String str, String str2, Callback callback) {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void exitLiveActivity(String str, Callback callback) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void registerForProvisionalAuthorization(Callback callback) {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removePushToStartToken(String str) {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setPushToStartToken(String str, String str2) {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setupDefaultLiveActivity(ReadableMap readableMap) {
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void startDefaultLiveActivity(String str, ReadableMap readableMap, ReadableMap readableMap2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logJSONException(String str, JSONException jSONException) {
        Logging.error("Failed to serialize payload for " + str, jSONException);
    }

    private void logLocationModuleNotAvailable(Throwable th) {
        Logging.error(LOCATION_MODULE_NOT_AVAILABLE, th);
    }

    private void removeObservers() {
        if (!this.oneSignalInitDone) {
            Logging.debug("OneSignal React-Native SDK not initialized yet. Could not remove observers.", null);
            return;
        }
        removePermissionObserver();
        removePushSubscriptionObserver();
        removeUserStateObserver();
        if (this.hasAddedInAppMessageClickListener) {
            OneSignal.getInAppMessages().mo3817removeClickListener(this.rnInAppClickListener);
            this.hasAddedInAppMessageClickListener = false;
        }
        if (this.hasAddedInAppMessageLifecycleListener) {
            OneSignal.getInAppMessages().mo3818removeLifecycleListener(this.rnInAppLifecycleListener);
            this.hasAddedInAppMessageLifecycleListener = false;
        }
        if (this.hasAddedNotificationClickListener) {
            OneSignal.getNotifications().mo3831removeClickListener(this.rnNotificationClickListener);
            this.hasAddedNotificationClickListener = false;
        }
        if (this.hasAddedNotificationForegroundListener) {
            OneSignal.getNotifications().mo3832removeForegroundLifecycleListener(this);
            this.hasAddedNotificationForegroundListener = false;
        }
    }

    public RNOneSignal(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.hasSetPermissionObserver = false;
        this.hasSetPushSubscriptionObserver = false;
        this.hasSetUserStateObserver = false;
        this.notificationWillDisplayCache = new HashMap<>();
        this.preventDefaultCache = new HashMap<>();
        this.hasAddedNotificationForegroundListener = false;
        this.hasAddedInAppMessageLifecycleListener = false;
        this.hasAddedNotificationClickListener = false;
        this.hasAddedInAppMessageClickListener = false;
        this.rnInAppClickListener = new IInAppMessageClickListener() { // from class: com.onesignal.rnonesignalandroid.RNOneSignal.1
            @Override // com.onesignal.inAppMessages.IInAppMessageClickListener
            public void onClick(IInAppMessageClickEvent iInAppMessageClickEvent) {
                try {
                    RNOneSignal.this.emitOnInAppMessageClicked(RNUtils.convertHashMapToWritableMap(RNUtils.convertInAppMessageClickEventToMap(iInAppMessageClickEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onInAppMessageClicked", e);
                }
            }
        };
        this.rnInAppLifecycleListener = new IInAppMessageLifecycleListener() { // from class: com.onesignal.rnonesignalandroid.RNOneSignal.2
            @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
            public void onWillDisplay(IInAppMessageWillDisplayEvent iInAppMessageWillDisplayEvent) {
                try {
                    RNOneSignal.this.emitOnInAppMessageWillDisplay(RNUtils.convertHashMapToWritableMap(RNUtils.convertInAppMessageWillDisplayEventToMap(iInAppMessageWillDisplayEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onInAppMessageWillDisplay", e);
                }
            }

            @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
            public void onDidDisplay(IInAppMessageDidDisplayEvent iInAppMessageDidDisplayEvent) {
                try {
                    RNOneSignal.this.emitOnInAppMessageDidDisplay(RNUtils.convertHashMapToWritableMap(RNUtils.convertInAppMessageDidDisplayEventToMap(iInAppMessageDidDisplayEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onInAppMessageDidDisplay", e);
                }
            }

            @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
            public void onWillDismiss(IInAppMessageWillDismissEvent iInAppMessageWillDismissEvent) {
                try {
                    RNOneSignal.this.emitOnInAppMessageWillDismiss(RNUtils.convertHashMapToWritableMap(RNUtils.convertInAppMessageWillDismissEventToMap(iInAppMessageWillDismissEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onInAppMessageWillDismiss", e);
                }
            }

            @Override // com.onesignal.inAppMessages.IInAppMessageLifecycleListener
            public void onDidDismiss(IInAppMessageDidDismissEvent iInAppMessageDidDismissEvent) {
                try {
                    RNOneSignal.this.emitOnInAppMessageDidDismiss(RNUtils.convertHashMapToWritableMap(RNUtils.convertInAppMessageDidDismissEventToMap(iInAppMessageDidDismissEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onInAppMessageDidDismiss", e);
                }
            }
        };
        this.rnNotificationClickListener = new INotificationClickListener() { // from class: com.onesignal.rnonesignalandroid.RNOneSignal.3
            @Override // com.onesignal.notifications.INotificationClickListener
            public void onClick(INotificationClickEvent iNotificationClickEvent) {
                try {
                    RNOneSignal.this.emitOnNotificationClicked(RNUtils.convertHashMapToWritableMap(RNUtils.convertNotificationClickEventToMap(iNotificationClickEvent)));
                } catch (JSONException e) {
                    RNOneSignal.this.logJSONException("onNotificationClicked", e);
                }
            }
        };
        reactApplicationContext.addLifecycleEventListener(this);
        RNOneSignal rNOneSignal = currentInstance;
        if (rNOneSignal != null && rNOneSignal != this) {
            rNOneSignal.removeObservers();
        }
        currentInstance = this;
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OneSignal";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        removeObservers();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        removeObservers();
        super.invalidate();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void initialize(String str) {
        OneSignalWrapper.setSdkType("reactnative");
        OneSignalWrapper.setSdkVersion("050504");
        if (this.oneSignalInitDone) {
            Logging.debug("Already initialized the OneSignal React-Native SDK", null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Context currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = reactApplicationContext.getApplicationContext();
        }
        Logging.debug("OneSignal initialize using context: " + currentActivity.getClass().getSimpleName(), null);
        OneSignal.initWithContext(currentActivity, str);
        this.oneSignalInitDone = true;
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setPrivacyConsentGiven(boolean z) {
        OneSignal.setConsentGiven(z);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setPrivacyConsentRequired(boolean z) {
        OneSignal.setConsentRequired(z);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setLogLevel(double d) {
        OneSignal.getDebug().setLogLevel(LogLevel.fromInt((int) d));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setAlertLevel(double d) {
        OneSignal.getDebug().setAlertLevel(LogLevel.fromInt((int) d));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addInAppMessageClickListener() {
        if (this.hasAddedInAppMessageClickListener) {
            return;
        }
        OneSignal.getInAppMessages().mo3812addClickListener(this.rnInAppClickListener);
        this.hasAddedInAppMessageClickListener = true;
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addInAppMessagesLifecycleListener() {
        if (this.hasAddedInAppMessageLifecycleListener) {
            return;
        }
        OneSignal.getInAppMessages().mo3813addLifecycleListener(this.rnInAppLifecycleListener);
        this.hasAddedInAppMessageLifecycleListener = true;
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getPaused(Promise promise) {
        promise.resolve(Boolean.valueOf(OneSignal.getInAppMessages().getPaused()));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void paused(boolean z) {
        OneSignal.getInAppMessages().setPaused(z);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addTrigger(String str, String str2) {
        OneSignal.getInAppMessages().mo3814addTrigger(str, str2);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addTriggers(ReadableMap readableMap) {
        OneSignal.getInAppMessages().mo3815addTriggers(RNUtils.convertReadableMapIntoStringMap(readableMap));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeTrigger(String str) {
        OneSignal.getInAppMessages().mo3819removeTrigger(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeTriggers(ReadableArray readableArray) {
        OneSignal.getInAppMessages().mo3820removeTriggers(RNUtils.convertReadableArrayIntoStringCollection(readableArray));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void clearTriggers() {
        OneSignal.getInAppMessages().mo3816clearTriggers();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void requestLocationPermission() {
        try {
            OneSignal.getLocation().requestPermission(Continue.none());
        } catch (Throwable th) {
            logLocationModuleNotAvailable(th);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void isLocationShared(Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(OneSignal.getLocation().get_isShared()));
        } catch (Throwable th) {
            logLocationModuleNotAvailable(th);
            promise.resolve(false);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setLocationShared(boolean z) {
        try {
            OneSignal.getLocation().setShared(z);
        } catch (Throwable th) {
            logLocationModuleNotAvailable(th);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addNotificationClickListener() {
        if (this.hasAddedNotificationClickListener) {
            return;
        }
        OneSignal.getNotifications().mo3825addClickListener(this.rnNotificationClickListener);
        this.hasAddedNotificationClickListener = true;
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addNotificationForegroundLifecycleListener() {
        if (this.hasAddedNotificationForegroundListener) {
            return;
        }
        OneSignal.getNotifications().mo3826addForegroundLifecycleListener(this);
        this.hasAddedNotificationForegroundListener = true;
    }

    @Override // com.onesignal.notifications.INotificationLifecycleListener
    public void onWillDisplay(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        if (!this.hasAddedNotificationForegroundListener) {
            iNotificationWillDisplayEvent.getNotification().display();
        }
        IDisplayableNotification notification = iNotificationWillDisplayEvent.getNotification();
        String notificationId = notification.getNotificationId();
        this.notificationWillDisplayCache.put(notificationId, iNotificationWillDisplayEvent);
        iNotificationWillDisplayEvent.preventDefault();
        try {
            emitOnNotificationWillDisplay(RNUtils.convertHashMapToWritableMap(RNUtils.convertNotificationToMap(notification)));
            try {
                synchronized (iNotificationWillDisplayEvent) {
                    while (this.preventDefaultCache.containsKey(notificationId)) {
                        iNotificationWillDisplayEvent.wait();
                    }
                }
            } catch (InterruptedException e) {
                Logging.error("InterruptedException: " + e.toString(), null);
            }
        } catch (JSONException e2) {
            logJSONException("onNotificationWillDisplay", e2);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void displayNotification(String str) {
        INotificationWillDisplayEvent iNotificationWillDisplayEvent = this.notificationWillDisplayCache.get(str);
        if (iNotificationWillDisplayEvent == null) {
            Logging.error("Could not find onWillDisplayNotification event for notification with id: " + str, null);
        } else {
            iNotificationWillDisplayEvent.getNotification().display();
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void preventDefault(String str) {
        INotificationWillDisplayEvent iNotificationWillDisplayEvent = this.notificationWillDisplayCache.get(str);
        if (iNotificationWillDisplayEvent == null) {
            Logging.error("Could not find onWillDisplayNotification event for notification with id: " + str, null);
        } else {
            iNotificationWillDisplayEvent.preventDefault();
            this.preventDefaultCache.put(str, iNotificationWillDisplayEvent);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addPermissionObserver() {
        if (this.hasSetPermissionObserver) {
            return;
        }
        OneSignal.getNotifications().mo3827addPermissionObserver(this);
        this.hasSetPermissionObserver = true;
    }

    private void removePermissionObserver() {
        if (this.hasSetPermissionObserver) {
            OneSignal.getNotifications().mo3835removePermissionObserver(this);
            this.hasSetPermissionObserver = false;
        }
    }

    @Override // com.onesignal.notifications.IPermissionObserver
    public void onNotificationPermissionChange(boolean z) {
        try {
            emitOnPermissionChanged(RNUtils.convertHashMapToWritableMap(RNUtils.convertPermissionToMap(z)));
            Logging.debug("Sending permission change event", null);
        } catch (JSONException e) {
            logJSONException("onPermissionChanged", e);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void requestNotificationPermission(boolean z, final Promise promise) {
        if (OneSignal.getNotifications().getPermission()) {
            promise.resolve(true);
        } else {
            OneSignal.getNotifications().requestPermission(z, Continue.with(new Consumer() { // from class: com.onesignal.rnonesignalandroid.RNOneSignal$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    RNOneSignal.lambda$requestNotificationPermission$0(Promise.this, (ContinueResult) obj);
                }
            }));
        }
    }

    static /* synthetic */ void lambda$requestNotificationPermission$0(Promise promise, ContinueResult continueResult) {
        if (continueResult.getIsSuccess()) {
            promise.resolve(continueResult.getData());
        } else {
            promise.reject(continueResult.getThrowable().getMessage());
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void hasNotificationPermission(Promise promise) {
        promise.resolve(Boolean.valueOf(OneSignal.getNotifications().getPermission()));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void permissionNative(Promise promise) {
        if (OneSignal.getNotifications().getPermission()) {
            promise.resolve(2);
        } else {
            promise.resolve(1);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void canRequestNotificationPermission(Promise promise) {
        promise.resolve(Boolean.valueOf(OneSignal.getNotifications().mo3829getCanRequestPermission()));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void clearAllNotifications() {
        OneSignal.getNotifications().mo3828clearAllNotifications();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeNotification(double d) {
        OneSignal.getNotifications().mo3834removeNotification((int) d);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeGroupedNotifications(String str) {
        OneSignal.getNotifications().mo3833removeGroupedNotifications(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getPushSubscriptionId(Promise promise) {
        String id = OneSignal.getUser().getPushSubscription().getId();
        if (id != null && !id.isEmpty()) {
            promise.resolve(id);
        } else {
            promise.resolve(null);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getPushSubscriptionToken(Promise promise) {
        String token = OneSignal.getUser().getPushSubscription().getToken();
        if (token != null && !token.isEmpty()) {
            promise.resolve(token);
        } else {
            promise.resolve(null);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getOptedIn(Promise promise) {
        promise.resolve(Boolean.valueOf(OneSignal.getUser().getPushSubscription().getOptedIn()));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void optIn() {
        OneSignal.getUser().getPushSubscription().optIn();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void optOut() {
        OneSignal.getUser().getPushSubscription().optOut();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addPushSubscriptionObserver() {
        if (this.hasSetPushSubscriptionObserver) {
            return;
        }
        OneSignal.getUser().getPushSubscription().addObserver(this);
        this.hasSetPushSubscriptionObserver = true;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscriptionObserver
    public void onPushSubscriptionChange(PushSubscriptionChangedState pushSubscriptionChangedState) {
        try {
            emitOnSubscriptionChanged(RNUtils.convertHashMapToWritableMap(RNUtils.convertPushSubscriptionChangedStateToMap(pushSubscriptionChangedState)));
            Logging.debug("Sending subscription change event", null);
        } catch (JSONException e) {
            logJSONException("onSubscriptionChanged", e);
        }
    }

    private void removePushSubscriptionObserver() {
        if (this.hasSetPushSubscriptionObserver) {
            OneSignal.getUser().getPushSubscription().removeObserver(this);
            this.hasSetPushSubscriptionObserver = false;
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addOutcome(String str) {
        OneSignal.getSession().addOutcome(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addUniqueOutcome(String str) {
        OneSignal.getSession().addUniqueOutcome(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addOutcomeWithValue(String str, double d) {
        OneSignal.getSession().addOutcomeWithValue(str, (float) d);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void login(String str) {
        OneSignal.login(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void logout() {
        OneSignal.logout();
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void setLanguage(String str) {
        OneSignal.getUser().setLanguage(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addTag(String str, String str2) {
        OneSignal.getUser().addTag(str, str2);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeTag(String str) {
        OneSignal.getUser().removeTag(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addTags(ReadableMap readableMap) {
        OneSignal.getUser().addTags(RNUtils.convertReadableMapIntoStringMap(readableMap));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeTags(ReadableArray readableArray) {
        OneSignal.getUser().removeTags(RNUtils.convertReadableArrayIntoStringCollection(readableArray));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getTags(Promise promise) {
        Map<String, String> tags = OneSignal.getUser().getTags();
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            createMap.putString(entry.getKey(), entry.getValue());
        }
        promise.resolve(createMap);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addEmail(String str) {
        OneSignal.getUser().addEmail(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeEmail(String str) {
        OneSignal.getUser().removeEmail(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addSms(String str) {
        OneSignal.getUser().addSms(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeSms(String str) {
        OneSignal.getUser().removeSms(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addAlias(String str, String str2) {
        OneSignal.getUser().addAlias(str, str2);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeAlias(String str) {
        OneSignal.getUser().removeAlias(str);
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addAliases(ReadableMap readableMap) {
        OneSignal.getUser().addAliases(RNUtils.convertReadableMapIntoStringMap(readableMap));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void removeAliases(ReadableArray readableArray) {
        OneSignal.getUser().removeAliases(RNUtils.convertReadableArrayIntoStringCollection(readableArray));
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getOnesignalId(Promise promise) {
        String onesignalId = OneSignal.getUser().getOnesignalId();
        if (onesignalId == null || onesignalId.isEmpty()) {
            promise.resolve(null);
        } else {
            promise.resolve(onesignalId);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void getExternalId(Promise promise) {
        String externalId = OneSignal.getUser().getExternalId();
        if (externalId == null || externalId.isEmpty()) {
            promise.resolve(null);
        } else {
            promise.resolve(externalId);
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void addUserStateObserver() {
        if (this.hasSetUserStateObserver) {
            return;
        }
        OneSignal.getUser().addObserver(this);
        this.hasSetUserStateObserver = true;
    }

    @Override // com.onesignal.user.state.IUserStateObserver
    public void onUserStateChange(UserChangedState userChangedState) {
        try {
            emitOnUserStateChanged(RNUtils.convertHashMapToWritableMap(RNUtils.convertUserChangedStateToMap(userChangedState)));
            Logging.debug("Sending user state change event", null);
        } catch (JSONException e) {
            logJSONException("onUserStateChanged", e);
        }
    }

    private void removeUserStateObserver() {
        if (this.hasSetUserStateObserver) {
            OneSignal.getUser().removeObserver(this);
            this.hasSetUserStateObserver = false;
        }
    }

    @Override // com.onesignal.rnonesignalandroid.NativeOneSignalSpec
    public void trackEvent(String str, ReadableMap readableMap) {
        OneSignal.getUser().trackEvent(str, readableMap != null ? readableMap.toHashMap() : new HashMap<>());
    }
}
