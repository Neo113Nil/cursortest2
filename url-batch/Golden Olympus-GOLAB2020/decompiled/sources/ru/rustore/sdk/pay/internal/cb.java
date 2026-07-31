package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f43907a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f43908b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f43909c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43910d;

    public cb(@NotNull String originalPrice, @Nullable String str, @NotNull String totalPrice, boolean z4) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        this.f43907a = originalPrice;
        this.f43908b = str;
        this.f43909c = totalPrice;
        this.f43910d = z4;
    }

    public static cb a(cb cbVar, String str, String totalPrice, boolean z4, int i4) {
        String originalPrice = cbVar.f43907a;
        if ((i4 & 2) != 0) {
            str = cbVar.f43908b;
        }
        if ((i4 & 4) != 0) {
            totalPrice = cbVar.f43909c;
        }
        if ((i4 & 8) != 0) {
            z4 = cbVar.f43910d;
        }
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        return new cb(originalPrice, str, totalPrice, z4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return Intrinsics.areEqual(this.f43907a, cbVar.f43907a) && Intrinsics.areEqual(this.f43908b, cbVar.f43908b) && Intrinsics.areEqual(this.f43909c, cbVar.f43909c) && this.f43910d == cbVar.f43910d;
    }

    public final int hashCode() {
        int hashCode = this.f43907a.hashCode() * 31;
        String str = this.f43908b;
        return Boolean.hashCode(this.f43910d) + j1.a(this.f43909c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "PriceInfoUi(originalPrice=" + this.f43907a + ", discount=" + this.f43908b + ", totalPrice=" + this.f43909c + ", detailsVisible=" + this.f43910d + ')';
    }
}
