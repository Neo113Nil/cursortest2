package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44969b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f44970c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f44971d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f44972e;

    public s8(@NotNull String purchaseId, @NotNull String invoiceId, @Nullable String str, @NotNull String purchaseStatus, @NotNull String purchaseType) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseStatus, "purchaseStatus");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        this.f44968a = purchaseId;
        this.f44969b = invoiceId;
        this.f44970c = str;
        this.f44971d = purchaseStatus;
        this.f44972e = purchaseType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return Intrinsics.areEqual(this.f44968a, s8Var.f44968a) && Intrinsics.areEqual(this.f44969b, s8Var.f44969b) && Intrinsics.areEqual(this.f44970c, s8Var.f44970c) && Intrinsics.areEqual(this.f44971d, s8Var.f44971d) && Intrinsics.areEqual(this.f44972e, s8Var.f44972e);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44969b, this.f44968a.hashCode() * 31, 31);
        String str = this.f44970c;
        return this.f44972e.hashCode() + j1.a(this.f44971d, (a4 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentDto(purchaseId=");
        sb.append(this.f44968a);
        sb.append(", invoiceId=");
        sb.append(this.f44969b);
        sb.append(", paymentUrl=");
        sb.append(this.f44970c);
        sb.append(", purchaseStatus=");
        sb.append(this.f44971d);
        sb.append(", purchaseType=");
        return i1.a(sb, this.f44972e, ')');
    }
}
