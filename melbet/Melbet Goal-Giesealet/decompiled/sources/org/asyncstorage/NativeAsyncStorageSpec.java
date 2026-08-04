package org.asyncstorage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativeAsyncStorageSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNAsyncStorage";

    @ReactMethod
    public abstract void clearStorage(String dbName, Promise promise);

    @ReactMethod
    public abstract void getKeys(String dbName, Promise promise);

    @ReactMethod
    public abstract void getValues(String dbName, ReadableArray keys, Promise promise);

    @ReactMethod
    public abstract void legacy_clear(Promise promise);

    @ReactMethod
    public abstract void legacy_getAllKeys(Promise promise);

    @ReactMethod
    public abstract void legacy_multiGet(ReadableArray keys, Promise promise);

    @ReactMethod
    public abstract void legacy_multiMerge(ReadableArray kvPairs, Promise promise);

    @ReactMethod
    public abstract void legacy_multiRemove(ReadableArray keys, Promise promise);

    @ReactMethod
    public abstract void legacy_multiSet(ReadableArray kvPairs, Promise promise);

    @ReactMethod
    public abstract void removeValues(String dbName, ReadableArray keys, Promise promise);

    @ReactMethod
    public abstract void setValues(String dbName, ReadableArray values, Promise promise);

    public NativeAsyncStorageSpec(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNAsyncStorage";
    }
}
