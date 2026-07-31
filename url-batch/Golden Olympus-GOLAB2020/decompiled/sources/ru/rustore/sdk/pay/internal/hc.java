package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44234b;

    public hc(@NotNull String id, @NotNull String value) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44233a = id;
        this.f44234b = value;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return Intrinsics.areEqual(this.f44233a, hcVar.f44233a) && Intrinsics.areEqual(this.f44234b, hcVar.f44234b);
    }

    public final int hashCode() {
        return this.f44234b.hashCode() + (this.f44233a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyDto(id=");
        sb.append(this.f44233a);
        sb.append(", value=");
        return i1.a(sb, this.f44234b, ')');
    }
}
