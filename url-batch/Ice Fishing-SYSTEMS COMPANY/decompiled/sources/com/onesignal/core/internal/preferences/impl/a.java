package com.onesignal.core.internal.preferences.impl;

import E7.l;
import I4.c;
import O7.Y;
import android.content.SharedPreferences;
import com.onesignal.common.threading.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import q7.C4938g;
import q7.v;
import r7.t;
import t0.AbstractC5051n;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements F4.b, com.onesignal.core.internal.startup.b {
    public static final C0193a Companion = new C0193a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final G4.a _time;
    private volatile boolean hasLoggedMissingAppContext;
    private final Map<String, Map<String, Object>> prefsToApply;
    private final e waiter;

    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0193a {
        public /* synthetic */ C0193a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0193a() {
        }
    }

    public static final class b extends h implements l {
        long J$0;
        int label;

        public b(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new b(interfaceC5133d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x0122, code lost:
        
            if (O7.AbstractC0399y.f(r5, r12) == r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0128, code lost:
        
            r5 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0137, code lost:
        
            if (r13.waitForWake(r12) == r0) goto L69;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0137 -> B:8:0x0037). Please report as a decompilation issue!!! */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j9;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            try {
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th);
            }
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService write loop running", null, 2, null);
                j9 = a.this._time.getCurrentTimeMillis();
            } else if (i == 1) {
                j9 = this.J$0;
                com.bumptech.glide.f.r(obj);
                e eVar = a.this.waiter;
                this.J$0 = j9;
                this.label = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = this.J$0;
                com.bumptech.glide.f.r(obj);
            }
            while (true) {
                for (String str : a.this.prefsToApply.keySet()) {
                    Object obj2 = a.this.prefsToApply.get(str);
                    kotlin.jvm.internal.h.b(obj2);
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
                            } finally {
                            }
                        }
                        edit.apply();
                    }
                }
                long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                long j10 = (j9 - currentTimeMillis) + 200;
                if (j10 <= 0) {
                    break;
                }
                try {
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                } catch (Throwable th2) {
                    j9 = currentTimeMillis;
                    com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th2);
                }
                com.onesignal.debug.internal.logging.b.log(c.ERROR, "Error with Preference work loop", th2);
            }
            return enumC5179a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public a(f _applicationService, G4.a _time) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        C4938g[] c4938gArr = {new C4938g(com.onesignal.common.threading.b.BASE_THREAD_NAME, new LinkedHashMap()), new C4938g("GTPlayerPurchases", new LinkedHashMap())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.z(2));
        t.B(linkedHashMap, c4938gArr);
        this.prefsToApply = linkedHashMap;
        this.waiter = new e();
    }

    private final Y doWorkAsync() {
        return com.onesignal.common.threading.c.launchOnIO(new b(null));
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(AbstractC5051n.f("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        kotlin.jvm.internal.h.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                if (!map2.containsKey(str2)) {
                    SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                    if (sharedPrefsByName != null) {
                        try {
                            if (kotlin.jvm.internal.h.a(cls, String.class)) {
                                return sharedPrefsByName.getString(str2, (String) obj);
                            }
                            if (kotlin.jvm.internal.h.a(cls, Boolean.TYPE)) {
                                Boolean bool = (Boolean) obj;
                                return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                            }
                            if (kotlin.jvm.internal.h.a(cls, Integer.TYPE)) {
                                Integer num = (Integer) obj;
                                return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                            }
                            if (kotlin.jvm.internal.h.a(cls, Long.TYPE)) {
                                Long l9 = (Long) obj;
                                return Long.valueOf(sharedPrefsByName.getLong(str2, l9 != null ? l9.longValue() : 0L));
                            }
                            if (kotlin.jvm.internal.h.a(cls, Set.class)) {
                                return sharedPrefsByName.getStringSet(str2, (Set) obj);
                            }
                            return null;
                        } catch (Exception unused) {
                        }
                    }
                    if (kotlin.jvm.internal.h.a(cls, String.class)) {
                        return (String) obj;
                    }
                    if (kotlin.jvm.internal.h.a(cls, Boolean.TYPE)) {
                        Boolean bool2 = (Boolean) obj;
                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    }
                    if (kotlin.jvm.internal.h.a(cls, Integer.TYPE)) {
                        Integer num2 = (Integer) obj;
                        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    }
                    if (kotlin.jvm.internal.h.a(cls, Long.TYPE)) {
                        Long l10 = (Long) obj;
                        return Long.valueOf(l10 != null ? l10.longValue() : 0L);
                    }
                    if (kotlin.jvm.internal.h.a(cls, Set.class)) {
                        return (Set) obj;
                    }
                    return null;
                }
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
            throw new Exception(AbstractC5051n.f("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        kotlin.jvm.internal.h.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService queued write for store=" + str + " key=" + str2, null, 2, null);
        this.waiter.wake();
    }

    @Override // F4.b
    public Boolean getBool(String store, String key, Boolean bool) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, bool);
    }

    @Override // F4.b
    public Integer getInt(String store, String key, Integer num) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        return (Integer) get(store, key, Integer.TYPE, num);
    }

    @Override // F4.b
    public Long getLong(String store, String key, Long l9) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        return (Long) get(store, key, Long.TYPE, l9);
    }

    @Override // F4.b
    public String getString(String store, String key, String str) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        return (String) get(store, key, String.class, str);
    }

    @Override // F4.b
    public Set<String> getStringSet(String store, String key, Set<String> set) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        return (Set) get(store, key, Set.class, set);
    }

    @Override // F4.b
    public void saveBool(String store, String key, Boolean bool) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        save(store, key, bool);
    }

    @Override // F4.b
    public void saveInt(String store, String key, Integer num) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        save(store, key, num);
    }

    @Override // F4.b
    public void saveLong(String store, String key, Long l9) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        save(store, key, l9);
    }

    @Override // F4.b
    public void saveString(String store, String key, String str) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        save(store, key, str);
    }

    @Override // F4.b
    public void saveStringSet(String store, String key, Set<String> set) {
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(key, "key");
        save(store, key, set);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService starting async write loop", null, 2, null);
        doWorkAsync();
    }
}
