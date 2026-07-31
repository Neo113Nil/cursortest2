package com.onesignal.core.internal.preferences.impl;

import H5.X;
import T1.f;
import android.content.SharedPreferences;
import com.onesignal.common.threading.c;
import f2.InterfaceC0365b;
import g2.InterfaceC0391a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k5.C0477g;
import k5.v;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l5.t;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a implements InterfaceC0365b, com.onesignal.core.internal.startup.b {
    public static final C0025a Companion = new C0025a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final InterfaceC0391a _time;
    private volatile boolean hasLoggedMissingAppContext;
    private final Map<String, Map<String, Object>> prefsToApply;
    private final c waiter;

    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0025a {
        public /* synthetic */ C0025a(e eVar) {
            this();
        }

        private C0025a() {
        }
    }

    public static final class b extends g implements InterfaceC0743l {
        long J$0;
        int label;

        public b(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new b(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x0122, code lost:
        
            if (H5.AbstractC0165z.d(r5, r12) == r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0128, code lost:
        
            r5 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0137, code lost:
        
            if (r13.waitForWake(r12) == r0) goto L69;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0137 -> B:8:0x0037). Please report as a decompilation issue!!! */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j4;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error with Preference work loop", th);
            }
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService write loop running", null, 2, null);
                j4 = a.this._time.getCurrentTimeMillis();
            } else if (i7 == 1) {
                j4 = this.J$0;
                AbstractC0676f.w(obj);
                c cVar = a.this.waiter;
                this.J$0 = j4;
                this.label = 2;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4 = this.J$0;
                AbstractC0676f.w(obj);
            }
            while (true) {
                for (String str : a.this.prefsToApply.keySet()) {
                    Object obj2 = a.this.prefsToApply.get(str);
                    i.b(obj2);
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
                long j7 = (j4 - currentTimeMillis) + a.WRITE_CALL_DELAY_TO_BUFFER_MS;
                if (j7 <= 0) {
                    break;
                }
                try {
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                } catch (Throwable th2) {
                    j4 = currentTimeMillis;
                    com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error with Preference work loop", th2);
                }
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Error with Preference work loop", th2);
            }
            return enumC0580a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public a(f _applicationService, InterfaceC0391a _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        C0477g[] c0477gArr = {new C0477g(com.onesignal.common.threading.a.BASE_THREAD_NAME, new LinkedHashMap()), new C0477g("GTPlayerPurchases", new LinkedHashMap())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.p0(2));
        t.r0(linkedHashMap, c0477gArr);
        this.prefsToApply = linkedHashMap;
        this.waiter = new c();
    }

    private final X doWorkAsync() {
        return com.onesignal.common.threading.b.launchOnIO(new b(null));
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(C1.c.h("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                if (!map2.containsKey(str2)) {
                    SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                    if (sharedPrefsByName != null) {
                        try {
                            if (i.a(cls, String.class)) {
                                return sharedPrefsByName.getString(str2, (String) obj);
                            }
                            if (i.a(cls, Boolean.TYPE)) {
                                Boolean bool = (Boolean) obj;
                                return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                            }
                            if (i.a(cls, Integer.TYPE)) {
                                Integer num = (Integer) obj;
                                return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                            }
                            if (i.a(cls, Long.TYPE)) {
                                Long l7 = (Long) obj;
                                return Long.valueOf(sharedPrefsByName.getLong(str2, l7 != null ? l7.longValue() : 0L));
                            }
                            if (i.a(cls, Set.class)) {
                                return sharedPrefsByName.getStringSet(str2, (Set) obj);
                            }
                            return null;
                        } catch (Exception unused) {
                        }
                    }
                    if (i.a(cls, String.class)) {
                        return (String) obj;
                    }
                    if (i.a(cls, Boolean.TYPE)) {
                        Boolean bool2 = (Boolean) obj;
                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    }
                    if (i.a(cls, Integer.TYPE)) {
                        Integer num2 = (Integer) obj;
                        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    }
                    if (i.a(cls, Long.TYPE)) {
                        Long l8 = (Long) obj;
                        return Long.valueOf(l8 != null ? l8.longValue() : 0L);
                    }
                    if (i.a(cls, Set.class)) {
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
            throw new Exception(C1.c.h("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService queued write for store=" + str + " key=" + str2, null, 2, null);
        this.waiter.wake();
    }

    @Override // f2.InterfaceC0365b
    public Boolean getBool(String store, String key, Boolean bool) {
        i.e(store, "store");
        i.e(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, bool);
    }

    @Override // f2.InterfaceC0365b
    public Integer getInt(String store, String key, Integer num) {
        i.e(store, "store");
        i.e(key, "key");
        return (Integer) get(store, key, Integer.TYPE, num);
    }

    @Override // f2.InterfaceC0365b
    public Long getLong(String store, String key, Long l7) {
        i.e(store, "store");
        i.e(key, "key");
        return (Long) get(store, key, Long.TYPE, l7);
    }

    @Override // f2.InterfaceC0365b
    public String getString(String store, String key, String str) {
        i.e(store, "store");
        i.e(key, "key");
        return (String) get(store, key, String.class, str);
    }

    @Override // f2.InterfaceC0365b
    public Set<String> getStringSet(String store, String key, Set<String> set) {
        i.e(store, "store");
        i.e(key, "key");
        return (Set) get(store, key, Set.class, set);
    }

    @Override // f2.InterfaceC0365b
    public void saveBool(String store, String key, Boolean bool) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, bool);
    }

    @Override // f2.InterfaceC0365b
    public void saveInt(String store, String key, Integer num) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, num);
    }

    @Override // f2.InterfaceC0365b
    public void saveLong(String store, String key, Long l7) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, l7);
    }

    @Override // f2.InterfaceC0365b
    public void saveString(String store, String key, String str) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, str);
    }

    @Override // f2.InterfaceC0365b
    public void saveStringSet(String store, String key, Set<String> set) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, set);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: PreferencesService starting async write loop", null, 2, null);
        doWorkAsync();
    }
}
