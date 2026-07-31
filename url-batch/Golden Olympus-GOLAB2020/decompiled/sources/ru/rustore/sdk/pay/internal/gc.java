package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44169a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44170b;

    public gc(String id, String value) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44169a = id;
        this.f44170b = value;
        if (StringsKt.z(value)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return Intrinsics.areEqual(this.f44169a, gcVar.f44169a) && Intrinsics.areEqual(this.f44170b, gcVar.f44170b);
    }

    public final int hashCode() {
        return this.f44170b.hashCode() + (this.f44169a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKey(id=");
        sb.append((Object) ("PublicKeyId(value=" + this.f44169a + ')'));
        sb.append(", value=");
        return i1.a(sb, this.f44170b, ')');
    }
}
