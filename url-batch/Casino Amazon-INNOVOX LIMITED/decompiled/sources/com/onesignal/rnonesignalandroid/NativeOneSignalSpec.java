package com.onesignal.rnonesignalandroid;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class NativeOneSignalSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "OneSignal";

    @ReactMethod
    public abstract void addAlias(String str, String str2);

    @ReactMethod
    public abstract void addAliases(ReadableMap readableMap);

    @ReactMethod
    public abstract void addEmail(String str);

    @ReactMethod
    public abstract void addInAppMessageClickListener();

    @ReactMethod
    public abstract void addInAppMessagesLifecycleListener();

    @ReactMethod
    public abstract void addNotificationClickListener();

    @ReactMethod
    public abstract void addNotificationForegroundLifecycleListener();

    @ReactMethod
    public abstract void addOutcome(String str);

    @ReactMethod
    public abstract void addOutcomeWithValue(String str, double d);

    @ReactMethod
    public abstract void addPermissionObserver();

    @ReactMethod
    public abstract void addPushSubscriptionObserver();

    @ReactMethod
    public abstract void addSms(String str);

    @ReactMethod
    public abstract void addTag(String str, String str2);

    @ReactMethod
    public abstract void addTags(ReadableMap readableMap);

    @ReactMethod
    public abstract void addTrigger(String str, String str2);

    @ReactMethod
    public abstract void addTriggers(ReadableMap readableMap);

    @ReactMethod
    public abstract void addUniqueOutcome(String str);

    @ReactMethod
    public abstract void addUserStateObserver();

    @ReactMethod
    public abstract void canRequestNotificationPermission(Promise promise);

    @ReactMethod
    public abstract void clearAllNotifications();

    @ReactMethod
    public abstract void clearTriggers();

    @ReactMethod
    public abstract void displayNotification(String str);

    @ReactMethod
    public abstract void enterLiveActivity(String str, String str2, Callback callback);

    @ReactMethod
    public abstract void exitLiveActivity(String str, Callback callback);

    @ReactMethod
    public abstract void getExternalId(Promise promise);

    @ReactMethod
    public abstract void getOnesignalId(Promise promise);

    @ReactMethod
    public abstract void getOptedIn(Promise promise);

    @ReactMethod
    public abstract void getPaused(Promise promise);

    @ReactMethod
    public abstract void getPushSubscriptionId(Promise promise);

    @ReactMethod
    public abstract void getPushSubscriptionToken(Promise promise);

    @ReactMethod
    public abstract void getTags(Promise promise);

    @ReactMethod
    public abstract void hasNotificationPermission(Promise promise);

    @ReactMethod
    public abstract void initialize(String str);

    @ReactMethod
    public abstract void isLocationShared(Promise promise);

    @ReactMethod
    public abstract void login(String str);

    @ReactMethod
    public abstract void logout();

    @ReactMethod
    public abstract void optIn();

    @ReactMethod
    public abstract void optOut();

    @ReactMethod
    public abstract void paused(boolean z);

    @ReactMethod
    public abstract void permissionNative(Promise promise);

    @ReactMethod
    public abstract void preventDefault(String str);

    @ReactMethod
    public abstract void registerForProvisionalAuthorization(Callback callback);

    @ReactMethod
    public abstract void removeAlias(String str);

    @ReactMethod
    public abstract void removeAliases(ReadableArray readableArray);

    @ReactMethod
    public abstract void removeEmail(String str);

    @ReactMethod
    public abstract void removeGroupedNotifications(String str);

    @ReactMethod
    public abstract void removeNotification(double d);

    @ReactMethod
    public abstract void removePushToStartToken(String str);

    @ReactMethod
    public abstract void removeSms(String str);

    @ReactMethod
    public abstract void removeTag(String str);

    @ReactMethod
    public abstract void removeTags(ReadableArray readableArray);

    @ReactMethod
    public abstract void removeTrigger(String str);

    @ReactMethod
    public abstract void removeTriggers(ReadableArray readableArray);

    @ReactMethod
    public abstract void requestLocationPermission();

    @ReactMethod
    public abstract void requestNotificationPermission(boolean z, Promise promise);

    @ReactMethod
    public abstract void setAlertLevel(double d);

    @ReactMethod
    public abstract void setLanguage(String str);

    @ReactMethod
    public abstract void setLocationShared(boolean z);

    @ReactMethod
    public abstract void setLogLevel(double d);

    @ReactMethod
    public abstract void setPrivacyConsentGiven(boolean z);

    @ReactMethod
    public abstract void setPrivacyConsentRequired(boolean z);

    @ReactMethod
    public abstract void setPushToStartToken(String str, String str2);

    @ReactMethod
    public abstract void setupDefaultLiveActivity(@Nullable ReadableMap readableMap);

    @ReactMethod
    public abstract void startDefaultLiveActivity(String str, ReadableMap readableMap, ReadableMap readableMap2);

    @ReactMethod
    public abstract void trackEvent(String str, @Nullable ReadableMap readableMap);

    public NativeOneSignalSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "OneSignal";
    }

    protected final void emitOnPermissionChanged(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onPermissionChanged", readableMap);
    }

    protected final void emitOnSubscriptionChanged(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onSubscriptionChanged", readableMap);
    }

    protected final void emitOnUserStateChanged(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onUserStateChanged", readableMap);
    }

    protected final void emitOnNotificationWillDisplay(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onNotificationWillDisplay", readableMap);
    }

    protected final void emitOnNotificationClicked(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onNotificationClicked", readableMap);
    }

    protected final void emitOnInAppMessageClicked(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onInAppMessageClicked", readableMap);
    }

    protected final void emitOnInAppMessageWillDisplay(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onInAppMessageWillDisplay", readableMap);
    }

    protected final void emitOnInAppMessageDidDisplay(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onInAppMessageDidDisplay", readableMap);
    }

    protected final void emitOnInAppMessageWillDismiss(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onInAppMessageWillDismiss", readableMap);
    }

    protected final void emitOnInAppMessageDidDismiss(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onInAppMessageDidDismiss", readableMap);
    }
}
