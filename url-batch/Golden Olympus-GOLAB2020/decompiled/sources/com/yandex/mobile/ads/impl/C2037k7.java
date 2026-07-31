package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2037k7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2308w1 f28085a;

    public C2037k7(@NotNull C2308w1 adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f28085a = adBreak;
    }

    @NotNull
    public final C1872d9 a() {
        return this.f28085a.b().a();
    }

    @Nullable
    public final String b() {
        C2354y1 e4 = this.f28085a.e();
        if (e4 != null) {
            return e4.c();
        }
        return null;
    }

    @Nullable
    public final String c() {
        return this.f28085a.b().b();
    }

    @Nullable
    public final String d() {
        C2354y1 e4 = this.f28085a.e();
        if (e4 != null) {
            return e4.d();
        }
        return null;
    }

    @Nullable
    public final String e() {
        C2354y1 e4 = this.f28085a.e();
        if (e4 != null) {
            return e4.e();
        }
        return null;
    }
}
