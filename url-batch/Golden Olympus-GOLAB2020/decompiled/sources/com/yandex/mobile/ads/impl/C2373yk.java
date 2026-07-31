package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2373yk {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private C2281uk f35166a;

    public C2373yk(@Nullable C2281uk c2281uk) {
        this.f35166a = c2281uk;
    }

    @Nullable
    public final C2281uk a() {
        return this.f35166a;
    }

    public final boolean b() {
        return this.f35166a != null;
    }

    public final void c() {
        C2281uk c2281uk = this.f35166a;
        if (c2281uk != null) {
            c2281uk.b();
        }
    }

    public final void a(@Nullable C2281uk c2281uk) {
        this.f35166a = c2281uk;
    }
}
