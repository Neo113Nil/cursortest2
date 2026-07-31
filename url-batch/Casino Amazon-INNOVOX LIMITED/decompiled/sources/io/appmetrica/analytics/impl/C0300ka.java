package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0300ka implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    public final C0041a9 a(C0271j7 c0271j7) {
        C0041a9 c0041a9 = null;
        if ((c0271j7 != null ? c0271j7.b : null) != null && c0271j7.c != null) {
            c0041a9 = new C0041a9();
            c0041a9.b = c0271j7.b.doubleValue();
            c0041a9.f1160a = c0271j7.c.doubleValue();
            Integer num = c0271j7.d;
            if (num != null) {
                c0041a9.g = num.intValue();
            }
            Integer num2 = c0271j7.e;
            if (num2 != null) {
                c0041a9.e = num2.intValue();
            }
            Integer num3 = c0271j7.f;
            if (num3 != null) {
                c0041a9.d = num3.intValue();
            }
            Integer num4 = c0271j7.g;
            if (num4 != null) {
                c0041a9.f = num4.intValue();
            }
            Long l = c0271j7.h;
            if (l != null) {
                c0041a9.c = TimeUnit.MILLISECONDS.toSeconds(l.longValue());
            }
            String str = c0271j7.i;
            if (str != null) {
                if (Intrinsics.areEqual(str, "gps")) {
                    c0041a9.h = 1;
                } else if (Intrinsics.areEqual(str, "network")) {
                    c0041a9.h = 2;
                }
            }
            String str2 = c0271j7.j;
            if (str2 != null) {
                c0041a9.i = str2;
            }
        }
        return c0041a9;
    }
}
