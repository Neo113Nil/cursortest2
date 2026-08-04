package org.asyncstorage;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.asyncstorage.legacy_storage.LegacyStorageModule;
import org.asyncstorage.storage.StorageRegistry;

/* compiled from: AsyncStorageModule.kt */
@ReactModule(name = "RNAsyncStorage")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lorg/asyncstorage/AsyncStorageModule;", "Lorg/asyncstorage/NativeAsyncStorageSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "legacyStorage", "Lorg/asyncstorage/legacy_storage/LegacyStorageModule;", "getName", "", "getValues", "", "db", "keys", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "setValues", "values", "removeValues", "getKeys", "clearStorage", "legacy_multiGet", "legacy_multiSet", "kvPairs", "legacy_getAllKeys", "legacy_multiRemove", "legacy_multiMerge", "legacy_clear", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsyncStorageModule extends NativeAsyncStorageSpec {
    public static final String NAME = "RNAsyncStorage";
    private final LegacyStorageModule legacyStorage;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncStorageModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.legacyStorage = new LegacyStorageModule(reactContext);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAsyncStorage";
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void getValues(String db, ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        StorageRegistry.INSTANCE.getRNStorage(this.reactContext, db).get(keys, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void setValues(String db, ReadableArray values, Promise promise) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(promise, "promise");
        StorageRegistry.INSTANCE.getRNStorage(this.reactContext, db).set(values, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void removeValues(String db, ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        StorageRegistry.INSTANCE.getRNStorage(this.reactContext, db).remove(keys, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void getKeys(String db, Promise promise) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(promise, "promise");
        StorageRegistry.INSTANCE.getRNStorage(this.reactContext, db).allKeys(promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void clearStorage(String db, Promise promise) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(promise, "promise");
        StorageRegistry.INSTANCE.getRNStorage(this.reactContext, db).clear(promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_multiGet(ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.multiGet(keys, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_multiSet(ReadableArray kvPairs, Promise promise) {
        Intrinsics.checkNotNullParameter(kvPairs, "kvPairs");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.multiSet(kvPairs, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_getAllKeys(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.getAllKeys(promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_multiRemove(ReadableArray keys, Promise promise) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.multiRemove(keys, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_multiMerge(ReadableArray kvPairs, Promise promise) {
        Intrinsics.checkNotNullParameter(kvPairs, "kvPairs");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.multiMerge(kvPairs, promise);
    }

    @Override // org.asyncstorage.NativeAsyncStorageSpec
    public void legacy_clear(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.legacyStorage.clear(promise);
    }
}
