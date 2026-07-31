package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.do1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f34012a;

    public wd0(@NotNull Object fusedLocationProviderObject) {
        Intrinsics.checkNotNullParameter(fusedLocationProviderObject, "fusedLocationProviderObject");
        this.f34012a = fusedLocationProviderObject;
    }

    @Nullable
    public final ks0 a() {
        Object a4 = do1.a.a(this.f34012a, "getLastLocation", new Object[0]);
        if (a4 != null) {
            return new ks0(a4);
        }
        return null;
    }
}
