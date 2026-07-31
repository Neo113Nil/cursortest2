package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45191a;

    public wj(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f45191a = id;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj) && Intrinsics.areEqual(this.f45191a, ((wj) obj).f45191a);
    }

    public final int hashCode() {
        return this.f45191a.hashCode();
    }

    @NotNull
    public final String toString() {
        return i1.a(new StringBuilder("SelectedCoupon(id="), this.f45191a, ')');
    }
}
