package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c1 f2180a;

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f2181b;

    static {
        c1 c1Var = new c1();
        Map map = Collections.EMPTY_MAP;
        f2181b = c1Var;
    }

    public static c1 a() {
        c1 c1Var = f2180a;
        if (c1Var != null) {
            return c1Var;
        }
        synchronized (c1.class) {
            try {
                c1 c1Var2 = f2180a;
                if (c1Var2 != null) {
                    return c1Var2;
                }
                int i3 = q0.f2690a;
                c1 d10 = g1.d();
                f2180a = d10;
                return d10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
