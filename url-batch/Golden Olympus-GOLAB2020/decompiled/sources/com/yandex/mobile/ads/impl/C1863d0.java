package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1863d0 {
    @NotNull
    public static C1887e0 a() {
        C1887e0 c1887e0;
        Object obj;
        C1887e0 c1887e02;
        c1887e0 = C1887e0.f25035g;
        if (c1887e0 != null) {
            return c1887e0;
        }
        obj = C1887e0.f25034f;
        synchronized (obj) {
            c1887e02 = C1887e0.f25035g;
            if (c1887e02 == null) {
                c1887e02 = new C1887e0();
                C1887e0.f25035g = c1887e02;
            }
        }
        return c1887e02;
    }
}
