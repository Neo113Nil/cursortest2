package com.onesignal.core.internal.preferences.impl;

import android.content.SharedPreferences;
import com.onesignal.common.threading.c;
import ea.f;
import ge.a0;
import ge.d0;
import ge.k0;
import ge.x;
import ge.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nd.i;
import ne.d;
import ne.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements qa.b, ra.b {
    public static final C0021a Companion = new C0021a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final sa.a _time;
    private final Map<String, Map<String, Object>> prefsToApply;
    private d0 queueJob;
    private final c waiter;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        long J$0;
        int label;

        public b(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x00f6, code lost:
        
            if (ge.a0.i(r4, r11) == r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
        
            r4 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x010b, code lost:
        
            if (r12.waitForWake(r11) == r0) goto L63;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x010b -> B:8:0x0030). Please report as a decompilation issue!!! */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            try {
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error with Preference work loop", th);
            }
            if (i3 == 0) {
                cf.c.M(obj);
                j = a.this._time.getCurrentTimeMillis();
            } else if (i3 == 1) {
                j = this.J$0;
                cf.c.M(obj);
                c cVar = a.this.waiter;
                this.J$0 = j;
                this.label = 2;
            } else {
                if (i3 != 2) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                cf.c.M(obj);
            }
            while (true) {
                for (String str : a.this.prefsToApply.keySet()) {
                    Object obj2 = a.this.prefsToApply.get(str);
                    obj2.getClass();
                    Map map = (Map) obj2;
                    SharedPreferences sharedPrefsByName = a.this.getSharedPrefsByName(str);
                    if (sharedPrefsByName == null) {
                        a.this.waiter.wake();
                    } else {
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
                long j3 = (j - currentTimeMillis) + a.WRITE_CALL_DELAY_TO_BUFFER_MS;
                if (j3 <= 0) {
                    break;
                }
                try {
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                } catch (Throwable th2) {
                    j = currentTimeMillis;
                    com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error with Preference work loop", th2);
                }
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Error with Preference work loop", th2);
            }
            return aVar;
        }
    }

    public a(f fVar, sa.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._time = aVar;
        this.prefsToApply = p0.d(new Pair("OneSignal", new LinkedHashMap()), new Pair("GTPlayerPurchases", new LinkedHashMap()));
        this.waiter = new c();
    }

    private final d0 doWorkAsync() {
        e eVar = k0.f4372a;
        return a0.e(x0.f4413d, d.f7275i, new b(null), 2);
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(v4.a.k("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        map.getClass();
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                if (!map2.containsKey(str2)) {
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
                                Long l10 = (Long) obj;
                                return Long.valueOf(sharedPrefsByName.getLong(str2, l10 != null ? l10.longValue() : 0L));
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
                        Long l11 = (Long) obj;
                        return Long.valueOf(l11 != null ? l11.longValue() : 0L);
                    }
                    if (Intrinsics.a(cls, Set.class)) {
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
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(v4.a.k("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        map.getClass();
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        this.waiter.wake();
    }

    @Override // qa.b
    public Boolean getBool(String str, String str2, Boolean bool) {
        str.getClass();
        str2.getClass();
        return (Boolean) get(str, str2, Boolean.TYPE, bool);
    }

    @Override // qa.b
    public Integer getInt(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        return (Integer) get(str, str2, Integer.TYPE, num);
    }

    @Override // qa.b
    public Long getLong(String str, String str2, Long l10) {
        str.getClass();
        str2.getClass();
        return (Long) get(str, str2, Long.TYPE, l10);
    }

    @Override // qa.b
    public String getString(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return (String) get(str, str2, String.class, str3);
    }

    @Override // qa.b
    public Set<String> getStringSet(String str, String str2, Set<String> set) {
        str.getClass();
        str2.getClass();
        return (Set) get(str, str2, Set.class, set);
    }

    @Override // qa.b
    public void saveBool(String str, String str2, Boolean bool) {
        str.getClass();
        str2.getClass();
        save(str, str2, bool);
    }

    @Override // qa.b
    public void saveInt(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        save(str, str2, num);
    }

    @Override // qa.b
    public void saveLong(String str, String str2, Long l10) {
        str.getClass();
        str2.getClass();
        save(str, str2, l10);
    }

    @Override // qa.b
    public void saveString(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        save(str, str2, str3);
    }

    @Override // qa.b
    public void saveStringSet(String str, String str2, Set<String> set) {
        str.getClass();
        str2.getClass();
        save(str, str2, set);
    }

    @Override // ra.b
    public void start() {
        this.queueJob = doWorkAsync();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0021a {
        public /* synthetic */ C0021a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0021a() {
        }
    }
}
