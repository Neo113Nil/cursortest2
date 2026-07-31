package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44134a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44135b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f44136c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f44137d;

    public fl(@NotNull String period, @NotNull String duration, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f44134a = period;
        this.f44135b = duration;
        this.f44136c = str;
        this.f44137d = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return Intrinsics.areEqual(this.f44134a, flVar.f44134a) && Intrinsics.areEqual(this.f44135b, flVar.f44135b) && Intrinsics.areEqual(this.f44136c, flVar.f44136c) && Intrinsics.areEqual(this.f44137d, flVar.f44137d);
    }

    public final int hashCode() {
        int a4 = j1.a(this.f44135b, this.f44134a.hashCode() * 31, 31);
        String str = this.f44136c;
        int hashCode = (a4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f44137d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SubscriptionPeriodDto(period=" + this.f44134a + ", duration=" + this.f44135b + ", currency=" + this.f44136c + ", price=" + this.f44137d + ')';
    }
}
