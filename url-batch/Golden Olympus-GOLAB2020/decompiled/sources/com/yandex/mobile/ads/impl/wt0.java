package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wt0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xr0 f34176a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f34177b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private String f34178c;

    public wt0(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f34176a = localStorage;
        this.f34177b = new Object();
    }

    @Nullable
    public final String a() {
        String str;
        synchronized (this.f34177b) {
            try {
                if (this.f34178c == null) {
                    this.f34178c = this.f34176a.d("YmadMauid");
                }
                str = this.f34178c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void a(@NotNull String mauid) {
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        synchronized (this.f34177b) {
            this.f34178c = mauid;
            this.f34176a.a("YmadMauid", mauid);
            Unit unit = Unit.f41027a;
        }
    }
}
