package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35324b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f35325c;

    public yv(@NotNull String name, @NotNull String format, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f35323a = name;
        this.f35324b = format;
        this.f35325c = adUnitId;
    }

    @NotNull
    public final String a() {
        return this.f35325c;
    }

    @NotNull
    public final String b() {
        return this.f35324b;
    }

    @NotNull
    public final String c() {
        return this.f35323a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj;
        return Intrinsics.areEqual(this.f35323a, yvVar.f35323a) && Intrinsics.areEqual(this.f35324b, yvVar.f35324b) && Intrinsics.areEqual(this.f35325c, yvVar.f35325c);
    }

    public final int hashCode() {
        return this.f35325c.hashCode() + C1842c3.a(this.f35324b, this.f35323a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.f35323a + ", format=" + this.f35324b + ", adUnitId=" + this.f35325c + ")";
    }
}
