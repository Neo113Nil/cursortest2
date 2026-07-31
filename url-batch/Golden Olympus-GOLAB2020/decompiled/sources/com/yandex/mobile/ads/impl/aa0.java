package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class aa0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23193a;

    public aa0(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23193a = value;
    }

    @NotNull
    public final String a() {
        return this.f23193a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa0) && Intrinsics.areEqual(this.f23193a, ((aa0) obj).f23193a);
    }

    public final int hashCode() {
        return this.f23193a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "FeedSessionData(value=" + this.f23193a + ")";
    }
}
