package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f43979a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Url f43980b;

    public dn(@NotNull String name, @Nullable Url url) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f43979a = name;
        this.f43980b = url;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return Intrinsics.areEqual(this.f43979a, dnVar.f43979a) && Intrinsics.areEqual(this.f43980b, dnVar.f43980b);
    }

    public final int hashCode() {
        int hashCode = this.f43979a.hashCode() * 31;
        Url url = this.f43980b;
        return hashCode + (url == null ? 0 : url.hashCode());
    }

    @NotNull
    public final String toString() {
        return "User(name=" + this.f43979a + ", avatarUrl=" + this.f43980b + ')';
    }
}
