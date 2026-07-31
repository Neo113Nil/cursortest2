package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35788a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35789b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f35790c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cw f35791d;

    public zv(@NotNull String name, @NotNull String format, @NotNull String adUnitId, @NotNull cw mediation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediation, "mediation");
        this.f35788a = name;
        this.f35789b = format;
        this.f35790c = adUnitId;
        this.f35791d = mediation;
    }

    @NotNull
    public final String a() {
        return this.f35790c;
    }

    @NotNull
    public final String b() {
        return this.f35789b;
    }

    @NotNull
    public final cw c() {
        return this.f35791d;
    }

    @NotNull
    public final String d() {
        return this.f35788a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj;
        return Intrinsics.areEqual(this.f35788a, zvVar.f35788a) && Intrinsics.areEqual(this.f35789b, zvVar.f35789b) && Intrinsics.areEqual(this.f35790c, zvVar.f35790c) && Intrinsics.areEqual(this.f35791d, zvVar.f35791d);
    }

    public final int hashCode() {
        return this.f35791d.hashCode() + C1842c3.a(this.f35790c, C1842c3.a(this.f35789b, this.f35788a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.f35788a + ", format=" + this.f35789b + ", adUnitId=" + this.f35790c + ", mediation=" + this.f35791d + ")";
    }
}
