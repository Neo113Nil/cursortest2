package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45112a;

    public v(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45112a = value;
        if (StringsKt.z(value)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.areEqual(this.f45112a, ((v) obj).f45112a);
    }

    public final int hashCode() {
        return this.f45112a.hashCode();
    }

    @NotNull
    public final String toString() {
        return i1.a(new StringBuilder("AppName(value="), this.f45112a, ')');
    }
}
