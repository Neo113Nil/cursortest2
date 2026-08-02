package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773qa implements InterfaceC0413cc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0413cc
    public final C0513g9 a(C0770q7 c0770q7) {
        C0513g9 c0513g9 = null;
        if ((c0770q7 != null ? c0770q7.f8130b : null) != null && c0770q7.f8131c != null) {
            c0513g9 = new C0513g9();
            c0513g9.f7383b = c0770q7.f8130b.doubleValue();
            c0513g9.f7382a = c0770q7.f8131c.doubleValue();
            Integer num = c0770q7.f8132d;
            if (num != null) {
                c0513g9.f7387g = num.intValue();
            }
            Integer num2 = c0770q7.f8133e;
            if (num2 != null) {
                c0513g9.f7386e = num2.intValue();
            }
            Integer num3 = c0770q7.f;
            if (num3 != null) {
                c0513g9.f7385d = num3.intValue();
            }
            Integer num4 = c0770q7.f8134g;
            if (num4 != null) {
                c0513g9.f = num4.intValue();
            }
            Long l3 = c0770q7.f8135h;
            if (l3 != null) {
                c0513g9.f7384c = TimeUnit.MILLISECONDS.toSeconds(l3.longValue());
            }
            String str = c0770q7.f8136i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0513g9.f7388h = 1;
                } else if (str.equals("network")) {
                    c0513g9.f7388h = 2;
                }
            }
            String str2 = c0770q7.f8137j;
            if (str2 != null) {
                c0513g9.f7389i = str2;
            }
        }
        return c0513g9;
    }
}
