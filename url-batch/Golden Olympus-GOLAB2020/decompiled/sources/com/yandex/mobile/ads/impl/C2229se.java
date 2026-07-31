package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.se, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2229se {
    public static boolean a(@NotNull C2138oe appMetricaIdentifiers) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        String a4 = appMetricaIdentifiers.a();
        String b4 = appMetricaIdentifiers.b();
        String c4 = appMetricaIdentifiers.c();
        if (!(c4 == null || c4.length() == 0)) {
            if (!(a4 == null || a4.length() == 0)) {
                if (!(b4 == null || b4.length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
