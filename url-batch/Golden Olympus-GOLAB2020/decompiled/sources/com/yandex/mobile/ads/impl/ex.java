package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ex {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25486a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25487b;

    public ex(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f25486a = name;
        this.f25487b = value;
    }

    @NotNull
    public final String a() {
        return this.f25486a;
    }

    @NotNull
    public final String b() {
        return this.f25487b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return Intrinsics.areEqual(this.f25486a, exVar.f25486a) && Intrinsics.areEqual(this.f25487b, exVar.f25487b);
    }

    public final int hashCode() {
        return this.f25487b.hashCode() + (this.f25486a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f25486a + ", value=" + this.f25487b + ")";
    }
}
