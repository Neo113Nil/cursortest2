package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ma2;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class le1 {
    @NotNull
    public static ta2 a(@NotNull la2 verification) {
        Intrinsics.checkNotNullParameter(verification, "verification");
        wp0 b4 = verification.b();
        if (b4 == null || !Intrinsics.areEqual(b4.c(), "omid")) {
            throw new ma2(verification, ma2.a.f28969c);
        }
        try {
            URL url = new URL(b4.d());
            String d4 = verification.d();
            String c4 = verification.c();
            if (c4 == null || c4.length() == 0) {
                ta2 a4 = ta2.a(url);
                Intrinsics.checkNotNull(a4);
                return a4;
            }
            ta2 a5 = ta2.a(d4, url, c4);
            Intrinsics.checkNotNull(a5);
            return a5;
        } catch (MalformedURLException unused) {
            throw new ma2(verification, ma2.a.f28970d);
        }
    }
}
