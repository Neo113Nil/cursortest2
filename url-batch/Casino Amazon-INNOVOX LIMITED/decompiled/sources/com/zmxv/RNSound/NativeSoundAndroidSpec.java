package com.zmxv.RNSound;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativeSoundAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSound";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void getCurrentTime(double d, Callback callback);

    @ReactMethod
    public abstract void getSystemVolume(Callback callback);

    @ReactMethod
    public abstract void pause(double d, Callback callback);

    @ReactMethod
    public abstract void play(double d, Callback callback);

    @ReactMethod
    public abstract void prepare(String str, double d, ReadableMap readableMap, Callback callback);

    @ReactMethod
    public abstract void release(double d);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void reset(double d);

    @ReactMethod
    public abstract void setCategory(String str, boolean z);

    @ReactMethod
    public abstract void setCurrentTime(double d, double d2);

    @ReactMethod
    public abstract void setLooping(double d, boolean z);

    @ReactMethod
    public abstract void setPitch(double d, double d2);

    @ReactMethod
    public abstract void setSpeakerphoneOn(double d, boolean z);

    @ReactMethod
    public abstract void setSpeed(double d, double d2);

    @ReactMethod
    public abstract void setSystemVolume(double d);

    @ReactMethod
    public abstract void setVolume(double d, double d2, double d3);

    @ReactMethod
    public abstract void stop(double d, Callback callback);

    public NativeSoundAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNSound";
    }
}
