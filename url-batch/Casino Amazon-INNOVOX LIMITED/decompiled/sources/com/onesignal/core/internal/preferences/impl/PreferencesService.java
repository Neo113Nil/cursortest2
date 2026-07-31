package com.onesignal.core.internal.preferences.impl;

import android.content.SharedPreferences;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: PreferencesService.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J0\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002J)\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u001aJ)\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0014\u001a\u00020\fH\u0002J$\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J0\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0016J\"\u0010&\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0002J'\u0010)\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010*J'\u0010+\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010,J'\u0010-\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0002\u0010.J\"\u0010/\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\fH\u0016J(\u00100\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%H\u0016J\b\u00101\u001a\u00020'H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/onesignal/core/internal/preferences/impl/PreferencesService;", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "Lcom/onesignal/core/internal/startup/IStartableService;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/time/ITime;)V", "hasLoggedMissingAppContext", "", "prefsToApply", "", "", "", "", "waiter", "Lcom/onesignal/common/threading/Waiter;", "doWorkAsync", "Lkotlinx/coroutines/Job;", "get", "store", "key", WebViewManager.EVENT_TYPE_KEY, "Ljava/lang/Class;", "defValue", "getBool", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "getInt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "getLong", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "getSharedPrefsByName", "Landroid/content/SharedPreferences;", "getString", "getStringSet", "", "save", "", "value", "saveBool", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "saveInt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "saveLong", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "saveString", "saveStringSet", ViewProps.START, "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesService implements IPreferencesService, IStartableService {
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final IApplicationService _applicationService;
    private final ITime _time;
    private volatile boolean hasLoggedMissingAppContext;
    private final Map<String, Map<String, Object>> prefsToApply;
    private final Waiter waiter;

    public PreferencesService(IApplicationService _applicationService, ITime _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        this.prefsToApply = MapsKt.mapOf(TuplesKt.to("OneSignal", new LinkedHashMap()), TuplesKt.to(PreferenceStores.PLAYER_PURCHASES, new LinkedHashMap()));
        this.waiter = new Waiter();
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        Logging.debug$default("OneSignal: PreferencesService starting async write loop", null, 2, null);
        doWorkAsync();
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public String getString(String store, String key, String defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) get(store, key, String.class, defValue);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Boolean getBool(String store, String key, Boolean defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, defValue);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Integer getInt(String store, String key, Integer defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Integer) get(store, key, Integer.TYPE, defValue);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Long getLong(String store, String key, Long defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) get(store, key, Long.TYPE, defValue);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Set<String> getStringSet(String store, String key, Set<String> defValue) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Set) get(store, key, Set.class, defValue);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveString(String store, String key, String value) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveBool(String store, String key, Boolean value) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveInt(String store, String key, Integer value) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveLong(String store, String key, Long value) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveStringSet(String store, String key, Set<String> value) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, value);
    }

    private final Object get(String store, String key, Class<?> type, Object defValue) {
        if (!this.prefsToApply.containsKey(store)) {
            throw new Exception("Store not found: " + store);
        }
        Map<String, Object> map = this.prefsToApply.get(store);
        Intrinsics.checkNotNull(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj = map2.get(key);
            if (obj == null && !map2.containsKey(key)) {
                Unit unit = Unit.INSTANCE;
                SharedPreferences sharedPrefsByName = getSharedPrefsByName(store);
                if (sharedPrefsByName != null) {
                    try {
                        if (Intrinsics.areEqual(type, String.class)) {
                            return sharedPrefsByName.getString(key, (String) defValue);
                        }
                        if (Intrinsics.areEqual(type, Boolean.TYPE)) {
                            Boolean bool = (Boolean) defValue;
                            return Boolean.valueOf(sharedPrefsByName.getBoolean(key, bool != null ? bool.booleanValue() : false));
                        }
                        if (Intrinsics.areEqual(type, Integer.TYPE)) {
                            Integer num = (Integer) defValue;
                            return Integer.valueOf(sharedPrefsByName.getInt(key, num != null ? num.intValue() : 0));
                        }
                        if (Intrinsics.areEqual(type, Long.TYPE)) {
                            Long l = (Long) defValue;
                            return Long.valueOf(sharedPrefsByName.getLong(key, l != null ? l.longValue() : 0L));
                        }
                        if (Intrinsics.areEqual(type, Set.class)) {
                            return sharedPrefsByName.getStringSet(key, (Set) defValue);
                        }
                        return null;
                    } catch (Exception unused) {
                    }
                }
                if (Intrinsics.areEqual(type, String.class)) {
                    return (String) defValue;
                }
                if (Intrinsics.areEqual(type, Boolean.TYPE)) {
                    Boolean bool2 = (Boolean) defValue;
                    return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                }
                if (Intrinsics.areEqual(type, Integer.TYPE)) {
                    Integer num2 = (Integer) defValue;
                    return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                if (Intrinsics.areEqual(type, Long.TYPE)) {
                    Long l2 = (Long) defValue;
                    return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                }
                if (Intrinsics.areEqual(type, Set.class)) {
                    return (Set) defValue;
                }
                return null;
            }
            return obj;
        }
    }

    private final void save(String store, String key, Object value) {
        if (!this.prefsToApply.containsKey(store)) {
            throw new Exception("Store not found: " + store);
        }
        Map<String, Object> map = this.prefsToApply.get(store);
        Intrinsics.checkNotNull(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(key, value);
            Unit unit = Unit.INSTANCE;
        }
        Logging.debug$default("OneSignal: PreferencesService queued write for store=" + store + " key=" + key, null, 2, null);
        this.waiter.wake();
    }

    private final Job doWorkAsync() {
        return ThreadUtilsKt.launchOnIO(new PreferencesService$doWorkAsync$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String store) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this._applicationService.getAppContext().getSharedPreferences(store, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        return sharedPreferences;
    }
}
