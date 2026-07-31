package com.apm.insight;

import com.apm.insight.l.g;

/* compiled from: Ensure.java */
/* loaded from: classes6.dex */
public final class c {
    private static com.apm.insight.b.a a = new com.apm.insight.b.a();

    public static com.apm.insight.b.a a() {
        return a;
    }

    public static void a(Throwable th, String str) {
        if (!e.i().isEnsureEnable() || g.a(th)) {
            return;
        }
        com.apm.insight.f.b.a(th, str, "core_exception_monitor");
    }
}
