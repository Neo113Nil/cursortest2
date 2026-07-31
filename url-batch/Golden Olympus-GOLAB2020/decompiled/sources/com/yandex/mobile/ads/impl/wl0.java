package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<wi1> f34110a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ss f34111b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final ss f34112c;

    public wl0(@NotNull ArrayList midrollItems, @Nullable ss ssVar, @Nullable ss ssVar2) {
        Intrinsics.checkNotNullParameter(midrollItems, "midrollItems");
        this.f34110a = midrollItems;
        this.f34111b = ssVar;
        this.f34112c = ssVar2;
    }

    @NotNull
    public final List<wi1> a() {
        return this.f34110a;
    }

    @Nullable
    public final ss b() {
        return this.f34112c;
    }

    @Nullable
    public final ss c() {
        return this.f34111b;
    }
}
