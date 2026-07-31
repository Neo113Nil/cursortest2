package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class di0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2138oe f24639a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24640b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ii0 f24641c;

    public di0(@NotNull C2138oe appMetricaIdentifiers, @NotNull String mauid, @NotNull ii0 identifiersType) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        Intrinsics.checkNotNullParameter(mauid, "mauid");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        this.f24639a = appMetricaIdentifiers;
        this.f24640b = mauid;
        this.f24641c = identifiersType;
    }

    @NotNull
    public final C2138oe a() {
        return this.f24639a;
    }

    @NotNull
    public final ii0 b() {
        return this.f24641c;
    }

    @NotNull
    public final String c() {
        return this.f24640b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return Intrinsics.areEqual(this.f24639a, di0Var.f24639a) && Intrinsics.areEqual(this.f24640b, di0Var.f24640b) && this.f24641c == di0Var.f24641c;
    }

    public final int hashCode() {
        return this.f24641c.hashCode() + C1842c3.a(this.f24640b, this.f24639a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "Identifiers(appMetricaIdentifiers=" + this.f24639a + ", mauid=" + this.f24640b + ", identifiersType=" + this.f24641c + ")";
    }
}
