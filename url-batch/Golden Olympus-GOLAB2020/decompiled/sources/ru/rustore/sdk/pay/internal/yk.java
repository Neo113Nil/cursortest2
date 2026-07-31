package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45299a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45300b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f45301c;

    public yk(@NotNull String keyId, @NotNull String value, @NotNull String responseData) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.f45299a = keyId;
        this.f45300b = value;
        this.f45301c = responseData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return Intrinsics.areEqual(this.f45299a, ykVar.f45299a) && Intrinsics.areEqual(this.f45300b, ykVar.f45300b) && Intrinsics.areEqual(this.f45301c, ykVar.f45301c);
    }

    public final int hashCode() {
        return this.f45301c.hashCode() + j1.a(this.f45300b, this.f45299a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SignatureResponseDto(keyId=");
        sb.append(this.f45299a);
        sb.append(", value=");
        sb.append(this.f45300b);
        sb.append(", responseData=");
        return i1.a(sb, this.f45301c, ')');
    }
}
