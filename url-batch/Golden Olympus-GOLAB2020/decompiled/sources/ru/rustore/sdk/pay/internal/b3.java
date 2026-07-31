package ru.rustore.sdk.pay.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f43845a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43846b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Date f43847c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Date f43848d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final j4 f43849e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f43850f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final u3 f43851g;

    public b3(String id, long j4, Date couponStartDate, Date couponEndDate, j4 status, String scope, u3 segment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(couponStartDate, "couponStartDate");
        Intrinsics.checkNotNullParameter(couponEndDate, "couponEndDate");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.f43845a = id;
        this.f43846b = j4;
        this.f43847c = couponStartDate;
        this.f43848d = couponEndDate;
        this.f43849e = status;
        this.f43850f = scope;
        this.f43851g = segment;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.areEqual(this.f43845a, b3Var.f43845a) && this.f43846b == b3Var.f43846b && Intrinsics.areEqual(this.f43847c, b3Var.f43847c) && Intrinsics.areEqual(this.f43848d, b3Var.f43848d) && Intrinsics.areEqual(this.f43849e, b3Var.f43849e) && Intrinsics.areEqual(this.f43850f, b3Var.f43850f) && this.f43851g == b3Var.f43851g;
    }

    public final int hashCode() {
        return this.f43851g.hashCode() + j1.a(this.f43850f, (this.f43849e.hashCode() + ((this.f43848d.hashCode() + ((this.f43847c.hashCode() + ((x7.a(this.f43846b) + (this.f43845a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Coupon(id=");
        sb.append((Object) ("CouponId(value=" + this.f43845a + ')'));
        sb.append(", nominal=");
        sb.append((Object) ("Nominal(value=" + this.f43846b + ')'));
        sb.append(", couponStartDate=");
        sb.append(this.f43847c);
        sb.append(", couponEndDate=");
        sb.append(this.f43848d);
        sb.append(", status=");
        sb.append(this.f43849e);
        sb.append(", scope=");
        sb.append((Object) ("CouponScope(value=" + this.f43850f + ')'));
        sb.append(", segment=");
        sb.append(this.f43851g);
        sb.append(')');
        return sb.toString();
    }
}
