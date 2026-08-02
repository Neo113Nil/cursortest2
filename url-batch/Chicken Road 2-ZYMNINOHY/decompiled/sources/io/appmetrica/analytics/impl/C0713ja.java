package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713ja implements Vb {
    @Override // io.appmetrica.analytics.impl.Vb
    public final Z8 a(C0685i7 c0685i7) {
        Z8 z8 = null;
        if ((c0685i7 != null ? c0685i7.f12020b : null) != null && c0685i7.f12021c != null) {
            z8 = new Z8();
            z8.f11354b = c0685i7.f12020b.doubleValue();
            z8.f11353a = c0685i7.f12021c.doubleValue();
            Integer num = c0685i7.f12022d;
            if (num != null) {
                z8.f11359g = num.intValue();
            }
            Integer num2 = c0685i7.f12023e;
            if (num2 != null) {
                z8.f11357e = num2.intValue();
            }
            Integer num3 = c0685i7.f12024f;
            if (num3 != null) {
                z8.f11356d = num3.intValue();
            }
            Integer num4 = c0685i7.f12025g;
            if (num4 != null) {
                z8.f11358f = num4.intValue();
            }
            Long l4 = c0685i7.f12026h;
            if (l4 != null) {
                z8.f11355c = TimeUnit.MILLISECONDS.toSeconds(l4.longValue());
            }
            String str = c0685i7.f12027i;
            if (str != null) {
                if (str.equals("gps")) {
                    z8.f11360h = 1;
                } else if (str.equals("network")) {
                    z8.f11360h = 2;
                }
            }
            String str2 = c0685i7.f12028j;
            if (str2 != null) {
                z8.f11361i = str2;
            }
        }
        return z8;
    }
}
