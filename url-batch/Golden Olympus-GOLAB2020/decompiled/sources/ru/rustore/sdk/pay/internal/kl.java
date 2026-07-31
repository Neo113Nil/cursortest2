package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kl {

    /* renamed from: a, reason: collision with root package name */
    public final int f44490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44492c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f44493d;

    public kl(int i4, @NotNull String periodType, int i5, @NotNull String tariffType) {
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(tariffType, "tariffType");
        this.f44490a = i4;
        this.f44491b = periodType;
        this.f44492c = i5;
        this.f44493d = tariffType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return this.f44490a == klVar.f44490a && Intrinsics.areEqual(this.f44491b, klVar.f44491b) && this.f44492c == klVar.f44492c && Intrinsics.areEqual(this.f44493d, klVar.f44493d);
    }

    public final int hashCode() {
        return this.f44493d.hashCode() + ((Integer.hashCode(this.f44492c) + j1.a(this.f44491b, Integer.hashCode(this.f44490a) * 31, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionTariffDto(price=");
        sb.append(this.f44490a);
        sb.append(", periodType=");
        sb.append(this.f44491b);
        sb.append(", duration=");
        sb.append(this.f44492c);
        sb.append(", tariffType=");
        return i1.a(sb, this.f44493d, ')');
    }
}
