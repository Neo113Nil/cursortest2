package com.moat.analytics.mobile.tjy;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
class ag implements bc {

    /* renamed from: a, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7225a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7226b;

    static {
        com.moat.analytics.mobile.tjy.base.functional.a a2 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        com.moat.analytics.mobile.tjy.base.functional.a a3 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        try {
            Method method = NativeDisplayTracker.class.getMethod("track", Map.class);
            Method method2 = NativeDisplayTracker.class.getMethod("stopTracking", new Class[0]);
            com.moat.analytics.mobile.tjy.base.functional.a a4 = com.moat.analytics.mobile.tjy.base.functional.a.a(method);
            try {
                a3 = com.moat.analytics.mobile.tjy.base.functional.a.a(method2);
                a2 = a4;
            } catch (NoSuchMethodException e) {
                e = e;
                a2 = a4;
                com.moat.analytics.mobile.tjy.base.exception.a.a(e);
                f7225a = a2;
                f7226b = a3;
            }
        } catch (NoSuchMethodException e2) {
            e = e2;
        }
        f7225a = a2;
        f7226b = a3;
    }

    ag() {
    }

    @Override // com.moat.analytics.mobile.tjy.bc
    public Class a() {
        return NativeDisplayTracker.class;
    }
}
