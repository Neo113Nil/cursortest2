package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2308w1 implements yf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2269u8 f33863a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f33864b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o42 f33865c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f33866d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f33867e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private C2354y1 f33868f;

    public C2308w1(@NotNull C2269u8 adSource, @Nullable String str, @NotNull o42 timeOffset, @NotNull List breakTypes, @NotNull ArrayList extensions, @NotNull HashMap trackingEvents) {
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
        Intrinsics.checkNotNullParameter(breakTypes, "breakTypes");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f33863a = adSource;
        this.f33864b = str;
        this.f33865c = timeOffset;
        this.f33866d = breakTypes;
        this.f33867e = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.yf2
    @NotNull
    public final Map<String, List<String>> a() {
        return this.f33867e;
    }

    @NotNull
    public final C2269u8 b() {
        return this.f33863a;
    }

    @Nullable
    public final String c() {
        return this.f33864b;
    }

    @NotNull
    public final List<String> d() {
        return this.f33866d;
    }

    @Nullable
    public final C2354y1 e() {
        return this.f33868f;
    }

    @NotNull
    public final o42 f() {
        return this.f33865c;
    }

    public final void a(@Nullable C2354y1 c2354y1) {
        this.f33868f = c2354y1;
    }
}
