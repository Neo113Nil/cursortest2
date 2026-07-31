package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f43978a;

    public dl(@NotNull ArrayList periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.f43978a = periods;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl) && Intrinsics.areEqual(this.f43978a, ((dl) obj).f43978a);
    }

    public final int hashCode() {
        return this.f43978a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SubscriptionInfoDto(periods=" + this.f43978a + ')';
    }
}
