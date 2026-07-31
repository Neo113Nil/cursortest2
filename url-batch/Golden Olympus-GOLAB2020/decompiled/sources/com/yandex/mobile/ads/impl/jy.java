package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jy implements InterfaceC2237t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27895a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27896b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<rj1> f27897c;

    public jy(@NotNull String actionType, @NotNull String fallbackUrl, @NotNull ArrayList preferredPackages) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(fallbackUrl, "fallbackUrl");
        Intrinsics.checkNotNullParameter(preferredPackages, "preferredPackages");
        this.f27895a = actionType;
        this.f27896b = fallbackUrl;
        this.f27897c = preferredPackages;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f27895a;
    }

    @NotNull
    public final String c() {
        return this.f27896b;
    }

    @NotNull
    public final List<rj1> d() {
        return this.f27897c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return Intrinsics.areEqual(this.f27895a, jyVar.f27895a) && Intrinsics.areEqual(this.f27896b, jyVar.f27896b) && Intrinsics.areEqual(this.f27897c, jyVar.f27897c);
    }

    public final int hashCode() {
        return this.f27897c.hashCode() + C1842c3.a(this.f27896b, this.f27895a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f27895a + ", fallbackUrl=" + this.f27896b + ", preferredPackages=" + this.f27897c + ")";
    }
}
