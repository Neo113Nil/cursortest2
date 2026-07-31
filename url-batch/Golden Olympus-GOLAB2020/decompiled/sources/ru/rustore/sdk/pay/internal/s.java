package ru.rustore.sdk.pay.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44947a;

    public s(boolean z4) {
        this.f44947a = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f44947a == ((s) obj).f44947a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44947a);
    }

    @NotNull
    public final String toString() {
        return "AppInstallationStatus(installed=" + this.f44947a + ')';
    }
}
