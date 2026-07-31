package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44140a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44141b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44142c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44143d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f44144e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f44145f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f44146g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f44147h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f44148i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final ob f44149j;

    public g0(@NotNull String purchaseId, @NotNull String invoiceId, @NotNull String description, int i4, @NotNull String amountLabel, @NotNull String purchaseStatus, @NotNull String productType, @NotNull String purchaseType, @Nullable String str, @NotNull ob product) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(purchaseStatus, "purchaseStatus");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f44140a = purchaseId;
        this.f44141b = invoiceId;
        this.f44142c = description;
        this.f44143d = i4;
        this.f44144e = amountLabel;
        this.f44145f = purchaseStatus;
        this.f44146g = productType;
        this.f44147h = purchaseType;
        this.f44148i = str;
        this.f44149j = product;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f44140a, g0Var.f44140a) && Intrinsics.areEqual(this.f44141b, g0Var.f44141b) && Intrinsics.areEqual(this.f44142c, g0Var.f44142c) && this.f44143d == g0Var.f44143d && Intrinsics.areEqual(this.f44144e, g0Var.f44144e) && Intrinsics.areEqual(this.f44145f, g0Var.f44145f) && Intrinsics.areEqual(this.f44146g, g0Var.f44146g) && Intrinsics.areEqual(this.f44147h, g0Var.f44147h) && Intrinsics.areEqual(this.f44148i, g0Var.f44148i) && Intrinsics.areEqual(this.f44149j, g0Var.f44149j);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44147h, j1.a(this.f44146g, j1.a(this.f44145f, j1.a(this.f44144e, (Integer.hashCode(this.f44143d) + j1.a(this.f44142c, j1.a(this.f44141b, this.f44140a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31), 31);
        String str = this.f44148i;
        return this.f44149j.hashCode() + ((a4 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "ApplicationPurchaseDto(purchaseId=" + this.f44140a + ", invoiceId=" + this.f44141b + ", description=" + this.f44142c + ", amount=" + this.f44143d + ", amountLabel=" + this.f44144e + ", purchaseStatus=" + this.f44145f + ", productType=" + this.f44146g + ", purchaseType=" + this.f44147h + ", purchaseTime=" + this.f44148i + ", product=" + this.f44149j + ')';
    }
}
