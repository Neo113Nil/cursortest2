package ru.rustore.sdk.pay.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45190a;

    public wi(boolean z4) {
        this.f45190a = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi) && this.f45190a == ((wi) obj).f45190a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45190a);
    }

    @NotNull
    public final String toString() {
        return "SandboxMode(enabled=" + this.f45190a + ')';
    }
}
