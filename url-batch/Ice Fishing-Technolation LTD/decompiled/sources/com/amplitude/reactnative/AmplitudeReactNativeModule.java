package com.amplitude.reactnative;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: AmplitudeReactNativeModule.kt */
@ReactModule(name = AmplitudeReactNativeModuleKt.MODULE_NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\"\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/amplitude/reactnative/AmplitudeReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "androidContextProvider", "Lcom/amplitude/reactnative/AndroidContextProvider;", "getName", "", "getApplicationContext", "", "options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getLegacySessionData", "instanceName", "getLegacyValue", "storage", "Lcom/amplitude/reactnative/LegacyDatabaseStorage;", DatabaseConstants.KEY_FIELD, "getLegacyLongValue", "", "(Lcom/amplitude/reactnative/LegacyDatabaseStorage;Ljava/lang/String;)Ljava/lang/Long;", "getLegacyEvents", "eventKind", "removeLegacyEvent", "eventId", "", "Companion", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AmplitudeReactNativeModule extends ReactContextBaseJavaModule {
    public static final String DEVICE_ID_KEY = "device_id";
    public static final String LAST_EVENT_ID_KEY = "last_event_id";
    public static final String LAST_EVENT_TIME_KEY = "last_event_time";
    public static final String PREVIOUS_SESSION_ID_KEY = "previous_session_id";
    public static final String USER_ID_KEY = "user_id";
    private AndroidContextProvider androidContextProvider;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return AmplitudeReactNativeModuleKt.MODULE_NAME;
    }

    @ReactMethod
    private final void getApplicationContext(ReadableMap options, Promise promise) {
        boolean z = options.hasKey("adid") ? options.getBoolean("adid") : false;
        if (this.androidContextProvider == null) {
            Context applicationContext = this.reactContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.androidContextProvider = new AndroidContextProvider(applicationContext, z);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        AndroidContextProvider androidContextProvider = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider);
        writableNativeMap.putString("version", androidContextProvider.getVersionName());
        AndroidContextProvider androidContextProvider2 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider2);
        writableNativeMap.putString("platform", androidContextProvider2.getPlatform());
        AndroidContextProvider androidContextProvider3 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider3);
        writableNativeMap.putString("language", androidContextProvider3.getLanguage());
        AndroidContextProvider androidContextProvider4 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider4);
        writableNativeMap.putString(AdRevenueScheme.COUNTRY, androidContextProvider4.getCountry());
        AndroidContextProvider androidContextProvider5 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider5);
        writableNativeMap.putString("osName", androidContextProvider5.getOsName());
        AndroidContextProvider androidContextProvider6 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider6);
        writableNativeMap.putString("osVersion", androidContextProvider6.getOsVersion());
        AndroidContextProvider androidContextProvider7 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider7);
        writableNativeMap.putString("deviceBrand", androidContextProvider7.getBrand());
        AndroidContextProvider androidContextProvider8 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider8);
        writableNativeMap.putString("deviceManufacturer", androidContextProvider8.getManufacturer());
        AndroidContextProvider androidContextProvider9 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider9);
        writableNativeMap.putString("deviceModel", androidContextProvider9.getModel());
        AndroidContextProvider androidContextProvider10 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider10);
        writableNativeMap.putString("carrier", androidContextProvider10.getCarrier());
        if (z) {
            AndroidContextProvider androidContextProvider11 = this.androidContextProvider;
            Intrinsics.checkNotNull(androidContextProvider11);
            writableNativeMap.putString("adid", androidContextProvider11.getAdvertisingId());
        }
        AndroidContextProvider androidContextProvider12 = this.androidContextProvider;
        Intrinsics.checkNotNull(androidContextProvider12);
        writableNativeMap.putString("appSetId", androidContextProvider12.getAppSetId());
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    private final void getLegacySessionData(String instanceName, Promise promise) {
        try {
            LegacyDatabaseStorageProvider legacyDatabaseStorageProvider = LegacyDatabaseStorageProvider.INSTANCE;
            Context applicationContext = this.reactContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            LegacyDatabaseStorage storage = legacyDatabaseStorageProvider.getStorage(applicationContext, instanceName);
            String legacyValue = getLegacyValue(storage, DEVICE_ID_KEY);
            String legacyValue2 = getLegacyValue(storage, USER_ID_KEY);
            Long legacyLongValue = getLegacyLongValue(storage, PREVIOUS_SESSION_ID_KEY);
            Long legacyLongValue2 = getLegacyLongValue(storage, LAST_EVENT_TIME_KEY);
            Long legacyLongValue3 = getLegacyLongValue(storage, LAST_EVENT_ID_KEY);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (legacyValue != null) {
                writableNativeMap.putString("deviceId", legacyValue);
            }
            if (legacyValue2 != null) {
                writableNativeMap.putString("userId", legacyValue2);
            }
            if (legacyLongValue != null) {
                writableNativeMap.putDouble("sessionId", legacyLongValue.longValue());
            }
            if (legacyLongValue2 != null) {
                writableNativeMap.putDouble("lastEventTime", legacyLongValue2.longValue());
            }
            if (legacyLongValue3 != null) {
                writableNativeMap.putDouble("lastEventId", legacyLongValue3.longValue());
            }
            promise.resolve(writableNativeMap);
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("can't get legacy session data: " + e);
        }
    }

    private final String getLegacyValue(LegacyDatabaseStorage storage, String key) {
        try {
            return storage.getValue(key);
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("can't get legacy " + key + ": " + e);
            return null;
        }
    }

    private final Long getLegacyLongValue(LegacyDatabaseStorage storage, String key) {
        try {
            return storage.getLongValue(key);
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("can't get legacy " + key + ": " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[Catch: Exception -> 0x0075, LOOP:0: B:11:0x005d->B:13:0x0063, LOOP_END, TryCatch #0 {Exception -> 0x0075, blocks: (B:2:0x0000, B:9:0x0049, B:10:0x0052, B:11:0x005d, B:13:0x0063, B:15:0x0071, B:19:0x0025, B:22:0x002e, B:23:0x0033, B:26:0x003c, B:27:0x0041, B:29:0x004e), top: B:1:0x0000 }] */
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getLegacyEvents(String instanceName, String eventKind, Promise promise) {
        List<JSONObject> readInterceptedIdentifies;
        Iterator<T> it;
        try {
            LegacyDatabaseStorageProvider legacyDatabaseStorageProvider = LegacyDatabaseStorageProvider.INSTANCE;
            Context applicationContext = this.reactContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            LegacyDatabaseStorage storage = legacyDatabaseStorageProvider.getStorage(applicationContext, instanceName);
            int hashCode = eventKind.hashCode();
            if (hashCode == -267163891) {
                if (eventKind.equals("interceptedIdentify")) {
                    readInterceptedIdentifies = storage.readInterceptedIdentifies();
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    it = readInterceptedIdentifies.iterator();
                    while (it.hasNext()) {
                    }
                    promise.resolve(writableNativeArray);
                    return;
                }
                readInterceptedIdentifies = CollectionsKt.emptyList();
                WritableNativeArray writableNativeArray2 = new WritableNativeArray();
                it = readInterceptedIdentifies.iterator();
                while (it.hasNext()) {
                }
                promise.resolve(writableNativeArray2);
                return;
            }
            if (hashCode == -135762164) {
                if (eventKind.equals("identify")) {
                    readInterceptedIdentifies = storage.readIdentifies();
                    WritableNativeArray writableNativeArray22 = new WritableNativeArray();
                    it = readInterceptedIdentifies.iterator();
                    while (it.hasNext()) {
                    }
                    promise.resolve(writableNativeArray22);
                    return;
                }
                readInterceptedIdentifies = CollectionsKt.emptyList();
                WritableNativeArray writableNativeArray222 = new WritableNativeArray();
                it = readInterceptedIdentifies.iterator();
                while (it.hasNext()) {
                }
                promise.resolve(writableNativeArray222);
                return;
            }
            if (hashCode == 96891546 && eventKind.equals("event")) {
                readInterceptedIdentifies = storage.readEvents();
                WritableNativeArray writableNativeArray2222 = new WritableNativeArray();
                it = readInterceptedIdentifies.iterator();
                while (it.hasNext()) {
                    writableNativeArray2222.pushString(((JSONObject) it.next()).toString());
                }
                promise.resolve(writableNativeArray2222);
                return;
            }
            readInterceptedIdentifies = CollectionsKt.emptyList();
            WritableNativeArray writableNativeArray22222 = new WritableNativeArray();
            it = readInterceptedIdentifies.iterator();
            while (it.hasNext()) {
            }
            promise.resolve(writableNativeArray22222);
            return;
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("can't get legacy " + eventKind + "s: " + e);
            promise.resolve(new WritableNativeArray());
        }
        LogcatLogger.INSTANCE.getLogger().error("can't get legacy " + eventKind + "s: " + e);
        promise.resolve(new WritableNativeArray());
    }

    @ReactMethod
    private final void removeLegacyEvent(String instanceName, String eventKind, int eventId) {
        try {
            LegacyDatabaseStorageProvider legacyDatabaseStorageProvider = LegacyDatabaseStorageProvider.INSTANCE;
            Context applicationContext = this.reactContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            LegacyDatabaseStorage storage = legacyDatabaseStorageProvider.getStorage(applicationContext, instanceName);
            int hashCode = eventKind.hashCode();
            if (hashCode != -267163891) {
                if (hashCode != -135762164) {
                    if (hashCode == 96891546 && eventKind.equals("event")) {
                        storage.removeEvent(eventId);
                    }
                } else if (eventKind.equals("identify")) {
                    storage.removeIdentify(eventId);
                }
            } else if (eventKind.equals("interceptedIdentify")) {
                storage.removeInterceptedIdentify(eventId);
            }
        } catch (Exception e) {
            LogcatLogger.INSTANCE.getLogger().error("can't remove legacy " + eventKind + " with id=" + eventId + ": " + e);
        }
    }
}
