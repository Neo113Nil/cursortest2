package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45115a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f45117c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f45118d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f45119e;

    public v2(@NotNull String cardBindingId, @NotNull String bankIcon, @NotNull String maskedNumber, @NotNull String paymentSystemIcon, @NotNull String paymentSystem) {
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        Intrinsics.checkNotNullParameter(bankIcon, "bankIcon");
        Intrinsics.checkNotNullParameter(maskedNumber, "maskedNumber");
        Intrinsics.checkNotNullParameter(paymentSystemIcon, "paymentSystemIcon");
        Intrinsics.checkNotNullParameter(paymentSystem, "paymentSystem");
        this.f45115a = cardBindingId;
        this.f45116b = bankIcon;
        this.f45117c = maskedNumber;
        this.f45118d = paymentSystemIcon;
        this.f45119e = paymentSystem;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.areEqual(this.f45115a, v2Var.f45115a) && Intrinsics.areEqual(this.f45116b, v2Var.f45116b) && Intrinsics.areEqual(this.f45117c, v2Var.f45117c) && Intrinsics.areEqual(this.f45118d, v2Var.f45118d) && Intrinsics.areEqual(this.f45119e, v2Var.f45119e);
    }

    public final int hashCode() {
        return this.f45119e.hashCode() + j1.a(this.f45118d, j1.a(this.f45117c, j1.a(this.f45116b, this.f45115a.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CardInfoDto(cardBindingId=");
        sb.append(this.f45115a);
        sb.append(", bankIcon=");
        sb.append(this.f45116b);
        sb.append(", maskedNumber=");
        sb.append(this.f45117c);
        sb.append(", paymentSystemIcon=");
        sb.append(this.f45118d);
        sb.append(", paymentSystem=");
        return i1.a(sb, this.f45119e, ')');
    }
}
