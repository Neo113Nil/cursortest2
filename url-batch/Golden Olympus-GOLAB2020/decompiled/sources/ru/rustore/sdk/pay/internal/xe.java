package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xe {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45225a;

    public xe(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f45225a = id;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe) && Intrinsics.areEqual(this.f45225a, ((xe) obj).f45225a);
    }

    public final int hashCode() {
        return this.f45225a.hashCode();
    }

    @NotNull
    public final String toString() {
        return i1.a(new StringBuilder("PurchaseIdDto(id="), this.f45225a, ')');
    }
}
