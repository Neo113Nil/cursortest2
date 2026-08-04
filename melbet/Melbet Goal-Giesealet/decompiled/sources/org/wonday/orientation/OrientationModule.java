package org.wonday.orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class OrientationModule extends ReactContextBaseJavaModule implements OrientationListeners {
    final ReactApplicationContext ctx;
    private boolean isConfigurationChangeReceiverRegistered;
    private boolean isLocked;
    private String lastDeviceOrientationValue;
    private String lastOrientationValue;
    final OrientationEventListener mOrientationListener;
    final BroadcastReceiver mReceiver;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isLocked = false;
        this.isConfigurationChangeReceiverRegistered = false;
        this.lastOrientationValue = "";
        this.lastDeviceOrientationValue = "";
        this.ctx = reactApplicationContext;
        OrientationEventListener orientationEventListener = new OrientationEventListener(reactApplicationContext, 2) { // from class: org.wonday.orientation.OrientationModule.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                FLog.d(ReactConstants.TAG, "DeviceOrientation changed to " + i);
                String str = OrientationModule.this.lastDeviceOrientationValue;
                if (i == -1) {
                    str = "UNKNOWN";
                } else if (i > 355 || i < 5) {
                    str = "PORTRAIT";
                } else if (i > 85 && i < 95) {
                    str = "LANDSCAPE-RIGHT";
                } else if (i > 175 && i < 185) {
                    str = "PORTRAIT-UPSIDEDOWN";
                } else if (i > 265 && i < 275) {
                    str = "LANDSCAPE-LEFT";
                }
                if (!OrientationModule.this.lastDeviceOrientationValue.equals(str)) {
                    OrientationModule.this.lastDeviceOrientationValue = str;
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("deviceOrientation", str);
                    if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("deviceOrientationDidChange", createMap);
                    }
                }
                String currentOrientation = OrientationModule.this.getCurrentOrientation();
                if (OrientationModule.this.lastOrientationValue.equals(currentOrientation)) {
                    return;
                }
                OrientationModule.this.lastOrientationValue = currentOrientation;
                FLog.d(ReactConstants.TAG, "Orientation changed to " + currentOrientation);
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("orientation", currentOrientation);
                if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap2);
                }
            }
        };
        this.mOrientationListener = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            FLog.d(ReactConstants.TAG, "orientation detect enabled.");
            orientationEventListener.enable();
        } else {
            FLog.d(ReactConstants.TAG, "orientation detect disabled.");
            orientationEventListener.disable();
        }
        this.mReceiver = new BroadcastReceiver() { // from class: org.wonday.orientation.OrientationModule.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String currentOrientation = OrientationModule.this.getCurrentOrientation();
                OrientationModule.this.lastOrientationValue = currentOrientation;
                FLog.d(ReactConstants.TAG, "Orientation changed to " + currentOrientation);
                WritableMap createMap = Arguments.createMap();
                createMap.putString("orientation", currentOrientation);
                if (OrientationModule.this.ctx.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) OrientationModule.this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
                }
            }
        };
        OrientationActivityLifecycle.getInstance().registerListeners(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentOrientation() {
        int rotation = ((WindowManager) getReactApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return "PORTRAIT";
        }
        if (rotation == 1) {
            return "LANDSCAPE-LEFT";
        }
        if (rotation == 2) {
            return "PORTRAIT-UPSIDEDOWN";
        }
        if (rotation == 3) {
            return "LANDSCAPE-RIGHT";
        }
        return "UNKNOWN";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        callback.invoke(getCurrentOrientation());
    }

    @ReactMethod
    public void getDeviceOrientation(Callback callback) {
        callback.invoke(this.lastDeviceOrientationValue);
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(1);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void lockToPortraitUpsideDown() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(9);
        this.isLocked = true;
        this.lastOrientationValue = "PORTRAIT-UPSIDEDOWN";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(6);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(0);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-LEFT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(8);
        this.isLocked = true;
        this.lastOrientationValue = "LANDSCAPE-RIGHT";
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(4);
        this.isLocked = false;
        this.lastOrientationValue = getCurrentOrientation();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("orientation", this.lastOrientationValue);
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("orientation", "UNKNOWN");
        if (this.ctx.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.ctx.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("lockDidChange", createMap2);
        }
    }

    @ReactMethod
    public void getAutoRotateState(Callback callback) {
        callback.invoke(Boolean.valueOf(Settings.System.getInt(this.ctx.getContentResolver(), "accelerometer_rotation", 0) == 1));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("initialOrientation", getCurrentOrientation());
        return hashMap;
    }

    @Override // org.wonday.orientation.OrientationListeners
    public void start() {
        FLog.i(ReactConstants.TAG, "orientation detect enabled.");
        this.mOrientationListener.enable();
        compatRegisterReceiver(this.ctx, this.mReceiver, new IntentFilter("onConfigurationChanged"), false);
        this.isConfigurationChangeReceiverRegistered = true;
    }

    @Override // org.wonday.orientation.OrientationListeners
    public void stop() {
        FLog.d(ReactConstants.TAG, "orientation detect disabled.");
        this.mOrientationListener.disable();
        try {
            if (this.isConfigurationChangeReceiverRegistered) {
                this.ctx.unregisterReceiver(this.mReceiver);
                this.isConfigurationChangeReceiverRegistered = false;
            }
        } catch (Exception e) {
            FLog.w(ReactConstants.TAG, "Receiver already unregistered", e);
        }
    }

    @Override // org.wonday.orientation.OrientationListeners
    public void release() {
        FLog.d(ReactConstants.TAG, "orientation detect disabled.");
        this.mOrientationListener.disable();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            if (this.isConfigurationChangeReceiverRegistered) {
                currentActivity.unregisterReceiver(this.mReceiver);
                this.isConfigurationChangeReceiverRegistered = false;
            }
        } catch (Exception e) {
            FLog.w(ReactConstants.TAG, "Receiver already unregistered", e);
        }
    }

    private void compatRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
            context.registerReceiver(broadcastReceiver, intentFilter, z ? 2 : 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
