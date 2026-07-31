package ru.rustore.sdk.pay.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44220a;

    public h7(boolean z4) {
        this.f44220a = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7) && this.f44220a == ((h7) obj).f44220a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44220a);
    }

    @NotNull
    public final String toString() {
        return "MetaInfoDto(sandbox=" + this.f44220a + ')';
    }
}
