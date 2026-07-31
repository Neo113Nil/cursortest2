package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44355a;

    public j2(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44355a = value;
        if (StringsKt.z(value)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && Intrinsics.areEqual(this.f44355a, ((j2) obj).f44355a);
    }

    public final int hashCode() {
        return this.f44355a.hashCode();
    }

    @NotNull
    public final String toString() {
        return i1.a(new StringBuilder("BankSchema(value="), this.f44355a, ')');
    }
}
