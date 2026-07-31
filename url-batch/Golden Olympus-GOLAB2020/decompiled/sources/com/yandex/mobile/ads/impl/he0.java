package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class he0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f26719b = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xr0 f26720a;

    public he0(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f26720a = localStorage;
    }

    public final boolean a(@Nullable C1851cc c1851cc) {
        String a4;
        boolean z4 = false;
        if (c1851cc == null || (a4 = c1851cc.a()) == null) {
            return false;
        }
        synchronized (f26719b) {
            String d4 = this.f26720a.d("google_advertising_id_key");
            if (d4 != null) {
                if (!Intrinsics.areEqual(a4, d4)) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void b(@Nullable C1851cc c1851cc) {
        String d4 = this.f26720a.d("google_advertising_id_key");
        String a4 = c1851cc != null ? c1851cc.a() : null;
        if (d4 != null || a4 == null) {
            return;
        }
        this.f26720a.a("google_advertising_id_key", a4);
    }
}
