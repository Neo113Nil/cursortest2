package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aq1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1938g3 {
    @NotNull
    public static C1914f3 a(@NotNull AbstractC2025jj loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        int i4 = aq1.f23419c;
        return new C1914f3(loadController, aq1.a.a(), new WeakReference(loadController));
    }
}
