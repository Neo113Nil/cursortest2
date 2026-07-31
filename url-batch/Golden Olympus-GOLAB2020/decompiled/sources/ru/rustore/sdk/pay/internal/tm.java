package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s9 f45048a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45049b;

    public tm(@NotNull s9 paymentMethod, boolean z4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f45048a = paymentMethod;
        this.f45049b = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        return Intrinsics.areEqual(this.f45048a, tmVar.f45048a) && this.f45049b == tmVar.f45049b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45049b) + (this.f45048a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "UiPaymentMethodItem(paymentMethod=" + this.f45048a + ", selected=" + this.f45049b + ')';
    }
}
