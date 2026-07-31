package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45096a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45097b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f45098c;

    public uf(@NotNull String purchaseId, @NotNull String productType, @NotNull String value) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45096a = purchaseId;
        this.f45097b = productType;
        this.f45098c = value;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return Intrinsics.areEqual(this.f45096a, ufVar.f45096a) && Intrinsics.areEqual(this.f45097b, ufVar.f45097b) && Intrinsics.areEqual(this.f45098c, ufVar.f45098c);
    }

    public final int hashCode() {
        return this.f45098c.hashCode() + j1.a(this.f45097b, this.f45096a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseStatusDto(purchaseId=");
        sb.append(this.f45096a);
        sb.append(", productType=");
        sb.append(this.f45097b);
        sb.append(", value=");
        return i1.a(sb, this.f45098c, ')');
    }
}
