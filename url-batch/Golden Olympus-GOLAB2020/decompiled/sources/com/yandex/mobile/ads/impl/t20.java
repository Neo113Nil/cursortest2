package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t20 implements r00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f32131a;

    public t20(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f32131a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.r00
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.areEqual(v00.f33455c.a(), this.f32131a.w());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t20) && Intrinsics.areEqual(this.f32131a, ((t20) obj).f32131a);
    }

    public final int hashCode() {
        return this.f32131a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f32131a + ")";
    }
}
