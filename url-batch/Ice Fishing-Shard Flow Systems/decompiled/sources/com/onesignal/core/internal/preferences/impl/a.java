package com.onesignal.core.internal.preferences.impl;

import K2.c;
import X5.j;
import android.content.SharedPreferences;
import com.onesignal.common.threading.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.X;
import v2.f;

/* loaded from: classes.dex */
public final class a implements H2.b, com.onesignal.core.internal.startup.b {
    public static final C0024a Companion = new C0024a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final I2.a _time;
    private volatile boolean hasLoggedMissingAppContext;
    private final Map<String, Map<String, Object>> prefsToApply;
    private final d waiter;

    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0024a {
        public /* synthetic */ C0024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0024a() {
        }
    }

    public static final class b extends j implements Function1 {
        long J$0;
        int label;

        public b(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x0124, code lost:
        
            if (n6.AbstractC0792z.d(r5, r12) == r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x012a, code lost:
        
            r5 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0139, code lost:
        
            if (r13.waitForWake(r12) == r0) goto L69;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0139 -> B:8:0x0037). Please report as a decompilation issue!!! */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th);
            }
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService write loop running", null, 2, null);
                j = a.this._time.getCurrentTimeMillis();
            } else if (i2 == 1) {
                j = this.J$0;
                V6.b.P(obj);
                d dVar = a.this.waiter;
                this.J$0 = j;
                this.label = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                V6.b.P(obj);
            }
            while (true) {
                for (String str : a.this.prefsToApply.keySet()) {
                    Object obj2 = a.this.prefsToApply.get(str);
                    Intrinsics.b(obj2);
                    Map map = (Map) obj2;
                    SharedPreferences sharedPrefsByName = a.this.getSharedPrefsByName(str);
                    if (sharedPrefsByName == null) {
                        if (!a.this.hasLoggedMissingAppContext) {
                            com.onesignal.debug.internal.logging.b.warn$default("OneSignal: PreferencesService app context unavailable, deferring writes", null, 2, null);
                            a.this.hasLoggedMissingAppContext = true;
                        }
                        a.this.waiter.wake();
                    } else {
                        if (a.this.hasLoggedMissingAppContext) {
                            com.onesignal.debug.internal.logging.b.info$default("OneSignal: PreferencesService app context is now available, resuming writes", null, 2, null);
                            a.this.hasLoggedMissingAppContext = false;
                        }
                        SharedPreferences.Editor edit = sharedPrefsByName.edit();
                        synchronized (map) {
                            try {
                                for (String str2 : map.keySet()) {
                                    Object obj3 = map.get(str2);
                                    if (obj3 instanceof String) {
                                        edit.putString(str2, (String) obj3);
                                    } else if (obj3 instanceof Boolean) {
                                        edit.putBoolean(str2, ((Boolean) obj3).booleanValue());
                                    } else if (obj3 instanceof Integer) {
                                        edit.putInt(str2, ((Integer) obj3).intValue());
                                    } else if (obj3 instanceof Long) {
                                        edit.putLong(str2, ((Long) obj3).longValue());
                                    } else if (obj3 instanceof Set) {
                                        edit.putStringSet(str2, (Set) obj3);
                                    } else if (obj3 == null) {
                                        edit.remove(str2);
                                    }
                                }
                                map.clear();
                                Unit unit = Unit.f6114a;
                            } finally {
                            }
                        }
                        edit.apply();
                    }
                }
                long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                long j7 = (j - currentTimeMillis) + a.WRITE_CALL_DELAY_TO_BUFFER_MS;
                if (j7 <= 0) {
                    break;
                }
                try {
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                } catch (Throwable th2) {
                    j = currentTimeMillis;
                    com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th2);
                }
                com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th2);
            }
            return aVar;
        }
    }

    public a(f _applicationService, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        this.prefsToApply = I.e(new Pair(com.onesignal.common.threading.a.BASE_THREAD_NAME, new LinkedHashMap()), new Pair("GTPlayerPurchases", new LinkedHashMap()));
        this.waiter = new d();
    }

    private final X doWorkAsync() {
        return com.onesignal.common.threading.b.launchOnIO(new b(null));
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(r4.f.i("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        Intrinsics.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null && !map2.containsKey(str2)) {
                Unit unit = Unit.f6114a;
                SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                if (sharedPrefsByName != null) {
                    try {
                        if (Intrinsics.a(cls, String.class)) {
                            return sharedPrefsByName.getString(str2, (String) obj);
                        }
                        if (Intrinsics.a(cls, Boolean.TYPE)) {
                            Boolean bool = (Boolean) obj;
                            return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                        }
                        if (Intrinsics.a(cls, Integer.TYPE)) {
                            Integer num = (Integer) obj;
                            return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                        }
                        if (Intrinsics.a(cls, Long.TYPE)) {
                            Long l7 = (Long) obj;
                            return Long.valueOf(sharedPrefsByName.getLong(str2, l7 != null ? l7.longValue() : 0L));
                        }
                        if (Intrinsics.a(cls, Set.class)) {
                            return sharedPrefsByName.getStringSet(str2, (Set) obj);
                        }
                        return null;
                    } catch (Exception unused) {
                    }
                }
                if (Intrinsics.a(cls, String.class)) {
                    return (String) obj;
                }
                if (Intrinsics.a(cls, Boolean.TYPE)) {
                    Boolean bool2 = (Boolean) obj;
                    return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                }
                if (Intrinsics.a(cls, Integer.TYPE)) {
                    Integer num2 = (Integer) obj;
                    return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                if (Intrinsics.a(cls, Long.TYPE)) {
                    Long l8 = (Long) obj;
                    return Long.valueOf(l8 != null ? l8.longValue() : 0L);
                }
                if (Intrinsics.a(cls, Set.class)) {
                    return (Set) obj;
                }
                return null;
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this._applicationService.getAppContext().getSharedPreferences(str, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        return sharedPreferences;
    }

    private final void save(String str, String str2, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(r4.f.i("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        Intrinsics.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
            Unit unit = Unit.f6114a;
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService queued write for store=" + str + " key=" + str2, null, 2, null);
        this.waiter.wake();
    }

    @Override // H2.b
    public Boolean getBool(String store, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, bool);
    }

    @Override // H2.b
    public Integer getInt(String store, String key, Integer num) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Integer) get(store, key, Integer.TYPE, num);
    }

    @Override // H2.b
    public Long getLong(String store, String key, Long l7) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) get(store, key, Long.TYPE, l7);
    }

    @Override // H2.b
    public String getString(String store, String key, String str) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) get(store, key, String.class, str);
    }

    @Override // H2.b
    public Set<String> getStringSet(String store, String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Set) get(store, key, Set.class, set);
    }

    @Override // H2.b
    public void saveBool(String store, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, bool);
    }

    @Override // H2.b
    public void saveInt(String store, String key, Integer num) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, num);
    }

    @Override // H2.b
    public void saveLong(String store, String key, Long l7) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, l7);
    }

    @Override // H2.b
    public void saveString(String store, String key, String str) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, str);
    }

    @Override // H2.b
    public void saveStringSet(String store, String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(key, "key");
        save(store, key, set);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService starting async write loop", null, 2, null);
        doWorkAsync();
    }
}
