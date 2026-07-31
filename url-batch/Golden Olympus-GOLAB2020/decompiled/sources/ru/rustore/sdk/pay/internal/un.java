package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f45111a;

    public un(@NotNull Url authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.f45111a = authUrl;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un) && Intrinsics.areEqual(this.f45111a, ((un) obj).f45111a);
    }

    public final int hashCode() {
        return this.f45111a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "WebAuthState(authUrl=" + this.f45111a + ')';
    }
}
